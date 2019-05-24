package comparaciones;

public class Robot implements Comparable<Robot>{
	
	private static int id_robot =1;//es una variable q tod los robots comparten, sin hacer falta de enumerar robot por robot/es para poder identificar cada uno
	
		private int id;
		private String nombre;
		private int vida;
		
		
		public Robot(String nombre, int vida) {
			this.nombre=nombre;
			this.vida= checkVida(vida);
			this.id=id_robot;
			id_robot++;
			
		}
		public int checkVida(int vida) {
			int vidaAux= 0;//una variable AUXiliar y le meto la variable vida y desde el contructor llamo a la varible
			if(vida>=0 && vida <=100) {
				vidaAux = vida;
				
			}
			return vidaAux;
		}
		public int getId() {
			return this.id;
			
		}
		public String getNombre() {
			return this.nombre;
			
		}
		public void setNombre(String nombre) {
			this.nombre= nombre;
			
		}
		public int getVida() {
			return this.vida;
		}
		public void setVida(int vida) {
			this.vida= checkVida(vida);
			
		}
		public String toString() {
			return "Robot [Id=" +id + " Nombre="+ nombre +", Vida="+ vida +"]";
		}
		@Override
		public int compareTo(Robot r) {
			// aqui es done definimos cuando un robot es igual o no
			//prof: definimos cuando un robot es mayor que otro
			//segun la cantidad de vida que tenga
			if(this.getVida()<r.getVida()) {
				return -1;
			}else if(this.getVida()>r.getVida()){
				return 1;
			}else {		
			return 0;
		}
		
}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Robot other = (Robot) obj;
			if (nombre == null) {
				if (other.nombre != null)
					return false;
			} else if (!nombre.equals(other.nombre))
				return false;
			if (vida != other.vida)
				return false;
			return true;
		}
		
}













