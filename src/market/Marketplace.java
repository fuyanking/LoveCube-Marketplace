import java.util.ArrayList;

public class Marketplace {
    private ArrayList<User> users;
    private Inventory inventory;
    private ArrayList<Order> orders;
    private int nextOrderId;

    public Marketplace(int rows, int cols) {
        users = new ArrayList<User>();
        inventory = new Inventory(rows, cols);
        orders = new ArrayList<Order>();
        nextOrderId = 1;
    }

    public void registerUser(User user) {
        if (user != null) {
            users.add(user);
        }
    }

    public User authenticate(String id, String password) {
        for (User user : users) {
            if (("" + user.getUserId()).equals(id) && user.hasPassword(password)) {
                return user;
            }
        }

        return null;
    }

    public Order processCheckout(Buyer buyer) {
        if (buyer == null || !buyer.isRemain()) {
            return null;
        }

        Cart cart = buyer.getCart();

        for (int i = 0; i < cart.getItemCount(); i++) {
            if (cart.getQuantity(i) > cart.getItem(i).getQuantity()) {
                return null;
            }
        }

        double total = cart.getTotal();

        for (int i = 0; i < cart.getItemCount(); i++) {
            inventory.updateQuantity(cart.getItem(i), -cart.getQuantity(i));
        }

        Order order = new Order(nextOrderId, total);
        nextOrderId++;
        orders.add(order);
        cart.clear();

        return order;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
}
