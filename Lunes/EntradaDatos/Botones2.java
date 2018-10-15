import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class Botones2{
	public static void main(String[] args){
		
		JFrame frame = new JFrame("Ejemplo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//NUmero de filas y columnas
		GridLayout gl = new GridLayout(4,3);
		//5 pixeles de diferencia entre cada uno 
		gl.setHgap(5);
		gl.setVgap(5);

		frame.setLayout(gl);
		for(int i = 1; i <= 9; i++){
			//En cada iteracion agregamos un nuevo boton y como cadena le pasamos i
			// i es lo que va a mostrar el boton
			frame.add(new JButton(String.valueOf(i)));
		}
		frame.add(new JButton("*"));
		frame.add(new JButton("0"));
		frame.add(new JButton("#"));
		//Es para ajustar todo sin dar tamaño
		frame.pack();
		//Para que se vea la ventana
		frame.setVisible(true);
	}
}