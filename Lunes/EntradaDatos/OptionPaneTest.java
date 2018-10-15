import javax.swing.JOptionPane;

public class OptionPaneTest{
	public static void main(String[] args){
		String[] carreras = {"Geofisica","Contaduria","Jorge"};
		//Para entrada de datos
		//String prueba = JOptionPane.showInputDialog("Ingresa lo que quieras: ", "mensaje por defecto");
		String prueba = (String)JOptionPane.showInputDialog(null,"Carreras", "seleccione una carrera",JOptionPane.PLAIN_MESSAGE,null,carreras,carreras[0]);

	}
}