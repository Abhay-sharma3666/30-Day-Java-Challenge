//  Welcome to Day 28
// "Today, I tackled a problem involving a "Abstract Window Toolkit with GUI" .”
/* Problem 1 : Create a frame with size width(1000) and height(1000).
*/
import java.awt.*;

public class Day_28_AWT_GUI_Frame_1 extends Frame  {
    public static void main(String[] args) {
        Day_28_AWT_GUI_Frame_1 f = new Day_28_AWT_GUI_Frame_1();
        f.setSize(1000,1000);
        f.setVisible(true);
    }
}