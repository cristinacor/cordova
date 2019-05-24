package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ContarLineas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int contador =0; 
		 try {
			contador = cuentaLineas("nombre.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		System.out.println(" Hay "+ contador+ " lineas");
	}
	
	
	 /**
	  * Funcion que cuenta las lineas que tiene un fichero de texto 
	  * cuya ruta se le passa por parametro 
	  * @param fichero
	  * @return 
	  * @throws IOException
	  */
	 
	public static int cuentaLineas(String fichero) throws IOException {
		int contador =0;
		BufferedReader br;

			br = new BufferedReader(new FileReader(fichero));

		String linea="";

			while( ( linea = br.readLine())!=null) {
				contador++;
			}

		return contador;
	}
}
