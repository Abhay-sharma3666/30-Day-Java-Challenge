// Frame of hotel show guest list
import java.awt.*;

class Show_Guest_List extends Frame {
    Label headlable,name,room_no;
    TextField T_L,T_R;

    Show_Guest_List(){
        // Set the title of the frame
        setTitle("LIST OF ALL GUEST");
        setLayout(null );

        // Create and set the head label
        headlable = new Label("LIST OF ALL GUEST");
        headlable.setBounds(300,60,400,50);
        headlable.setFont(new Font("Arial",Font.BOLD,40));
        add(headlable);

        // Create outer_L panel (rectangle box)
        Panel outerPanel_L = new Panel();
        outerPanel_L.setLayout(null);
        outerPanel_L.setBackground(Color.LIGHT_GRAY);
        outerPanel_L.setBounds(40, 140, 440, 430);
        add(outerPanel_L);

        // Add components to the outter_L panel
        name = new Label("NAMES");
        name.setBounds(170,20,110,40);
        name.setFont(new Font("Arial",Font.BOLD,30));
        outerPanel_L.add(name);

        // Create inner_L panel (rectangle box)
        Panel innerPanel_L = new Panel();
        innerPanel_L.setLayout(null);
        innerPanel_L.setBackground(Color.WHITE);
        innerPanel_L.setBounds(20, 70, 400, 340);
        outerPanel_L.add(innerPanel_L);

        // Add components to the inner_L panel
        T_L = new TextField();
        T_L.setBounds(0,0,400,340);
        T_L.setFont(new Font("Arial",Font.PLAIN,18));
        innerPanel_L.add(T_L);


        // Create outer_R panel (rectangle box)
        Panel outerPanel_R = new Panel();
        outerPanel_R.setLayout(null);
        outerPanel_R.setBackground(Color.LIGHT_GRAY);
        outerPanel_R.setBounds(500, 140, 440, 430);
        add(outerPanel_R);

        // Add components to the outter_R panel
        room_no = new Label("ROOM NO.");
        room_no.setBounds(150,20,170,40);
        room_no.setFont(new Font("Arial",Font.BOLD,30));
        outerPanel_R.add(room_no);

        // Create inner_R panel (rectangle box)
        Panel innerPanel_R = new Panel();
        innerPanel_R.setLayout(null);
        innerPanel_R.setBackground(Color.WHITE);
        innerPanel_R.setBounds(20, 70, 400, 340);
        outerPanel_R.add(innerPanel_R);

        // Add components to the inner_R panel
        T_R = new TextField();
        T_R.setBounds(0,0,400,340);
        T_R.setFont(new Font("Arial",Font.PLAIN,18));
        innerPanel_R.add(T_R);


        // Set the size of the frame
        setSize(1000,600);
        setVisible(true);
    }

}

public class Day_29_AWT_GUI_Hotel_show_Guest_list {
    public static void main(String[] args) {
        Show_Guest_List agl = new Show_Guest_List();
    }
}