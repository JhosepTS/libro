
package Ejercicio8_1;
//Jhosep TS
import java.util.Random;
public class ListaAleatoria {

    public static void main(String[] args) {
        Random r;
 int d;
 Lista lista;
 int k;
 r = new Random();
 lista = new Lista(); // crea lista vacÃ­a
 k = Math.abs(r.nextInt()% 55); // numero de nodos
 // se insertan elementos en la lista
 for (; k > 0; k-- )
 {
 d = r.nextInt() % 99 ;
 lista.insertarCabezaLista(d);
 }
 // recorre la lista para escribir sus elementos
 System.out.println("Elementos de la lista generados al azar");
 lista.visualizar();

    }   
}
