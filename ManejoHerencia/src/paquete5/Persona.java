/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;
//XAVIER ALEXANDER CHAVEZ/SARAGURO
//Michael Eduardo Maldonado Pereira
/**
 *
 * @author memaldonado28
 */
public class Persona {
    

    protected String nombre;
    protected String apellido;
    
    public Persona(String nom, String apell){
        nombre = nom;
        apellido = apell;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String n) {
        apellido = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerApellido(){
        return apellido;
    }

}

