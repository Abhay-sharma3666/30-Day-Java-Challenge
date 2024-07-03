
/* Problem 5 : Create a frame and add checkbox.
 */
import java.awt.*;
class frame_5 extends Frame {
    Label l1;
    Button b1,b2;
    frame_5(){
        Checkbox c1,c2,c3,c4;
        l1 = new Label("Branch : ");
        add(l1);
        c1 = new Checkbox ("IT");
        c2 = new Checkbox ("CSE");
        c3 = new Checkbox ("Mechanical");
        c4 = new Checkbox ("civil");
        b1 = new Button("Ok");
        b2 = new Button("Cancel");
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(b1);
        add(b2);
        GridLayout g = new GridLayout(1,7);
        setLayout(g);
    }
}

public class Day_28_AWT_GUI_Frame_5_checkbox {
    public static void main(String[] args) {
        frame_5 f5 = new frame_5();
        f5.setSize(1000,500);
        f5.setVisible(true);
    }
}