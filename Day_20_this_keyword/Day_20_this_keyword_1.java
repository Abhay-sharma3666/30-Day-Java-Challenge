
//  Welcome to Day 20
// Note : "this" is a reference variable that refers to the current object.
// "Today, I tackled a problem involving a this keyword.”
/* Problem 1 : this: to refer current class instance variable give example.
 */
class Student4{
    int rollno;
    String name;
    float fee;
    Student4(int rollno,String name,float fee){
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+fee);}
}
public class Day_20_this_keyword_1 {
    public static void main(String[] args) {
        Student4 s1=new Student4(111,"ankit",5000f);
        Student4 s2=new Student4(112,"sumit",6000f);
        s1.display();
        s2.display();
    }
}
