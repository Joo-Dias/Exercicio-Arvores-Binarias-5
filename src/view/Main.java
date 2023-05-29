package view;

import controller.Arvore;

public class Main {

	public static void main(String[] args) {

		Arvore tree = new Arvore();

		int[] vetor = { 30, 15, 10, 20, 60, 40, 80 };

		// Inserindo os valores do vetor na árvore
		for (int valor : vetor) {
			tree.insert(valor);
		}

		// Mostrando a árvore em ordem crescente com o atravessamento IN 
		try {
			System.out.println("Atravessamento IN =============");
			tree.infixSearch();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
