package Produto;
import javax.swing.JOptionPane;

import Sistema.Login;

public class CarrinhoCompras extends ItensCompra {
	
	public void excluirItem() {
		String delete = JOptionPane.showInputDialog("Qual produto você deseja excluir");
		int n = this.Carrinho.size();
		for(int i = 0; i < n; i++) {
			if(delete.equals(this.Carrinho)) {
				this.Carrinho.remove(i);
			}
		}
	}
	public void FinalizarCompra() {
		int n = this.Carrinho.size();
		double ValorFinal = 0;
		for(int i = 0; i<=n; i++) {
			ValorFinal = ValorFinal+this.valor[i];
			System.out.println(ValorFinal);
		}
		String Compra = JOptionPane.showInputDialog("Vai querer realizar mesmo essa compra?");
		Compra.toLowerCase();
		switch(Compra) {
		case "sim": 
			System.out.println("Compra realizada com Sucesso");
			break;
		case "não": 
		System.out.println("Compra realizada com Sucesso");
		}
	}
}
