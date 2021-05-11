package test;

import java.util.ArrayList;
import java.util.Iterator;

import repaso.Circulo;
import repaso.Cuadrado;
import repaso.Figura;
import repaso.PoligonoRegular;
import repaso.Rectangulo;
import repaso.Triangulo;
import util.FiguraFileUtil;

public class Test {

	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado("c1",10);
		Circulo cir1 = new Circulo("cir1",7);
		Triangulo t1 = new Triangulo("t1",12,80);
		Rectangulo r1 = new Rectangulo("r1",16,10);
		PoligonoRegular pr1= new PoligonoRegular("pr1",10,80,800);
		ArrayList<Figura> figuras = new ArrayList<Figura>();
		figuras.add(c1);
		figuras.add(cir1);
		figuras.add(r1);
		figuras.add(t1);
		figuras.add(pr1);
		String path= "C:\\FigurasUtil";
		String nombre_archivo ="\\figuras.txt";
		FiguraFileUtil util = new FiguraFileUtil(figuras,nombre_archivo,path);
		util.generarArchivo();
		ArrayList<Figura> figuras2 = new ArrayList<Figura>();
		figuras2=util.leerArchivo();
		
		for (Figura figura : figuras2) {
			System.out.println(figura);
			
		}

		
		//System.out.println(textoA[0]);
		//System.out.println(textoA[1].substring(2,textoA[1].length()-2));
		//System.out.println(finNombre[0]+"--"+finNombre[1]+"--"+finNombre[2]);
		//String nombre = frase.substring(18, 18+finNombre);
		//System.out.println(nombre);
	//	int finNombre=linea.indexOf(",",9); 
    	//System.out.println(finNombre);
    	//String tipo = linea.substring(8,9);
    //	String nombre = linea.substring(19,finNombre-2);
		
		/*System.out.println("DATOS DE UN CUADRADO");
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
		
		System.out.println("Fin de los datos.");*/
		

	}

}
