package classes;

import herancas.Pessoa;
import interfaces.RegrasDaEscola;

public class Professor extends Pessoa implements RegrasDaEscola{
	
	String curso;
	String salario;
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	@Override
	public void horarioEntrada() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void horarioSaida() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void lugarDaMerenda() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Professor [curso=" + curso + ", salario=" + salario + ", telefone=" + getTelefone() + ", nome=" + getNome() +"]";
	}
	
	
	
	
	/* CONTRUTOR
	
	public Professor() {
		
		System.out.println("algo escrito");
		
	}

	
	*/
}
