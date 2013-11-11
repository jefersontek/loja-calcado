package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import dao.GenericDao;

@Entity
public class Modelo extends GenericDao<Modelo> {

	
	@Id
	@GeneratedValue
	private Long id;
	
	private String referencia;
	
	private String descricao;
	
	private String cor;
	
	@ManyToOne
	@JoinColumn(name="idGradeNumeracao")
	private GradeNumeracao gradeNumeracao;
	
	@ManyToOne
	@JoinColumn(name="idCategoria")
	private CategoriaModelo categoriaModelo;
	
	@OneToMany(mappedBy="modelo")
	private List<ModeloImagem> lstModeloImagem;  

	public Modelo() {
		super(Modelo.class);
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


	public CategoriaModelo getCategoriaModelo() {
		return categoriaModelo;
	}


	public void setCategoriaModelo(CategoriaModelo categoriaModelo) {
		this.categoriaModelo = categoriaModelo;
	}
	
	
	
	
	
	
}
