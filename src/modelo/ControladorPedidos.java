package modelo;

import java.util.ArrayList;
import java.util.List;

public class ControladorPedidos {
    private static List<Pedido> pedidos = new ArrayList<>();

    // Metodo para agregar pedido
    public static void agregarPedido(Pedido p) {
        pedidos.add(p);
    }

    // Getter
    public static List<Pedido> getPedidos() {
        return pedidos;
    }

    // Setter
    public static void setPedidos(List<Pedido> nuevaLista) {
        pedidos = nuevaLista;
    }
}
