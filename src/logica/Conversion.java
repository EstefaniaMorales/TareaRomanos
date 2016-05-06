package logica;

public class Conversion {
	
	public int convertirI(String romano){
		if (romano.equalsIgnoreCase("I")){
			return 1;
			
		}else if(romano.equalsIgnoreCase("II")){
			return 2;
		}else if(romano.equalsIgnoreCase("V")){
			return 5;
		}
		
		return 0;
	}

}
