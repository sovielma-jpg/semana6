package vista;

import modelo.ControladorPedidos;
import modelo.Pedido;

import javax.swing.*;

public class VentanaRegistroPedido extends JFrame {
    private JTextField txtId, txtDireccion;
    private JComboBox<String> cmbTipo;
    private JButton btnGuardar;

    public VentanaRegistroPedido() {
        setTitle("Registrar Pedido");
        setSize(300, 200);
        setLayout(null);

        JLabel lblId = new JLabel("ID:");
        lblId.setBounds(20, 20, 80, 25);
        add(lblId);

        txtId = new JTextField();
        txtId.setBounds(100, 20, 150, 25);
        add(txtId);

        JLabel lblDireccion = new JLabel("Dirección:");
        lblDireccion.setBounds(20, 60, 80, 25);
        add(lblDireccion);

        txtDireccion = new JTextField();
        txtDireccion.setBounds(100, 60, 150, 25);
        add(txtDireccion);

        JLabel lblTipo = new JLabel("Tipo:");
        lblTipo.setBounds(20, 100, 80, 25);
        add(lblTipo);

        cmbTipo = new JComboBox<>(new String[]{"Comida", "Encomienda", "Express"});
        cmbTipo.setBounds(100, 100, 150, 25);
        add(cmbTipo);

        btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(100, 140, 100, 25);
        add(btnGuardar);

        setLocationRelativeTo(null);
        setVisible(true);

        btnGuardar.addActionListener(e -> {
            if (txtId.getText().isEmpty() || txtDireccion.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios");
            } else {
                Pedido p = new Pedido(txtId.getText(), txtDireccion.getText(), cmbTipo.getSelectedItem().toString());
                ControladorPedidos.agregarPedido(p);
                JOptionPane.showMessageDialog(this, "Pedido registrado correctamente");
                dispose();
            }
        });
    }
}
