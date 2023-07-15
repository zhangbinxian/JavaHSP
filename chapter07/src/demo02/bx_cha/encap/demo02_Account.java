package demo02.bx_cha.encap;

public class demo02_Account {
    private String username;
    private double balance; //余额
    private String password;

    public demo02_Account() {
    }

    public demo02_Account(String username, double balance, String password) {
        // this.username = username;
        // this.balance = balance;
        // this.password = password;

        this.setUsername(username);
        this.setBalance(balance);
        this.setPassword(password);

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username.length() >= 2 && username.length() <= 4) {
            this.username = username;
        } else {
            System.out.println("username 输出有误，已更改为默认值");
            this.username = "userXXX";
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额必须大于20");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            System.out.println("password必须是6位");
            this.password = "000000";
        }
    }

    @Override
    public String toString() {
        return "demo02_TestAccount{" +
                "username='" + username + '\'' +
                ", balance=" + balance +
                ", password='" + password + '\'' +
                '}';
    }
}
