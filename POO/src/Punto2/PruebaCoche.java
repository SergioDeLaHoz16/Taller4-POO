
package Punto2;

import java.util.Scanner;

public class PruebaCoche {
    
    public static void main(String[] args){
        Coche cochex = new Coche();
        cochex.setColor("Negro");    
        cochex.setMatricula("BKW-256");
        cochex.setMarca("Mazda");
        cochex.setModelo(2009);
        cochex.setFcaballos(12);
        cochex.setNumpuertas(4);
        
        System.out.println("Color: "+ cochex.getColor());
        System.out.println("Marca: "+ cochex.getMarca());
        System.out.println("Matricula: "+ cochex.getMatricula());
        System.out.println("Caballos de fuerza: "+ cochex.getFcaballos());
        System.out.println("Modelo: "+ cochex.getModelo());
        System.out.println("Números de Fuerza: "+ cochex.getNumpuertas());
        }
        
    
    
    
    }
   
    