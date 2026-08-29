import java.util.ArrayList;

public class Buyer extends User {
    private Cart cart;
    private ArrayList<Order> list;

    public Buyer(int userId, String password) {
        super(userId, password);
        cart = new Cart();
        list = new ArrayList<Order>();
    }

    public void addToCart(Item item, int qty) {
        cart.addItem(item, qty);
    }

    public Order checkout(Marketplace marketplace) {
        Order order = marketplace.processCheckout(this);

        if (order != null) {
            list.add(order);
        }

        return order;
    }

    public boolean isRemain() {
        return cart.getItemCount() > 0;
    }

    public Cart getCart() {
        return cart;
    }

    public ArrayList<Order> getOrders() {
        return list;
    }
}
