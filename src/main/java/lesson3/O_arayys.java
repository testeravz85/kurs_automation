package lesson3;

public class O_arayys {
    public static void main(String[] args) {


        int arr[] = {10, 20, 30, 40};  //массив данных, это по языку с++
        int[] arr2 = {10, 20, 30, 40}; // массив данных по языку Джава, но обе формы принятые и корректные в использовании

        boolean[] arr3 = {true, false, true};
        String[] strArr = {"Hello", "world", "!!!"};

        //int[] arrComp = {"Str", 5678, true};

        System.out.println(arr[0]);// это мы берем первый элемент массива, нумерация элементов всегда с нуля
        System.out.println(arr[2]);// второй элемент массива

        arr[2] = 3000;// меняем значение второго элемента

        System.out.printf("Length: '%d'", arr.length);
        System.out.println(arr[arr.length -1]);// если мы не знаем длину, но нам нужен последний элемент

    }
}
