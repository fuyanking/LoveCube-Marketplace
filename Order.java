public class Order {
    private String status;
    private double total;
    private int orderId;

    public Order(int orderId, double total) {
        this.orderId = orderId;
        this.total = total;
        status = "placed";
    }

    public String getStatus() {
        return status;
    }

    public double getTotal() {
        return total;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setStatus(String status) {
        if (status != null) {
            this.status = status;
        }
    }

    public String getInfo() {
        return "Order #" + orderId + " | status: " + status + " | total: $" + total;
    }
}