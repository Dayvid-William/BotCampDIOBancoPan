package edu.dayvid.operadores;

public class operadores {
  public static void main(String[] args) {
    String concatenacao = "?";
    
    concatenacao = 1+1+1+"1";

    System.out.println(concatenacao);

    concatenacao = 1+"1"+1+"1";

    System.out.println(concatenacao);

    concatenacao = 1+"1"+1+1;

    System.out.println(concatenacao);

    concatenacao = "1"+(1+1+1);

    System.out.println(concatenacao);

    int num = 5;

    //operador de incremento
    num = ++num;

    System.out.println(num);
    System.out.println(++num);

    //inverte variavel boolen

    boolean verdade = true;

    verdade = !verdade;

    System.out.println(verdade);

    //operador ternario

    int a, b;

    a = 5;
    b = 5;

    String resultador = a == b ? "Verdadeiro" : "Falso";

    System.out.println(resultador);

    // Operadores Lógicos && / ||

    boolean condicao1 = true;

    boolean condicao2 = true;

    if (condicao1 && condicao2) {
      System.out.println("As duas condições são verdadeiras");
    }
    if(condicao1 || condicao2) {
      System.out.println("Uma condição e verdadeira");
    }
    System.out.println("fim");
  }
}
