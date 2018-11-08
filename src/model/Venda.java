package model;

import java.util.*;

public class Venda {
	
	private int codVenda;
	private Float totalVenda;
	private int codAluno;
	

	
	public Venda(int codVenda, float totalVenda, int codAluno) {
		this.codVenda = codVenda;
		this.totalVenda = totalVenda;
		this.codAluno = codAluno;
	}
	
	public Venda(int codVenda, float totalVenda) {
		this.codVenda = codVenda;
		this.totalVenda = totalVenda;
	}
	public Venda(Float valorTot, int codAluno) {
		this.totalVenda = valorTot;
		this.codAluno = codAluno;
	}


	public int getCodVenda() {
		return codVenda;
	}

	public float getTotalVenda() {
		return totalVenda;
	}
	public void setTotalVenda(float totalVenda) {
		this.totalVenda = totalVenda;
	}
	public int getCodAluno() {
		return codAluno;
	}
	public void setCodAluno(int codAluno) {
		this.codAluno = codAluno;
	}
	
	
	
	
}
