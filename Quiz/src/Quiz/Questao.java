package Quiz;

public class Questao {

	    private String pergunta;
	    private String resposta;

	    public Questao(String pergunta, String resposta) {
	        this.pergunta = pergunta;
	        this.resposta = resposta;
	    }

	    // Getters
	    public String getPergunta() {
	        return pergunta;
	    }

	    public String getResposta() {
	        return resposta;
	    }
	}
