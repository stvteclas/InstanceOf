package test;

import domain.Empleado;
import domain.Gerente;

public class TestInstanceOf {
    public static void main(String[] args) {
        // Gerente gerente1= new Gerente("juan", 5000, "Sistemas");
        //System.out.println("Gerente= " + gerente1.obtenerDetalles());

        Empleado empleado = new Empleado("Juan", 5000);
        determinarTipo(empleado);
        empleado = new Gerente("Karla", 10000, "contabilidad");
        determinarTipo(empleado);

    }
    public static void determinarTipo(Empleado empleado){
     if (empleado instanceof Gerente){
         System.out.println("Es Gerente");
     } else if (empleado instanceof Empleado) {
         System.out.println("Es de tipo Empleado");

     } else if (empleado instanceof Object) {
         System.out.println("Es de tipo Objet");
     }
    }
    }
