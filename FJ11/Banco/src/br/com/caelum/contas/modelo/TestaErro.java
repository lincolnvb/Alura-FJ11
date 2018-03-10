package br.com.caelum.contas.modelo;

import java.io.FileNotFoundException;

public class TestaErro {
	public static void main (String[] args){
		System.out.println("Inicio do main.");

		try {
			new java.io.FileInputStream("                                                                                                          .text");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		//metodo1();
		System.out.println("Fim do main.");
	}

	public static void metodo1(){
		System.out.println("Inicio do metodo 1.");
		metodo2();
		System.out.println("fim do metodo 1.");
	}

	public static void metodo2(){
		System.out.println("Inicio do metodo 2.");
		int[] array = new int[10];

		try {
			for(int i = 0;i < 15; i++){

				array[i] = i*i;
				System.out.println(array[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Deu ruim");
		}
		System.out.println("fim do metodo 2.");
	}



}
