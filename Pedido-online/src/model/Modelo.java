package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Modelo {

	@Id
	@GeneratedValue
	private Long id;
	
	private String referencia;
	
	private String descricao;
	
	private String cor;
	
	@ManyToOne
	@JoinColumn(name="idGradeNumeracao")
	private GradeNumeracao gradeNumeracao;
	
	@OneToOne(mappedBy="modelo")
	private List<ModeloImagem> lstModeloImagem;

	public Modelo() {
		super();
	}

	public Modelo(Long id, String referencia, String descricao, String cor,
			GradeNumeracao gradeNumeracao, List<ModeloImagem> lstModeloImagem) {
		super();
		this.id = id;
		this.referencia = referencia;
		this.descricao = descricao;
		this.cor = cor;
		this.gradeNumeracao = gradeNumeracao;
		this.lstModeloImagem = lstModeloImagem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public GradeNumeracao getGradeNumeracao() {
		return gradeNumeracao;
	}

	public void setGradeNumeracao(GradeNumeracao gradeNumeracao) {
		this.gradeNumeracao = gradeNumeracao;
	}

	public List<ModeloImagem> getLstModeloImagem() {
		return lstModeloImagem;
	}

	public void setLstModeloImagem(List<ModeloImagem> lstModeloImagem) {
		this.lstModeloImagem = lstModeloImagem;
	}
	
	
	
	
	
}
