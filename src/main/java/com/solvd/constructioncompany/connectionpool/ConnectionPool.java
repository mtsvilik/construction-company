package com.solvd.constructioncompany.connectionpool;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConnectionPool {

    private static final Logger LOGGER = LogManager.getLogger(ConnectionPool.class);

    private static ConnectionPool INSTANCE;

    private final BlockingQueue<Connection> freeConnections;
    private final BlockingQueue<Connection> givenAwayConnections;

    private ConnectionPool(int size) {
        freeConnections = new LinkedBlockingQueue<>(size);
        givenAwayConnections = new LinkedBlockingQueue<>(size);
        for (int i = 0; i < size; i++) {
            freeConnections.add(new Connection());
        }
    }

    public static synchronized ConnectionPool getInstance(int size) {
        if (INSTANCE == null) {
            INSTANCE = new ConnectionPool(size);
        }
        return INSTANCE;
    }

    public synchronized Connection getConnection() {
        Connection connection = null;
        try {
            connection = freeConnections.take();
            givenAwayConnections.offer(connection);
        } catch (InterruptedException e) {
            LOGGER.error(e);
        }
        return connection;
    }

    public void releaseConnection(Connection connection) {
        givenAwayConnections.remove(connection);
        LOGGER.info("Size of givenAwayConnections " + givenAwayConnections.size());

        freeConnections.offer(connection);
        LOGGER.info("Size of freeConnections " + freeConnections.size());
    }
}
