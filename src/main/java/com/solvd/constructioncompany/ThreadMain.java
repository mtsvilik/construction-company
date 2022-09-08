package com.solvd.constructioncompany;

import com.solvd.constructioncompany.connectionpool.Connection;
import com.solvd.constructioncompany.connectionpool.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ThreadMain {

    private static final Logger LOGGER = LogManager.getLogger(ThreadMain.class);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                ConnectionPool connectionPool = ConnectionPool.getInstance(5);

                Connection connection = connectionPool.getConnection();
                connection.create();
                connection.read();
                connection.update();
                connection.delete();
                connectionPool.releaseConnection(connection);
            }).start();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                LOGGER.error(e);
            }
        }
    }
}
