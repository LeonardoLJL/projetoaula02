package entities;

public class Pessoa {

	// Atriburos sempre privado(dados -> campos)
	private Integer id;
	private String nome;
	private String cpf;

	
	//Construtor Defaut já vem implicito na classe, mas pode ser declarado
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	
	//sobrecarga do metodo construtor
	//Joga os parametros para serem usados na criação da instancia
	//botão direiro -> source -> Generate constructor...
	public Pessoa(Integer id, String nome, String cpf) {
		//o super não é obrigatório
		super(); 
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
