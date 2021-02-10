package homework.lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом do () while
*/

public class Task4 {

    public static void main(String[] args) {
        String s = "Alexandra";
        int i = 5;

        do {
            int j = 10;
            do {
                System.out.print(s + " ");
                j--;

            } while (j > 0);
            i--;
            System.out.println();
        } while (i > 0);



    }
}


