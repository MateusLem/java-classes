package fiap.view;
import javax.swing.JOptionPane;

import fiap.controller.*;


@SuppressWarnings("unused")
public abstract class Teste {

	public static void main(String[] args) {
		CarroController carro = new CarroController();
		
		//Testing insert
		//JOptionPane.showMessageDialog(null,carro.insereCarro("ABCDEFuckU","Branco","Renegade"));
		
		//Testing update
		//JOptionPane.showMessageDialog(null,carro.alteraCarro("ABCDEFuckU","Preto","Renegade"));
				
		//Testing delete
		//JOptionPane.showMessageDialog(null,carro.excluiCarro("ABCDEFuckU"));
		
		//Testing listar
		//JOptionPane.showMessageDialog(null, carro.listaCarro("ABCDEFuckU"));
		
	}

}
