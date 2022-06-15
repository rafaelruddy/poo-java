package progOrientada2;

public class Produto {
	
	private String idProduto;
	private String nome;
	private String categoria;
	private double preco;
	private String marca;
	private String modelo;
	private double altura;
	private double largura;
	private double comprimento;
	private double peso;

	public Produto() {
		
	}
	
	public Produto(String idProduto, String nome, String categoria, double preco, double altura, double largura, double comprimento, double peso) {		
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.categoria = categoria;
		this.preco = preco;
		this.altura = altura;
		this.largura = largura;
		this.comprimento = comprimento;
		this.peso = peso;
	}

	public Produto(String idProduto, String nome, double preco, double altura, double largura, double comprimento, double peso) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.preco = preco;
		this.altura = altura;
		this.largura = largura;
		this.comprimento = comprimento;
		this.peso = peso;
	}


	public String getIdProduto() {
		return idProduto;
	}


	public String getNome() {
		return nome;
	}


	public String getCategoria() {
		return categoria;
	}


	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}


	public String getMarca() {
		return marca;
	}


	public String getModelo() {
		return modelo;
	}


	public double getAltura() {
		return altura;
	}


	public double getLargura() {
		return largura;
	}


	public double getComprimento() {
		return comprimento;
	}


	public double getPeso() {
		return peso;
	}

}
