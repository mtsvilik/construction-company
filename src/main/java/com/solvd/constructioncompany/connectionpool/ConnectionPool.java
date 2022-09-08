package com.solvd.constructioncompany.connectionpool;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

    private static final Logger LOGGER = LogManager.getLogger(ConnectionPool.class);

    private static final int POOL_SIZE = 5;

    private static ConnectionPool INSTANCE;

    private final List<Connection> connections;

    private ConnectionPool(int size) {
        connections = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            connections.add(new Connection());
        }
    }

    public static synchronized ConnectionPool getInstance(int size) {
        if (INSTANCE == null) {
            INSTANCE = new ConnectionPool(size);
        }
        return INSTANCE;
    }

    public synchronized Connection getConnection() {
        Connection connection = new Connection();
        INSTANCE.connections.remove(connections.size() - 1);
        LOGGER.info(INSTANCE.connections.size() + " size after get connection");
        return connection;
    }

    public void releaseConnection(Connection connection) {
        INSTANCE.connections.add(connection);
        LOGGER.info(connections.size() + " size after release connection");
    }
}
