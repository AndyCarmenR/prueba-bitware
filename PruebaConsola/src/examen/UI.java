package examen;

import java.util.Scanner;

public class UI {

	public void llamarInterfaz() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hola usuario!");
		System.out.println("Escribe tu nombre por favor:");
		String nombre = scan.nextLine();
		System.out.println("Escribe tu edad por favor:");
		int edad = Integer.parseInt(scan.nextLine());
		System.out.println("Escribe tu peso por favor:");
		Double peso=Double.parseDouble(scan.nextLine());
		System.out.println("Escribe tu altura por favor:");
		Double altura=Double.parseDouble(scan.nextLine());
		System.out.println("Eres hombre o mujer? escribe m para mujer, o h para hombre:");
		String sexo=scan.nextLine();
		
		Persona persona=new Persona(nombre, edad, sexo, peso, altura);
		System.out.println(persona.toString());
	}
	
}
