package pack;

public class Student {
    protected int Mobile_no;
    protected String Name;

    public void set(int Mobile_no, String Name) {
        this.Mobile_no = Mobile_no;
        this.Name = Name;
    }

    public int getMobile_no() {
        return Mobile_no;
    }

    public String getName() {
        return Name;
    }
}