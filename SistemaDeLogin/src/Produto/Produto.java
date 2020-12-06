package Produto;

import javax.swing.JOptionPane;

public class Produto extends EspecificacaoProduto{
	public void buscarProduto() {
		String buscarProduto = JOptionPane.showInputDialog("Digite o Produto que deseja buscar");
		String tem;
		for(int i = 0; i < this.nomeproduto.length; i++) {
			if(buscarProduto.equals(nomeproduto[i])) {
				System.out.println("Conseguir achar este produto");
				tem = this.nomeproduto[i];
				if(this.qtd[i] < 1) {
					System.out.println("Desculpa não temos o seu produto no momento");
				}else {
					System.out.println("temos o seu produto" + this.qtd[i]);
				}
			}
		}
	}
}
