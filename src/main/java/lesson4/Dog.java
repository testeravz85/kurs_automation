package lesson4;

public class Dog {
    String name = "Palkan";
    String color = "grey";
    int age = 10;
    static int counter = 0;

    public Dog() {
        System.out.println("Created new instanceof the Dog");
        Dog.counter++;
    }

    public Dog(String name) {
        this.name = name;
        Dog.counter++;
        }

        public Dog( String name, int age) {
        this.name = name;
        this.age = age;
        Dog.counter++;


    System.out.println("Created new instanceof the Dog");

    }

    public int getAge() {
        System.out.println("I will give you my age");
        return age;
    }

    public void bark () {
        System.out.println(" bark-bark ....");
    }

    public void bark (int a, int b) {
        System.out.println(" bark-bark ....");
    }


    public void bark (int amount, String personName) {
        for (int i = 0; i < amount; i++) {
            System.out.println(personName + " bark-bark ....");
        }

    }

    public void sleep () {
        System.out.println(" I am sleeping ...");

    }

    static public void someMethod() {
        System.out.println("Some static method");
    }



}
