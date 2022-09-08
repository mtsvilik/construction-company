package com.solvd.constructioncompany;

import com.solvd.constructioncompany.connectionpool.Connection;
import com.solvd.constructioncompany.connectionpool.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureMain {

    private static final Logger LOGGER = LogManager.getLogger(CompletableFutureMain.class);

    private static final ExecutorService EXECUTOR_SERVICE = Executors.newFixedThreadPool(5);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            CompletableFuture<Void> connectionFuture = CompletableFuture
                    .runAsync(CompletableFutureMain::workWithConnection, EXECUTOR_SERVICE);
            connectionFuture.join();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                LOGGER.error(e);
            }
        }

        CompletableFuture<Void> connectionFuture1 = CompletableFuture.runAsync(CompletableFutureMain::workWithConnection);
        CompletableFuture<Void> connectionFuture2 = CompletableFuture.runAsync(CompletableFutureMain::workWithConnection);
        CompletableFuture<Void> connectionFuture3 = CompletableFuture.runAsync(CompletableFutureMain::workWithConnection);
        CompletableFuture<Void> connectionFuture4 = CompletableFuture.runAsync(CompletableFutureMain::workWithConnection);
        CompletableFuture<Void> connectionFuture5 = CompletableFuture.runAsync(CompletableFutureMain::workWithConnection);
        CompletableFuture<Void> connectionFuture6 = CompletableFuture.runAsync(CompletableFutureMain::workWithConnection);

        CompletableFuture<Void> c = CompletableFuture.allOf(connectionFuture1, connectionFuture2,
                connectionFuture3, connectionFuture4, connectionFuture5, connectionFuture6);
        c.join();
    }

    public static void workWithConnection() {
        ConnectionPool connectionPool = ConnectionPool.getInstance(5);
        Connection connection = connectionPool.getConnection();
        connection.create();
        connection.read();
        connection.update();
        connection.delete();
        connectionPool.releaseConnection(connection);
    }
}

