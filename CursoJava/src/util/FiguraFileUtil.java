package util;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import repaso.Circulo;
import repaso.Cuadrado;
import repaso.Figura;
import repaso.PoligonoRegular;
import repaso.Rectangulo;
import repaso.Triangulo;

public class FiguraFileUtil {
	
	private ArrayList<Figura>figuras;
	private String nombreArchivo;
	private String path;
	
	public FiguraFileUtil(ArrayList<Figura> figuras, String nombreArchivo, String path) {
		super();
		this.figuras = figuras;
		this.nombreArchivo = nombreArchivo;
		this.path = path;
	}
	
	static void generarArchivo(ArrayList<Figura> figuras,String nombreArchivo,String path) {
		    FileWriter fichero = null;
	        PrintWriter pw = null;
	        int tipo=0;
	        try
	        {
	        	//path = System.getProperty("user.dir")+"\\src\\archivos\\figuras.txt";
	            fichero = new FileWriter(path);
	            pw = new PrintWriter(fichero);
	            
	            for (Figura figura : figuras) {
	            	if(figura instanceof Cuadrado) {
	            		tipo = 1;
	            		pw.println("{\"tipo\":" + tipo +","+ "\"nombre\"': " +figura.getNombre()+ "," + "\"valores\":"+ figura.getValores()+"\"}");
	            	}else if(figura instanceof Circulo ) {
	            		tipo = 2;
	            		pw.println("{\"tipo\":" + tipo +","+ "\"nombre\"': " +figura.getNombre()+ "," + "\"valores\":"+ figura.getValores()+"\"}");
	            	}else if(figura instanceof Rectangulo ) {
	            		tipo = 3;
	            		pw.println("{\"tipo\":" + tipo +","+ "\"nombre\"': " +figura.getNombre()+ "," + "\"valores\":"+ figura.getValores()+"\"}");
	            	}else if(figura instanceof Triangulo ) {
	            		tipo = 4;
	            		pw.println("{\"tipo\":" + tipo +","+ "\"nombre\"': " +figura.getNombre()+ "," + "\"valores\":"+ figura.getValores()+"\"}");
	            	}else if(figura instanceof PoligonoRegular ) {
	            		tipo = 5;
	            		pw.println("{\"tipo\":" + tipo +","+ "\"nombre\"': " +figura.getNombre()+ "," + "\"valores\":"+ figura.getValores()+"\"}");
	            	}
	            	
	            	
				}
	     
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	           try {
	           // Nuevamente aprovechamos el finally para 
	           // asegurarnos que se cierra el fichero.
	           if (null != fichero)
	              fichero.close();
	           } catch (Exception e2) {
	              e2.printStackTrace();
	           }
	        }
	        System.out.println("finalizo felizmente");
	    }
		
	
	
	public void generarArchivo() {
		 FileWriter fichero = null;
	        PrintWriter pw = null;
	        int tipo=0;
	        try
	        {
	        	this.path = "C:\\FigurasUtil\\figuras.txt";
	            fichero = new FileWriter(this.path);
	            pw = new PrintWriter(fichero);
	            
	            for (Figura figura : figuras) {
	            	if(figura instanceof Cuadrado) {
	            		tipo = 1;
	            		
	            	}else if(figura instanceof Circulo ) {
	            		tipo = 2;
	            		
	            	}else if(figura instanceof Rectangulo ) {
	            		tipo = 3;
	            		
	            	}else if(figura instanceof Triangulo ) {
	            		tipo = 4;
	            		
	            	}else if(figura instanceof PoligonoRegular ) {
	            		tipo = 5;
	            		
	            	}
	            	pw.println("{\"tipo\":" + tipo +","+ "\"nombre\":" +figura.getNombre()+ "," + "\"valores\":"+ figura.getValores()+"\"}");
	            		
				}
	     
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	           try {
	           // Nuevamente aprovechamos el finally para 
	           // asegurarnos que se cierra el fichero.
	           if (null != fichero)
	              fichero.close();
	           } catch (Exception e2) {
	              e2.printStackTrace();
	           }
	        }
	        System.out.println("finalizo felizmente");
		
	}
	
