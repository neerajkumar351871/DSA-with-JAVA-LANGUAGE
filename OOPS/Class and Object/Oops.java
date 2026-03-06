
public class Oops {

    public static void main(String[] args) {
        //Pen
        pen data = new pen();// Created a pen object.
        data.setcost(20);
        data.setcolor("Red");
       // data.getColorCost();
        // Bankaccount;
        BankAccount usersdata = new BankAccount();
        usersdata.username = "Neeraj kumar  singh";
        usersdata.setpassword(1234);

    }
}

class BankAccount {

    public String username;
    private int password;

    public void setpassword(int newpassword) {
        password = newpassword;
        System.out.print("Password is:" +newpassword);

    }

    public void printpassword() {
        System.out.print("Usename is:" + username);
    }

}

class pen {

    int cost;
    String color;

    public void setcost(int newcost) {
        cost = newcost;
    }

    public void setcolor(String newcolor) {
        color = newcolor;
    }

    public void getColorCost() {
        System.out.println("Pen color:" + color);
        System.out.println("Pen Cost:" + cost);
    }

}
