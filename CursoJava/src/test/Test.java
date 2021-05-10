package test;

import repaso.Circulo;
import repaso.Cuadrado;
import repaso.PoligonoRegular;
import repaso.Rectangulo;
import repaso.Triangulo;

public class Test {

	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado("c1",10);
		Circulo cir1 = new Circulo("cir1",7);
		Triangulo t1 = new Triangulo("t1",12,8);
		Rectangulo r1 = new Rectangulo("r1",16,10);
		PoligonoRegular pr1= new PoligonoRegular("pr1",10,8,8);
		
		System.out.println("DATOS DE UN CUADRADO");
		System.out.println(c1.getValores());
		System.out.println(c1.calcularPerimetro());
		System.out.println(c1.calcularSuperficie());
		System.out.println("-----------------------");
		
		System.out.println("DATOS DE UN CIRCULO");
		System.out.println(cir1.getValores());
		System.out.println(cir1.calcularPerimetro());
		System.out.println(cir1.calcularSuperficie());
		System.out.println("-----------------------");
		
		System.out.println("DATOS DE UN TRIANGULO");
		System.out.println(t1.getValores());
		System.out.println(t1.calcularPerimetro());
		System.out.println(t1.calcularSuperficie());
		System.out.println("-----------------------");
		
		System.out.println("DATOS DE UN RECTANGULO");
		System.out.println(r1.getValores());
		System.out.println(r1.calcularPerimetro());
		System.out.println(r1.calcularSuperficie());
		System.out.println("-----------------------");
		
		System.out.println("DATOS DE UN POLIGONO-REGULAR");
		System.out.println(pr1.getValores());
		System.out.println(pr1.calcularPerimetro());
		System.out.println(pr1.calcularSuperficie());
		
		System.out.println("Fin de los datos.");
		

	}

}
