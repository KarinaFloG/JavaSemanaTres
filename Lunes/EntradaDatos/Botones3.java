import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Botones3{
	public static void main(String[] args){
		
		JFrame frame = new JFrame("Ejemplo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		BorderLayout b1 = new BorderLayout();
		frame.setLayout(b1);

		JButton btnNorte = new JButton("Norte");
		JButton btnSur = new JButton("Sur");
		JButton btnEste = new JButton("Este");
		JButton btnOeste = new JButton("Oeste");
		JButton btnCentro = new JButton("Centro");

		b1.setVgap(10);
		b1.setHgap(10);

		frame.add(btnNorte, BorderLayout.NORTH);
		frame.add(btnSur, BorderLayout.SOUTH);
		frame.add(btnEste, BorderLayout.EAST);
		frame.add(btnOeste, BorderLayout.WEST);
		frame.add(btnCentro, BorderLayout.CENTER);

		frame.pack();
		frame.setVisible(true);

	}
}