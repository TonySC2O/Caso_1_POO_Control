package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class Window extends JFrame {
	private JTextArea textArea;
	private JButton button2;
	private Color color_verde = new Color(0,160,50);
	private Color color_suelo = new Color(170,115,30);
	private Color color_casa = new Color(200,250,230);
	private MatteBorder borde = new MatteBorder(2, 2, 2, 2, Color.BLACK);
	
	private void Colocar_label(JLabel pLabel, JPanel pPanel, int x, int y, int h, int w, Boolean pOpacity, Color pFondo, int pTamaño, Boolean pBorde) {
		pLabel.setFont(new Font("Arial", Font.BOLD, pTamaño)); // Set font and sizO
		pLabel.setForeground(Color.black); // Set text color
		pLabel.setBackground(pFondo); // Set text color
		pLabel.setHorizontalAlignment(SwingConstants.CENTER);
		if(pBorde == true) {pLabel.setBorder(borde);}
		pLabel.setOpaque(pOpacity);
		pLabel.setBounds(x, y, h ,w);
        if (pPanel != null) {pPanel.add(pLabel);}
	}
	
	private void Colocar_panel(JPanel pPanel, int x, int y, int h, int w, Color pFondo) {
		pPanel.setLayout(null);
		pPanel.setBackground(pFondo);
		pPanel.setBounds(x, y, h, w);
		pPanel.setBorder(borde);
        getContentPane().add(pPanel);
	}
	
	public Window() {
		setTitle("Casa #1");
        setSize(800, 900); // Set the desired size
        setResizable(false); // Disable frame resizing
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocation(50, 60);
        
        getContentPane().setBackground(Color.LIGHT_GRAY);
        getContentPane().setLayout(null);
        
        
        JLabel label = new JLabel("Casa 1");
        Colocar_label(label, null, 340, 10, 120, 30, true, Color.LIGHT_GRAY, 18, false);
        getContentPane().add(label);
        
        // Habitaciones ====================================================================
        
        // Genera panel y label de cuarto de pilas.
        
        JPanel pnlCuartoPilas = new JPanel();
        Colocar_panel(pnlCuartoPilas, 160, 300, 300, 100, color_casa);
        
        JLabel lblCuartoPilas = new JLabel("Cuarto de pilas");
        Colocar_label(lblCuartoPilas, pnlCuartoPilas, 75, 35, 150, 30, false, Color.white, 18, false);
        
        // Genera panel y label de baños.
        
        JPanel pnlBaños = new JPanel();
        Colocar_panel(pnlBaños, 470, 300, 80, 100, color_casa);
        
        JLabel lblBaños = new JLabel("Baños");
        Colocar_label(lblBaños, pnlBaños, 10, 35, 60, 30, false, Color.white, 18, false);
        
        // Genera panel y label de cuartos.
        
        JPanel pnlCuartos = new JPanel();
        Colocar_panel(pnlCuartos, 560, 300, 200, 300, color_casa);
        
        JLabel lblCuartos = new JLabel("Cuartos");
        Colocar_label(lblCuartos, pnlCuartos, 60, 130, 80, 30, false, Color.white, 18, false);
        
        // Genera panel y label de sala.
        
        JPanel pnlSala = new JPanel();
        Colocar_panel(pnlSala, 350, 610, 410, 200, color_casa);
        
        JLabel lblSala = new JLabel("Sala");
        Colocar_label(lblSala, pnlSala, 170, 85, 80, 30, false, Color.white, 18, false);
        
        // Genera panel y label de comedor.
        
        JPanel pnlComedor = new JPanel();
        Colocar_panel(pnlComedor, 350, 410, 200, 190, color_casa);
        
        JLabel lblComedor = new JLabel("Comedor");
        Colocar_label(lblComedor, pnlComedor, 55, 75, 90, 30, false, Color.white, 18, false);
        
        // Genera panel y label de cochera.
        
        JPanel pnlCochera = new JPanel();
        Colocar_panel(pnlCochera, 160, 560, 180, 220, color_casa);
        
        JLabel lblCochera = new JLabel("Cochera");
        Colocar_label(lblCochera, pnlCochera, 45, 105, 90, 30, false, Color.white, 18, false);
        
        // Genera panel y label de cocina.
        
        JPanel pnlCocina = new JPanel();
        Colocar_panel(pnlCocina, 160, 410, 180, 140, color_casa);
        
        JLabel lblCocina = new JLabel("Cocina");
        Colocar_label(lblCocina, pnlCocina, 45, 55, 90, 30, false, Color.white, 18, false);
        
        // Patio ===========================================================================
        
        // Genera panel y label del suelo del patio.
        
        JPanel pnlSueloPatio = new JPanel();
        Colocar_panel(pnlSueloPatio, 350, 90, 410, 200, color_suelo);
        
        JLabel lblSueloPatio = new JLabel("Suelo");
        Colocar_label(lblSueloPatio, pnlSueloPatio, 160, 80, 90, 30, false, Color.white, 18, false);
        
        // Genera panel y label del cesped.
        
        JPanel pnlCesped = new JPanel();
        Colocar_panel(pnlCesped, 240, 190, 100, 100, color_verde);
        
        JLabel lblCesped = new JLabel("Cesped");
        Colocar_label(lblCesped, pnlCesped, 15, 35, 70, 30, false, Color.white, 18, false);
        
        // Genera panel y label del arbol.
        
        JPanel pnlArbol = new JPanel();
        Colocar_panel(pnlArbol, 130, 80, 100, 100, color_verde);
        
        JLabel lblArbol = new JLabel("Árbol");
        Colocar_label(lblArbol, pnlArbol, 15, 35, 70, 30, false, Color.white, 18, false);
        
        // Genera panel y label del planta.
        
        JPanel pnlPlanta = new JPanel();
        Colocar_panel(pnlPlanta, 20, 190, 100, 100, color_verde);
        
        JLabel lblPlanta = new JLabel("Planta");
        Colocar_label(lblPlanta, pnlPlanta, 15, 35, 70, 30, false, Color.white, 18, false);
        
        // Dispositivos ===================================================================
        
        JLabel lblLavadora = new JLabel("Lavadora");
        Colocar_label(lblLavadora, pnlCuartoPilas, 10, 15, 65, 25, true, Color.white, 12, true);

        JLabel lblTrapeador = new JLabel("Trapeador");
        Colocar_label(lblTrapeador, pnlCuartoPilas, 10, 55, 65, 25, true, Color.white, 12, true);
        
        JLabel lblAspiradora = new JLabel("Aspiradora");
        Colocar_label(lblAspiradora, pnlCuartoPilas, 220, 15, 70, 25, true, Color.white, 12, true);

        JLabel lblMicroondas = new JLabel("Microondas");
        Colocar_label(lblMicroondas, pnlCocina, 10, 15, 75, 25, true, Color.white, 12, true);
        
        JLabel lblRefrigeradora = new JLabel("Refrigeradora");
        Colocar_label(lblRefrigeradora, pnlCocina, 10, 105, 90, 25, true, Color.white, 12, true);
        
        JLabel lblGenerador = new JLabel("Generador");
        Colocar_label(lblGenerador, pnlCochera, 10, 15, 75, 25, true, Color.white, 12, true);
        
        JLabel lblModem = new JLabel("Modem");
        Colocar_label(lblModem, pnlSala, 10, 15, 75, 25, true, Color.white, 12, true);
        
        JLabel lblTelefono = new JLabel("Teléfono");
        Colocar_label(lblTelefono, pnlSala, 10, 160, 75, 25, true, Color.white, 12, true);
        
        
        textArea = new JTextArea();
        textArea.setLineWrap(true); // Enable line wrapping
        textArea.setWrapStyleWord(true); // Wrap at word boundaries

        Rectangle textAreaBounds = new Rectangle(10, 790, 150, 30);
        textArea.setBounds(textAreaBounds);
        
        // Add text area to the frame's content pane
        getContentPane().add(textArea);
        
        JButton button1 = new JButton("Hola");
        button2 = new JButton("Adios");

        // Define positions for the buttons
        button1.setBounds(10, 825, 100, 30);
        button2.setBounds(130, 825, 100, 30);

        // Add buttons to the frame's content pane
        getContentPane().add(button1);
        getContentPane().add(button2);

        // Set null layout

        // Add onClick event listeners to the buttons
        button1.addActionListener(e -> decirHola());
        button2.addActionListener(e -> decirAdios());
        
        setLocationRelativeTo(null);
    }
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(() -> {
			Window frame = new Window();
	        frame.setVisible(true);
	    });
	}
	
	private void decirHola() {
		textArea.setText("aqui va mi mensaje");
	}
	
	private void decirAdios() {
		button2.setBackground(Color.CYAN);
	}
}
