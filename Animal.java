package practice;
class AnimalSound { 
    public static void dog() {
        System.out.println("BOWW BOWW....!!!!!");
    }
}

public class Animal {
    public static void main(String[] args) {
        AnimalSound.dog(); // Call static method directly using class name
    }
}
