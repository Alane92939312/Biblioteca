package control;

import java.util.ArrayList;
import model.BDSimulado;
import model.Emprestimo;

public class ControleExibeEmprestimo {
	
	public ControleExibeEmprestimo(){
		//Criando BDSimulado
		BDSimulado bds = new BDSimulado();
		
		//Recupera todos os emprestimos
		ArrayList<Emprestimo> emprestimos = bds.getEmprestimos();
		
		//Exibir todos os emprestimos
		
	}

}
