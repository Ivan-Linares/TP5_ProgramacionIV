package aplicacion_escritorio;

import java.awt.Panel;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JList;

public class PanelListarPelicula extends Panel{	
	private JList<Pelicula> JList;
	private DefaultListModel<Pelicula> listModel;
	
	public PanelListarPelicula() {
		setLayout(null);
		
		JLabel lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setBounds(10, 134, 40, 14);
		add(lblPeliculas);
		
		JPanel panel = new JPanel();
		panel.setBounds(54, 11, 369, 278);
		add(panel);
		
		JList = new JList<Pelicula>();				
		panel.add(JList);		
	}
	
	public void setDefaultListModel(DefaultListModel<Pelicula> listModel)
	{
		this.listModel = listModel;
		JList.setModel(this.listModel);
	}
}
