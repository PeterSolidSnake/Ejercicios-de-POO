
/**
 * Write a description of class Rectangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangulo extends Figuras
{
    //Atributos
     private double base;
     private double altura;
     
     //constructor
    public Rectangulo (double base, double altura){
        if (base <= 0 || altura <= 0){
            throw new IllegalArgumentException("La base y/o la altura deben ser mayores a 0 revise sus datos nuevamente porfavor :D");
            }
            this.base = base;
            this.altura = altura;
        }
        
        //metodo getter
    public double getBase(){
        return this.base;
        }
     public double getAltura(){
        return this.altura;
        }
        
     //metodo setter
    public void setAltura(double altura){
        this.altura = altura;
        }
        public void setBase(double base){
        this.base = base;
        }
        
     //metodo calcualdor
    public double calcularArea(){
         return base*altura;
     }
    
}