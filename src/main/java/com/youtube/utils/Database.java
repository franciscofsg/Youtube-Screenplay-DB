package com.youtube.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Database {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/your_database";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "PASSWORD";

    public static String getVideoNameFromDatabase() {

        // obtenemos el nombre del video desde la base de datos

        String videoName = null;

        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {

            String query = "SELECT video_name FROM your_database.videos_table LIMIT 1";

            try (PreparedStatement statement = connection.prepareStatement(query);
                 ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    videoName = resultSet.getString("video_name");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return videoName;
    }

    }


