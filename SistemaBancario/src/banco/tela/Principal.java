package banco.tela;

import javax.swing.JOptionPane;

import banco.modelo.Cliente;

public class Principal {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Anita", "Bonito", "MS");
		Cliente cliente2 = new Cliente("Camila", "Bonito", "MS");
		
		JOptionPane.showMessageDialog(null, cliente1.listarDados());
		JOptionPane.showMessageDialog(null, cliente2.listarDados());
		
		JOptionPane.showMessageDialog(null, "Possuímos " + Cliente.qtdClientes() + " clientes cadastrados");
	}

}
