package com.mycompany.sistemalogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SistemaLogin {
    
    private final Usuario[] usuarios;
    private int indiceUsuario;
    
    
    private JFrame ventanaLogin;
    private JFrame ventanaRegistro;
    private JTextField txtUsuarioLogin;
    private JPasswordField txtContrasenaLogin;
    private JTextField txtUsuarioRegistro;
    private JTextField txtContrasenaRegistro;
    private JTextField txtConfirmarContrasena;

    public SistemaLogin() {
        
        usuarios = new Usuario[10];
        indiceUsuario = 0;
        
        // Crear usuarios predeterminados
        usuarios[0] = new Usuario("admin", "admin123");
        usuarios[1] = new Usuario("usuario", "pass123");
        indiceUsuario = 2; 
        
        crearVentanaLogin();
    }

    private void crearVentanaLogin() {
        
        ventanaLogin = new JFrame("Sistema de Login");
        ventanaLogin.setLayout(new BorderLayout());
        ventanaLogin.setSize(300, 200);
        
        /
        JPanel panelCampos = new JPanel(new GridLayout(3, 2, 5, 5));
        
        
        panelCampos.add(new JLabel("Usuario:"));
        txtUsuarioLogin = new JTextField();
        panelCampos.add(txtUsuarioLogin);
        
        panelCampos.add(new JLabel("Contraseña:"));
        txtContrasenaLogin = new JPasswordField();
        panelCampos.add(txtContrasenaLogin);
        
        
        JButton btnIniciar = new JButton("Iniciar Sesión");
        btnIniciar.addActionListener(e -> iniciarSesion());
        
        JButton btnRegistrar = new JButton("Registrarse");
        btnRegistrar.addActionListener(e -> crearVentanaRegistro());
        
        
        JPanel panelBotones = new JPanel();
        panelBotones.add(btnIniciar);
        panelBotones.add(btnRegistrar);
        
        
        ventanaLogin.add(panelCampos, BorderLayout.CENTER);
        ventanaLogin.add(panelBotones, BorderLayout.SOUTH);
        
       
        ventanaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaLogin.setLocationRelativeTo(null);
        ventanaLogin.setVisible(true);
    }

    private void crearVentanaRegistro() {
        
        ventanaRegistro = new JFrame("Registro de Usuario :D");
        ventanaRegistro.setLayout(new BorderLayout());
        ventanaRegistro.setSize(300, 250);
        
        
        JPanel panelCampos = new JPanel(new GridLayout(4, 2, 5, 5));
        
        
        panelCampos.add(new JLabel("Tu Usuario:"));
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
                "¡Bienvenido Uwu " + usuario + "!", 
                "inicio de sesion Exitoso", 
                JOptionPane.INFORMATION_MESSAGE);
        } else {
            mostrarError("Usuario o contraseña incorrectos, eres un intruso????");
        }
    }

    private void registrarUsuario() {
        String usuario = txtUsuarioRegistro.getText();
        String contrasena = txtContrasenaRegistro.getText();
        String confirmacion = txtConfirmarContrasena.getText();
        
        // Validaciones
        if (usuario.isEmpty() || contrasena.isEmpty()) {
            mostrarError("Los campos no pueden estar vacíos, flojo");
            return;
        }
        
        if (!contrasena.equals(confirmacion)) {
            mostrarError("Las contraseñas no coinciden, mala suerte bruh");
            return;
        }
        
        // Verificar si el usuario ya existe
        for (int i = 0; i < indiceUsuario; i++) {
            if (usuarios[i].getNombreUsuario().equals(usuario)) {
                mostrarError("El usuario ya existe, acuerdate *side eye*");
                return;
            }
        }
        
        // Registrar nuevo usuario
        if (indiceUsuario < usuarios.length) {
            usuarios[indiceUsuario] = new Usuario(usuario, contrasena);
            indiceUsuario++;
            
            JOptionPane.showMessageDialog(ventanaRegistro, 
                "Usuario registrado exitosamente YEI", 
                "Registro Exitoso", 
                JOptionPane.INFORMATION_MESSAGE);
            
            ventanaRegistro.dispose();
        } else {
            mostrarError("No hay espacio para más usuarios, Ushcale");
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
