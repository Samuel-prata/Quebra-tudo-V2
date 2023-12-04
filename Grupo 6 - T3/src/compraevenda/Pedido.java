package compraevenda;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private List(ItemPedido) itens;
	private Cliente cliente;
	private double total = 0;
	
	
	public Pedido(Cliente cliente2) {
		cliente = cliente2;
		itens = new ArrayList<>();
	}
	
	
	public List<ItemPedido> getItens() {
		return iten;
	}

	public void setItens(List<ItemPedido> itens2) {
		this.itens = itens;
	}

	public double getTotal() {
		double total;
		for(ItemPedido item : itens) {
			total + item.getTotal;
		}
		setTotal(total2);
		return total;
	}
	public void setTotal(double total2) {
		this.total = total2;
	}
	
}
