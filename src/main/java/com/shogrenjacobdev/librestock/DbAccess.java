package com.shogrenjacobdev.librestock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbAccess {
    private final String url = "jdbc:sqlite:librestock.db";
    public Connection conn;

    // Get an inventory item by its itemId
    public Item getItemById(int id) {
        int itemId;
        String sku;
        String name;
        int quantity;
        int collection; // Returns id of collection item belongs to

        String sql = "SELECT * FROM items WHERE itemId = ?";

        try (var conn = DriverManager.getConnection(url); var statement = conn.prepareStatement(sql)) {
            statement.setInt(1, id);

            var result = statement.executeQuery();

            itemId = result.getInt("itemId");
            sku = result.getString("sku");
            name = result.getString("name");
            quantity = result.getInt("quantity");
            collection = result.getInt("collection");

            // Construct new java object for front end with item query results
            return new Item(itemId, sku, name, quantity, collection);
        }
        catch (SQLException e) {
            System.out.println("SQLException in DBAccess.getItemById:" + e.getMessage());
            return null;
        }
    }
}
