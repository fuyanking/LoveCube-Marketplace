import java.util.ArrayList;

public class LoveCubeMarketplace {
    public static void main(String[] args) {
        System.out.println("=== Love Cube Test Cases ===\n");

        testEmptyCart();
        testOverStockAdd();
        testSearchMissingItem();
        testInsufficientStockCheckout();
        testWrongPasswordLogin();
    }

    // 1. Empty cart checkout
    public static void testEmptyCart() {
        Marketplace mp = new Marketplace(3,3);
        Buyer b = new Buyer(201, "pass");
        mp.registerUser(b);
        Order o = b.checkout(mp);
        System.out.println("Test 1 Empty Cart: " + (o == null ? "PASS" : "FAIL"));
    }

    // 2. Add quantity > stock
    public static void testOverStockAdd() {
        Item item = new Item("Pencil", 1, 5, 1.0, "Stationery");
        Cart c = new Cart();
        c.addItem(item, 10);
        System.out.println("Test 2 Over Stock: " + (c.getItemCount() == 0 ? "PASS" : "FAIL"));
    }

    // 3. Search non-existent item
    public static void testSearchMissingItem() {
        Inventory inv = new Inventory(3,3);
        Item res = inv.findItemByName("NonExistent");
        System.out.println("Test 3 Missing Item: " + (res == null ? "PASS" : "FAIL"));
    }

    // 4. Checkout insufficient stock
    public static void testInsufficientStockCheckout() {
        Marketplace mp = new Marketplace(3,3);
        Buyer b = new Buyer(201, "pass");
        mp.registerUser(b);
        Item item = new Item("Book", 2, 2, 10.0, "Book");
        mp.getInventory().addItem(item,0,0);
        b.addToCart(item,5);
        Order o = b.checkout(mp);
        System.out.println("Test 4 Insufficient Stock: " + (o == null ? "PASS" : "FAIL"));
    }

    // 5. Wrong password login
    public static void testWrongPasswordLogin() {
        Marketplace mp = new Marketplace(3,3);
        Buyer b = new Buyer(201, "correct");
        mp.registerUser(b);
        User u = mp.authenticate("201", "wrong");
        System.out.println("Test 5 Wrong Password: " + (u == null ? "PASS" : "FAIL"));
    }

}



