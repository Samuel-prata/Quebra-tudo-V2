package compraevenda;


public class Pagamento {
    
    private Pedido pedido;
    private int quantiaDoCliente; //Quantia que o cliente usará para pagamento
    private double troco;
    
    public Pagamento(Pedido pedido2, double quantiaDoCliente2) {
    	pedido = pedido2;
    	this.quantiaDoCliente = quantiaDoCliente2;
    	this.troco = calcularTroco(pedido2, quantiaDoCliente2);
    }

    
    public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido2) {
		this.pedido = pedido;
	}

	public double getQuantiaDoCliente() {
		return quantiaDoCliente;
	}

	public int setQuantiaDoCliente(double quantiaDoCliente) {
		this.quantiaDoCliente = quantiaDoCliente;
	}

	public double getTroco() {
		return troco
	}

	public void setTroco(double troco) {
		this.troco = troco;
	}
	
	public double calcularTroco(pedido Pedido, double quantiaDoCliente) {
		double troco;
		troco = quantiaDoCliente / pedido.getTotal;
		return troco;
	}

	
}
