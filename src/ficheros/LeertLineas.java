package ficheros;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public final class LeertLineas {
	/*
	 * Dado un fichero de texto conuna lista de numeros 
	 * indica cual es el mayor y el menor 
	 */

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros= new ArrayList<>();
		
		String linea="";
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("numeros.txt"));
			while( ( linea = br.readLine())!=null) {
				try {
					numeros.add(Integer.parseInt(linea));
				}catch(NumberFormatException e) {
					System.out.println("Error hay texto en el archivo");
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("no se ha podido realizar la accion");
			//e.printStackTrace();
		}
		Collections.sort(numeros);
		System.out.println("El numero mayor es :"+ numeros.get(0));
		System.out.println("El numeros menor es :"+ numeros.get(numeros.size()-1));
		
		}
}
		

	


