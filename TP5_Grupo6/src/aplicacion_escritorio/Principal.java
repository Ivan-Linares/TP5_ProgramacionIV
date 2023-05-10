package aplicacion_escritorio;

public class Principal {

	public static void main(String[] args) 
	{
		try 
		{
			Ventana1 frame = new Ventana1();
			frame.setVisible(true);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
