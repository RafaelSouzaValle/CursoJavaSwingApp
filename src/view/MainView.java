/**
 * 
 * @author rafaelsouzavalle
 * 
 * Código elaborado para o curso de Java Swing
 * digivalle.com.br
 * 
 */


package view;

import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainView {

	private static final Dimension DIMENSAO_FRAME = new Dimension(500, 300);
	
	private static final Point POSICAO_FRAME = new Point(150, 150);
	
	private static JFrame frame;
	
	public static void loadFrame() {
		
		// Cria a janela
		frame = new JFrame();
		
		// Define o título da janela
		frame.setTitle("Janela principal");
		
		// Define o tamanho para a janela (largura, altura) em pixels
		// Pode receber como parâmetro um Dimension ou as medidas x e y em pixels
		frame.setSize(DIMENSAO_FRAME);
		
		// Define a localização da janela (frame) na tela.
		// Pode receber como parâmetro um Point ou as medidas x e y em pixels
		frame.setLocation(POSICAO_FRAME);
		
		// Define o que ocorre quando a janela é fechada.
		// No exemplo a aplicação é encerrada quando fecha a janela.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/**
		 * 
		 * Adicionando componentes
		 */

		// Painel que agrupa componentes
		JPanel panel = new JPanel();

		// Cria um texto exibido para o usuário.
		JLabel label = new JLabel("Nome:");

		// Adciona o componente ao painel
		panel.add(label);

		// Cria um campo de texto para o usuário digitar.
		// Recebe como como parâmetro a quantidade de colunas
		// (Sem parâmetros não limita a quantidade de caracteres)
		JTextField textField = new JTextField(10);

		// Adciona o componente ao painel
		panel.add(textField);

		// Adiciona o panel ao frame
		frame.add(panel);
		
		// Define a janela como visível
		frame.setVisible(true);

	}
	
}
