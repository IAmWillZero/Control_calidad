import java.util.ArrayList;
import java.util.List;

public class ArbolBinarioBusqueda {
    Nodo raiz;

    public ArbolBinarioBusqueda() {
        raiz = null;
    }

    // Método para insertar un nodo en el árbol
    public void insertar(int puntaje) {
        raiz = insertarRecursivo(raiz, puntaje);
    }

    private Nodo insertarRecursivo(Nodo nodo, int puntaje) {
        if (nodo == null) {
            return new Nodo(puntaje);
        }

        if (puntaje < nodo.puntaje) {
            nodo.izquierdo = insertarRecursivo(nodo.izquierdo, puntaje);
        } else if (puntaje > nodo.puntaje) {
            nodo.derecho = insertarRecursivo(nodo.derecho, puntaje);
        }

        return nodo;
    }

    // Método para obtener las piezas dentro de un rango específico
    public List<Integer> obtenerPiezasEnRango(int min, int max) {
        List<Integer> piezasEnRango = new ArrayList<>();
        obtenerPiezasEnRangoRecursivo(raiz, min, max, piezasEnRango);
        return piezasEnRango;
    }

    private void obtenerPiezasEnRangoRecursivo(Nodo nodo, int min, int max, List<Integer> piezasEnRango) {
        if (nodo == null) {
            return;
        }

        if (min < nodo.puntaje) {
            obtenerPiezasEnRangoRecursivo(nodo.izquierdo, min, max, piezasEnRango);
        }

        if (min <= nodo.puntaje && nodo.puntaje <= max) {
            piezasEnRango.add(nodo.puntaje);
        }

        if (max > nodo.puntaje) {
            obtenerPiezasEnRangoRecursivo(nodo.derecho, min, max, piezasEnRango);
        }
    }

    // Recorrido Preorden
    public void recorridoPreorden() {
        recorridoPreordenRecursivo(raiz);
    }

    private void recorridoPreordenRecursivo(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.puntaje + " ");
            recorridoPreordenRecursivo(nodo.izquierdo);
            recorridoPreordenRecursivo(nodo.derecho);
        }
    }

    // Recorrido Inorden
    public void recorridoInorden() {
        recorridoInordenRecursivo(raiz);
    }

    private void recorridoInordenRecursivo(Nodo nodo) {
        if (nodo != null) {
            recorridoInordenRecursivo(nodo.izquierdo);
            System.out.print(nodo.puntaje + " ");
            recorridoInordenRecursivo(nodo.derecho);
        }
    }

    // Recorrido Postorden
    public void recorridoPostorden() {
        recorridoPostordenRecursivo(raiz);
    }

    private void recorridoPostordenRecursivo(Nodo nodo) {
        if (nodo != null) {
            recorridoPostordenRecursivo(nodo.izquierdo);
            recorridoPostordenRecursivo(nodo.derecho);
            System.out.print(nodo.puntaje + " ");
        }
    }
}
