package arraysdedados;

import java.util.Scanner;

/*
 * 
Comparando Arrays de Números
Crie um programa que lê 2 números, depois dois arrays de números com os tamanhos informados anteriormente e ao final imprime os números comuns que aparecem em ambos os arrays.
 */
public class ComparandoArraysNumeros {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a capacidade de números do primeiro array: ");
    int capacidadePrimeiroArray = sc.nextInt();
    sc.nextLine();

    int[] primeiroArray = new int[capacidadePrimeiroArray];

    System.out.println("Digite " + primeiroArray.length + " números para preencher o primeiro array: ");
    for (int i = 0; i < primeiroArray.length; i++) {
      System.out.println("Digite o " + (i + 1) + " número:");
      primeiroArray[i] = sc.nextInt();
      sc.nextLine();
    }

    System.out.println("Digite a capacidade de números do segundo array: ");
    int capacidadeSegundoArray = sc.nextInt();
    sc.nextLine();

    int[] segundoArray = new int[capacidadeSegundoArray];

    System.out.println("Digite " + segundoArray.length + " números para preencher o primeiro array: ");
    for (int i = 0; i < segundoArray.length; i++) {
      System.out.println("Digite o " + (i + 1) + " número:");
      segundoArray[i] = sc.nextInt();
      sc.nextLine();
    }

    System.out.println("Os numeros iguais nos dois arrays são:");
    for (int numeroPrimeiroArray : primeiroArray) {
      for (int numeroSegundoArray : segundoArray) {
        if (numeroPrimeiroArray == numeroSegundoArray) {
          System.out.println(numeroPrimeiroArray);
        }
      }
    }
    sc.close();
  }
}
