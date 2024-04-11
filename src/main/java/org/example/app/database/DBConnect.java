package org.example.app.database;

import org.example.app.view.AppView;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

// Конектор до БД.
public class DBConnect {

    public static Connection connect() {

        Properties props = new Properties();
        Connection connection = null;

        try {
            // Формуємо потік (Stream) даних з конфігураційного файлу
            // src/main/resources/db/jdbc.properties
            props.load(DBConnect.class.getResourceAsStream("/db/jdbc.properties"));
            // Реалізуємо з'єднання з БД по конфігураційному файлу
            connection = DriverManager.getConnection(props.getProperty("dbDriver") +
                            props.getProperty("dbName"),
                    props.getProperty("username"), props.getProperty("password"));
        } catch (SQLException | IOException e) {
            // Виведення повідомлення про помилки роботи
            // з БД або конфігураційним файлом
            new AppView().getOutput(e.getMessage());
        }
        return connection;
    }
}
