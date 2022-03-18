import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList teste = new ArrayList<Float>();
		teste.add(1200.86);
		teste.add(1200.86);
		teste.add(1200.86);
		Float soma;;
		soma = (Float) teste.get(0);
		System.out.print(soma);
		teste.size();
		
		double salarioAtual = 0;
		double percentualAumento = 0;
		double novoSalario = 0;
		double baseCalculo = 0;
		
		double vetor[];
		double valorTeste = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor do salário: ");
		salarioAtual = teclado.nextFloat();
		System.out.println("Digite o Percentual de Aumento: ");
		percentualAumento = teclado.nextFloat();
		
		vetor = new double[100];
		vetor[0] = 10.0;

		novoSalario = (salarioAtual * (percentualAumento/100)) + salarioAtual;
		System.out.printf("Seu novo Salário será: %.2f", novoSalario);
		
	}

}
