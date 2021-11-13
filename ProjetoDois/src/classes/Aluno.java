package classes;

import herancas.Pessoa;
import interfaces.RegrasDaEscola;

public class Aluno extends Pessoa implements RegrasDaEscola{

	String cursos;
	int nota;
	
	public String getCursos() {
		return cursos;
	}
	public void setCursos(String cursos) {
		this.cursos = cursos;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
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
		return "Aluno"+ "nome="+ getNome() +" cursos=" + cursos + ", nota=" + nota + " telefone="+ getTelefone()+"]";
	}
	
	/* CONTRUTOR
	
	public Aluno() {
		
		System.out.println("algo escrito");
		
	}

	
	*/
	
}
