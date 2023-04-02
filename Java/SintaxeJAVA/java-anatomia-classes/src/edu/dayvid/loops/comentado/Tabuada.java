package edu.dayvid.loops.comentado;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
o usuário deve informarde qual numero ele deseja ver a tabuada.
A saida de ser conforme o exemplo abaixo:

Tabuada de 5:
5 x 1 = 5
5 x 2 = 10
....
5 x 10 = 50
*/
public class Tabuada {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int multiplicador;
    int count = 0;
    int multiplo = 1;

    System.out.println("Tabuada desejada: ");
    multiplicador = scan.nextInt();
    if (multiplicador > 10)System.out.println("Tabuada invalida !");
    else if (multiplicador <= 10 && multiplicador >= 1) System.out.println("Tabuada de: " + multiplicador);
    
    do{
      if (multiplicador > 10) break;

      System.out.println(multiplicador + " x " + multiplo + " = " + multiplicador * multiplo);

      multiplo++;
      count++;
    }while(count < 10);
  }
}
