package mbjs.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private static DataBase self = new DataBase();

    public static DataBase getSelf() {
        return self;
    }

    Connection connection = null;

    public Connection getConnection() {
        return connection;
    }

    public void connect() {
        try {
            String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=Basketball;integratedSecurity=true;";
            String user = "bazaKsr2";
            String pass = "123456789";
            connection = DriverManager.getConnection(dbURL, user, pass);
            if (connection != null) {
                DatabaseMetaData dm = connection.getMetaData();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public List<Player> addPlayers() {
        connect();
        String query = "SELECT * FROM baza3";
        List<Player> players = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String league = resultSet.getString("League");
                String season = resultSet.getString("Season");
                String nationality = resultSet.getString("nationality");
                String player = resultSet.getString("Player");
                int GP = resultSet.getInt("GP");
                int FGM = resultSet.getInt("FGM");
                int ThreePM = resultSet.getInt("3PM");
                int TOV = resultSet.getInt("TOV");
                int PF = resultSet.getInt("PF");
                int REB = resultSet.getInt("REB");
                int AST = resultSet.getInt("AST");
                int STL = resultSet.getInt("STL");
                int BLK = resultSet.getInt("BLK");
                int PTS = resultSet.getInt("PTS");
                double height = resultSet.getDouble("height_cm");
                double weight = resultSet.getDouble("weight_kg");

                players.add(new Player(league, nationality, player, season, GP, FGM, ThreePM, TOV, PF, REB, AST, STL, BLK, PTS, height, weight));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        disconnect();
        return players;
    }

    public void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
