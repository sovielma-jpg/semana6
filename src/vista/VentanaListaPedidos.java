package vista;

import modelo.ControladorPedidos;
import modelo.Pedido;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class VentanaListaPedidos extends JFrame {
    private JTable tabla;
    private DefaultTableModel modelo;

    public VentanaListaPedidos() {
        setTitle("Lista de Pedidos");
        setSize(500, 300);

        modelo = new DefaultTableModel(new String[]{"ID", "Dirección", "Tipo"}, 0);
        tabla = new JTable(modelo);
        add(new JScrollPane(tabla));

        refrescarTabla();

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void refrescarTabla() {
        modelo.setRowCount(0);
        List<Pedido> pedidos = ControladorPedidos.getPedidos();
        for (Pedido p : pedidos) {
            modelo.addRow(new Object[]{p.getId(), p.getDireccion(), p.getTipo()});
        }
    }
}
