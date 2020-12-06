package Sistema;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Cliente{
	private String nome;
	private String email;
	private String senha;
	private String endere�o;
	Scanner all = new Scanner(System.in);
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	
	public void alterarDados(String dado) {	
		switch(dado) {
		case "endere�o":
			endere�o = JOptionPane.showInputDialog("Digite o novo endere�o");
			System.out.printf(endere�o);
			break;
		case "senha":
			senha = JOptionPane.showInputDialog("Digite a nova senha");
			System.out.printf(senha);
			break;
		
		case "email":
			email = JOptionPane.showInputDialog("Digite o novo endere�o");
			System.out.printf(email);
			break;
		case "nome":
			nome = JOptionPane.showInputDialog("Digite o novo endere�o");
			System.out.printf(nome);
			break;
		default: 
			System.out.println("Valor incorreto, por favor refa�a a opera��o");
			break;
		}
	}

	public void ExcluirConta(String dado) {
		System.out.println("Deseja mesmo excluir esta conta?");
		dado = all.toString();
		dado.toLowerCase();
		switch(dado) {
		case "sim":
			System.out.println("Conta excluida com sucesso");
			break;
		case "n�o":
			System.out.println("Conta n�o foi excluida");
		}
	}
}
