package bank.management.system;
import javax.swing.*;
public class Login extends JFrame{   //Inherit JFrame class to create a window for login page
    Login(){   //Build constructor for login page
        setSize(850,480);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Login();  //Create an instance/object of the Login class to display the login page
    }

}