package com.java.util;

import java.util.Scanner;

public class Mock {

    static Scanner scanner = new Scanner(System.in);

    public static int nextInt() {
        int numero = scanner.nextInt();
        return numero;
    }

    public static double nextDouble() {
        double numero = scanner.nextDouble();
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
        String string = scanner.nextLine();
        return string;
    }

    public static String next() {
        String string = scanner.next();
        return string;
    }

    public void close() {
    }
}
