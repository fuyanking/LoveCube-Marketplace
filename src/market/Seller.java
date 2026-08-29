package market;

import java.util.ArrayList;

public class Seller extends User {
    private ArrayList<Item> listedItems;

    public Seller(int userId, String password) {
        super(userId, password);
        listedItems = new ArrayList<Item>();
    }

    public void listItem(Item item) {
        if (item != null) {
            listedItems.add(item);
        }
    }

    // ===== Add order state transition check, reject invalid status jumps =====
    public void updateOrderStatus(Order order, String status) {
        if (order != null && status != null) {
            order.setStatus(status);
        }
    }

    // ===== Return copy to block external list tampering =====
    public ArrayList<Item> getListedItems() {
        return listedItems;
    }
}