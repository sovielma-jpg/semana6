package vista;

import modelo.ControladorPedidos;
import modelo.Pedido;
import modelo.Repartidor;

import javax.swing.*;
import java.util.List;

public class VentanaAsignarRepartidor extends JFrame {
    private JComboBox<String> cmbPedidos;
    private JTextField txtRepartidor;
    private JButton btnIniciar;

    public VentanaAsignarRepartidor() {
        setTitle("Asignar Repartidor");
        setSize(400, 200);
        setLayout(null);

        JLabel lblPedido = new JLabel("Pedido:");
        lblPedido.setBounds(20, 20, 80, 25);
        add(lblPedido);

        cmbPedidos = new JComboBox<>();
        List<Pedido> pedidos = ControladorPedidos.getPedidos();
        for (Pedido p : pedidos) {
            cmbPedidos.addItem(p.getId() + " - " + p.getDireccion());
        }
        cmbPedidos.setBounds(100, 20, 250, 25);
        add(cmbPedidos);

        JLabel lblRepartidor = new JLabel("Repartidor:");
        lblRepartidor.setBounds(20, 60, 80, 25);
        add(lblRepartidor);

        txtRepartidor = new JTextField();
        txtRepartidor.setBounds(100, 60, 250, 25);
        add(txtRepartidor);

        btnIniciar = new JButton("Iniciar Entrega");
        btnIniciar.setBounds(100, 100, 150, 25);
        add(btnIniciar);

        setLocationRelativeTo(null);
        setVisible(true);

        btnIniciar.addActionListener(e -> {
            String repartidorNombre = txtRepartidor.getText();
            if (repartidorNombre.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese el nombre del repartidor");
            } else {
                Repartidor r = new Repartidor(repartidorNombre);
                JOptionPane.showMessageDialog(this, "Entrega iniciada por " + r.getNombre());
                dispose();
            }
        });
    }
}
