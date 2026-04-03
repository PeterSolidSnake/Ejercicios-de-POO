
/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circulo extends Figuras
{
    //Atributos
     private double radio;
     
    //Constructor
     public Circulo (double radio){
         if (radio > 0){
            this.radio = radio;
            }
            else throw new IllegalArgumentException("El radio debe ser mayor a 0"); // IllegalArgumentException sirve para indicar que hay un error en los datos 
     }
     
     //metodo getter
     public double getRadio(){
        return this.radio;
        }
        
     //metodo setter
     public void setRadio(double radio){
        this.radio = radio;
        }
        
     //metodo calculador
     public double calcularArea(){
         return Math.PI * radio*radio;
     }
    
}