package logica;

public class Conversion {
	
	boolean digitoRepetible=false;
	boolean digitoFueRestado=false;
	int digitoARestar=0;
	String strResultado="";
	
	
	public int convertir(String romano){
		int digitoAnterior=0;
		int digitoEntero;
		int temp=0;
		int contadorRepeticion=0;
		boolean digAntRepetible=false;
		int resultado=0;
		int digitoMayor=0;
		
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
			
			}else if(digitoAnterior< digitoEntero){
				digitoARestar= digitoAnterior;
				digitoAnterior=digitoEntero;
				temp=digitoEntero -temp;
				contadorRepeticion=0;
				digAntRepetible=digitoRepetible;	
				
				
			}else if(digitoAnterior == digitoEntero && contadorRepeticion <=3){
				if (digitoRepetible==false || digitoFueRestado==true){
					return -1;//si el romano es invalido
				}
				
				digitoAnterior = digitoEntero;
				temp += digitoEntero;
				digAntRepetible=digitoRepetible;
				contadorRepeticion++;
				digitoFueRestado=false;
				
				
			}else if (digitoAnterior > digitoEntero){
				digitoMayor=digitoAnterior;
				digitoAnterior = digitoEntero;				
				digAntRepetible=digitoRepetible;
				contadorRepeticion=0;				
				resultado += temp;				
				temp = digitoEntero;
				digitoFueRestado=false;
				
				
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
			case 'X':
				enteroDigito=10;
				digitoRepetible=true;
				break;
			case 'L':
				enteroDigito=50;
				break;
			case 'C':
				enteroDigito=100;
				digitoRepetible=true;
				break;
			case 'D':
				enteroDigito=500;
				
				break;
			case 'M':
				enteroDigito=1000;
				digitoRepetible=true;
				break;
				
			default:
				return -1;//Si se ingresa un caracter invalido
		}
		return enteroDigito;
	}

}
	


