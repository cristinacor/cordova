package ficheros;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Escribirobjetos {
	private FileOutputStream file;
	private ObjectOutputStream output;
	
	//abrir el fichero
	public void abrir() {
		
		try {
			file= new FileOutputStream("objeto_robot.rb");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			output = new ObjectOutputStream(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//cerrar fichero
	public void cerrar() throws IOException {
		if(output != null) {
			output.close();
		}
	}
	public void escribir(Robot robot) throws IOException {
	if(output != null) {
		output.writeObject(robot);
		}
	}
}