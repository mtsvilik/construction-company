package com.solvd.constructioncompany;

import com.solvd.constructioncompany.connectionpool.Connection;
import com.solvd.constructioncompany.connectionpool.ConnectionPool;

public class ThreadMain {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                ConnectionPool connectionPool = ConnectionPool.getInstance(5);

                Connection connection = connectionPool.getConnection();
                connection.create();
                connection.read();
                connection.update();
                connection.delete();
                connectionPool.releaseConnection(connection);
            }).start();
        }
    }
}
