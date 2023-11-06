package cl.jpino.codember;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Challenge_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un texto:");
        String texto = scanner.nextLine();

        //Separando palabras segun espacio
        String[] palabras = texto.split("\\s+");

        //Hashmap para almacenar la frecuencia de cada palabra
        Map<String, Integer> frecuenciaPalabras = new HashMap<>();

        for (String palabra : palabras) {
            //Palabras a minúsculas
            palabra = palabra.toLowerCase();

            if (frecuenciaPalabras.containsKey(palabra)) {
                //Si la palabra ya está en el HashMap, aumenta frecuencia en 1
                int frecuencia = frecuenciaPalabras.get(palabra);
                frecuenciaPalabras.put(palabra, frecuencia + 1);
            } else {
                //Si la palabra no está en el HashMap agrega con frecuencia 1
                frecuenciaPalabras.put(palabra, 1);
            }
        }

        //Imprime las palabras y su frecuencia en orden de aparición
        for (String palabra : palabras) {
            palabra = palabra.toLowerCase();
            if (frecuenciaPalabras.containsKey(palabra)) {
                int frecuencia = frecuenciaPalabras.get(palabra);
                System.out.print(palabra + frecuencia);
                frecuenciaPalabras.remove(palabra); //Evita imprimir la misma palabra nuevamente
            }
        }
    }
}