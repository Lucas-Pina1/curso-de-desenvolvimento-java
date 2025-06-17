package conhecendoabaseexercicio;

/*
 * Escreva um programa que informe os relacionamentos de ordem existentes entre
 * dois números:
 * Igual, não igual, maior, menor, maior ou igual, menor ou igual.
 * 
 * 1. Ler 2 números
 * 2. Imprimir relacionamentos de ordem
 * 
 * Ex: Dados os números 2 e 3:
 * 2 = 3 ? false, 2 != 3 ? true, ... , 2 <= 3 ? true
 */

import java.util.Scanner;

public class RelacionamentoDeOrdem {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o primeiro numero:");
    int primeiroNumero = scanner.nextInt();
    System.out.println("Digite o segundo numero: ");
    int segundoNumero = scanner.nextInt();

    System.out.println("------- A ordem de relacionamento -------");
    System.out.println(primeiroNumero + " = " + segundoNumero + " ? " + (primeiroNumero == segundoNumero));
    System.out.println(primeiroNumero + " != " + segundoNumero + " ? " + (primeiroNumero != segundoNumero));
    System.out.println(primeiroNumero + " > " + segundoNumero + " ? " + (primeiroNumero > segundoNumero));
    System.out.println(primeiroNumero + " < " + segundoNumero + " ? " + (primeiroNumero < segundoNumero));
    System.out.println(primeiroNumero + " >= " + segundoNumero + " ? " + (primeiroNumero >= segundoNumero));
    System.out.println(primeiroNumero + " <= " + segundoNumero + " ? " + (primeiroNumero <= segundoNumero));
    
    scanner.close();
  }
}
