
public class QuestaoMultiplaEscolha extends QuestaoSimples {
	protected String alt1;
	protected String alt2;
	protected String alt3;
	protected String alt4;

	public QuestaoMultiplaEscolha(String enunciado, String resposta, String alt1, String alt2, String alt3, String alt4) {
		super(enunciado, resposta);
		this.alt1 = alt1;
		this.alt2 = alt2;
		this.alt3 = alt3;
		this.alt4 = alt4;
	}	
	@Override
	public String toString() {
		return "QuestaoMultiplaEscolha [alt1=" +alt1+ ", alt2=" +alt2+ ", alt3=" +alt3+ ", alt4=" +alt4
				+ ", enunciado=" +enunciado+ ", resposta=" +resposta+ "]";
	}

	public String aplicarQuestao() {
		return super.enunciado + "\n" +alt1+ "\n" +alt2+ "\n" +alt3+ "\n" +alt4;
	}

	public String getAlt1() {
		return alt1;
	}
	public void setAlt1(String alt1) {
		this.alt1 = alt1;
	}

	public String getAlt2() {
		return alt2;
	}
	public void setAlt2(String alt2) {
		this.alt2 = alt2;
	}

	public String getAlt3() {
		return alt3;
	}
	public void setAlt3(String alt3) {
		this.alt3 = alt3;
	}

	public String getAlt4() {
		return alt4;
	}
	public void setAlt4(String alt4) {
		this.alt4 = alt4;
	}
}
