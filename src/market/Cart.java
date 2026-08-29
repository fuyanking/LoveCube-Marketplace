import java.util.ArrayList;

public class Cart {
    private ArrayList<Item> items;
    private ArrayList<Integer> quantities;

    public Cart() {
        items = new ArrayList<Item>();
        quantities = new ArrayList<Integer>();
    }

    public void addItem(Item item, int qty) {
        if (item == null || qty <= 0 || qty > item.getQuantity()) {
            return;
        }

        int index = findItemIndex(item);

        if (index == -1) {
            items.add(item);
            quantities.add(qty);
        } else {
            int newQty = quantities.get(index) + qty;

            if (newQty <= item.getQuantity()) {
                quantities.set(index, newQty);
            }
        }
    }

    public double getTotal() {
        double total = 0.0;

        for (int i = 0; i < items.size(); i++) {
            total += items.get(i).getPrice() * quantities.get(i);
        }

        return total;
    }

    public int getItemCount() {
        return items.size();
    }

    public Item getItem(int index) {
        return items.get(index);
    }

    public int getQuantity(int index) {
        return quantities.get(index);
    }

    public void clear() {
        items.clear();
        quantities.clear();
    }

    public String getCartInfo() {
        String result = "";

        for (int i = 0; i < items.size(); i++) {
            result += items.get(i).getName() + " x" + quantities.get(i) + "\n";
        }

        result += "Total: $" + getTotal();
        return result;
    }

    private int findItemIndex(Item item) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItemId() == item.getItemId()) {
                return i;
            }
        }

        return -1;
    }
}
