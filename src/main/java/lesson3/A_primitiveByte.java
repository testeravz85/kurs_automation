package lesson3;

public class A_primitiveByte {
    public static void main(String[] args) {
        byte temperature = 127;
        System.out.println(temperature);
        byte b = 'b';
        System.out.println(b);
        //byte b = 'ы'; не может так быть, так как по кодировке аски это означает число больше 127 и тип данных уже
        //должен быть другой, в байт не поместится
        //byte 1a = 10; так переменную называть нельзя, переменная не может начинаться с цифры!
        byte a1 = 23;
        byte $fis$h = 23;
    }
}
