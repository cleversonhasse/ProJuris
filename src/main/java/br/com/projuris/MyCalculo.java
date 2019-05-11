package br.com.projuris;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.projuris.Calculo;
import br.com.projuris.CustoCargo;
import br.com.projuris.CustoDepartamento;
import br.com.projuris.Funcionario;

public class MyCalculo implements Calculo {

	public List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios) {
		Map<String, CustoCargo> cargos = new HashMap<String, CustoCargo>();

		for (Funcionario funcionario : funcionarios) {
			String cargo = funcionario.getCargo();

			if (cargos.containsKey(cargo)) {
				cargos.get(cargo).addCusto(funcionario.getSalario());
			} else {
				cargos.put(cargo, new CustoCargo(cargo, funcionario.getSalario()));
			}
		}

		return new ArrayList<CustoCargo>(cargos.values());
	}

	public List<CustoDepartamento> custoPorDepartamento(List<Funcionario> funcionarios) {
		Map<String, CustoDepartamento> departamentos = new HashMap<String, CustoDepartamento>();

		for (Funcionario funcionario : funcionarios) {
			String departamento = funcionario.getDepartamento();

			if (departamentos.containsKey(departamento)) {
				departamentos.get(departamento).addCusto(funcionario.getSalario());
			} else {
				departamentos.put(departamento, new CustoDepartamento(departamento, funcionario.getSalario()));
			}
		}

		return new ArrayList<CustoDepartamento>(departamentos.values());
	}

}
