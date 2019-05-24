package ficheros;

import java.io.IOException;

public class EscribirRobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robot1 = new Robot("Maziner z",80);
		Robot robot2 = new Robot("Lori jensen",90);
		
		Escribirobjetos salida= new Escribirobjetos();
		
		
		try {
			salida.abrir();
			salida.escribir(robot1);
			salida.escribir(robot2);
			salida.cerrar();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
