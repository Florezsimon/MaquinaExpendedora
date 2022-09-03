package com.simon.maquina;

import java.util.InputMismatchException;
import java.util.Scanner;

public class app {
    public static void main(String[]args){
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("");// en caso de usar nombres compuestos
        boolean  salir = false;
        int opcion; // guardaremos la opcion del usuario


        while (!salir){

            System.out.println("1. agregar snack a la maquina");
            System.out.println("2. aumentar cantidad de snacks");
            System.out.println("3. quitar snack");
            System.out.println("4. obtener unidades restantes de un snack");
            System.out.println("5. nombres de snacks agotados");
            System.out.println("6. consultar el stock total");
            System.out.println("7. lista de snacks de mayor  a menor precio");
            System.out.println("8. lista de snacks de menor a mayor precio");
            System.out.println("9. Salir");
            try {
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();


                String nombre;
                char codigo;
                double precio;









                switch (opcion){
                    case 1:
                        System.out.println("ingresar nombre");


                        break;



                    case 2:
                        System.out.println("ingresar cantidad de snacks a ingresar");


                        break;



                    case 3:
                        System.out.println("ingrese snack a retirar");


                        break;



                    case 4:


                        break;


                    case 5:


                        break;

                    case 6:

                        break;

                    case 7:

                        break;




                    case 8:

                        break;

                }

            } catch (InputMismatchException e){
                System.out.println("debes insertar un numero");
                sn.next();
            }
        }
    }

}
