
package Ejercicios8_3;

public class Nodo {
    int dato;
Nodo enlace;
Nodo adelante;
Nodo atras;
public Nodo(int x)
{
 dato = x;
 enlace = null;
}
public int getDato()
{
 return dato;
}
public Nodo getEnlace()
{
 return enlace;
}
public void setEnlace(Nodo enlace)
{
 this.enlace = enlace;
}

}
