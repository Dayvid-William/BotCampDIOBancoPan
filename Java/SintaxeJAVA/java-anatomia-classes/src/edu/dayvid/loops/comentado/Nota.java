package edu.dayvid.loops.comentado;

import java.util.Scanner;

/*
 * Faça um programa que peça uma notra, entre zero e dez.
 * mostre uma mensagem caso o valor seja invalido e continue pedindo
 * até que o usuário infomre um valor valido
 */

public class Nota {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int nota;

    while (true) {
      System.out.println("nota: ");
      nota = scan.nextInt();
      if (nota >= 0 && nota <= 10) break ;
    }

    /*
     * Solução do curso 
     * while(nota < 0 | nota > 10) {
     *  System.out.println("Nota invalida! Digite novamente");
     *  nota = scan.nextInt
     * }
     */
  }
}
