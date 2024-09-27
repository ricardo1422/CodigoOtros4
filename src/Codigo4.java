//se importo el sacanner
import java.util.Scanner;

public class Codigo4 {
	//se añadio el metodo main
	public static void main(String[] args) {
		String j1="";
		String j2="";
		boolean j1w=false;
		boolean j2w=false;
		//se corrigio como se importa el scanner
	    Scanner s = new Scanner(System.in);
	    //se añadio lowe case a las cadenas para facilitar su tratamiento
	    //se añadio un while para que solo se den opciones validas
	    while (!j1w) {
	    	System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	 	    j1 = s.nextLine();
	 	    j1=j1.toLowerCase();
	 	    if(j1.equals("tijeras") || j1.equals("piedra") || j1.equals("papel")) {
	 	    	j1w=true;
	 	    }else
	 	    {
	 	    	System.out.println("Opción invalidad");
	 	    }
			
		}
	    while (!j2w) {
	    	System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    	j2 = s.nextLine();
	    	j2=j2.toLowerCase();
	    	if(j2.equals("tijeras") || j2.equals("piedra") || j2.equals("papel")) {
	    		j2w=true;
	    	}else
	    	{
	    		System.out.println("Opción invalidad");
	    	}
	    	
	    }
	   
	    
	    //se elimino el segundo llamado al sacnner por se inecesario
	    //Scanner s2 = new Scanner();
	    
	    
	    // se quito un parentesis que sobraba
	    //se modifico las validaciones de los if
	    if (j1.equals(j2)) {
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":	
	          if (j2.equals("tijeras")) {
	            g = 1;
	          }
	        case "papel":
	          if (j2.equals("piedra")) {
	            g = 1;
	          //se bajo la llave que cierra
	          }
	        case "tijera":
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	      }
	      System.out.println("Gana el jugador " + g);
	    }
	}
	      
}
