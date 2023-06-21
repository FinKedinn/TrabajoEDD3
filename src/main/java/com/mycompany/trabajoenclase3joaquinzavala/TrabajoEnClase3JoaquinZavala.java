package com.mycompany.trabajoenclase3joaquinzavala;

import java.util.Scanner;
import java.util.Stack;

public class TrabajoEnClase3JoaquinZavala {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Character> pila = new Stack<>();
        System.out.println("Ingrese la cadena de texto solo con: {,[,(,),],}");
        String ejemplo = in.nextLine();
        for (int i = 0; i < ejemplo.length(); i++) {
            char j = ejemplo.charAt(i);
            if (pila.isEmpty()) {
                pila.push(j);

                for (char character : pila) {
                    System.out.print(character);
                }
                System.out.println("");
            } else if (j == '(' || j == '[' || j == '{') {
                pila.push(j);
                for (char character : pila) {
                    System.out.print(character);
                }
                System.out.println("");
            } else if (j == ')' || j == ']' || j == '}') {
                if (j == ')' && pila.get(pila.size() - 1) == '(') {
                    pila.pop();
                    for (char character : pila) {
                        System.out.print(character);
                    }
                    System.out.println("");
                } else if (j == ']' && pila.get(pila.size() - 1) == '[') {
                    pila.pop();
                    for (char character : pila) {
                        System.out.print(character);
                    }
                    System.out.println("");
                } else if (j == '}' && pila.get(pila.size() - 1) == '{') {
                    pila.pop();
                    for (char character : pila) {
                        System.out.print(character);
                    }
                    System.out.println("");

                } else {
                    pila.push(j);
                    for (char character : pila) {
                        System.out.print(character);
                    }
                    System.out.println("");

                }

            }
        }

    }

}
