
/* Problem 3 : If you apply static keyword with any method, it is known as static method.
               condition:
                      A static method belongs to the class rather than the object of a class.
                      A static method can be invoked without the need for creating an instance of a class.
                      A static method can access static data member and can change the value of it.
*/
class Student3{
    int rollno;
    String name;
    static String college = "ITS";
    //static method to change the value of static variable
    static void change(){
        college = "BBDIT";
    }
    //constructor to initialize the variable
    Student3(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display values
    void display(){System.out.println(rollno+" "+name+" "+college);}
}
public class Static_keyword_3 {
    public static void main(String[] args) {
        Student3.change();//calling change method
        //creating objects
        Student3 s1 = new Student3(111,"Karan");
        Student3 s2 = new Student3(222,"Aryan");
        Student3 s3 = new Student3(333,"Sonoo");
        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
