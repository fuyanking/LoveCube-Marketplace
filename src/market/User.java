package market;

import java.util.ArrayList;

public class User {
    private int userId;
    private String password;
    // ===== Every user maintains ArrayList of Orders =====
    private ArrayList<Order> userOrderHistory;

    public User(int userId, String password) {
        this.userId = userId;
        this.password = password;
        // ===== Initialize shared order list for Buyer & Seller =====
        userOrderHistory = new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }

    public boolean hasPassword(String password) {
        return this.password.equals(password);
    }

    // ===== Add order to shared history =====
    public void addOrderRecord(Order order) {
        if (order != null) userOrderHistory.add(order);
    }

    // ===== Return copy to prevent external modification =====
    public ArrayList<Order> getOrderHistory() {
        return new ArrayList<>(userOrderHistory);
    }
}