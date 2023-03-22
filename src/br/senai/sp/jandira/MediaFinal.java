package br.senai.sp.jandira;

import java.util.Scanner;

public class MediaFinal {

	public static void main(String[] args) {
			
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("*************************************");
		System.out.println("              MÉDIA FINAL            ");
		System.out.println("*************************************");
		System.out.println("");
		
		System.out.print("Nome do Aluno: ");
		String nomeAluno = teclado.nextLine();
		
		System.out.print("Nota do bimestre 1: ");
		double notaUm = teclado.nextDouble();
		
		System.out.print("Nota do bimestre 2: ");
		double notaDois = teclado.nextDouble();
		
		System.out.print("Nota do bimestre 3: ");
		double notaTres = teclado.nextDouble();
		
		System.out.print("Nota do bimestre 4: ");
		double notaQuatro = teclado.nextDouble();	
		
		
		double notaFinal = (notaUm + notaDois + notaTres + notaQuatro) / 4;
				
		System.out.println("");
		System.out.println("------------------------------------");
		System.out.println("");
		System.out.println(nomeAluno + ", sua nota final é " + notaFinal);
		System.out.println("");
		System.out.println("------------------------------------");
		
	}


}
