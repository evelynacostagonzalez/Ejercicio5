package com.company;

import java.util.Scanner;

/*
Para tributar un determinado impuesto se debe ser mayor de 16 años y tener unos ingresos iguales
o superiores a 1000 € mensuales. Escribir un programa que pregunte al usuario su edad y
sus ingresos mensuales y muestre por pantalla si el usuario tiene que tributar o no.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	int edad;
    int ingresos;
        System.out.println("¿Qué edad tienes?");
        edad = scan.nextInt();
        System.out.println("¿Cuáles son tus ingresos mensuales?");
        ingresos = scan.nextInt();

        if (edad > 16 && ingresos>=1000){
            System.out.println("Tienes que tributar");
        }else
            System.out.println("No tienes que tributar");
    }
}
