package aplicacion_escritorio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class Ventana1 extends JFrame {

	private JPanel contentPane;
	JMenuBar menuBar;
	JMenu mnPeliculas;
	JMenuItem mnItemAgregar;
	JMenuItem mnItemListar;

	public Ventana1() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnPeliculas = new JMenu("Peliculas");
		menuBar.add(mnPeliculas);
		
		mnItemAgregar = new JMenuItem("Agregar");
		mnPeliculas.add(mnItemAgregar);
		
		mnItemListar = new JMenuItem("Listar");
		mnPeliculas.add(mnItemListar);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
