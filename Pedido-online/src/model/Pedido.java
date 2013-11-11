package model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import dao.GenericDao;

@Entity
public class Pedido extends GenericDao<Pedido> {

	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="idCliente")
	private Cliente cliente;
	
	private Date dataPedido;
	
	private Date dataEntrega;
	
	@OneToMany(mappedBy="pedido")
	private List<PedidoItem> lstPedidoItem;

	public Pedido() {
		super(Pedido.class);		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public List<PedidoItem> getLstPedidoItem() {
		return lstPedidoItem;
	}

	public void setLstPedidoItem(List<PedidoItem> lstPedidoItem) {
		this.lstPedidoItem = lstPedidoItem;
	}
	
	
	
	
}
