package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class GradeNumeracao {

	@Id
	@GeneratedValue
	private Long id;
	
	private Long numeracaoInicial;
	
	private Long numeracaoFinal;
	
	@OneToMany(mappedBy="gradeNumeracao")
	private List<Modelo> lstModelo;

	
	
	public GradeNumeracao() {
		super();
		// TODO Auto-generated constructor stub
	}



	public GradeNumeracao(Long id, Long numeracaoInicial, Long numeracaoFinal,
			List<Modelo> lstModelo) {
		super();
		this.id = id;
		this.numeracaoInicial = numeracaoInicial;
		this.numeracaoFinal = numeracaoFinal;
		this.lstModelo = lstModelo;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Long getNumeracaoInicial() {
		return numeracaoInicial;
	}



	public void setNumeracaoInicial(Long numeracaoInicial) {
		this.numeracaoInicial = numeracaoInicial;
	}



	public Long getNumeracaoFinal() {
		return numeracaoFinal;
	}



	public void setNumeracaoFinal(Long numeracaoFinal) {
		this.numeracaoFinal = numeracaoFinal;
	}



	public List<Modelo> getLstModelo() {
		return lstModelo;
	}



	public void setLstModelo(List<Modelo> lstModelo) {
		this.lstModelo = lstModelo;
	}
	
	
	
}
