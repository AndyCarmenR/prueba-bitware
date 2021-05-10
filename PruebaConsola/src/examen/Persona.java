package examen;

import java.util.Random;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Persona {

	private String nombre = "";
	private String nss;
	private int edad = 0;
	private String sexo = "";
	private Double peso = 0d;
	private Double altura = 0d;
	private String pesoIdeal="";

	public Persona(String nombre, Integer edad, String sexo, Double peso, Double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.nss = this.generaNSS();
		this.pesoIdeal=(this.calcularIMC()==-1)?("Falta de peso"):((this.calcularIMC()==0)?("Peso normal"):("Sobrepeso"));
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public String getNss() {
		return nss;
	}

	public int calcularIMC() {
		int respuestaIMC = 0;
		Double imc = this.peso / (this.altura * this.altura);
		if (this.sexo.equalsIgnoreCase(Constantes.CVE_SEXO_HOMBRE)) {
			if (imc < 20) {
				respuestaIMC = -1;
			} else if (imc > 25) {
				respuestaIMC = 1;
			}

		} else if (this.sexo.equalsIgnoreCase(Constantes.CVE_SEXO_MUJER)) {
			if (imc < 19) {
				respuestaIMC = -1;
			} else if (imc > 24) {
				respuestaIMC = 1;
			}
		}
		return respuestaIMC;
	}

	public Boolean esMayorDeEdad() {
		return (this.edad > 18) ? (Boolean.TRUE) : (Boolean.FALSE);
	}

	private Boolean comprobarSexo() {
		return (this.sexo.equals(Constantes.CVE_SEXO_HOMBRE) || this.sexo.equals(Constantes.CVE_SEXO_MUJER))
				? (Boolean.TRUE)
				: (Boolean.FALSE);
	}

	private String generaNSS() {
		String nss = "";
		for (int i = 0; i <= 11; i++) {
			nss += this.generaLetraNumero();
		}
		return nss;
	}

	private String generaLetraNumero() {
		String letraNumero = (new Random().nextInt(2) % 2 == 0) ? ("char") : ("num");
		String caracter = "";
		if ("char".equals(letraNumero)) {
			caracter = caracter + (char) (new Random().nextInt(26) + 91);
		} else if ("num".equals(letraNumero)) {
			caracter = caracter + String.valueOf(new Random().nextInt(10));
		}
		return caracter;
	}

	public String toString() {
		return " ".concat(this.nombre).concat("\n edad: " + String.valueOf(this.edad) + " años ").concat("\n sexo: " + this.sexo)
				.concat(" \n nss: " + this.nss.toUpperCase()).concat("\n peso: " + this.peso.toString() + " kg")
				.concat("\n altura: " + this.altura.toString() + " m")
				.concat((this.esMayorDeEdad()) ? (", eres mayor de edad") : (", eres menor de edad"))
				.concat("\n "+this.pesoIdeal);
	}
}
