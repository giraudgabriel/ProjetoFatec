package antenas;

public class Entrega {
	private String urlGit;
	private String urlDeploy;
	private String texto;
	private Aluno aluno;
	
	public Entrega(String urlGit, String urlDeploy, String texto, Aluno aluno) {
		this.setUrlGit(urlGit);
		this.setUrlDeploy(urlDeploy);
		this.setAluno(aluno);
		this.setTexto(texto);
	}

	public String getUrlGit() {
		return urlGit;
	}

	public void setUrlGit(String urlGit) {
		this.urlGit = urlGit;
	}

	public String getUrlDeploy() {
		return urlDeploy;
	}

	public void setUrlDeploy(String urlDeploy) {
		this.urlDeploy = urlDeploy;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
}
