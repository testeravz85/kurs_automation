package homework.lesson1;

public class Task1 {
    /* Минимум трех чисел
    Написать функцию, которая вычисляет минимум из трёх чисел.
    */
    public static void main(String[] args) {


        int min = get_min_number(-5, 2,3);
        System.out.println(min);

    }

    public static int get_min_number(int a, int b, int c) {
       int min;

       if (a < b) {
           min = a;

       } else {
           min = b;
       }

        if (c < min) {
            min = c;
        }
       return min;
    }
}