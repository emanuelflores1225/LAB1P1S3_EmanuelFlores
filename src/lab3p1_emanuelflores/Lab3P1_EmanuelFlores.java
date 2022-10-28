package lab3p1_emanuelflores;
import java.util.Scanner;

public class Lab3P1_EmanuelFlores {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("---------------------------------");
            System.out.println("Bienvenido a laboratorio semana tres");
            System.out.println("1-> Diptongo");
            System.out.println("2-> Sumatoria");
            System.out.println("3-> Time Clock");
            System.out.println("4-> Saliendo");
            opcion = leer.nextInt();
            switch (opcion){
                case 1 -> {
                    String palabra;
                    System.out.println("Ingrese una palabra: ");
                    palabra = leer.next();
                    palabra = palabra.toLowerCase();
                    int ans=0;
                    int ver = 0;
                    for (int i = 0; i < palabra.length(); i++) {
                        char dip = palabra.charAt(i);
                        if (ans == 1){
                            switch (dip){
                            case 'a', 'e', 'i', 'o', 'u' -> ver = 1;
                            default -> ans = 0;
                                }
                        }
                            switch (dip){
                                case 'a', 'e', 'i', 'o', 'u' -> ans = 1;
                            }   
                        }
                    
                    if (ver ==1 ){
                        System.out.println("La palabra " + palabra + " tiene diptongo");
                    }
                    else {
                        System.out.println("La palabra " + palabra + " no tiene diptongo");
                    }                  
                  break;
                }//fin diptongo
                
                case 2 -> {
                    double num, divid, tot;
                    double cont;
                    double base = -1;
                    double ans = 0;
                    System.out.println("Sumatoria");
                    System.out.println("Ingrese un numero: ");
                    num = leer.nextDouble();
                    for (cont= 0; cont < num; cont++){
                        divid = (Math.pow(base, cont))/((2*cont)+1);
                        ans += divid;
                    } 
                    tot = ans * 4;
                    System.out.println("La sumatoria es: " + tot);
                    }//fin sumatoria resuelto
                
                case 3 -> {
                    System.out.println("Iniciando time clock");
                    System.out.println("Ingrese un numero impar: ");
                    int n = leer.nextInt();   
                    if (n % 2 != 0){                        
                        for (int i = n-1; i >= 0; i--){
                            for (int k = n-1; k > i; k--){
                                System.out.print(" ");
                            }
                            for (int k = 0; k < (i*2)-1; k++){
                                System.out.print("*");
                            }
                            System.out.println();
                        }                        
                       
                        for (int i = 0; i<= n/2; i++){
                            for (int k = 1; k < n-i; k++){
                                System.out.print(" ");
                            }
                            for (int k = 1; k <= (i*2)-1; k++){
                                System.out.print("*");
                            }
                            System.out.println("");
                        }
                    }
                    else {
                        System.out.println("Ingrese un numero IMPAR");
                    }
                }//fin hourglass
                
                case 4 -> {
                    System.out.println("Saliendo");
                }
            }//salir del programa
            
        }while (opcion != 4);//fin do while    
    }
}