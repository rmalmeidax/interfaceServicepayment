package model.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/aaaa");
		
		
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int contrato = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/MM/yyyy):");
		String dataString = sc.nextLine();
		LocalDate dataContrato = LocalDate.parse(dataString, dtf);
		System.out.print("Valor do contrato:");
		double priceContrato = sc.nextDouble();
		System.out.print("Entre com o numero de parcelas:");
		int parcela = sc.nextInt();
		
		System.out.println();
		
		System.out.println("Parcelas:");
		
		
		sc.close();

	}

}
