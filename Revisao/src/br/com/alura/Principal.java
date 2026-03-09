package br.com.alura;

import java.util.List;

public class Principal {
	public static void main(String[] args) {
		
        //A lista gerada pelo List.of() é IMUTÁVEL.
		//Garante que a lista não será alterada acidentalmente por outras partes do código.
		List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda");
		
		//List<String> funcionariosLetraA = funcionarios.stream()
        //            .filter(f -> f.startsWith("A"))
		
		List<String> funcionariosLetraA = funcionarios.stream()
				.filter(f -> f.startsWith("A"))
				.toList();
		
		//A lista destas que possuem a inicial A
		System.out.println(funcionarios);
		System.out.println(funcionariosLetraA);
		
		
		List<Double> valorVendas = List.of(500.0, 1800.0, 6200.0);
		List<Double> comissao = valorVendas.stream()
	            .map(v -> v * 0.05).toList();
		
		System.out.println(valorVendas);
		System.out.println(comissao);
		
	}
}
