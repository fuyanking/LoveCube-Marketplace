public class User {
    private int userId;
    private String password;

    public User(int userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public boolean hasPassword(String password) {
        return this.password.equals(password);
    }
}