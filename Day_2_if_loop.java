
// Welcome to Day 2
// "Today, I tackled a problem involving a for if-else loop.”
/* Problem 1 : Print ==> (a) Check the input number n is a perfect number or not.
                         (b) Check the input number n is a prime number or not.
              {Note:Perfect number is a sum of all factor if the input number == input number.}

 */
/* Problem 2 : Write a java program to input marks of five subjects
                Physics, Chemistry, Biology, Mathematics and Computer.
               Calculate percentage and grade according to following:
                      Percentage >= 90% : Grade A
                      Percentage >= 80% : Grade B
                      Percentage >= 70% : Grade C
                      Percentage >= 60% : Grade D
                      Percentage >= 40% : Grade E
                      Percentage < 40% : Grade F
 */
/* Problem 3 : Take input electricity unit charges and calculate total
                electricity bill according to the given condition:
                      For first 100 units Rs. unit*2
                      For next 200 units Rs. unit*3
                      For next 300 units Rs. unit*4
                      For next 400 units Rs. unit*5
                      For next 500 units Rs. unit*6
                      For unit above 600 Rs. unit*7
 */

import java.util.Scanner;
public class Day_2_if_loop  {
    public static void main(String[] args) {
        // Solving Problem 1
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any number = ");
        int n,sum=0,count=0;
        n=sc.nextInt();
        for (int i=1 ; i<=n/2 ; i++){
            if (n%i == 0){
                sum += i;
                count += 1;
            }
        }
        if (sum == n){
            System.out.println("Number "+ n + " is a perfect number.");
        }
        else {
            System.out.println("Number "+ n + " is not a perfect number.");
        }
        if (count == 1){
            System.out.println("Number "+ n + " is a prime number.");
        }
        else {
            System.out.println("Number "+ n + " is not a prime number.");
        }
        //Solving Problem 2
        Scanner sc1 = new Scanner(System.in);
        // take marks input from user
        System.out.print("Enter  Physics marks = ");
        double Physics = sc1.nextDouble();
        System.out.print("Enter  Chemistry marks = ");
        double Chemistry = sc1.nextDouble();
        System.out.print("Enter  Biology marks = ");
        double Biology = sc1.nextDouble();
        System.out.print("Enter  Mathematics marks = ");
        double Mathematics = sc1.nextDouble();
        System.out.print("Enter  Computer marks = ");
        double Computer = sc1.nextDouble();

        //Now calculate the total marks and percentage
        double totalmarks = Physics + Chemistry + Biology + Mathematics + Computer;
        double percentage = (totalmarks/500)*100;
        // Dtermine the grade

        char grade;
        if (percentage >= 90){
            grade = 'A';
        }
        else if (percentage >=80) {
            grade = 'B';
        }
        else if (percentage >=70) {
            grade = 'C';
        }
        else if (percentage >=60) {
            grade = 'D';
        }
        else if (percentage >=50) {
            grade = 'E';
        }
        else {
            grade = 'F';
        }
        // Now display result
        System.out.println("Total Marks : " + totalmarks);
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade : " + grade);
        // Solving Problem 3
        Scanner sc2 = new Scanner(System.in);
        int unit,bill;
        System.out.println("Enter Unit used = ");
        unit = sc2.nextInt();

        if (unit >=1 && unit <= 100){
            bill = unit*2;
            System.out.println("Your bill is = " + bill);
        }
        else if (unit >=101 && unit <= 200) {
            bill = (100*2)+(unit-100)*3;
            System.out.println("Your bill is = " + bill);
        }
        else if (unit >=201 && unit <= 300) {
            bill = (100*2)+(100*3)+(unit-200)*4;
            System.out.println("Your bill is = " + bill);
        }
        else if (unit >=301 && unit <= 300) {
            bill = (100*2)+(100*3)+(100*4)+(unit-300)*5;
            System.out.println("Your bill is = " + bill);
        }
        else if (unit >=401 && unit <= 500) {
            bill = (100*2)+(100*3)+(100*4)+(100*5)+(unit-400)*6;
            System.out.println("Your bill is = " + bill);
        }
        else if (unit >=501 && unit <= 600) {
            bill = (100*2)+(100*3)+(100*4)+(100*5)+(100*6)+(unit-500)*7;
            System.out.println("Your bill is = " + bill);
        }
        else if (unit >=601 && unit <= 700) {
            bill = (100*2)+(100*3)+(100*4)+(100*5)+(100*6)+(100*7)+(unit-600)*8;
            System.out.println("Your bill is = " + bill);
        }

    }
}
