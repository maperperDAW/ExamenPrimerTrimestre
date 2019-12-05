/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

/**
 *
 * @author miguel-angel
 */
import java.util.Scanner;

public class Ventana {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamano = 0;
        Scanner sc = new Scanner(System.in);
        String bordeSuperior = "";
        String vacio = "";
        String lleno = "";
        String tipoVentana;
        String ventana = "";
        int cont = 0;
        
        do{
            System.out.println("Pon un número: ");
            tamano = sc.nextInt();
        }while ( (tamano % 2 == 0) || ( tamano < 10 ));
        sc.nextLine();
        for ( int ii = 0; ii < tamano; ii++ ){
            bordeSuperior += "*";
        }
        
        for ( int ii = 0; ii < (tamano - 3)/2 ; ii++ ){
            vacio += " ";
            lleno += "*";
        }
        
        System.out.println("Qué ventana quieres romper: ");
        tipoVentana = sc.nextLine().toLowerCase();
        
        if ( tipoVentana.equals("arriba izquierda")){
            for ( int ii = 0; ii < tamano; ii++ ){
                if ( ii == 0 ){
                    ventana += bordeSuperior + "\n";
                }
                if ( ii >= 1 && ii < tamano/2 ){
                    ventana = ventana + "*" +  lleno + "*" + vacio + "*\n";
                }
                if ( ii == tamano/2 ){
                    ventana = ventana + bordeSuperior + "\n";
                }
                if ( ii > tamano/2 && ii < tamano -1  ){
                    ventana = ventana + "*" + vacio + "*" + vacio + "*\n";
                }
                if ( ii == tamano - 1){
                    ventana = ventana + bordeSuperior + "\n";
                }
            }
        }else{
            cont++;
        }
        
        if ( tipoVentana.equals("arriba derecha")){
            for ( int ii = 0; ii < tamano; ii++ ){
                if ( ii == 0 ){
                    ventana += bordeSuperior + "\n";
                }
                if ( ii >= 1 && ii < tamano/2 ){
                    ventana = ventana + "*" +  vacio + "*" + lleno + "*\n";
                }
                if ( ii == tamano/2 ){
                    ventana = ventana + bordeSuperior + "\n";
                }
                if ( ii > tamano/2 && ii < tamano -1  ){
                    ventana = ventana + "*" + vacio + "*" + vacio + "*\n";
                }
                if ( ii == tamano - 1){
                    ventana = ventana + bordeSuperior + "\n";
                }
            }
        }else{
            cont++;
        }
        
        if ( tipoVentana.equals("abajo izquierda")){
            for ( int ii = 0; ii < tamano; ii++ ){
                if ( ii == 0 ){
                    ventana += bordeSuperior + "\n";
                }
                if ( ii >= 1 && ii < tamano/2 ){
                    ventana = ventana + "*" +  vacio + "*" + vacio + "*\n";
                }
                if ( ii == tamano/2 ){
                    ventana = ventana + bordeSuperior + "\n";
                }
                if ( ii > tamano/2 && ii < tamano -1  ){
                    ventana = ventana + "*" + lleno + "*" + vacio + "*\n";
                }
                if ( ii == tamano - 1){
                    ventana = ventana + bordeSuperior + "\n";
                }
            }
        }else{
            cont++;
        }
        
        if ( tipoVentana.equals("abajo derecha")){
            for ( int ii = 0; ii < tamano; ii++ ){
                if ( ii == 0 ){
                    ventana += bordeSuperior + "\n";
                }
                if ( ii >= 1 && ii < tamano/2 ){
                    ventana = ventana + "*" +  vacio + "*" + vacio + "*\n";
                }
                if ( ii == tamano/2 ){
                    ventana = ventana + bordeSuperior + "\n";
                }
                if ( ii > tamano/2 && ii < tamano -1  ){
                    ventana = ventana + "*" + vacio + "*" + lleno + "*\n";
                }
                if ( ii == tamano - 1){
                    ventana = ventana + bordeSuperior + "\n";
                }
            }
        }else{
            cont++;
        }
        
        if ( cont == 4 ){
             for ( int ii = 0; ii < tamano; ii++ ){
                if ( ii == 0 ){
                    ventana += bordeSuperior + "\n";
                }
                if ( ii >= 1 && ii < tamano/2 ){
                    ventana = ventana + "*" +  vacio + "*" + vacio + "*\n";
                }
                if ( ii == tamano/2 ){
                    ventana = ventana + bordeSuperior + "\n";
                }
                if ( ii > tamano/2 && ii < tamano -1  ){
                    ventana = ventana + "*" + vacio + "*" + vacio + "*\n";
                }
                if ( ii == tamano - 1){
                    ventana = ventana + bordeSuperior + "\n";
                }
            }
        }    
        System.out.println(ventana);
    }
    
}
