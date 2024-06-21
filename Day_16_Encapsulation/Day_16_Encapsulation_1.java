
//  Welcome to Day 16
// "Today, I tackled a problem involving an Encapsulation.”

/* Problem 1 : To create a class called Person with private instance variables name, age.
               and country. Provide public getter and setter methods to access and
               modify these variables.
*/
//  Solving :-->
// Person.java
// Person Class
class Person2 {
    private String name;
    private int age;
    private String country;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}

public class Day_16_Encapsulation_1 {
    public static void main(String[] args) {
        // Create an instance of Person
        Person2 person = new Person2();

        // Set values using setter methods
        person.setName("Arthfael Viktorija");
        person.setAge(25);
        person.setCountry("USA");

        // Get values using getter methods
        String name = person.getName();
        int age = person.getAge();
        String country = person.getCountry();

        // Print the values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
    }
}
