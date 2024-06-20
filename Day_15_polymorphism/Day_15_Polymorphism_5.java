/* Program 5: To create a base class Sports with a method called play().
              Create three subclasses: Football, Basketball, and Rugby.
              Override the play() method in each subclass to play a specific
              statement for each sport.

 */
// Sports.java
// Base class Sports
class Sports {
    public void play() {
        System.out.println("Playing a sport...\n");
    }
}
// Football.java
// Subclass Football
class Football extends Sports {
    @Override
    public void play() {
        System.out.println("Playing football...");
    }
}
// Basketball.java
// Subclass Basketball
class Basketball extends Sports {
    @Override
    public void play() {
        System.out.println("Playing basketball...");
    }
}
// Rugby.java
// Subclass Rugby

class Rugby extends Sports {
    @Override
    public void play() {
        System.out.println("Playing rugby...");
    }
}
// Main.java
// Main class
public class Day_15_Polymorphism_5 {
    public static void main(String[] args) {
        Sports sports = new Sports();
        Football football = new Football();
        Basketball basketball = new Basketball();
        Rugby rugby = new Rugby();

        sports.play();
        football.play();
        basketball.play();
        rugby.play();
    }
}
