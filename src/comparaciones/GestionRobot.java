package comparaciones;

import java.util.ArrayList;
import java.util.Collections;

public class GestionRobot {

	public static void main(String[] args) {
		// esto es una clase ejecutable
		//esto es algo novedos es un ARRAYLIST distinto de lo que hemos hachoe antes/solo pude contener clases/le pobnemos el nombre qqueramos
		//prof: cre un arrayLIst para guardar las instancias de la clase robot
		ArrayList<Robot> listaRobots = new ArrayList<>();
		
		listaRobots.add(new Robot(" Machika",70));
		listaRobots.add(new Robot(" Majori",50));
		listaRobots.add(new Robot(" Icecris",90));
		listaRobots.add(new Robot(" Evalins",80));
		listaRobots.add(new Robot(" Lori JJ",60));
		listaRobots.add(new Robot(" Lori JJ",60));
		
		for(Robot robot : listaRobots) {
			System.out.println(robot.toString());//no hace falta decirle si tiene enseñlar todos sino q el mismo lo benseña si hay cuatro pues enseña los cuatro,recorre todos los elemnetos
		}
		//compruebo si los robots Lori son igualews
		if(listaRobots.get(4).equals(listaRobots.get(5))) {
			System.out.println( "los robots son iguales");
		}else {
			System.out.println( "los robots NO son iguales");
		Collections.sort(listaRobots);
		
		System.out.println( "lista de robots ordenada segun su vida");
		for(Robot robot : listaRobots) {
			System.out.println(robot.toString());
		}
		
		}
		
	}

}
