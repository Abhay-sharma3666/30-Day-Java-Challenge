
/* Problem 4 : Create a frame and add choice option.
 */
import java.awt.*;
class frame_4 extends Frame {
    Button b1,b2;
    Label l1,l2;
    frame_4(){
        Choice c1,c2;
        l1 = new Label("Branch : ");
        add(l1);
        c1 = new Choice();
        c1.add("CSE");
        c1.add("IT");
        c1.add("Electrical");
        c1.add("Mechanical");
        add(c1);
        l2 = new Label("Semester : ");
        add(l2);
        c2 = new Choice();
        for (int i=1 ; i<=8 ; i++ ){
            c2.add(i + ""); //  convert int to string then we use + ""
        }
        add(c2);
        b1 = new Button("Ok");
        add(b1);

        b2 = new Button("Cancel");
        add(b2);
        GridLayout g = new GridLayout(3,2);
        setLayout(g);
    }
}
public class Day_28_AWT_GUI_Frame_4_choice {
    public static void main(String[] args) {
        frame_4 f4 = new frame_4();
        f4.setSize(1000, 500);
        f4.setBackground(Color.GRAY);
        f4.setVisible(true);
    }
}