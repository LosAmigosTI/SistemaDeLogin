package Produto;

import javax.swing.JOptionPane;

public class EspecificacaoProduto {
	
	String[] nomeproduto = new String[10];
	int[] qtd = new int[10];
	double[] valor = new double[10];
	
	public void CadNewProduct() {
		int NumProd = Integer.parseInt(JOptionPane.showInputDialog("Quantos produtos você quer cadastrar?"));
		for(int i = 0; i <NumProd; i++) {
			for( i = 0; i <NumProd; i++) {
				for(i = 0; i <NumProd; i++) {
					this.nomeproduto[i] = JOptionPane.showInputDialog("Digite o nome do Produto");
					System.out.println(this.nomeproduto[i]);
					this.qtd[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a qtd do Produto"));
					System.out.println(this.qtd[i]);
					this.valor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser recebido"));
					System.out.println(this.valor[i]);
				}
			}
		}
	}
}
