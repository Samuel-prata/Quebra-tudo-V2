package compraevenda;

public class ItemPedido {
	private Produto produto;
	private int quantidade;
	private int total;
	
	public ItemPedido(Produto produto2, int quantidade2) {
		setProduto(produto2);
		setQuantidade(quantidade2);
		setTotal();
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto2) {
		this.produto = produto;
	}
	public void getQuantidade() {
		return quantidade;
	}
	public int setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getTotal() {
		return this.total
	}
	public void setTotal() {
		this.total = produto.getPreco * this.quantidade;
	
}
