package vista;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    private JButton btnRegistrar, btnListar, btnAsignar;

    public VentanaPrincipal() {
        setTitle("SpeedFast - Gestión de Entregas");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        btnRegistrar = new JButton("Registrar Pedido");
        btnListar = new JButton("Listar Pedidos");
        btnAsignar = new JButton("Asignar Repartidor / Iniciar Entrega");

        add(btnRegistrar);
        add(btnListar);
        add(btnAsignar);

        setLocationRelativeTo(null);
        setVisible(true);

        btnRegistrar.addActionListener(e -> new VentanaRegistroPedido());
        btnListar.addActionListener(e -> new VentanaListaPedidos());
        btnAsignar.addActionListener(e -> new VentanaAsignarRepartidor());
    }
}
