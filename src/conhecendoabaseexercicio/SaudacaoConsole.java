package conhecendoabaseexercicio;

/*
 * Crie um programa que eia um nome e imprima uma saudação utilizando o
 * Console ao invés do Scanner
 */

import java.io.Console;

public class SaudacaoConsole {
  public static void main(String[] args) {
    Console console = System.console();

    String nome = console.readLine("Digite seu nome: ");
    console.printf("Olá, %s, bem-vindo(a)!", nome);
  }
}
