package edu.dayvid.variaveis;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
      String meuNome = "Dayvid William";

      double salarioMinimo = 2500.33;

      short numeroCurto = 1;
      int numeorNormal = numeroCurto;
      short numeroCurto2 = (short) numeorNormal; //cast

      int numero = 1;

      numero = 2;

      System.out.println(numero);

      final double VALOR_DE__PI = 3.14; //Variaveis final por convenção dever ter sempre seus nomes em caixa alta

      System.out.println(numeroCurto2);
      System.out.println(salarioMinimo);
      System.out.println(meuNome);

    }
}
