
public class QuestaoSimples {

	protected String enunciado;
	protected String resposta;
	protected String entrada;

	@Override
	public String toString() {
		return "QuestaoSimples [Enunciado: " +enunciado+ ", Resposta: " +resposta+"]";
	}

	public QuestaoSimples(String enunciado, String resposta) {
		this.enunciado = enunciado;
		this.resposta = resposta;
	}

	public String aplicarQuestao() {
		return this.enunciado;
	}

	public boolean corrigir(String resposta) {
		return resposta.equals(this.resposta);
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public String getEntrada() {
		return entrada;
	}

	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}

	public String getEnunciado() {
		return enunciado;
	}
}
