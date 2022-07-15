package Task5;

public class Aula {
	int id;
	int maxEst;
	//enum materia;
	
	public Aula(int id, int maxEst) {
		this.id = id;
		this.maxEst = maxEst;
	}
	
	public Aula() {
		this.id = 0;
		this.maxEst = 0;
	}

	public int getId() {
		return id;
	}

	public int getMaxEst() {
		return maxEst;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMaxEst(int maxEst) {
		this.maxEst = maxEst;
	}

	@Override
	public String toString() {
		return "Aula [id=" + id + ", maxEst=" + maxEst + "]";
	}
	
	
	
	
}
