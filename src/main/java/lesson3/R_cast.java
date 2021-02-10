package lesson3;

import jdk.swing.interop.SwingInterOpUtils;

public class R_cast {
    public static void main(String[] args) {
        int a = 23;
        long b = a;

        long c = 34;
        c = 73_593_45_7989L;
        int d = (int) c;

        System.out.println(d);

        System.out.println((float) 3/2);

    }
}
