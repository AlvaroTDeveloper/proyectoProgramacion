package proyectoProgramacion.interfazGrafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;


public class InterfazGrafica {

	public InterfazGrafica() {

	}

	public void window() {
		JFrame window = new JFrame("NOMBRE APLICACIÓN");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(1280, 720);
		window.setLocationRelativeTo(null);
		window.add(mainPanel());
		window.setVisible(true);
	}

	public JPanel mainPanel() {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(northPanel(), BorderLayout.NORTH);
		mainPanel.add(southPanel(), BorderLayout.SOUTH);
		mainPanel.add(eastPanel(), BorderLayout.EAST);
		mainPanel.add(westPanel(), BorderLayout.WEST);
		mainPanel.add(centerPanel(), BorderLayout.CENTER);
		return mainPanel;
	}

	public JPanel northPanel() {
		JPanel northPanel = new JPanel();
		northPanel.setBackground(Color.green);
		northPanel.setBorder(new EmptyBorder(10, 10, 5, 5));
		JLabel title = new JLabel("Buscador");
		title.setFont(new Font("Courier New", Font.ITALIC, 36));
		title.setHorizontalTextPosition(JLabel.CENTER);
		northPanel.add(title);
		return northPanel;
	}

	public JPanel southPanel() {
		JPanel southPanel = new JPanel();
		southPanel.setBackground(Color.yellow);

		return southPanel;
	}

	public JPanel eastPanel() {
		JPanel eastPanel = new JPanel();
		eastPanel.setBackground(Color.WHITE);

		return eastPanel;
	}

	public JPanel westPanel() {
		JPanel westPanel = new JPanel();
		westPanel.setBackground(Color.red);

		return westPanel;
	}

	public JPanel centerPanel() {
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.pink);
		JLabel searchTitle = new JLabel("¿Qué quieres buscar?");
		JTextField textToSearch = new JTextField(25);
		// textToSearch.setPreferredSize(new Dimension(,0));
		JButton searchButton = new JButton("Buscar");
		centerPanel.add(searchTitle);
		centerPanel.add(textToSearch);
		centerPanel.add(searchButton);

		return centerPanel;
	}

}
