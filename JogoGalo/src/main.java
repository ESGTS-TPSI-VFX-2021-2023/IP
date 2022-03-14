import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] tabuleiro = new String[3][3];
		boolean jogoAcabou = false;
		int contaJogadas = 0;
		int jogador = 1;
		
		//MostrarTabuleiro(tabuleiro);
		
		do {
			Jogada(tabuleiro, jogador);
			MostrarTabuleiro(tabuleiro);
			jogoAcabou = VerificaVitoria(tabuleiro);
			contaJogadas++;
			jogador = jogador == 1 ? 2 : 1;
			
			if (contaJogadas == 9) {
				jogoAcabou = true;
			}
			
		} while (!jogoAcabou);
		
		
	}
	
	public static boolean VerificaVitoria(String[][] tabuleiro) {
		
		boolean jogador1Ganhou = false;
		boolean jogador2Ganhou = false;
		
		// Verifica linhas
		for (int i = 0; i < tabuleiro.length; i++) {
			
			int contaJogador1 = 0;
			int contaJogador2 = 0;
			
			for (int j = 0; j < tabuleiro[i].length; j++) {
				
				if (tabuleiro[i][j] == "X") {
					contaJogador1++;
				}
				
				if (tabuleiro[i][j] == "O") {
					contaJogador2++;
				}
				
			}
			
			if (contaJogador1 == 3) {
				jogador1Ganhou = true;
			}
			
			if (contaJogador2 == 3) {
				jogador2Ganhou = true;
			}
			
		}
		// FIM verifica linhas
		
		// Verifica colunas
		for (int c = 0; c < tabuleiro[0].length; c++) {
			
			int contaJogador1 = 0;
			int contaJogador2 = 0;
			
			for (int l = 0; l < tabuleiro.length; l++) {
				
				if (tabuleiro[l][c] == "X") {
					contaJogador1++;
				}
				
				if (tabuleiro[l][c] == "O") {
					contaJogador2++;
				}
				
			}
			
			if (contaJogador1 == 3) {
				jogador1Ganhou = true;
			}
			
			if (contaJogador2 == 3) {
				jogador2Ganhou = true;
			}
		}
		//FIM verifica colunas
		
		return jogador1Ganhou || jogador2Ganhou;
		
	}

	public static void MostrarTabuleiro(String[][] tabuleiro) {
		
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				
				if(tabuleiro[i][j] == null) {
					System.out.print("_");
				} else {
					System.out.print(tabuleiro[i][j]);
				}
				
			}
			
			System.out.println();
		}
		
	}
	
	public static void Jogada(String[][] tabuleiro, int jogador) {
		
		Scanner sc = new Scanner(System.in);
		int linha;
		int coluna;
		
		do {
			System.out.println("[JOGADOR " + jogador + "] Qual a linha?");
			linha = sc.nextInt();
			
			System.out.println("[JOGADOR " + jogador + "] Qual a coluna?");
			coluna = sc.nextInt();
		} while (linha > tabuleiro.length || coluna > tabuleiro[linha-1].length 
				|| tabuleiro[linha-1][coluna-1] != null);
		
		tabuleiro[linha-1][coluna-1] = jogador == 1 ? "X" : "O";
		
		
	}

}
