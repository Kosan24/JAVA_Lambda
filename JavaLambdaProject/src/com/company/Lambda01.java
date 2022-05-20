package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> numero = new ArrayList<>(Arrays.asList(34, 22, 16, 11, 35, 20, 63, 21, 65, 44, 66, 64, 81, 38, 15));

        printElStuructured(numero);
        System.out.println("\n   ***   ");
        printElFunctional(numero);
        System.out.println("\n   ***   ");
        printElFunctional1(numero);
        System.out.println("\n   ***   ");
        printElFunctional2(numero);
        System.out.println("\n   ***   ");
        printCiftElSturctured(numero);
        System.out.println("\n   ***   ");
        printCiftElFunctional(numero);
        System.out.println("\n   ***   ");
        printCiftElFunctional1(numero);
        System.out.println("\n   ***   ");
        printCiftOtzKckFunctional(numero);
        System.out.println("\n   ***   ");
        printCiftOtzBykFunctional(numero);
        System.out.println("\n   ***   ");
    }


    public static void printElStuructured(List<Integer> numero) {
        for (Integer w : numero) {
            System.out.print(w + " ");
        }
    }

    public static void printElFunctional(List<Integer> numero) {
        numero.stream().forEach((t) -> System.out.print(t + " "));
    }

    public static void printElFunctional1(List<Integer> numero) {
        numero.stream().forEach(System.out::print);

    }

    public static void ecrire(int a) {
        System.out.print(a + " ");
    }

    public static void printElFunctional2(List<Integer> numero)
            {
        numero.stream().forEach(Lambda01::ecrire);
    }


    public static void printCiftElSturctured(List<Integer> numero) {
        for (Integer w : numero) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }


    public static void printCiftElFunctional(List<Integer> numero) {

        numero.
                stream().
                filter(t -> t % 2 == 0).
                forEach(Lambda01::ecrire);

    }

    public static boolean trouverunepaire(int a) {

        return a % 2 == 0;
    }

    public static void printCiftElFunctional1(List<Integer> sayi) {

        sayi.
                stream().
                filter(Lambda01::trouverunepaire).
                forEach(Lambda01::ecrire);

    }


    public static void printCiftOtzKckFunctional(List<Integer> numero) {
        numero.
                stream().
                // filter(t -> t % 2 == 0 && t < 34).
                        filter(Lambda01::trouverunepaire).
                filter(t -> t < 34).//lambda exp.
                forEach(Lambda01::ecrire);
    }




    public static void printCiftOtzBykFunctional(List<Integer> numero) {
        numero.
                stream().
                filter(t -> t % 2 == 0 || t > 34).

                // filter(t -> t > 34).//lambda exp.
                        forEach(Lambda01::ecrire);
    }
}
