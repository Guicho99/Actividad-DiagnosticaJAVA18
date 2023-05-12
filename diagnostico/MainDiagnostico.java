package mx.com.cursodia.js18mod1.diagnostico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class MainDiagnostico {

	public static void main(String[] args) 
	{
		MainDiagnostico s = new MainDiagnostico();
		
		
		
		s.mainMenu();
		
		

	}

	public void mainMenu() 
	{
		int op = Integer.parseInt(JOptionPane.showInputDialog("------------- Diagnostico ------------- \n"
                + "Slecciona una accion a realizar           \n"
				  + "1. Escaneo de Archivos (AV)\n"
                + "2. Contar Palabras de Archivos\n"
				  + "3. Modulo de Tiempo"));
		switch(op) 
		{
			case 1:
			{
				int nomFile = Integer.parseInt(JOptionPane.showInputDialog("------------- Diagnostico ------------- \n"
		                + "Slecciona la o las carpetas a analizar\n"
						  + "1. 1File\n"
		                + "2. AlotofFiles\n"
						  + "3. Ambos"));
				switch(nomFile)
				{
					case 1:
					{
						leerCarpeta();
						break;
						
					}
					
					case 2:
					{
						leerCarpeta1();
						break;
					}
					case 3:
					{
						leerCarpeta2();
						break;
					}
				}
			}
			case 2:
			{
				int option = Integer.parseInt(JOptionPane.showInputDialog("------------- Diagnostico ------------- \n"
		                + "Selecione donde buscara la palabra o palabras\n"
						  + "1. 1File\n"
		                + "2. AlotofFiles\n"
						  + "3. Ambos"));
				switch(option)
				{
				
					case 1:
					{
						String ruta = "Archivos/1File/analize.txt";
						busquedaYConteo(ruta);
						break;
						
					}
					case 2:
					{
						int op2 = Integer.parseInt(JOptionPane.showInputDialog("------------- Diagnostico ------------- \n"
				                + "Selecione donde buscara la palabra o palabras\n"
								  + "1. 17 LEYES DEL TRABAJO EN EQUIPO.txt\n"
				                + "2. 21 LEYES DEL LIDERAZGO - JOHN C. MAXWELL.txt\n"
								  + "3. 25 MANERAS DE GANARSE A LA GENTE - .txt\n"
					                + "4. Abe Shana - La última sirena.txt\n"+
								  "5. ACTITUD DE VENCEDOR - JOHN C. MAXWELL.txt\n"
					                + "6. El Oro Y La Ceniza - Abecassis Eliette .txt\n"
								  +"7. SEAMOS PERSONAS DE INFLUENCIA - JOHN MAXWELL.txt\n"
					                + "8. VIVE TU SUEÑO - JOHN MAXWELL.txt\n"
								  + "9. Todos"));
						
						switch(op2)
						{
						 	case 1:
						 	{
						 		String ruta = "Archivos/AlotofFiles/17 LEYES DEL TRABAJO EN EQUIPO.txt";
								busquedaYConteo(ruta);
								break;
						 	}
						 	case 2:
						 	{
						 		String ruta = "Archivos/AlotofFiles/21 LEYES DEL LIDERAZGO - JOHN C. MAXWELL.txt";
								busquedaYConteo(ruta);
								break;
						 	}
						 	case 3:
						 	{
						 		String ruta = "Archivos/AlotofFiles/25 MANERAS DE GANARSE A LA GENTE - .txt";
								busquedaYConteo(ruta);
								break;
						 	}
						 	case 4:
						 	{
						 		String ruta = "Archivos/AlotofFiles/Abe Shana - La última sirena.txt";
								busquedaYConteo(ruta);
								break;
						 	}
						 	case 5:
						 	{
						 		String ruta = "Archivos/AlotofFiles/ACTITUD DE VENCEDOR - JOHN C. MAXWELL.txt";
								busquedaYConteo(ruta);
								break;
						 	}
						 	case 6:
						 	{
						 		String ruta = "Archivos/AlotofFiles/El Oro Y La Ceniza - Abecassis Eliette .txt";
								busquedaYConteo(ruta);
								break;
						 	}
						 	case 7:
						 	{
						 		String ruta = "Archivos/AlotofFiles/SEAMOS PERSONAS DE INFLUENCIA - JOHN MAXWELL.txt";
								busquedaYConteo(ruta);
								break;
						 	}
						 	case 8:
						 	{
						 		String ruta = "Archivos/AlotofFiles/VIVE TU SUEÑO - JOHN MAXWELL.txt";
								busquedaYConteo(ruta);
								break;
						 	}
						 	case 9:
						 	{
						 		String ruta ="Archivos/AlotofFiles";
						 		busquedaYConteo(ruta);
						 		break;
						 	}
						 	
						 	
						}
						break;
						
					}
					case 3:
					{
						String ruta = "Archivos";
						busquedaYConteo(ruta);
						break;
						
					}
				}
			}
			case 3:
			{
				int opt = Integer.parseInt(JOptionPane.showInputDialog("------------- Diagnostico ------------- \n"
		                + "Selecione la funcionalidad que desea activar\n"
						  + "1. Reloj tiempo real (Con sistemas de alarmas)\n"
		                + "2. Cronometro\n"
						  + "3. Contador Inverso"));
				switch(opt)
				{
					case 1:
					{
						 new LaucherRelojTiempoReal();
						mainMenu();
						break;
						    
						
					}
				}
			}
			
		}
	}
	
	public void leerCarpeta()
	{
		
		File folder = new File("Archivos/1File");
		int i = 0;
		int cont = 0;
		leerArchivos(folder,i,cont);
	}
	public void leerCarpeta1()
	{
		
		File folder = new File("Archivos/AlotofFiles");
		int i = 1;
		int cont = 0;
		leerArchivos(folder,i,cont);
	}
	public void leerCarpeta2()
	{
		
		File folder = new File("Archivos");
		int i = 0;
		int cont = 1;
		leerArchivos(folder,i,cont);
	}
	

	public void leerArchivos( File folder,int i, int cont) 
	{
		String[] folderName = new String [3];
		folderName = folder.list();
		
		
		
		for ( File file : folder.listFiles()) 
		{
			
			if (file.isDirectory()) 
			{
				
				System.out.println("Carpeta: " + folderName[i]);
				leerArchivos(file,i,cont);
				
			}
			if(file.isFile())
			{
				
				
				System.out.printf("Archivo: " + file.getName());
				System.out.println( " Tamaño: "+(file.length()/1000)+"Kb");
			}
			if(cont == 1)
			{
				i++;
			}
		
				
		}
		
	}
			
	public  void busquedaYConteo( String ruta) 
	{
		String palabraBuscar = JOptionPane.showInputDialog("Ingrese la palabra a buscar");
		File archivo = new File(ruta);
	    int totalCoincidencias = 0;
	    int totalCoincidenciasAll = 0;
	    int totalAnterior = 0;
	    System.out.println(archivo.getName());
	    ArrayList <Integer> linea = new ArrayList<Integer>();
	    

	    try {
	    	if (archivo.isDirectory())
	    	{
		    	for ( File file : archivo.listFiles()) 
		        {
		    		
		    		if(file.isFile())
		    		{
		    			
		    		
		    			BufferedReader archivoLeer = new BufferedReader(new FileReader(file));
		    			String lineaLeida;
		    			int contLinea = 0;
	
		    			while ((lineaLeida = archivoLeer.readLine()) != null) 
		    			{
		    				contLinea++;
		    				totalAnterior = totalCoincidencias;
		            		String[] partes = lineaLeida.split(" ");
	
		                	for (int i = 0; i < partes.length; i++) 
		                	{
		                		if (partes[i].equals(palabraBuscar)) 
		                		{
		                			totalCoincidencias = totalCoincidencias + 1;
		                			totalCoincidenciasAll = totalCoincidenciasAll + 1;
		                    	}
		                	}
		                	if(totalAnterior != totalCoincidencias)
		                	{
		                		linea.add(contLinea);
		                	}
		                	
		    			}
		    			System.out.println( "En el archivo " + file.getName() + "\nLa palabra: " +"| "+ palabraBuscar+" |"
		    	                + " se encuentra: " + totalCoincidencias+" veces, estas se encuentran en las lineas \n"+ linea.toString());
		    			totalCoincidencias = 0;
		            	archivoLeer.close();
		            	linea.clear();
		    		}
		    		if(file.isDirectory())
		    		{
		    			
		    			String nruta = ("Archivos/"+file.getName());
		    			archivo = new File(nruta);
		    			for ( File file2 : archivo.listFiles()) 
				        {
				    		
				    		if(file2.isFile())
				    		{
				    			
				    		
				    			BufferedReader archivoLeer = new BufferedReader(new FileReader(file2));
				    			String lineaLeida;
				    			int contLinea = 0;
			
				    			while ((lineaLeida = archivoLeer.readLine()) != null) 
				    			{
				    				contLinea++;
				    				totalAnterior = totalCoincidencias;
				            		String[] partes = lineaLeida.split(" ");
			
				                	for (int i = 0; i < partes.length; i++) 
				                	{
				                		if (partes[i].equals(palabraBuscar)) 
				                		{
				                			totalCoincidencias = totalCoincidencias + 1;
				                			totalCoincidenciasAll = totalCoincidenciasAll + 1;
				                    	}
				                	}
				                	if(totalAnterior != totalCoincidencias)
				                	{
				                		linea.add(contLinea);
				                	}
				                	
				    			}
				    			System.out.println( "En el archivo " + file2.getName() + "\nLa palabra: " +"| "+ palabraBuscar+" |"
				    	                + " se encuentra: " + totalCoincidencias+" veces, estas se encuentran en las lineas \n"+ linea.toString());
				    			totalCoincidencias = 0;
				            	archivoLeer.close();
				            	linea.clear();
				    		}
				    		
				        }
		    			
		    		}
		    		linea.clear();
		        }
		    	System.out.println( "En los archivos de la carpeta " + archivo.getParent() + "\nLa palabra: " +"| "+ palabraBuscar+" |"
    	                + " se encuentra: " + totalCoincidenciasAll+" veces");
	    	}
	    	else
	    	{
	    		BufferedReader archivoLeer = new BufferedReader(new FileReader(archivo));
    			String lineaLeida;
    			int contLinea = 0;
    			while ((lineaLeida = archivoLeer.readLine()) != null) 
    			{
    				contLinea++;
    				totalAnterior = totalCoincidencias;
            		String[] partes = lineaLeida.split(" ");

                	for (int i = 0; i < partes.length; i++) 
                	{
                		if (partes[i].equals(palabraBuscar)) 
                		{
                			totalCoincidencias = totalCoincidencias + 1;
                    	}
                	}
                	
                	if(totalAnterior != totalCoincidencias)
                	{
                		linea.add(contLinea);
                	}
                	
    			}
    			System.out.println( "En el archivo " + archivo.getName() + "\nLa palabra: " +"| "+ palabraBuscar+" |"
    	                + " se encuentra: " + totalCoincidencias+" veces, estas se encuentran en las lineas \n"+ linea.toString());
            	archivoLeer.close();
            	linea.clear();
	    	}

	        
	       int op = Integer.parseInt(JOptionPane.showInputDialog("Desea buscar otra palabra? 1.Si 2.No"));
	        if ( op == 1)
	        {
	        	busquedaYConteo(ruta);
	        }
	        else
	        {
	        	mainMenu();
	        }
	        
	    } 
	    catch (Exception e) 
	    {
	        System.out.println(e.getMessage());
	    }
	}		
			
		
	
}
