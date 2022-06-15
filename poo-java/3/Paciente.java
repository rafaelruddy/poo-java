package progOrientada3;

import java.time.LocalDate;

public class Paciente {
	private String nome;
	private String sobrenome;
	private char sexo;
	private LocalDate nascimento;
	private byte idade;
	private float altura;
	private double peso;
	private String cpf;
	private double imc;
	
	public Paciente() {
		
	}
	
	public Paciente(String nome, String sobrenome, char sexo, LocalDate nascimento, float altura, double peso, String cpf) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.nascimento = nascimento;
		this.altura = altura;
		this.peso = peso;
		this.cpf = cpf;
	}
	
	public Paciente(String nome, String sobrenome, char sexo, LocalDate nascimento, float altura, double peso) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.nascimento = nascimento;
		this.altura = altura;
		this.peso = peso;
	}

	public Paciente(String nome, String sobrenome, String cpf) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}

	public double obterPesoIdeal() {
		double homens = 72.7;
		double mulheres = 62.1;
		if (this.sexo == 'M') {
			return (homens*this.altura) - 58;
		}
		
		if (this.sexo == 'F') {
			return (mulheres*this.altura) - 44.7; 
		}
		return 0;
	}
	
	public void calcularIMC() {
		 this.altura = this.altura /= 100;
		
		
		this.imc = (this.peso) / (this.altura * this.altura);  
	}
	
	public byte calcularIdade() {
		LocalDate dataDoDia = LocalDate.now();
		LocalDate nascimento = this.nascimento;
		
		this.idade = (byte)(dataDoDia.getYear() - nascimento.getYear());
		
		return this.idade;
	}
	
	public String obterSituacaoIMC() {

		if (this.imc < 17) {
			return "Muito abaixo do peso";
		}

		if (this.imc >= 17 && this.imc < 18.49) {
			return "Abaixo do peso";
		}

		if (this.imc >= 18.50 && this.imc < 24.99) {
			return "Peso normal";
		}

		if (this.imc >= 25 && this.imc < 29.99) {
			return "Acima do peso";
		}

		if (this.imc >= 30 && this.imc < 34.99) {
			return "Obesidade I";
		}

		if (this.imc >= 35 && this.imc < 39.99) {
			return "Obesidade II (severa)";
		}

		if (this.imc > 40) {
			return "Obesidade III (mórbida)";
		}

		return "IMC não informado.";
	}
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @param sobrenome the sobrenome to set
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	/**
	 * @param nascimento the nascimento to set
	 */
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(short altura) {
		this.altura = altura;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the sobrenome
	 */
	public String getSobrenome() {
		return sobrenome;
	}
	/**
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}
	/**
	 * @return the nascimento
	 */
	public LocalDate getNascimento() {
		return nascimento;
	}
	/**
	 * @return the idade
	 */
	public byte getIdade() {
		return idade;
	}
	/**
	 * @return the altura
	 */
	public float getAltura() {
		return altura;
	}
	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}
	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}
	/**
	 * @return the imc
	 */
	public double getImc() {
		return imc;
	}
	
	
	
	
}
