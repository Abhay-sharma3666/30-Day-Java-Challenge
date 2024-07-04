// frame of Hotel check inn
import java.awt.*;

class HotelCheckInForm extends Frame {
    HotelCheckInForm() {
        // Set the title of the frame
        setTitle("Hotel Check-In Form");
        setLayout(null );

        // Create labels
        Label titleLabel = new Label("YOU CLICKED ON   :   CHECK INN");
        Label nameLabel = new Label("ENTER YOUR NAME          :");
        Label addressLabel = new Label("ENTER YOUR ADDRESS  :");
        Label numberLabel = new Label ("ENTER YOUR NUMBER    :");
        Label daysLabel = new Label("NUMBER OF DAYS            :");
        Label roomLabel = new Label("CHOOSE YOUR ROOM     :");
        Label paymentLabel = new Label("CHOOSE PAYMENT METHOD :");

        // Create text fields
        TextField nameField = new TextField();
        TextField addressField = new TextField();
        TextField numberField = new TextField();
        TextField daysField = new TextField();

        // Create checkboxes
        Checkbox deluxeCheckbox = new Checkbox("DELUXE");
        Checkbox fullDeluxeCheckbox = new Checkbox("FULL DELUXE");
        Checkbox generalCheckbox = new Checkbox("GENERAL");
        Checkbox jointCheckbox = new Checkbox("JOINT");
        Checkbox cashCheckbox = new Checkbox("By cash");
        Checkbox cardCheckbox = new Checkbox("By credit/debit card");

        // Create buttons
        Button nameOkButton = new Button("OK");
        Button addressOkButton = new Button("OK");
        Button numberOkButton = new Button("OK");
        Button daysOkButton = new Button("OK");
        Button submitButton = new Button("SUBMIT");

        // Set positions of the components
        titleLabel.setBounds(90,90,825,60);

        nameLabel.setBounds(40, 200, 350, 40);
        nameField.setBounds(425, 200, 450, 40);
        nameOkButton.setBounds(890, 200, 50, 40);

        addressLabel.setBounds(40, 260, 350, 40);
        addressField.setBounds(425, 260, 450, 40);
        addressOkButton.setBounds(890, 260, 50, 40);

        numberLabel.setBounds(40, 320, 350, 40);
        numberField.setBounds(425, 320, 450, 40);
        numberOkButton.setBounds(890, 320, 50, 40);

        daysLabel.setBounds(40, 380, 350, 40);
        daysField.setBounds(425, 380, 450, 40);
        daysOkButton.setBounds(890, 380, 50, 40);

        roomLabel.setBounds(40, 440, 350, 40);
        deluxeCheckbox.setBounds(425, 440, 115, 40);
        fullDeluxeCheckbox.setBounds(580, 440, 150, 40);
        generalCheckbox.setBounds(425, 500, 115, 40);
        jointCheckbox.setBounds(580, 500, 100, 40);

        paymentLabel.setBounds(40, 560, 350, 40);
        cashCheckbox.setBounds(425, 560, 115, 40);
        cardCheckbox.setBounds(580, 560, 200, 40);
        submitButton.setBounds(380, 640, 110, 40);

        // Style
        titleLabel.setFont(new Font("Arial",Font.BOLD,50));

        nameLabel.setFont(new Font("Arial",Font.BOLD,27));
        nameField.setFont(new Font("Arial",Font.PLAIN,25));

        addressLabel.setFont(new Font("Arial",Font.BOLD,27));
        addressField.setFont(new Font("Arial",Font.PLAIN,25));

        numberLabel.setFont(new Font("Arial",Font.BOLD,27));
        numberField.setFont(new Font("Arial",Font.PLAIN,25));

        daysLabel.setFont(new Font("Arial",Font.BOLD,27));
        daysField.setFont(new Font("Arial",Font.PLAIN,25));

        roomLabel.setFont(new Font("Arial",Font.BOLD,27));
        deluxeCheckbox.setFont(new Font("Arial",Font.BOLD,20));
        fullDeluxeCheckbox.setFont(new Font("Arial",Font.BOLD,20));
        generalCheckbox.setFont(new Font("Arial",Font.BOLD,20));
        jointCheckbox.setFont(new Font("Arial",Font.BOLD,20));

        paymentLabel.setFont(new Font("Arial",Font.BOLD,23));
        cashCheckbox.setFont(new Font("Arial",Font.BOLD,20));
        cardCheckbox.setFont(new Font("Arial",Font.BOLD,20));

        submitButton.setFont(new Font("Arial",Font.BOLD,25));

        // colour
        setBackground(Color.lightGray);


        // Add components to the frame
        add(titleLabel);
        add(nameLabel);
        add(nameField);
        add(nameOkButton);
        add(addressLabel);
        add(addressField);
        add(addressOkButton);
        add(numberLabel);
        add(numberField);
        add(numberOkButton);
        add(daysLabel);
        add(daysField);
        add(daysOkButton);
        add(roomLabel);
        add(deluxeCheckbox);
        add(fullDeluxeCheckbox);
        add(generalCheckbox);
        add(jointCheckbox);
        add(paymentLabel);
        add(cashCheckbox);
        add(cardCheckbox);
        add(submitButton);

        // Set the size of the frame
        setSize(1000, 800);
    }
}
public class Day_29_AWT_GUI_HotelCheckInForm {
    public static void main(String[] args) {
        // Create and show the frame
        HotelCheckInForm form = new HotelCheckInForm();
        form.setVisible(true);
    }
}