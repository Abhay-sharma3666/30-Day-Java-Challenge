
/* Problem 6 : Create a frame of student details with (name,mobile,branch,semester).
 */
import java.awt.*;
class frame_6 extends Frame {
    Button ok,cancel;
    TextField t1,t2;
    Label name,mobile,branch,semester;
    frame_6(){
        name = new Label("Name : ");
        mobile = new Label("Mobile No. : ");
        branch = new Label("Branch : ");
        semester = new Label("Semester : ");
        ok = new Button("Save");
        cancel = new Button("Cancel");
        t1 = new TextField();
        t2 = new TextField();
        Choice c_branch,c_sem;
        c_branch = new Choice();
        c_branch.add("Select");
        c_branch.add("CSE");
        c_branch.add("IT");
        c_branch.add("Electrical");
        c_branch.add("Mechanical");
        c_sem = new Choice();
        c_sem.add("Select");
        for (int i=1 ; i<=8 ; i++ ){
            c_sem.add(i + ""); //  convert int to string then we use + ""
        }
        add(name);
        add(mobile);
        add(branch);
        add(semester);
        add(t1);
        add(t2);
        add(c_branch);
        add(c_sem);
        add(ok);
        add(cancel);
        name.setBounds(100,100,120,25);
        mobile.setBounds(100,150,120,25);
        branch.setBounds(100,200,120,25);
        semester.setBounds(100,250,120,25);
        ok.setBounds(150,300,90,30);
        cancel.setBounds(260,300,90,30);
        t1.setBounds(230,100,100,25);
        t2.setBounds(230,150,100,25);
        c_branch.setBounds(230,200,100,25);
        c_sem.setBounds(230,250,100,25);
        setLayout(null);
        ok.setBackground(Color.BLUE);
        cancel.setBackground(Color.red);
        t1.setBackground(Color.LIGHT_GRAY);
        t2.setBackground(Color.LIGHT_GRAY);
        c_branch.setBackground(Color.LIGHT_GRAY);
        c_sem.setBackground(Color.LIGHT_GRAY);
        name.setFont(new Font("Arial",Font.BOLD,18));
        mobile.setFont(new Font("Arial",Font.BOLD,18));
        branch.setFont(new Font("Arial",Font.BOLD,18));
        semester.setFont(new Font("Arial",Font.BOLD,18));
        ok.setFont(new Font("Arial",Font.BOLD,18));
        cancel.setFont(new Font("Arial",Font.BOLD,18));
    }
}

public class Day_28_AWT_GUI_Frame_6 {
    public static void main(String[] args) {
        frame_6 f6 = new frame_6();
        f6.setSize(600, 400);
        f6.setVisible(true);

    }
}