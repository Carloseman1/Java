package Exercicios_Java;

import javax.swing.JOptionPane;

public class Exercicio_Login_Usuario_Senha_Switch {
	
	public static void main(String[] args) {
		
		String login;
		int senha;
		
		login = JOptionPane.showInputDialog("Login: ");
		senha = Integer.parseInt(JOptionPane.showInputDialog("Senha: "));
		
	if (login.equals("Roger") && senha == 123) {
		
		JOptionPane.showMessageDialog(null, "Login e senha:  Válido.");
		
	} else {
		JOptionPane.showMessageDialog(null, "Login e senha: Inválido.");
	}
	
	}

}
