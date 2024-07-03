
/* Problem 2 : Create a frame and add two button (ok,cancel).
 */
import java.awt.*;
class frame_2 extends Frame {
    Button b1,b2;
    frame_2(){
        b1 = new Button("OK");
        b2 = new Button("Cancel");
        add(b1);
        add(b2);
        GridLayout g = new GridLayout(1,2);
        setLayout(g);
    }
}
public class Day_28_AWT_GUI_Frame_2_with_button {
    public static void main(String[] args) {
        frame_2 f2 = new frame_2();
        f2.setSize(1000, 600);
        f2.setVisible(true);
    }
}