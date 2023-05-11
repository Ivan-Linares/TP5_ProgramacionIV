package aplicacion_escritorio;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class PanelAgregarPelicula extends JPanel {
	private JTextField textFieldNombrePelicula;
	
	public PanelAgregarPelicula() {
		addLayout();
		addLabels();
		addTextField();
		addComboBox();
		addBotonAceptar();
	}
	
	public void addLayout() {		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 89, 107, 140, 62, 4};
		gridBagLayout.rowHeights = new int[]{16, 45, 46, 57, 21, 2};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
	}
	
	public void addLabels() {		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.WEST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 4;
		gbc_lblId.gridy = 1;
		add(lblId, gbc_lblId);
	
		JLabel lblIdPelicula = new JLabel("1");
		lblIdPelicula.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblIdPelicula = new GridBagConstraints();
		gbc_lblIdPelicula.anchor = GridBagConstraints.WEST;
		gbc_lblIdPelicula.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdPelicula.gridx = 5;
		gbc_lblIdPelicula.gridy = 1;
		add(lblIdPelicula, gbc_lblIdPelicula);
	
		JLabel lblNombrePelicula = new JLabel("Nombre");
		lblNombrePelicula.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNombrePelicula = new GridBagConstraints();
		gbc_lblNombrePelicula.anchor = GridBagConstraints.WEST;
		gbc_lblNombrePelicula.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombrePelicula.gridx = 4;
		gbc_lblNombrePelicula.gridy = 2;
		add(lblNombrePelicula, gbc_lblNombrePelicula);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblGenero = new GridBagConstraints();
		gbc_lblGenero.anchor = GridBagConstraints.WEST;
		gbc_lblGenero.insets = new Insets(0, 0, 5, 5);
		gbc_lblGenero.gridx = 4;
		gbc_lblGenero.gridy = 3;
		add(lblGenero, gbc_lblGenero);
	}
	
	public void addTextField() {
		textFieldNombrePelicula = new JTextField();
		GridBagConstraints gbc_textFieldNombrePelicula = new GridBagConstraints();
		gbc_textFieldNombrePelicula.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldNombrePelicula.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNombrePelicula.gridx = 5;
		gbc_textFieldNombrePelicula.gridy = 2;
		add(textFieldNombrePelicula, gbc_textFieldNombrePelicula);
		textFieldNombrePelicula.setColumns(10);	
	}
	
	public void addComboBox() {	
		JComboBox comboBox = new JComboBox<String>();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 5;
		gbc_comboBox.gridy = 3;
		add(comboBox, gbc_comboBox);
	}
	
	public void addBotonAceptar() {
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.fill = GridBagConstraints.BOTH;
		gbc_btnAceptar.insets = new Insets(0, 0, 0, 5);
		gbc_btnAceptar.gridx = 4;
		gbc_btnAceptar.gridy = 4;
		add(btnAceptar, gbc_btnAceptar);
	}
	
}
