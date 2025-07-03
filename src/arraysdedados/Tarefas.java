package arraysdedados;

import java.util.Scanner;

/*
 * Array de Tarefas
Escreva um programa para gerenciar tarefas da seguinte forma:



O programa permite que até 10 tarefas sejam cadastradas.

Serão exibidas 3 opções: 1. Cadastrar tarefa, 2. Listar tarefas e 3. Sair

Caso seja selecionada a opção 1, deve ler o número da tarefa (entre 1 e 10) e depois a tarefa em si, que será cadastrada na posição do array equivalente ao número da tarefa fornecido (ex: 0 no array é a primeira posição, 1 é a segunda, ...).

Caso seja selecionada a opção 2, deve imprimir todas as tarefas encontradas no formato: 

Tarefa 1 - gfwgjf
Tarefa 2 - kfhwekfjwhe
Caso seja selecionada qualquer outra opção, o programa deve imprimir "Encerrando programa..." e deverá encerrar.


 */
public class Tarefas {
  public static void main(String[] args) {
    String[] tarefas = new String[] {
        "x", "x", "x", "x", "x", "x", "x", "x", "x", "x" };

    Scanner scanner = new Scanner(System.in);
    while (true) {
      // Lê opção (1 - Cadastrar, 2 - Exibir, Qualquer outra - Sair)
      System.out.println("\nOpções:");
      System.out.println("1. Cadastrar tarefa");
      System.out.println("2. Listar tarefas");
      System.out.println("3. Sair");

      int opcao = scanner.nextInt();
      scanner.nextLine(); // Limpar o buffer do teclado

      switch (opcao) {
        // Escreva a solução a partir daqui...
        case 1 -> {
          int index = 0;
          int posicaoTarefa;
          System.out.println("Digite o numero da tarefa para cadastrar (entre 1 a 10): ");
          posicaoTarefa = scanner.nextInt();
          scanner.nextLine();

          if (posicaoTarefa <= 0 || posicaoTarefa > 10) {
            System.out.println("Número da tarefa inválido.");
            continue;
          }

          index = posicaoTarefa - 1;

          System.out.println("Digite qual será a tarefa: ");

          tarefas[index] = scanner.nextLine();

        }
        case 2 -> {
          int index = 0;
          for (String tarefa : tarefas) {
            System.out.println("Tarefa " + (index + 1) + " - " + tarefa);
            index++;
          }
        }
        default -> {
          System.out.println("Encerrando programa...");
          scanner.close();
          return;
        }
      }
    }
  }
}
