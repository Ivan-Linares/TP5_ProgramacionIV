package aplicacion_escritorio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnPeliculas = new JMenu("Peliculas");
		menuBar.add(mnPeliculas);
		
		mnItemAgregar = new JMenuItem("Agregar");
		mnItemAgregar.addActionListener(new eventoBtnAgregarPelicula(contentPane));
		mnPeliculas.add(mnItemAgregar);
		
		mnItemListar = new JMenuItem("Listar");
		mnPeliculas.add(mnItemListar);
		

	}

}

class eventoBtnAgregarPelicula implements ActionListener {
	private JPanel contentPane;
	
	public eventoBtnAgregarPelicula(){		
	}
	
	public eventoBtnAgregarPelicula(JPanel contentPane){	
		this.contentPane = contentPane;
	}
	@Override
	public void actionPerformed(ActionEvent e) {		
		mostrarPanelAgregarPelicula();
	}

	public void mostrarPanelAgregarPelicula(){
		contentPane.removeAll();
		
		PanelAgregarPelicula panelAgregarPelicula = new PanelAgregarPelicula();
		contentPane.add(panelAgregarPelicula);
		contentPane.repaint();
		contentPane.revalidate();

	}
	
}