	static ArrayList<Figura> leerArchivo(String nombreArchivo,String path){	
		  File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      ArrayList<Figura>figuras = new ArrayList<Figura>();

	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine())
	    	 
	         archivo = new File (path+nombreArchivo);
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);

	         // Lectura del fichero
	         String linea;
	         while((linea=br.readLine())!=null) {
	        	String tipo = linea.substring(8,9);
	        	int ntipo=Integer.parseInt(tipo);
	        	if(ntipo==1) {
	        		
	        		String[] partes = linea.split(",");
	        		String nombre = partes[1].substring(8,partes[1].length());
	        		String valores =partes[2].substring(12,partes[2].length()-2);
	        		float valor = Float.parseFloat(valores);
	        		Cuadrado c1 = new Cuadrado();
	        		c1.setNombre(nombre);
	        		c1.setLado(valor);
	        		figuras.add(c1);
	        		
	        	}else if(ntipo==2) {
	        		
	        		String[] partes = linea.split(",");
	        		String nombre = partes[1].substring(8,partes[1].length());
	        		String valores =partes[2].substring(12,partes[2].length()-2);
	        		float valor = Float.parseFloat(valores);
	        		Circulo x1 = new Circulo();
	        		x1.setNombre(nombre);
	        		x1.setRadio(valor);
	        		figuras.add(x1);
	        		
	        	}else if(ntipo==3) {
	        		
	        		String[] partes = linea.split(",");
	        		String nombre = partes[1].substring(8,partes[1].length());
	        		String svalor1 =partes[2].substring(12,partes[2].length()-2);
	        		
	        		
	        		String[] partes2 = svalor1.split("-");
	        		String svalor2 =partes2[1].substring(2,partes2[1].length());
	        		
	        		
	        		float valor = Float.parseFloat(partes2[0]);
	        		float valor2 = Float.parseFloat(svalor2);
	        		Rectangulo r1 = new Rectangulo();
	        		r1.setNombre(nombre);
	        		r1.setAltura(valor);
	        		r1.setBase(valor2);
	        		figuras.add(r1);
	        	}
	        	else if(ntipo==4) {
	        		
	        		String[] partes = linea.split(",");
	        		String nombre = partes[1].substring(8,partes[1].length());
	        		String svalor1 =partes[2].substring(12,partes[2].length()-2);
	        		
	        		
	        		String[] partes2 = svalor1.split("-");
	        		String svalor2 =partes2[1].substring(2,partes2[1].length());
	        		
	        		
	        		float valor = Float.parseFloat(partes2[0]);
	        		float valor2 = Float.parseFloat(svalor2);
	        		
	        		Triangulo t1 = new Triangulo();
	        		t1.setNombre(nombre);
	        		t1.setAltura(valor);
	        		t1.setBase(valor2);
	        		figuras.add(t1);
	        		
	        	}else if(ntipo==5) {
	        		
	        		String[] partes = linea.split(",");
	        		String nombre = partes[1].substring(8,partes[1].length());
	        		String svalor1 =partes[2].substring(12,partes[2].length()-2);
	        		
	        		
	        		String[] partes2 = svalor1.split("-");
	        		
	        		String svalor2 =partes2[1].substring(3,partes2[1].length());
	        		String svalor3 =partes2[2].substring(2,partes2[2].length());
	        		//System.out.println(svalor3);
	        		
	        		float valor = Float.parseFloat(partes2[0]);
	        		int valor2 = Integer.parseInt(svalor2);
	        		int valor3 = Integer.parseInt(svalor3);
	        		
	        		PoligonoRegular pr = new PoligonoRegular();
	        		pr.setNombre(nombre);
	        		pr.setApotema(valor);
	        		pr.setCantidadDeLados(valor2);
	        		pr.setLado(valor3);
	        		figuras.add(pr);
	        		
	        	}
	        	
	        	
	         }
	            
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
	   
		return figuras;
	}
		
	
	public ArrayList<Figura> leerArchivo(){	
		  File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      ArrayList<Figura>figuras = new ArrayList<Figura>();

	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine())
	    	 this.path = "C:\\FigurasUtil\\figuras.txt";
	         archivo = new File (this.path);
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);

	         // Lectura del fichero
	         String linea;
	         while((linea=br.readLine())!=null) {
	        	String tipo = linea.substring(8,9);
	        	int ntipo=Integer.parseInt(tipo);
	        	if(ntipo==1) {
	        		
	        		String[] partes = linea.split(",");
	        		String nombre = partes[1].substring(8,partes[1].length());
	        		String valores =partes[2].substring(12,partes[2].length()-2);
	        		float valor = Float.parseFloat(valores);
	        		Cuadrado c1 = new Cuadrado();
	        		c1.setNombre(nombre);
	        		c1.setLado(valor);
	        		figuras.add(c1);
	        		
	        	}else if(ntipo==2) {
	        		
	        		String[] partes = linea.split(",");
	        		String nombre = partes[1].substring(8,partes[1].length());
	        		String valores =partes[2].substring(12,partes[2].length()-2);
	        		float valor = Float.parseFloat(valores);
	        		Circulo x1 = new Circulo();
	        		x1.setNombre(nombre);
	        		x1.setRadio(valor);
	        		figuras.add(x1);
	        		
	        	}else if(ntipo==3) {
	        		
	        		String[] partes = linea.split(",");
	        		String nombre = partes[1].substring(8,partes[1].length());
	        		String svalor1 =partes[2].substring(12,partes[2].length()-2);
	        		
	        		
	        		String[] partes2 = svalor1.split("-");
	        		String svalor2 =partes2[1].substring(2,partes2[1].length());
	        		
	        		
	        		float valor = Float.parseFloat(partes2[0]);
	        		float valor2 = Float.parseFloat(svalor2);
	        		Rectangulo r1 = new Rectangulo();
	        		r1.setNombre(nombre);
	        		r1.setAltura(valor);
	        		r1.setBase(valor2);
	        		figuras.add(r1);
	        	}
	        	else if(ntipo==4) {
	        		
	        		String[] partes = linea.split(",");
	        		String nombre = partes[1].substring(8,partes[1].length());
	        		String svalor1 =partes[2].substring(12,partes[2].length()-2);
	        		
	        		
	        		String[] partes2 = svalor1.split("-");
	        		String svalor2 =partes2[1].substring(2,partes2[1].length());
	        		
	        		
	        		float valor = Float.parseFloat(partes2[0]);
	        		float valor2 = Float.parseFloat(svalor2);
	        		
	        		Triangulo t1 = new Triangulo();
	        		t1.setNombre(nombre);
	        		t1.setAltura(valor);
	        		t1.setBase(valor2);
	        		figuras.add(t1);
	        		
	        	}else if(ntipo==5) {
	        		
	        		String[] partes = linea.split(",");
	        		String nombre = partes[1].substring(8,partes[1].length());
	        		String svalor1 =partes[2].substring(12,partes[2].length()-2);
	        		
	        		
	        		String[] partes2 = svalor1.split("-");
	        		
	        		String svalor2 =partes2[1].substring(3,partes2[1].length());
	        		String svalor3 =partes2[2].substring(2,partes2[2].length());
	        		//System.out.println(svalor3);
	        		
	        		float valor = Float.parseFloat(partes2[0]);
	        		int valor2 = Integer.parseInt(svalor2);
	        		int valor3 = Integer.parseInt(svalor3);
	        		
	        		PoligonoRegular pr = new PoligonoRegular();
	        		pr.setNombre(nombre);
	        		pr.setApotema(valor);
	        		pr.setCantidadDeLados(valor2);
	        		pr.setLado(valor3);
	        		figuras.add(pr);
	        		
	        	}
	        	
	        	
	         }
	            
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
	   
		return figuras;
	}
		

	public ArrayList<Figura> getFiguras() {
		return figuras;
	}

	public void setFiguras(ArrayList<Figura> figuras) {
		this.figuras = figuras;
	}

	public String getNombreFigura() {
		return nombreArchivo;
	}

	public void setNombreFigura(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	

}
	
	
	
	