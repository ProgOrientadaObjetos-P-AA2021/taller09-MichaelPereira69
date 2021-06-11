/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean bandera = true;
        int opcion;
        String nom, apell, tipAut, marAut;
        while (bandera) {
            System.out.println(">>>>>>>>>>>>>>>> Prestamos <<<<<<<<<<<<");    
            System.out.println(">> 1  Para un Prestamo de tipo Automovil\n"
                    + ">> 2  Para un Prestamo de tipo Educativo");
            opcion = entrada.nextInt();
            entrada.nextLine();
            System.out.println("\t>>>>Datos del beneficiario<<<<\n");
            System.out.println("Ingrese el nombre");
            nom = entrada.nextLine();
            System.out.println("Ingrese el apellido");
            apell = entrada.nextLine();
            System.out.println("Ingrese el tiempo de prestamo en meses");
            int meses = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingrese la ciudad donde hace el prestamo");
            String ciudad = entrada.nextLine();
            Persona p1 = new Persona(nom, apell);
            if (opcion == 1) {              
                System.out.println(">>>>>>>>> PRESTAMO AUTOMOVIL <<<<<<<<");
                System.out.println("Ingrese el tipo de automovil");
                tipAut = entrada.nextLine();
                System.out.println("Ingrese la marca del automovil");
                marAut = entrada.nextLine();
                System.out.println("\t>>>>>>Datos del garante<<<<<<<<\n");
                System.out.println("Ingrese el nombre");
                String nom2 = entrada.nextLine();
                System.out.println("Ingrese el apellido");
                String apell2 = entrada.nextLine();
                Persona p2 = new Persona(nom2, apell2);
                System.out.println("Ingrese el valor del automovil");
                double valor = entrada.nextDouble();
                entrada.nextLine();
                PrestamoAutomovil pa = new PrestamoAutomovil(p1, meses,
                        ciudad, tipAut, marAut, p2, valor);
                pa.establecerValorMensualAutomovil();
                System.out.println(pa);
                
            } else if (opcion == 2) {
                System.out.println(">>>>>>>>> PRESTAMO ESTUDIANTIL <<<<<<<<");
                System.out.println(">>>>>> Ingrese el nivel de estudio <<<<");
                String nivel = entrada.nextLine();
                System.out.println(">>>>>>> Nombre del centro educativo <<<");
                String centro = entrada.nextLine();
                System.out.println(">>>>> Ingrese el valor de la carrera <<<<");
                double valCar = entrada.nextDouble(); 
                entrada.nextLine();
                PrestamoEducativo pe = new PrestamoEducativo(p1, 
                        meses,ciudad,nivel,centro,valCar);
                pe.establecerValorMensualCarrera();
                System.out.println(pe);
            }else{
                System.out.println("!!!Opcion Incorrecta!!!");
            }
            System.out.println(">>>> Digite *si* para ingresar mas datos\n"
                    + "o \n"
                    + "Digite *no* para salir");
            String ap = entrada.nextLine();
            if(ap.toLowerCase().equals("si")){
                bandera = true;
            }else if(ap.toLowerCase().equals("no")){
                bandera = false;
            }
            

        }

    }

}
