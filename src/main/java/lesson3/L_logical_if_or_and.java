package lesson3;

public class L_logical_if_or_and {
    public static void main(String[] args) {
        int age = 30;
        int money = 100;

        if (age < 18 && money > 50) {

        if (age <18 && (age > 10 || money > 50))
            System.out.println("Let's go to school and buy a car");
        } else if (age < 60 || money > 100) {
            System.out.println("Let's go work and buy a car");
        } else {
            System.out.println("Let's go retire");
        }
    }
}
