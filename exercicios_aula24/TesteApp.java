package exercicios_aula24;

import java.util.Scanner;

public class TesteApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Onde posso compra a l�mpada da promo��o?");
		System.out.println("Segue as informa��es do catalogo, para te auxiliar.");
		System.out.println("=======================================================");
		Lampada lamp1 = new Lampada("Supermecado AquiTem", "Osram", 220, 15, 5.99);
		System.out.println("Onde Comprar: " + lamp1.onde_comprar);
		System.out.println("Descri��es do produto L�mpada (PROMO��O): ");
		System.out.println("Fabricante: " + lamp1.fabricante);
		System.out.println("PROMOC�O HOJE por R$ " + lamp1.preco);
		System.out.println("Tens�o: " + lamp1.tensao + " Volts");
		System.out.println("Pot�ncia: " + lamp1.potencia + " Watts");
		System.out.println("=======================================================");
		System.out.println("=======================================================");
		 System.out.println("Teste a l�mpada antes de passar no caixa.");
		 lamp1.acender();
		 
		 if(lamp1.acesa == true) {
			 System.out.println("L�mpada funciona perfeitamente!");
		 }else {
			 System.out.println("Lampada com defeito. Tirar do carrinho.");
		 }	
		 lamp1.apagar();
		 System.out.println("=======================================================");
	}	
		
}
