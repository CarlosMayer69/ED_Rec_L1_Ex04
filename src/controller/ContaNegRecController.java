/*
4. Crie uma função recursiva que exiba 
o total de elementos negativos de um vetor de inteiros,
de N posições, passado como parâmetro.
O código deve trazer como comentários:
A condição de parada;
Como escrever a função para o termo n em função do termo anterior
*/

package controller;

public class ContaNegRecController {
	
	public ContaNegRecController() {
		super();
	}
	
	public int contaNegativos(int[] vetor, int n) {
	    // a) Condição de parada: quando n for igual a 0.
	    if (n == 0) {
	        
	    // Se o elemento for negativo, retorna 1.
	    if (vetor[n] < 0) {
	            return 1;
	        } else {
	            return 0;
	        }
	    }
	    // b) Cálculo do termo n em função do termo anterior.
        // Se o elemento for negativo, adiciona 1 ao resultado da função recursiva
	    	if (vetor[n] < 0) {
	    	return 1 + contaNegativos(vetor, n-1);
	    	} else {
	    		return contaNegativos(vetor, n-1);
	    	}
	    	
	}

}
