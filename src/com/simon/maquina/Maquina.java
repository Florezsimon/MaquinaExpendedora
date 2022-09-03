package com.simon.maquina;

import java.util.ArrayList;
import java.util.List;

public class Maquina {

    private List<snacks> snack;
    private static final int LIMITE_DISPENSADORA = 72;




    public  Maquina(){
        this.snack = new ArrayList<>();
        snack.add("snicker",3.000);
        snack.add("galletas noel",1.000);
        snack.add("papas de pollo",1.300);
        snack.add("papas de limon",1.300);
        snack.add("chocolatina",3.200);
        snack.add("jamon de pavo",2.200);
        snack.add("nucitas",400);
        snack.add("waffers",500);
        snack.add("coca-cola",1.500);
        snack.add("fanta", 1.200);
        snack.add("sprite", 1.400);



    }

    public boolean agregarSnack(){



    }




    public void aumentarCantidad( String añadirSnack){
        if (añadirSnack >= LIMITE_DISPENSADORA){
            System.out.println("limite superado");
        }
        else {
            boolean añadirsnack = false;
            for (int i = 0; i < snack && !LIMITE_DISPENSADORA; i++)

        }

    }

    public boolean quitarSnack(String snack, String snackaquitar){
        if( snack = snackaquitar){
            System("el snack ", snack," ha sido removido");
        }
    }else{
        System.out.println("no hay stock de ", snack);
    }





    }



    public void cantidadTotal(int cantidadSnacks){
        if (cantidadSnacks = LIMITE_DISPENSADORA){
            System.out.println("la cantidad total de snack es", snack);

        }else {
            for( int i=0, i< LIMITE_DISPENSADORA, i++){
                snacks = cantidadSnacks;


            }

        }

    }
    public void nombresSnacksAgotados(){


    }

    public void StockCompleto(){
        if(snacks = LIMITE_DISPENSADORA){
            System.out.println("esta llena la dispensadora");


        }else{
            System("aun hay espacio en el stock");
        }

    }

 public void mayorMenor (){

}
