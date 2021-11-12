import lcse.ListaCircularSimplementeEnlazada;

public class Main {
    public static void main(String[] args){
            /*Exception {
        ListaCircularSimplementeEnlazada listaCircularSimplementeEnlazada = new ListaCircularSimplementeEnlazada();
        System.out.println("Lista Circular\n");

        //mostrar si nuestra lista esta vacia
        System.out.println(listaCircularSimplementeEnlazada.estaVacia());


        //llenamos lista con valores
        for (int i = 1; i<=20;i++) {
            listaCircularSimplementeEnlazada.insertarFinal(i);
        }

        //preguntamos esta vacia
        System.out.println(listaCircularSimplementeEnlazada.estaVacia());

        //mostramos lista
        listaCircularSimplementeEnlazada.mostrar();

        //eliminamos lista
        listaCircularSimplementeEnlazada.eliminarFinal(19);
        listaCircularSimplementeEnlazada.eliminarFinal(18);
        System.out.print(" nueva lista circular \n");
        //mostramos lista
        listaCircularSimplementeEnlazada.mostrar();
             */

        ListaCircularSimplementeEnlazada listaCircularSimplementeEnlazada = new ListaCircularSimplementeEnlazada();
        System.out.println(listaCircularSimplementeEnlazada.estaVacia());
        System.out.println(listaCircularSimplementeEnlazada.tamaño());

        for (int i = 1; i <= 12; i++){
            listaCircularSimplementeEnlazada.insertarFin(i);
        }

        listaCircularSimplementeEnlazada.mostrar();
        System.out.println(listaCircularSimplementeEnlazada.tamaño());

        //listaCircularSimplementeEnlazada.eliminarFin();
        //listaCircularSimplementeEnlazada.eliminarFin();

        //listaCircularSimplementeEnlazada.mostrar();


        listaCircularSimplementeEnlazada.mostrarCircular(2);
    }

}

