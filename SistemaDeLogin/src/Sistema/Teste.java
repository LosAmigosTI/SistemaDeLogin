package Sistema;
import Produto.*;

public class Teste {
	public static void main(String[]args) {
	
	CarrinhoCompras go = new CarrinhoCompras();
	go.CadNewProduct();
	go.buscarProduto();
	go.IncluirItens();
	go.FinalizarCompra();
	
	
	
	}
}
