package edu.vando.segundaSemana;

public class MinhaClasse {
	
	public static void main(String[] args) {
		
		String primeiroNome = "givandilson";
		String segundoNome = "Oliveira";
				
		String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
		System.out.println(nomeCompleto);
		
	}

	public static String nomeCompleto(String primeiroNome, String segundoNome) {
		return primeiroNome + segundoNome;
	}
}
