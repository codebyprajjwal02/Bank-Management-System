package bank.management.system;
import java.awt.*;
import javax.swing.*;
public class Login extends JFrame{   //Inherit JFrame class to create a window for login page
    Login(){                         //Build constructor for login page
        super("Bank Management System");  //Set the title of the login page

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/bank.png")); //Load an image icon for the login page in the variable i1 in the form of imageicon
        Image i2= i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT); //Scale the image to fit the login page
        ImageIcon i3= new ImageIcon(i2); //Create a new image icon with the scaled image
        JLabel image= new JLabel(i3); //Create a JLabel which helps to display the image on the login page
        image.setBounds(350,10,100,100); //Set the position and size of the image on the login page
        add(image);
       
        ImageIcon ii1= new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));  //Load an image icon for the login page in the variable i1 in the form of imageicon
        Image ii2= ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT); //Scale the image to fit the login page
        ImageIcon ii3= new ImageIcon(ii2); //Create a new image icon with the scaled image
        JLabel image2= new JLabel(ii3); //Create a JLabel which helps to display the image on the login page
        image2.setBounds(650,350,100,100); //Set the position and size of the image on the login page
        add(image2);
       
        setLayout(null); 
        setVisible(true);             //Make the login page visible
        setSize(850,480);  //Set the size of the login page            
        setLocation(450,200);      //Set the location of the login page on the screen
    }
    public static void main(String[] args) {
        new Login();  //Create an instance/object of the Login class to display the login page
    }

}