package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Correcao {

	String respostaCerta;
	String respostaMarcada;
	

	
	@Override
	public String toString() {
		return "Classes1 [respostaCerta=" + respostaCerta + ", respostaMarcada=" + respostaMarcada +"]";
	}



	public String getRespostaCerta() {
		return respostaCerta;
	}



	public void setRespostaCerta(String respostaCerta) {
		this.respostaCerta = respostaCerta;
	}



	public String getRespostaMarcada() {
		return respostaMarcada;
	}



	public void setRespostaMarcada(String respostaMarcada) {
		this.respostaMarcada = respostaMarcada;
	}

	@Override
	public int hashCode() {
		return Objects.hash(respostaCerta, respostaMarcada);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
		
			return true;
		
		}
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) {
		
			return false;
			
		}
		Correcao other = (Correcao) obj;
		return Objects.equals(respostaCerta, other.respostaCerta)
				&& Objects.equals(respostaMarcada, other.respostaMarcada);
	}




	
	/* CONTRUTOR
	
	public Correcao() {
		
		System.out.println("algo escrito");
		
	}

	
	*/
	
	
}
