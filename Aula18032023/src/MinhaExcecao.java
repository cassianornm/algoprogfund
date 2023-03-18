
public class MinhaExcecao extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String mensagem;
	
	public MinhaExcecao(String mensagem){
		this.mensagem = mensagem;
	}
	
	public String toString() {
		return "MinhaExcecao [" + mensagem + "]";
	}
}
