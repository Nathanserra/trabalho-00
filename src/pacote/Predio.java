package pacote;

import java.util.ArrayList;
import exception.*;

public class Predio {
	String nome;
	ArrayList<Sala> salas = new ArrayList<Sala>();

	
	public Predio(String nome) {
		this.nome = nome;
	}

	void addSala(String nome) {
		salas.add(new Sala(nome));
	}
	
	void addSala(String nome, int capacidade, String tipo_aula) {
		salas.add(new Sala(nome,capacidade, tipo_aula));
	}
	
	void addSala(String nome, int capacidade, String tipo_aula, Predio predio) {
		salas.add(new Sala(nome, capacidade, tipo_aula, this));
		
	}
	
	void cadastrarSala(String nome, String tipo_aula, int capacidade, Predio predio) throws TipoDeAulaNaoAtribuidoException {
		if (tipo_aula == null) {
			throw new TipoDeAulaNaoAtribuidoException();
		} else {
			predio.addSala(nome, capacidade, tipo_aula, predio);
			System.out.println("Sala cadastrada com sucesso!"); 
		}
	}

	void removeSala(int id) {
		salas.remove(id);
	}
	
	void editSala(int id, String newNome, int newCapacidade) {
		Sala s = salas.get(id);
		s.setNome(newNome);
		s.setNewCapacidade(newCapacidade);
	}
	
	int getIDSalaStr(String nome) {
		for(int i = 0; i<salas.size();i++) {
			Sala s = salas.get(i);
			if(s.nome.equals(nome))
				return i;
		}
		return -1;
	}

	public void setNome(String newNome) {
		this.nome = newNome;
	}
	
	void infPredio() {
		for(int i = 0; i<salas.size(); i++) {
			System.out.println("			Salas["+ i +"]: " + salas.get(i).nome + " | Suporta " + salas.get(i).capacidade + " alunos | Tipo de Aula:" + salas.get(i).getTipo_aula());
			salas.get(i).infSala();
		}
	}

    public String getNome() {
        return nome;
    }

    
	
}
