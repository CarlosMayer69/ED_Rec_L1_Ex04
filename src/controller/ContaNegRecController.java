/*
4. Crie uma fun��o recursiva que exiba 
o total de elementos negativos de um vetor de inteiros,
de N posi��es, passado como par�metro.
O c�digo deve trazer como coment�rios:
A condi��o de parada;
Como escrever a fun��o para o termo n em fun��o do termo anterior
*/

package controller;

public class ContaNegRecController {
	
	public ContaNegRecController() {
		super();
	}
	
	public int contaNegativos(int[] vetor, int n) {
	    // a) Condi��o de parada: quando n for igual a 0.
	    if (n == 0) {
	        
	    // Se o elemento for negativo, retorna 1.
	    if (vetor[n] < 0) {
	            return 1;
	        } else {
	            return 0;
	        }
	    }
	    // b) C�lculo do termo n em fun��o do termo anterior.
        // Se o elemento for negativo, adiciona 1 ao resultado da fun��o recursiva
	    	if (vetor[n] < 0) {
	    	return 1 + contaNegativos(vetor, n-1);
	    	} else {
	    		return contaNegativos(vetor, n-1);
	    	}
	    	
	}

}
