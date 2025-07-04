package arraysdedados;

import java.util.Scanner;

/*
 * Batalha Naval
Implementar um batalha naval, onde dado um mapa o usuário tenta adivinhar onde estão os navios. Considere um tabuleiro de tamanho 5 x 5 e 10 tentativas para acertar a posição de 3 navios que estão no mapa (navio ocupa apenas uma posição). 

O jogo deve solicitar primeiro a posição dos 3 navios, e então preencher o mapa com água (~) e com os navios (N). Após isso, devem ser lidas a linha e a coluna que o usuário acha que o navio está. Caso ele consiga acertar antes das tentativas esgotarem, ele verá uma mensagem de vitória:

Digite as posições dos navios: 
Navio 1: 
0 0
Navio 2: 
1 1
Navio 3: 
2 2
Bem-vindo ao jogo de Batalha Naval!
Você tem 10 tentativas para afundar 3 navios.
 
  0 1 2 3 4
0 N ~ ~ ~ ~ 
1 ~ N ~ ~ ~ 
2 ~ ~ N ~ ~ 
3 ~ ~ ~ ~ ~ 
4 ~ ~ ~ ~ ~ 
Tentativas restantes: 10
Digite a linha e a coluna (0-4): 0 0
Você acertou um navio!
 
  0 1 2 3 4
0 X ~ ~ ~ ~ 
1 ~ N ~ ~ ~ 
2 ~ ~ N ~ ~ 
3 ~ ~ ~ ~ ~ 
4 ~ ~ ~ ~ ~ 
Tentativas restantes: 9
Digite a linha e a coluna (0-4): 1 1
Você acertou um navio!
 
  0 1 2 3 4
0 X ~ ~ ~ ~ 
1 ~ X ~ ~ ~ 
2 ~ ~ N ~ ~ 
3 ~ ~ ~ ~ ~ 
4 ~ ~ ~ ~ ~ 
Tentativas restantes: 8
Digite a linha e a coluna (0-4): 2 2
Você acertou um navio!
Parabéns! Você afundou todos os navios.
 */
public class BatalhaNaval {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int navios = 0;
    int linha;
    int coluna;
    String[][] tabuleiro = new String[5][5];

    for (int i = 0; i < tabuleiro.length; i++) {
      for (int j = 0; j < tabuleiro.length; j++) {
        tabuleiro[i][j] = "~";
      }
    }

    while (navios < 3) {
      System.out.println("Digite a posição do " + (navios + 1) + " navio - digite 2 numeros ex (1 1): ");
      linha = sc.nextInt();
      coluna = sc.nextInt();

      if (linha < 0 || linha > 4 || coluna < 0 || coluna > 4) {
        System.out.println("Posição invaida.. Digite novamente");
        continue;
      }

      if (tabuleiro[linha][coluna].equals("N")) {
        System.out.println("Já existe um navio nessa posição. Tente novamente");
        continue;
      }

      tabuleiro[linha][coluna] = "N";
      navios++;
    }

    int tentativas = 10;
    int acertos = 0;
    System.out.println("Bem-vindo ao jogo de Batalha Naval!");
    System.out.println("Você tem " + tentativas + " tentativas para afundar " + navios + " navios.");

    while (tentativas > 0) {
      System.out.println("Digite a linha e a coluna entre (0-4) Ex: 0 1: ");
      linha = sc.nextInt();
      coluna = sc.nextInt();

      if (linha < 0 || linha > 4 || coluna < 0 || coluna > 4) {
        System.out.println("Posição invaida.. Digite novamente");
        continue;
      }

      if (tabuleiro[linha][coluna].equals("X")) {
        System.out.println("Já atacou essa posição. Tente novamente");
        continue;
      }

      if (tabuleiro[linha][coluna].equals("N")) {
        System.out.println("Você afundou um navio!");
        tabuleiro[linha][coluna] = "X";
        acertos++;
      } else {
        System.out.println("Você errou! Água...");
        tabuleiro[linha][coluna] = "X";
      }

      tentativas--;

      if (acertos != 3) {
        System.out.println("Tentativas restantes: " + tentativas);
      }

      if (acertos == navios) {
        System.out.println("Parabéns! Você afundou todos os navios.");
        System.out.println("Você venceu!");
        continue;
      }
    }

    System.out.println("Você perdeu. Os navios sobreviveram.");

    sc.close();
  }
}
