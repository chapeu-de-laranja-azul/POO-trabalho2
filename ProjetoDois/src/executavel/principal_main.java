package executavel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import classes.Professor;
import classes.Aluno;
import classes.Correcao;

public class principal_main {
	

	public static void main(String[] args) {

		int nota =0;

		List<String> resCerto = new ArrayList<>();

		Professor professor = new Professor();
		Aluno aluno = new Aluno();
		
		String nome = JOptionPane.showInputDialog("Qual e o nome do professor:");
		professor.setNome(nome);
		
		String telefone = JOptionPane.showInputDialog("Qual e o numero do professor:");
		professor.setTelefone(telefone);
		
		String curso = JOptionPane.showInputDialog("Qual e o curso que ele da aula:");
		professor.setCurso(curso);
		
		
		String salario = JOptionPane.showInputDialog("Quanto que o professor recebe:");
		professor.setSalario(salario);
		
		System.out.println(professor.toString());
		
		
		
		
		String numeroPerguntas = JOptionPane.showInputDialog("Quantas perguntas tem a prova:");
		String numProvas = JOptionPane.showInputDialog("Quantas provas são para corrigir:");
		
		for (int i = 1 ; i<(Integer.parseInt(numProvas))+1 ; i++) {
	
			
			
			String nomeAluno = JOptionPane.showInputDialog("Qual e o nome do aluno dessa prova:");
			aluno.setNome(nomeAluno);
			String telefoneAluno = JOptionPane.showInputDialog("Qual o numero de telefone do aluno:");
			aluno.setTelefone(telefoneAluno);
			String cursos = JOptionPane.showInputDialog("Qual e o curso desse aluno:");
			aluno.setCursos(curso);
			resCerto.add(nomeAluno);
			
			for (int n = 1 ; n<(Integer.parseInt(numeroPerguntas))+1 ; n++) {
				
				
	
				String respostaCerta = JOptionPane.showInputDialog("Qual e a reposta certa da pergunta "+n+":");
				String respostaMarcada = JOptionPane.showInputDialog("E qual e a reposta marcada na pergunta "+n+":");
	
				Correcao classe1 = new Correcao();
				
				System.out.println(respostaCerta.equals(respostaMarcada) ? "numero "+n+" certa" :"numero "+n+" errada");
				
				if(respostaCerta.hashCode() == respostaMarcada.hashCode()) {
					nota++;
				}
				
				
				
			}
			
			System.out.println("cada questao vale 1 ponto, nota final: "+nota);
			aluno.setNota(nota);
			//System.out.println("nome do aluno: "+aluno.getNome());
			//.out.println("telefone do aluno: "+aluno.getTelefone());
			System.out.println(aluno.toString());
			nota = 0;
			
		}
		
		System.out.println("numero do hashCode: "+professor.hashCode());
		
		System.out.println(resCerto.size()+" Provas corrigidas");
		
		
		
		
	}

}
