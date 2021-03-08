
package TallerPOO;

import java.util.Scanner;

public class Rectangulo {
    //Atributos
  int longitud;
  int ancho;
  int area;
  int perimetro;


  //Metodo
    //Metodo para que el usuario ponga los valores que se necesitan
    /*public void leerLongitudyArea(){
    Scanner x=new Scanner(System.in);
    System.out.println("Escriba la longitud del Rectangulo: "); 
    longitud = x.nextInt();
    System.out.println("Escriba el Ancho del Rectangulo: "); 
    ancho=x.nextInt();
    }
    */
    //Metodo Constructor 
    public Rectangulo(int longitud, int ancho){
        this.longitud= longitud;
        this.ancho= ancho;
    }    
     //Metodo para dar resultados 
     public void resultado(){
        System.out.printf("El Area del Rectangulo es: %d \n", (longitud*ancho));
        System.out.printf("El Perimetro del Rectangulo es: %d \n",2*(longitud+ancho));
    }
  }
  

