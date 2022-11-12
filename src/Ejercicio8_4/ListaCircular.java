
package Ejercicio8_4;
//Jhosep TS
class Nodo
{
    String dato;
Nodo enlace;
public Nodo (String entrada) {; }
}

public class ListaCircular {
    private Nodo lc;
public ListaCircular(){;}
public ListaCircular insertar(String entrada){;return null;
}
public void eliminar(String entrada)
{
 Nodo actual;
 actual = lc;
 while ((actual.enlace != lc) &&
 !(actual.enlace.dato.equals(entrada)))
 {
 if (!actual.enlace.dato.equals(entrada))
 actual = actual.enlace;
 }
 // Enlace de nodo anterior con el siguiente
 // si se ha encontrado el nodo.
 if (actual.enlace.dato.equals(entrada))
 {
 Nodo p;
 p = actual.enlace; // Nodo a eliminar
 if (lc == lc.enlace) // Lista con un solo nodo
 lc = null;
 else
 {
 if (p == lc)
 {
 lc = actual; // Se borra el elemento referenciado por lc,
 // el nuevo acceso a la lista es el anterior
 }
 actual.enlace = p.enlace;
 }
 p = null;
 }
}
public void borrarLista()
{
 Nodo p;
 if (lc != null)
 {
 p = lc;
 do {
 Nodo t;
 t = p;
 p = p.enlace;
 t = null; // no es estrictamente necesario
 }while(p != lc);
 }
 else

 
System.out.println("\n\t Lista vacÃ­a.");
 lc = null;
 


}

    void recorrer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
