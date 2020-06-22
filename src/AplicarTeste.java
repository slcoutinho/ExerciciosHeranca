import java.util.Scanner;

public class AplicarTeste {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		String respostaAluno;

		QuestaoSimples questoes[] = new QuestaoSimples[3];
		questoes[0] = new QuestaoSimples("Qual a capital da Franca?", "Paris");
		questoes[1] = new QuestaoMultiplaEscolha("Qual a capital de RJ? Opções abaixo:", "Rio de Janeiro", "Sao Goncalo", "Caxias", "Brotas", "Rio de Janeiro");
		questoes[2] = new QuestaoComDica("Qual a capital de SP? ", "Sao Paulo", " *** Dica: Semelhante ao nome do estado ***");

		System.out.println("*** BORA APLICAR O TESTE. PREPARE-SE! ****");

		for (QuestaoSimples q : questoes) {
			System.out.println(q.aplicarQuestao());
			respostaAluno = teclado.nextLine();
			
			System.out.println("Sua resposta: " + respostaAluno);
			if (q.corrigir(respostaAluno)) {
				System.out.println(" ***** Acerto miseraviii! ***** \n");
			} else {
				System.out.println("***** ERRRRRRRROOOOOOU! ***** / A resposta correta seria: " + q.getResposta() +"\n");
			}
		}
		teclado.close();
	}
}