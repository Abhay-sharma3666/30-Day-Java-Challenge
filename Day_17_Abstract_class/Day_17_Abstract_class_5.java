
/* Problem 5 : An abstract class called “Marks” is needed to calculate the percentage of marks earned by students A
               in three subjects (with each subject out of 100) and student B in four subjects (with each subject
               out of 100). This class must contain the abstract method “getPercentage,” which two other classes,
               “A” and “B,” will inherit. The method “getPercentage,” which provides the percentage of students,
               is shared by classes “A” and “B.”
 */
abstract class Marks {
    abstract double getPercentage();
}
class A extends Marks {
    double subject1, subject2, subject3;
    A(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
    double getPercentage() {
        double percentage = (subject1 + subject2 + subject3) / 3.0;
        return percentage;
    }
}
class B extends Marks {
    double subject1, subject2, subject3, subject4;
    B(double subject1, double subject2, double subject3, double subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }
    double getPercentage() {
        double percentage = (subject1 + subject2 + subject3 + subject4) / 4.0;
        return percentage;
    }
}
public class Day_17_Abstract_class_5 {
    public static void main(String[] args) {
        A studentA = new A(80.0, 90.0, 95.0);
        B studentB = new B(70.0, 80.0, 90.0, 85.0);

        System.out.println("Percentage obtained by Student A: " + studentA.getPercentage());
        System.out.println("Percentage obtained by Student B: " + studentB.getPercentage());
    }
}
