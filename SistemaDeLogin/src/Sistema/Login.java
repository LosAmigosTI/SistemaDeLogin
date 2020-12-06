package Sistema;

import javax.swing.JOptionPane;

public class Login extends Cliente{
	private String usuario;
	private String senha;
	
	public void CriarCadastro() {
		this.usuario =  JOptionPane.showInputDialog("Novo nome de usuario");
		this.senha =  JOptionPane.showInputDialog("Novo nome de senha");
		
	}
	public void FazerLogin() {
		String usuario = JOptionPane.showInputDialog("Digite o usuario");
		String senha = JOptionPane.showInputDialog("Digite a senha");
		if(usuario.equals(this.usuario)) {
			if(senha.equals(this.senha)) {
				System.out.println("Login efetuado com sucesso");
			}
		}else {
				System.out.println("Login incorreto");
		}
	}
}
