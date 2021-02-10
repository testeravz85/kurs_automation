package lesson3;

public class K_compare {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        boolean isEqual = a > b;
        boolean isEqual1 = a >= b;
        boolean isEqual2 = a <= b;
        boolean isEqual3 = a == b;
        boolean isEqual4 = a != b;

        System.out.println(a > b);

        int age = 20;

        boolean isChild = age < 18;

        if (isChild) {
            System.out.println("some text");
        }


    }
}
