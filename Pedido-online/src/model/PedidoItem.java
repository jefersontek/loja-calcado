package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import dao.GenericDao;

@Entity
public class PedidoItem extends GenericDao<PedidoItem> {

	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="idPedido")
	private Pedido pedido;
	
	@ManyToOne
	@JoinColumn(name="idModelo")
	private Modelo modelo;
	
	private Long numeracao;
	
	private Long quantidade;

	public PedidoItem() {
		super(PedidoItem.class);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Long getNumeracao() {
		return numeracao;
	}

	public void setNumeracao(Long numeracao) {
		this.numeracao = numeracao;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	
	
}
