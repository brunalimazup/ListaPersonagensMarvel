package br.com.marvel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Personagens {
	public static void main(String[] args) {
		
		// Declarando o teclado
		Scanner entrada = new Scanner (System.in);
		
		// Declarando o ArrayList
		List<String> listaDePersonagens = new ArrayList <String>();
		
		String nomePersonagem = ""; 
		
		// Usando o While
		while (!nomePersonagem.equalsIgnoreCase("Homem de Ferro")) {
			
			System.out.println("Digite o nome de personagens da marvel: ");
			nomePersonagem = entrada.nextLine();
		
	    listaDePersonagens.add(nomePersonagem);
	    
	    System.out.println("O personagem adicionado a lista foi: " + nomePersonagem);
			
		} 
		System.out.println("Os personagens da lista são: ");
		for (String string : listaDePersonagens) {
			System.out.println(string);
		}

		entrada.close();
	}
}
