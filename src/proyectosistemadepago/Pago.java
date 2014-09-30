/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectosistemadepago;

/**
 *
 * @author OMAR
 */
public class Pago extends Object{
   
    public Pago(){
        System.out.println("a ver si es cierto que aparesco");
    }
    
    
    public float hacerpago (int horastrabajadas, float sueldo){
    float pago=horastrabajadas*sueldo;
    return pago;
    }
}
