package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BddController {
    public BddController() {

    }

    public boolean connect() {
        boolean connected = false;

        try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:heloWin", "psy_admin", "admin")) {

            if (conn != null) {
                connected = true;
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connected;
    }
}
