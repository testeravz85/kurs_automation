package lesson3;

public class P_loops {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 35, 45, 50};
        //System.out.println(arr[0]);

        //for (int i = 5; i <= 25; i+=5) {
            //или эту же запись можно так записать:
            // if(i%5 == 0)
            //System.out.println("-------" +i);

            // для того, чтоб пробежаться по массиву
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < 10; j++) {
                    //System.out.println(arr[i]); нам надо вывести каждое число по 10 раз в одной строке
                    //но так у нас выведется по 10 раз в столбике число, поэтому надо убрать перенос строки (ln)
                    System.out.print(arr[i] + " ");

                }
                System.out.println();// эту мы добавили пустой чтоб был перенос на новую строку после каждого цикла или
                //System.out.println("/n"); или можно было б так тоже сделать перенос


                //for (int i = 0; i < arr.length; i++) System.out.println(arr[i]);// можно так, цикл и тело цикла в одной строке
                // если все тело цикла выполняется в одной строчке, но воспринимается сложнее для чтения
                //и если будут какие-то измнения, возможно придется переделывать уже с фигурными скобками, менять
            }

            int increment = 0;

            while (increment > arr.length) {
                System.out.println(increment);
                increment++;
            }

            increment = 0;

        do {
            System.out.println(arr[increment]);
            increment++;
        } while (increment < arr.length);

        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]); // цикл от большего к меньшему
            
        }

    }
}
