package logica;

public class Conversion {
	
	boolean digitoRepetible=false;
	boolean digitoFueRestado=false;
	int digitoARestar=0;
	
	
	
	public int convertir(String romano){
		int digitoAnterior=0;
		int digitoEntero;
		int temp=0;
		int contadorRepeticion=0;
		boolean digAntRepetible=false;
		int resultado=0;
		
		//recorrer el string romano
		for(Character digito: romano.toCharArray()){
			digitoEntero=letraADecimal(digito);
			
			//verificar primer digito del string
			if (digitoAnterior == 0){				
				digitoAnterior = digitoEntero;
				temp = digitoEntero;
				contadorRepeticion++;
				digAntRepetible=digitoRepetible;
				digitoFueRestado=false;
			
			}else if(digitoAnterior< digitoEntero && contadorRepeticion<=3){
				
			
				digitoARestar= digitoAnterior;
				System.out.println(""+digitoARestar);
				digitoAnterior=digitoEntero;
				temp=digitoEntero -digitoARestar;
				contadorRepeticion=0;
				digAntRepetible=digitoRepetible;
		
				
			}
			
			
	
		}
		resultado += temp; 
		return resultado;
	}
	
	public int letraADecimal(Character digito){
		int enteroDigito=0;
		switch(digito){
			case 'I': 
				enteroDigito=1;
				digitoRepetible=true;
				break;
				
			case 'V':
				enteroDigito=5;
				break;
						
		}
		return enteroDigito;
	}

}


