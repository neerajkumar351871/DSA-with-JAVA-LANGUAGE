
public class AccessModifiers {

    public static void main(String args[]) {
        Account userdata = new Account();
        userdata.name = "Neeraj kumar";
        userdata.changepasssword("asdfg");
        System.out.println(userdata.name);
        //  Private value are not access and  change password .
        // only change with second var of through  function.
       
    }
}

class Account {

    public String name;
    private String password; // Priavte value only acces in class;

    public void changepasssword(String newpassword) {
        password = newpassword;
        System.out.println(password);
    }

}
