package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CategoriaModelo {

	
	@Id
	@GeneratedValue
	private Long id;
	
	private String descricao;
	
	@OneToMany(mappedBy="categoriaModelo")
	private List<Modelo> lstModelo;

	public CategoriaModelo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CategoriaModelo(Long id, String descricao, List<Modelo> lstModelo) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.lstModelo = lstModelo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Modelo> getLstModelo() {
		return lstModelo;
	}

	public void setLstModelo(List<Modelo> lstModelo) {
		this.lstModelo = lstModelo;
	}
	
	
	
	
}
