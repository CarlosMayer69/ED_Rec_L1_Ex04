package view;

import controller.ContaNegRecController;

public class Principal {

	public static void main(String[] args) {
        
		ContaNegRecController cn = new ContaNegRecController();
		
		int[] vetor = {-5,-4,-3,-2,-1,0,1,2,3,4,5};
		int n = vetor.length-1;
		int contaNegativos = cn.contaNegativos(vetor, n);
		
		System.out.println(contaNegativos);

	}

}
