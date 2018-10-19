package entities;

public class quartos {

	String nome;
	String e_mail;
	Integer n_quarto;
	
	public quartos(String nome, String e_mail, Integer n_quarto) {
		
		this.nome = nome;
		this.e_mail = e_mail;
		this.n_quarto = n_quarto;
	}

	public String getNome() {
		return nome;
	}

	public String getE_mail() {
		return e_mail;
	}

	public Integer getN_quarto() {
		return n_quarto;
	}



}
