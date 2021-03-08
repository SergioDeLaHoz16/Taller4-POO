/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Coche {
//Atributos
    private String marca, color, matriculas;
    private int fcaballos, numpuertas, modelo;
    
  
    //Constructor
 
     public Coche(){
         
     }
    //Getter
    public String getMarca(){return this.marca;}
    public String getColor(){return this.color;}
    public String getMatricula(){return this.matriculas;}
    public int getModelo(){return this.modelo;}
    public int getFcaballos(){return this.fcaballos;}
    public int getNumpuertas(){return this.numpuertas;}
    //Setter
    public void setMarca(String m){this.marca=m;}
    public void setColor(String c){this.color=c;}
    public void setMatricula(String m){this.matriculas=m;}
    public void setModelo(int m){this.modelo=m;}
    public void setFcaballos(int f){this.fcaballos=f;}
    public void setNumpuertas(int p){this.numpuertas=p;}
    
}
    
    

