package ficheros;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeerObjetos {
	private FileInputStream file;
	private ObjectInputStream input;
	//abrir el fichero
	public void abrir() throws IOException {
		file = new FileInputStream("objeto_robot.rb") ;
		input = new ObjectInputStream(file);	
	}
	//cerrar 
	public void cerrar() throws IOException {
		if(input !=null) {
			input.close();
		}
		
	}
	public Robot leer()  {
		
	Robot robot = null;
	if (input != null) {
		try {
			robot = (Robot) input.readObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
		}
	}
	return robot;
}
}