package progOrientada2;

public class ItemDeVenda {

	private Produto produto;
	private int quantidade;
	private double subtotal;
	
	public ItemDeVenda() {
		
	}
	
	public ItemDeVenda(Produto produto, double subtotal) {
		
		this.produto = produto;
		this.subtotal = subtotal;
	}
	
	
	/**
	 * @param produto
	 * @param quantidade
	 */
	public void atualizarProduto(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	/**
	 * @return the quantidade
	 */
	public int getQuantidade() {
		return quantidade;
	}
	/**
	 * @param quantidade the quantidade to set
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	/**
	 * @return the produto
	 */
	public Produto getProduto() {
		return produto;
	}
	/**
	 * @return the subtotal
	 */
	public double getSubtotal() {
		return subtotal;
	}
	
	public void calcularSubtotal() {
		this.subtotal *= this.quantidade;
	}
	
	
}
