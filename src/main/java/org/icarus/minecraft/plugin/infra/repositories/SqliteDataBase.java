package org.icarus.minecraft.plugin.infra.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Logger;

public class SqliteDataBase {
    private static final Logger LOGGER = Logger.getLogger("SqliteDataBase");
    private static final String DATABASE = "minecraft-player-login-tracker.db";

    public void createTable() {
        final String query = """
                CREATE TABLE IF NOT EXISTS player_events (
                player_event_id INTEGER PRIMARY KEY,\s
                event_id TEXT NOT NULL,\s
                player_id TEXT,\s
                player_name TEXT,\s
                event_type TEXT,\s
                timestamp_creation DATETIME);""";

        try (final Connection connection = this.connect(); final PreparedStatement statement = connection.prepareStatement(query)) {
            statement.execute();
        } catch (final SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    public void insert(final String eventIdentifier, final String playerId, final String playerName, final String eventType, final Timestamp timestampCreation) {
        final String query = """
                    INSERT INTO player_events(event_id, player_id, player_name, event_type, timestamp_creation)\s
                    	VALUES (?, ?, ?, ?, ?);
                """;
        try (final Connection connection = this.connect(); final PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, eventIdentifier);
            preparedStatement.setString(2, playerId);
            preparedStatement.setString(3, playerName);
            preparedStatement.setString(4, eventType);
            preparedStatement.setTimestamp(5, timestampCreation);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Connection connect() {
        final String url = "jdbc:sqlite:" + DATABASE;
        Connection connection;
        try {
            LOGGER.info("Connecting to: " + DATABASE);
            connection = DriverManager.getConnection(url);
            LOGGER.info("Connection to SQLite has been established.");
        } catch (final SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
