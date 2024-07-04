
//  Welcome to Day 29
// "Today, I tackled a problem involving a "Abstract Window Toolkit with GUI".
/* Problem 1 : create a frame for Hotel Management.
*/
import java.awt.*;
class Welcome extends Frame {
    Button b1,b2,b3,b4,b5;
    Label l1;
    Welcome(){
        // Set the title of the frame
        setTitle("Hotel Management");
        l1 = new Label("WELCOME TO HOTEL");
        b1 = new Button("1. CHECK INN");
        b2 = new Button("2. SHOW GUEST LIST");
        b3 = new Button("3. CHECK OUT");
        b4 = new Button("4. GET INFO OF GUEST");
        b5 = new Button("5. EXIT");
        add(l1);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        l1.setBounds(250,90,535,50);
        b1.setBounds(120,200,500,80);
        b2.setBounds(120,300,500,80);
        b3.setBounds(120,400,500,80);
        b4.setBounds(120,500,500,80);
        b5.setBounds(120,600,500,80);
        l1.setBackground(Color.LIGHT_GRAY);
        b1.setBackground(Color.LIGHT_GRAY);
        b2.setBackground(Color.LIGHT_GRAY);
        b3.setBackground(Color.LIGHT_GRAY);
        b4.setBackground(Color.LIGHT_GRAY);
        b5.setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        l1.setFont(new Font("Arial",Font.BOLD,50));
        b1.setFont(new Font("HP Simplified",Font.BOLD,25));
        b2.setFont(new Font("HP Simplified",Font.BOLD,25));
        b3.setFont(new Font("HP Simplified",Font.BOLD,25));
        b4.setFont(new Font("HP Simplified",Font.BOLD,25));
        b5.setFont(new Font("HP Simplified",Font.BOLD,25));

    }
}
public class Day_29_AWT_GUI_Frame_Hotel_Management {
    public static void main(String[] args) {
        Welcome w  = new Welcome();
        w.setSize(1000, 800);
        w.setVisible(true);
        w.setBackground(Color.lightGray);
    }
}