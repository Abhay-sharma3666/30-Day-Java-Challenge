// Frame of hotel check out form
import java.awt.*;

class HotelCheckOutForm extends Frame {
    Label roomlabel;
    TextField roomNumberField,show_out;
    Button checkoutButton;
    HotelCheckOutForm(){
        // Set the title of the frame
        setTitle("Hotel Check-Out Form");
        setLayout(null );

        // Create outer panel (rectangle box)
        Panel outerPanel = new Panel();
        outerPanel.setLayout(null);
        outerPanel.setBackground(Color.LIGHT_GRAY);
        outerPanel.setBounds(40, 40, 920, 540);

        // Create inner panel (nested rectangle box)
        Panel innerPanel = new Panel();
        innerPanel.setLayout(null);
        innerPanel.setBackground(Color.WHITE);
        innerPanel.setBounds(20, 20, 880, 500);

        // Create and set the label for entering room number
        roomlabel = new Label("ENTER THE ROOM NO. :");
        roomlabel.setBounds(50, 80, 480, 50);

        // Create text filed
        roomNumberField = new TextField();
        roomNumberField.setBounds(570, 80, 90, 50);
        roomlabel.setFont(new Font("SansSerif", Font.BOLD, 18));

        // Create check out button
        checkoutButton = new Button("CHECK OUT");
        checkoutButton.setBounds(300,180,200,50);

        // create showing successfully check out
        show_out = new TextField();
        show_out.setBounds(50,260,780,650);

        // style
        innerPanel.setBackground(Color.LIGHT_GRAY);
        roomlabel.setFont(new Font("Arial",Font.BOLD,40));
        roomNumberField.setFont(new Font("Arial",Font.PLAIN,35));
        checkoutButton.setFont(new Font("Arial",Font.BOLD,30));
        show_out.setFont(new Font("Arial",Font.BOLD,20));


        // Add components to the inner panel
        innerPanel.add(roomlabel);
        innerPanel.add(roomNumberField);
        innerPanel.add(checkoutButton);
        innerPanel.add(show_out);

        // Add the inner panel to the outer panel
        outerPanel.add(innerPanel);

        // Add the outer panel to the frame
        add(outerPanel);

        // Set the size of the frame
        setSize(500, 400);

        setSize(1000,600);
    }
}
public class Day_29_AWT_GUI_HotelCheckOutForm {
    public static void main(String[] args) {
        // Create and show the frame
        HotelCheckOutForm co = new HotelCheckOutForm();
        co.setVisible(true);
    }
}