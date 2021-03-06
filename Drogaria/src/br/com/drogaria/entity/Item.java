package br.com.drogaria.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;;

@Entity
@Table(name="tbl_itens")
public class Item implements Serializable { 
	static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "ite_codigo")
	private Long codigo;
	
	@Column(name="ite_parcial", precision = 7, scale = 2, nullable = false)
	private BigDecimal valor;
	
	@Column(name = "ite_quantidade", nullable = false)
	private  Integer quantidade;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="tbl_venda_ven_codigo", referencedColumnName = "vend_codigo" , nullable = false)
	private Venda venda;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name ="tbl_produtos_pro_codigo", referencedColumnName = "pro_codigo", nullable = false)
	private Produto produto;
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	@Override
	public String toString() {
		return "Item [codigo=" + codigo + ", valor=" + valor + ", quantidade=" + quantidade + ", venda=" + venda
				+ ", produto=" + produto + "]";
	}
	
	
}
