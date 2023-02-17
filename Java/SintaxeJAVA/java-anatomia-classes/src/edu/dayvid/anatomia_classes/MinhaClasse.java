package edu.dayvid.anatomia_classes;
public class MinhaClasse {
  
  public static void main (String [] args) {
    /*String meuNome = "Dayvid";
    
    int anoFabricacao = 2023;

    boolean verdadeira = true;

    anoFabricacao = 2018;*/

    String primeroNome = "Dayvid";
    String segundoNome = "William";

    String nomeCompleto = nomeCompleto(primeroNome, segundoNome);

    System.out.println(nomeCompleto);
  }

  public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
  }

}
