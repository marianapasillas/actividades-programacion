package com.mycompany.sistemalogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SistemaLogin {
    // Array para almacenar usuarios
    private final Usuario[] usuarios;
    private int indiceUsuario;
    
    // Componentes de la interfaz
    private JFrame ventanaLogin;
    private JFrame ventanaRegistro;
    private JTextField txtUsuarioLogin;
    private JPasswordField txtContrasenaLogin;
    private JTextField txtUsuarioRegistro;
    private JTextField txtContrasenaRegistro;
    private JTextField txtConfirmarContrasena;

    public SistemaLogin() {
        // Inicializar array de usuarios con capacidad para 10 usuarios
        usuarios = new Usuario[10];
        indiceUsuario = 0;
        
        // Crear usuarios predeterminados
        usuarios[0] = new Usuario("admin", "admin123");
        usuarios[1] = new Usuario("usuario", "pass123");
        indiceUsuario = 2; // Indicamos que el siguiente usuario será el índice 2
        
        crearVentanaLogin();
    }

    private void crearVentanaLogin() {
        // Crear ventana principal de login
        ventanaLogin = new JFrame("Sistema de Login");
        ventanaLogin.setLayout(new BorderLayout());
        ventanaLogin.setSize(300, 200);
        
        // Panel para campos de entrada
        JPanel panelCampos = new JPanel(new GridLayout(3, 2, 5, 5));
        
        // Campos y etiquetas para login
        panelCampos.add(new JLabel("Usuario:"));
        txtUsuarioLogin = new JTextField();
        panelCampos.add(txtUsuarioLogin);
        
        panelCampos.add(new JLabel("Contraseña:"));
        txtContrasenaLogin = new JPasswordField();
        panelCampos.add(txtContrasenaLogin);
        
        // Botones
        JButton btnIniciar = new JButton("Iniciar Sesión");
        btnIniciar.addActionListener(e -> iniciarSesion());
        
        JButton btnRegistrar = new JButton("Registrarse");
        btnRegistrar.addActionListener(e -> crearVentanaRegistro());
        
        // Panel para botones
        JPanel panelBotones = new JPanel();
        panelBotones.add(btnIniciar);
        panelBotones.add(btnRegistrar);
        
        // Agregar componentes a la ventana
        ventanaLogin.add(panelCampos, BorderLayout.CENTER);
        ventanaLogin.add(panelBotones, BorderLayout.SOUTH);
        
        // Configurar la ventana
        ventanaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaLogin.setLocationRelativeTo(null);
        ventanaLogin.setVisible(true);
    }

    private void crearVentanaRegistro() {
        // Crear ventana de registro
        ventanaRegistro = new JFrame("Registro de Usuario");
        ventanaRegistro.setLayout(new BorderLayout());
        ventanaRegistro.setSize(300, 250);
        
        // Panel para campos de entrada
        JPanel panelCampos = new JPanel(new GridLayout(4, 2, 5, 5));
        
        // Campos y etiquetas para registro
        panelCampos.add(new JLabel("Usuario:"));
        txtUsuarioRegistro = new JTextField();
        panelCampos.add(txtUsuarioRegistro);
        
        panelCampos.add(new JLabel("Contraseña:"));
        txtContrasenaRegistro = new JTextField();
        panelCampos.add(txtContrasenaRegistro);
        
        panelCampos.add(new JLabel("Confirmar Contraseña:"));
        txtConfirmarContrasena = new JTextField();
        panelCampos.add(txtConfirmarContrasena);
        
        // Botón de registro
        JButton btnRegistrar = new JButton("Registrar");
        btnRegistrar.addActionListener(e -> registrarUsuario());
        
        // Agregar componentes a la ventana
        ventanaRegistro.add(panelCampos, BorderLayout.CENTER);
        ventanaRegistro.add(btnRegistrar, BorderLayout.SOUTH);
        
        // Configurar la ventana
        ventanaRegistro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventanaRegistro.setLocationRelativeTo(ventanaLogin);
        ventanaRegistro.setVisible(true);
    }

    private void iniciarSesion() {
        String usuario = txtUsuarioLogin.getText();
        String contrasena = new String(txtContrasenaLogin.getPassword());
        
        // Buscar usuario en el array
        boolean encontrado = false;
        for (int i = 0; i < indiceUsuario; i++) {
            if (usuarios[i].getNombreUsuario().equals(usuario) && 
                usuarios[i].getContrasena().equals(contrasena)) {
                encontrado = true;
                break;
            }
        }
        
        if (encontrado) {
            JOptionPane.showMessageDialog(ventanaLogin, 
                "¡Bienvenido " + usuario + "!", 
                "Login Exitoso", 
                JOptionPane.INFORMATION_MESSAGE);
        } else {
            mostrarError("Usuario o contraseña incorrectos");
        }
    }

    private void registrarUsuario() {
        String usuario = txtUsuarioRegistro.getText();
        String contrasena = txtContrasenaRegistro.getText();
        String confirmacion = txtConfirmarContrasena.getText();
        
        // Validaciones
        if (usuario.isEmpty() || contrasena.isEmpty()) {
            mostrarError("Los campos no pueden estar vacíos");
            return;
        }
        
        if (!contrasena.equals(confirmacion)) {
            mostrarError("Las contraseñas no coinciden");
            return;
        }
        
        // Verificar si el usuario ya existe
        for (int i = 0; i < indiceUsuario; i++) {
            if (usuarios[i].getNombreUsuario().equals(usuario)) {
                mostrarError("El usuario ya existe");
                return;
            }
        }
        
        // Registrar nuevo usuario
        if (indiceUsuario < usuarios.length) {
            usuarios[indiceUsuario] = new Usuario(usuario, contrasena);
            indiceUsuario++;
            
            JOptionPane.showMessageDialog(ventanaRegistro, 
                "Usuario registrado exitosamente", 
                "Registro Exitoso", 
                JOptionPane.INFORMATION_MESSAGE);
            
            ventanaRegistro.dispose();
        } else {
            mostrarError("No hay espacio para más usuarios");
        }
    }

    private void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(ventanaLogin, 
            mensaje, 
            "Error", 
            JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SistemaLogin());
    }
}

class Usuario {
    private final String nombreUsuario;
    private final String contrasena;

    public Usuario(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }
}