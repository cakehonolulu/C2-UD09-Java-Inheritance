package Task5;

public class Aula {
	int id;
	int maxEst;
	Materia materia;

	public Aula(int id, int maxEst, Materia materia) {
		this.id = id;
		this.maxEst = maxEst;
		this.materia = materia;
	}

	public Aula() {
		this.id = 0;
		this.maxEst = 0;
		this.materia = Materia.sin_materia;
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

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "Aula [id=" + id + ", maxEst=" + maxEst + ", materia=" + materia + "]";
	}

}
