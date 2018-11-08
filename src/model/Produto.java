package model;

public class Produto {

	private Integer codProduto;
	private String descricao;
	private Float preco;
	
	public Produto() {
		
	}

	public Integer getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(Integer codProduto) {
		this.codProduto = codProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}
        
        @Override
        public String toString() {
                return getDescricao();
        }
        
        public boolean equals(Object o) {
        if (o instanceof Produto) {
            Produto p = (Produto) o;
            if (p.getCodProduto() == this.getCodProduto()) {
                return true;
            }
        }
        return false;
    }
	
}
