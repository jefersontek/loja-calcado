package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ModeloImagem {

	@Id
	@GeneratedValue
	private Long id;	
	private String contextType;	
	private String url;	
	@ManyToOne
	@JoinColumn(name="idModelo")
	private Modelo modelo;
	public ModeloImagem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ModeloImagem(Long id, String contextType, String url, Modelo modelo) {
		super();
		this.id = id;
		this.contextType = contextType;
		this.url = url;
		this.modelo = modelo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContextType() {
		return contextType;
	}
	public void setContextType(String contextType) {
		this.contextType = contextType;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Modelo getModelo() {
		return modelo;
	}
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	
	
	
	
	
	
}
