package com.java.util;

import java.io.InputStream;
import java.util.Random;

public class Scanner {
    static Random random = new Random();
    static Mock mock = new Mock();

    public Scanner(InputStream in) {
    }

    public static int nextInt() {
        int numero = mock.nextInt();
        numero = random.nextInt(3);
        return numero;
    }

    public static double nextDouble() {
        double numero = mock.nextDouble();
        numero = random.nextDouble(2300);
        return numero;
    }

    public static void main(String[] args) {
        System.out.println("Difite um valor inteiro");
        int numero = nextInt();

        System.out.println(numero);
        System.out.println("Difite um valor real");
        double valor = nextDouble();
        System.out.println(valor);
    }

    public static String nextLine() {
        String string = mock.nextLine();
        return string;
    }

    public static String next() {
        String string = mock.next();
        return string;
    }

    public void close() {
    }

    public String charAt() {
        return null;
    }
}
