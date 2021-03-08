
package Punto3;

import java.util.Scanner;

public class PruebaTriangulo {
    public static void main(String[] arg){
      Scanner x=new Scanner(System.in);  
       
      Triangulo_Isoceles TrianguloX = new Triangulo_Isoceles();
      
      TrianguloX.setAltura(90);
      TrianguloX.setBase(10);
      TrianguloX.area();
      TrianguloX.perimetro();
      TrianguloX.ladosT();
      TrianguloX.vertice();
      System.out.printf("El Area del Triangulo es: %.2f\n", TrianguloX.area());        
      System.out.printf("El Perimetro del Triangulo es: %.2f\n", TrianguloX.perimetro());
      System.out.printf("Los Lados del Triangulo es: %.2f\n", TrianguloX.ladosT());
      System.out.printf("El Vertice del Triangulo es: %.2f\n", TrianguloX.vertice());
    }
    
}
