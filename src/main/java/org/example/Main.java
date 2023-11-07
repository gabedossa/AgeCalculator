package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("O objetivo desse sistema é mostrar a idade do usuario.");
            System.out.println("Digite o ano em que voce nasceu:");
            int birth = sc.nextInt();
        System.out.println("Digite o ano atual:");
            int currentYear = sc.nextInt();

            int age = currentYear - birth;
        System.out.println("Sua idade é: " + age);

        sc.close();
        }
    }