// Create a class to represent a User
class User {
    private String username;
    private String password;
    private String role; // "customer", "admin", or "employee"

    public void User();

    public void User(String username, String password, String role){
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setRole(String role){
        this.role = role;
    }
}

// Create a class to represent a User Login Service
class UserLoginService {
    // Method to create a customer account
    public void createCustomerAccount(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setRole("customer");
        // Save the user to the database
    }

    // Method to create an employee account
    public void createEmployeeAccount(String username, String password, User admin) {
        if (admin.getRole().equals("admin")) {
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            user.setRole("employee");
            // Save the user to the database
        } else {
            // Throw an exception if the user is not an admin
        }
    }

    // Method to login a user
    public User login(String username, String password) {
        // Query the database for a user with the given username and password
        // Return the user if found, otherwise return null
    }
}
