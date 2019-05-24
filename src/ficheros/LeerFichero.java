package ficheros;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			leerFichero("nombre.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void leerFichero(String fichero) throws  IOException{
		
		BufferedReader br = new BufferedReader(new FileReader(fichero));
		String linea= "";
	
			
	
			while((linea = br.readLine()) !=null) {
				System.out.println(linea);
				
			}
	
		}
	}


