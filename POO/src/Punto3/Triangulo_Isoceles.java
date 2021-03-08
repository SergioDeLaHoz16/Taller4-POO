
package Punto3;
  
    public class Triangulo_Isoceles {
     //atributos
    private double baseT;
    private double alturaT;
    
    //constructor
    public Triangulo_Isoceles() {}
    //getter
    public double getBase() {
        return this.baseT;
    }

    public double getAltura() {
        return this.alturaT;
    }

    //setter
    public void setBase(double baseT) {
        this.baseT=baseT;
    }

    public void setAltura(double alturaT) {
        this.alturaT = alturaT;
    }
    
    //metodos para calculos
    public double area(){
        return (baseT * alturaT)/2; 
    }
    
    //Math.sqrt = sirve para sacar raiz
    public double ladosT(){
        double hipotenusa = (double) ((double) Math.pow((this.baseT/2),2)+ Math.pow(this.alturaT, 2));
        return (double) Math.sqrt(hipotenusa);
    }    
    
    public double perimetro(){
        return (2*ladosT()+this.baseT);
    }
    
    //Math.asin = arcoseno Math.toDegrees = angulo a radianes
    public double vertice(){
        return Math.toDegrees(2*(Math.asin((this.baseT/2)/this.alturaT)));
    }
}

