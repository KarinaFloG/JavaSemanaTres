import javax.swing.JOptionPane;

public class JOptionPaneTest{
	public static void main(String[] args){
		//(1,2)
		//(1. Componenete sobre el cual estamos mostrando)
		//(2. El mensaje que va a mostrar)
		//(3. Mensaje que va a aparecer en el encabezado de la ventana)
		JOptionPane.showMessageDialog(null,"Mensaje de prueba","JOptionPane",JOptionPane.WARNING_MESSAGE);
		//INFORMATION MESSAGE
		/*WARNING_MESSAGE
		  QUESTION_MESSAGE
		  PLAIN_MESSAGE
		  ERROR_MESSAGE*/

	}
}