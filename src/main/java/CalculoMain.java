import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.projuris.Calculo;
import br.com.projuris.CustoCargo;
import br.com.projuris.CustoDepartamento;
import br.com.projuris.Funcionario;
import br.com.projuris.MyCalculo;

public class CalculoMain {

	private static Calculo calculo = new MyCalculo();

	private static List<Funcionario> listaFuncionario = new ArrayList<Funcionario>();

	public static void main(String[] args) {
		listaFuncionario.add(new Funcionario("Assistente", "Administrativo", new BigDecimal("1000.0")));
		listaFuncionario.add(new Funcionario("Gerente", "Administrativo", new BigDecimal("7000.70")));
		listaFuncionario.add(new Funcionario("Diretor", "Administrativo", new BigDecimal("10000.45")));

		listaFuncionario.add(new Funcionario("Assistente", "Financeiro", new BigDecimal("1300.9")));
		listaFuncionario.add(new Funcionario("Gerente", "Financeiro", new BigDecimal("7500")));
		listaFuncionario.add(new Funcionario("Diretor", "Financeiro", new BigDecimal("11000.0")));

		listaFuncionario.add(new Funcionario("Estagiário", "Jurídico", new BigDecimal("700.4")));
		listaFuncionario.add(new Funcionario("Assistente", "Jurídico", new BigDecimal("1800.90")));
		listaFuncionario.add(new Funcionario("Gerente", "Jurídico", new BigDecimal("9500.50")));
		listaFuncionario.add(new Funcionario("Diretor", "Jurídico", new BigDecimal("13000.0")));

		System.out.println("##### CUSTO TOTAL POR CARGO #####");
		List<CustoCargo> custoCargo = calculo.custoPorCargo(listaFuncionario);

		for (CustoCargo custo : custoCargo) {
			System.out.println(custo.getCargo() + ": " + custo.getCusto());
		}

		System.out.println("\n#####CUSTO TOTAL POR DEPARTAMENTO #####");
		List<CustoDepartamento> custoDepartamento = calculo.custoPorDepartamento(listaFuncionario);

		for (CustoDepartamento custo : custoDepartamento) {
			System.out.println(custo.getDepartamento() + ": " + custo.getCusto());
		}
	}

}
