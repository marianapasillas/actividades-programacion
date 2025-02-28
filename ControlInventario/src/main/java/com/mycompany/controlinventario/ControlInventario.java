
package com.mycompany.controlinventario;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class ControlInventario {
    
    private final Producto[] productos;
    private int indiceProducto;
    
    
    private JFrame ventana;
    private JTextField txtCodigo;
    private JTextField txtNombre;
    private JTextField txtPrecio;
    private JTextField txtCantidad;
    private JTable tablaProductos;

    public ControlInventario() {
        
        productos = new Producto[100];
        indiceProducto = 0;
        
        
        productos[0] = new Producto("P001", "Laptop", 999.99, 5);
        productos[1] = new Producto("P002", "Mouse", 29.99, 20);
        indiceProducto = 2;
        
        crearInterfaz();
    }

    private void crearInterfaz() {
        
        ventana = new JFrame("Control de Inventario");
        ventana.setLayout(new BorderLayout());
        ventana.setSize(800, 600);
        
        
        JPanel panelCampos = new JPanel(new GridLayout(4, 2, 5, 5));
        
        
        panelCampos.add(new JLabel("Código:"));
        txtCodigo = new JTextField();
        panelCampos.add(txtCodigo);
        
        panelCampos.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelCampos.add(txtNombre);
        
        panelCampos.add(new JLabel("Precio:"));
        txtPrecio = new JTextField();
        panelCampos.add(txtPrecio);
        
        panelCampos.add(new JLabel("Cantidad:"));
        txtCantidad = new JTextField();
        panelCampos.add(txtCantidad);
        
        // Panel para botones
        JPanel panelBotones = new JPanel();
        JButton btnAgregar = new JButton("Agregar Producto");
        btnAgregar.addActionListener(e -> agregarProducto());
        panelBotones.add(btnAgregar);
        
        // Crear tabla de productos
        String[] columnas = {"Código", "Nombre", "Precio", "Cantidad"};
        DefaultTableModel modeloTabla = new DefaultTableModel(columnas, 0);
        tablaProductos = new JTable(modeloTabla);
        actualizarTabla();
        
        
        JScrollPane scrollPane = new JScrollPane(tablaProductos);
        
        
        ventana.add(panelCampos, BorderLayout.NORTH);
        ventana.add(scrollPane, BorderLayout.CENTER);
        ventana.add(panelBotones, BorderLayout.SOUTH);
        
        
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }

    private void agregarProducto() {
        try {
            
            String codigo = txtCodigo.getText();
            String nombre = txtNombre.getText();
            double precio = Double.parseDouble(txtPrecio.getText());
            int cantidad = Integer.parseInt(txtCantidad.getText());
            
            
            if (codigo.isEmpty() || nombre.isEmpty()) {
                mostrarError("Los campos código y nombre son obligatorios");
                return;
            }
            
            if (precio <= 0 || cantidad <= 0) {
                mostrarError("Precio y cantidad deben ser mayores a cero");
                return;
            }
            
            
            for (int i = 0; i < indiceProducto; i++) {
                if (productos[i].getCodigo().equals(codigo)) {
                    mostrarError("El código de producto ya existe");
                    return;
                }
            }
            
            
            if (indiceProducto < productos.length) {
                productos[indiceProducto] = new Producto(codigo, nombre, precio, cantidad);
                indiceProducto++;
                
                
                txtCodigo.setText("");
                txtNombre.setText("");
                txtPrecio.setText("");
                txtCantidad.setText("");
                
                
                actualizarTabla();
                
                JOptionPane.showMessageDialog(ventana, 
                    "Producto agregado exitosamente", 
                    "Éxito", 
                    JOptionPane.INFORMATION_MESSAGE);
            } else {
                mostrarError("No hay espacio para más productos");
            }
        } catch (NumberFormatException e) {
            mostrarError("Precio y cantidad deben ser números válidos");
        }
    }

    private void actualizarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tablaProductos.getModel();
        modelo.setRowCount(0);
        
        for (int i = 0; i < indiceProducto; i++) {
            Producto p = productos[i];
            modelo.addRow(new Object[] {
                p.getCodigo(),
                p.getNombre(),
                p.getPrecio(),
                p.getCantidad()
            });
        }
    }

    private void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(ventana, 
            mensaje, 
            "Error", 
            JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ControlInventario());
    }
}

class Producto {
    private final String codigo;
    private final String nombre;
    private final double precio;
    private int cantidad;

    public Producto(String codigo, String nombre, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}