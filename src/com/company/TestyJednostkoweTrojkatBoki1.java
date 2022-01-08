package com.company;

import java.util.Scanner;

public class TestyJednostkoweTrojkatBoki1 {
    static float bokA;
    static float bokB;
    static float bokC;
    static float obwod;
    static float pole;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj długość boku A trójkąta: ");
        bokA = scanner.nextFloat();
        System.out.print("Podaj długość boku B trójkąta: ");
        bokB = scanner.nextFloat();
        System.out.print("Podaj długość boku C trójkąta: ");
        bokC = scanner.nextFloat();

        TrojkatBoki trojkatBoki = new TrojkatBoki(bokA, bokB, bokC);
        obwod = trojkatBoki.obliczObwod();
        pole = trojkatBoki.obliczPole();

        System.out.print("Trójkąt o bokach: ");
        System.out.print(trojkatBoki.getBokA() + ", " );
        System.out.print(trojkatBoki.getBokB() + ", " );
        System.out.print(trojkatBoki.getBokC() + ", " );
        System.out.println("ma obwód: " + obwod + " i pole: " + pole);
    }
}
