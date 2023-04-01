package edu.dayvid.loops.comentado;

/*
 * Faça um programa que peça N numeros inteiros, 
 * calcule e mostre a quantidade de números pares 
 * e a quantidade de números impares
 */

import java.util.Scanner;  

public class ParEImpar {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
    
      int quantidadeDeNumeros;
      int count = 0;
      int numero;
      int numerosPares = 0;
      int numerosImpares = 0;

      System.out.println("Quantidade de numeros: ");
      quantidadeDeNumeros = scan.nextInt();
      do {
        System.out.println("Numero: ");
        numero = scan.nextInt();

        if (numero % 2 == 0 ) numerosPares++;
        else if (numero % 2 == 1) numerosImpares++;
        else System.out.println("Valor invalido");

        count++;
      } while(count < quantidadeDeNumeros);

      System.out.println("Numeros Impares: " + numerosImpares);
      System.out.println("Numeros pares: " + numerosPares
      );
    }
}
