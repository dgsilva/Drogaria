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
import javax.persistence.Table;

@Entity
@Table(name="tbl_produtos")
public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "pro_codigo")
	private Long codigo;
	
	@Column(name="pro_descricao", length = 50 , nullable = false)
	private String descricao;
	
	@Column(name="pro_preco", precision = 7, scale=2, nullable = false)
	private BigDecimal preco;
	
	@Column(name="pro_quantidade",precision = 7,scale=2, nullable = false)
	private Integer quantidade;
	
	@JoinColumn(name = "tbl_fabricantes_fab_codigo", referencedColumnName = "fab_codigo" )
	//Muito Produto tem um fabricante
	@ManyToOne(fetch = FetchType.EAGER)
	private Fabricante fabricante;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", preco=" + preco + ", quantidade="
				+ quantidade + ", fabricante=" + fabricante + "]";
	}
	
	
	
	

}
