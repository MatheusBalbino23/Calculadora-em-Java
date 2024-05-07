package Calculadora1;

import java.util.Scanner;

public class Calculadora1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		do {		
		//apresentação do sistema 
		System.out.println("######");
		System.out.println("Escolha uma opção: ");
		System.out.println("1 - Novo Calculo");
		System.out.println("9 - Sair do sistema");
		System.out.println("######");
		int opcao = entrada.nextInt();
		
		//declaração das variaveis
		double a, b;
		
		//caso o usuario digite "1" o sistema faz um novo calculo, caso digite "9" o sistema sai 
		//e caso não digite nenhum o sistema retorna "opção invalida"
		switch (opcao) {
		case 1:
		System.out.println("Digite o primero número: ");
		a = entrada.nextDouble();
		System.out.println("Digite o segundo número: ");
		b = entrada.nextDouble();
		
		//"chamando" a classe das funcoes
		CalculadoraFuncoes funcoes = new CalculadoraFuncoes();	
		System.out.println("Digite a operacao matematica: ");
		System.out.println("1 - Soma");
		System.out.println("2 - Multiplicação");
		System.out.println("3 - Divisão");
		System.out.println("4 - Subtração");
		int calculo = entrada.nextInt();
		
		if (calculo == 1) {
			System.out.println("Resultado: " + funcoes.soma(a, b));
		}else if(calculo == 2){ 
			System.out.println("Resultado: " + funcoes.multiplicacao(a, b));
		}else if (calculo == 3) {
			System.out.println("Resultado: " + funcoes.divisao(a, b));
		}else if (calculo == 4){
			System.out.println("Resultado: " + funcoes.subtracao(a, b));
		}else
			System.out.println("opção invalida");
		
		continue; //para continuar o looping
		case 9:
			System.out.println("Saindo do Sistema");
			System.exit(0);//comando pra sair do sistema
		default:
			System.out.println("Opção invalida");
		}
		
		} while (true);
	}
	
}
