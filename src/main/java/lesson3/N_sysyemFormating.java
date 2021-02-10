package lesson3;

public class N_sysyemFormating {
    public static void main(String[] args) {
        System.out.print("AAAA\n");
        System.out.println("BBBB");

        String name = "Vova";
        int money = 200;

        // instead og this : System.out.printf(" Hello '" + name + "' you won '$" + money);
        //we write next:

        System.out.printf("Hello '%s' you won '%d' !!!!", name,money);
    }
}
