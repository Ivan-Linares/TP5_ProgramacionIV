package aplicacion_escritorio;

import java.awt.Panel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JList;
import java.awt.Font;
import java.awt.Color;

public class PanelListarPelicula extends Panel{	
	private JList<Pelicula> JList;
	private DefaultListModel<Pelicula> listModel;
	
	public PanelListarPelicula() {
		setLayout(null);
		
		JLabel lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPeliculas.setBounds(10, 134, 75, 14);
		add(lblPeliculas);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(153, 11, 270, 278);
		add(panel);
		
		JList = new JList<Pelicula>();				
		panel.add(JList);		
	}
	
	public void setDefaultListModel(DefaultListModel<Pelicula> listModel)
	{
		this.listModel = ordenarLista(listModel);
		JList.setModel(this.listModel);
	}
	
	public DefaultListModel<Pelicula> ordenarLista(DefaultListModel<Pelicula> lista)
	{	
		ArrayList<Pelicula> listaPeliculasArray = Collections.list(lista.elements()); 
		Collections.sort(listaPeliculasArray, (Pelicula p1, Pelicula p2) -> p1.getNombre().compareTo(p2.getNombre()));
		
		lista.removeAllElements();
		
		for(Pelicula peli : listaPeliculasArray)
		{	
			lista.addElement(peli);
		}
		
		return lista;
	}
}
