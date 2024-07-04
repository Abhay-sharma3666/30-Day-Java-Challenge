// Frame of hotel info here
import java.awt.*;

class HotelRoomInfo extends Frame {
    Label roomlabel,roomhead;
    TextField roomNumberField,show_out;
    Button checkoutButton;
    HotelRoomInfo(){
        // Set the title of the frame
        setTitle("Hotel Room-Info Form");
        setLayout(null);

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
        roomhead = new Label("GET INFO HERE...!! :");
        roomhead.setBounds(200, 20, 480, 50);
        roomlabel = new Label("ENTER THE ROOM NO. :");
        roomlabel.setBounds(50, 105, 450 , 40);

        // Create text filed
        roomNumberField = new TextField();
        roomNumberField.setBounds(500, 105, 90, 40);


        // Create check out button
        checkoutButton = new Button("SUBMIT");
        checkoutButton.setBounds(300,180,200,50);

        // create showing successfully check out
        show_out = new TextField();
        show_out.setBounds(50,260,780,650);

        // style
        innerPanel.setBackground(Color.LIGHT_GRAY);
        roomhead.setFont(new Font("Arial",Font.BOLD,45));
        roomlabel.setFont(new Font("SansSerif", Font.BOLD, 35));
        roomNumberField.setFont(new Font("Arial",Font.PLAIN,30));
        checkoutButton.setFont(new Font("Arial",Font.BOLD,25));
        show_out.setFont(new Font("Arial",Font.BOLD,20));

        // Add components to the inner panel
        innerPanel.add(roomhead);
        innerPanel.add(roomlabel);
        innerPanel.add(roomNumberField);
        innerPanel.add(checkoutButton);
        innerPanel.add(show_out) ;

        // Add the inner panel to the outer panel
        outerPanel.add(innerPanel);

        // Add the outer panel to the frame
        add(outerPanel);

        // Set the size of the frame
        setSize(1000,600);
    }
}
public class Day_29_AWT_GUI_Hotel_Room_Info_here {
    public static void main(String[] args) {
        // Create and show the frame
        HotelRoomInfo ri = new HotelRoomInfo();
        ri.setVisible(true);
    }
}