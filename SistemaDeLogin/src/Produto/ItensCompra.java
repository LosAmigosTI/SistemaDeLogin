package Produto;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ItensCompra extends Produto {
	ArrayList<String> Carrinho = new ArrayList();
	public void IncluirItens() {
		String Item = JOptionPane.showInputDialog("Digite qual produto você quer");
		for(int i = 0; i < this.nomeproduto.length; i++) {
			if(Item.equals(nomeproduto[i])) {
				Carrinho.add(Item);
				System.out.println("Item adicionado");
				this.qtd[i] = this.qtd[i] - 1;
			}
		}
	}
}
