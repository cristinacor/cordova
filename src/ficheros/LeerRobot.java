package ficheros;

import java.io.IOException;

public class LeerRobot {

	public static void main(String[] args) {
		Robot robot;
		LeerObjetos entrada = new LeerObjetos();
		
		
		try {
			entrada.abrir();
			while((robot = entrada.leer())!= null) {
				System.out.println(robot.toString());
			}
			entrada.cerrar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
