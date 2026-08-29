public class Inventory {
    private Item[][] categoryGrid;

    public Inventory(int rows, int cols) {
        categoryGrid = new Item[rows][cols];
    }

    public void addItem(Item item, int row, int col) {
        if (isValidLocation(row, col)) {
            categoryGrid[row][col] = item;
        }
    }

    public Item findItemByName(String name) {
        for (int row = 0; row < categoryGrid.length; row++) {
            for (int col = 0; col < categoryGrid[row].length; col++) {
                Item item = categoryGrid[row][col];

                if (item != null && item.getName().equals(name)) {
                    return item;
                }
            }
        }

        return null;
    }

    public void updateQuantity(Item item, int delta) {
        if (item == null) {
            return;
        }

        int newQuantity = item.getQuantity() + delta;

        if (newQuantity >= 0) {
            item.setQuantity(newQuantity);
        }
    }

    public String getInventoryInfo() {
        String result = "Inventory:\n";

        for (int row = 0; row < categoryGrid.length; row++) {
            for (int col = 0; col < categoryGrid[row].length; col++) {
                if (categoryGrid[row][col] != null) {
                    result += "[" + row + "][" + col + "] "
                            + categoryGrid[row][col].getInfo() + "\n";
                }
            }
        }

        return result;
    }

    private boolean isValidLocation(int row, int col) {
        return row >= 0 && row < categoryGrid.length
                && col >= 0 && col < categoryGrid[row].length;
    }
}
