
public class QuestaoComDica extends QuestaoSimples {
	protected String dica;

	@Override
	public String toString() {
		return "QuestaoComDica [dica=" +dica+ ", enunciado=" +enunciado+ ", resposta=" +resposta+"]";
	}

	public QuestaoComDica(String enunciado, String resposta, String dica) {
		super(enunciado, resposta);
		this.dica = dica;
	}

	public String aplicarQuestao() {
		return super.enunciado + this.dica;
	}

	public String getDica() {
		return this.dica;
	}

	public void setDica(String dica) {
		this.dica = dica;
	}
}
