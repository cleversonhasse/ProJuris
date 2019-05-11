package br.com.projuris;

import java.math.BigDecimal;

public class CustoDepartamento {

	private String departamento;

	private BigDecimal custo;

	public CustoDepartamento(String departamento, BigDecimal custo) {
		this.departamento = departamento;
		this.custo = custo;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public BigDecimal getCusto() {
		return this.custo;
	}

	public void setCusto(BigDecimal custo) {
		this.custo = custo;
	}

	public void addCusto(BigDecimal custo) {
		this.setCusto(this.getCusto().add(custo));
	}

}
