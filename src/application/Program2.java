package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Contribuinte> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for (int i=1;i<=n;i++) {
			System.out.println("Tax payer #"+i+" data: ");
			System.out.print("Individual or company (i/c)? ");
			char resp = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Anual income: ");
			Double rendaAnual = sc.nextDouble();
			if(resp=='i') {
				System.out.print("Health expenditures: ");
				Double gastoSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
			}
			else {
				System.out.print("Number of employees: ");
				int nFuncionario = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, nFuncionario));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID");
		double sum = 0.0;
		for(Contribuinte cont:list) {
			System.out.printf(cont.getNome()+": $"+String.format("%.2f", cont.imposto())+"\n");
			sum+=cont.imposto();
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $"+String.format("%.2f",sum));
		
		sc.close();
	}

}
