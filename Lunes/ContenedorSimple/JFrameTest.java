import javax.swing.JFrame;

public class JFrameTest{
	public static void main(String[] args){
		JFrame marco = new JFrame("JFrame test");
		//PARA CERRAR LA VENTANA DEL MARCO
		//Este puede ir o no pero es preferente que se ponga
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//PARA DARLE TAMAÑO AL MARCO
		marco.setSize(400,300);
		//Para hacer que la ventana del marco se visualice
		marco.setVisible(true);
	}
}