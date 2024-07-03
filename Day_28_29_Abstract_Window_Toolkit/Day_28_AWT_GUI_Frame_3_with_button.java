
/* Problem 3 : Create a frame and add Lable,TextFiled.button;
 */
import java.awt.*;
class frame_3 extends Frame {
    Label l1,l2;
    TextField t1,t2;
    Button b1,b2;
    frame_3(){
        l1 = new Label("Number_1 : ");
        t1 = new TextField();
        l2 = new Label("Number_2 : ");
        t2 = new TextField();
        b1 = new Button("Ok");
        b2 = new Button("Cancel");
        t1.setBackground(Color.cyan);
        t2.setBackground(Color.cyan);
        b1.setBackground(Color.BLUE);
        b2.setBackground(Color.red);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        GridLayout g = new GridLayout(3,2);
        setLayout(g);
    }

}
public class Day_28_AWT_GUI_Frame_3_with_button {
    public static void main(String[] args) {
        frame_3 f3 = new frame_3();
        f3.setSize(1000, 500);
        f3.setBackground(Color.GRAY);
        f3.setVisible(true);
    }
}