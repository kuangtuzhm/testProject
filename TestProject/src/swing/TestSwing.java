package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;

public class TestSwing {

	private JFrame frame;
	private JTextField textField;
	private JMenuItem menuItem;
	
	JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestSwing window = new TestSwing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestSwing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("111111111");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(39, 79, 111, 27);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = textField.getText();
			}
		});
		btnNewButton.setBounds(185, 81, 93, 23);
		panel.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(30, 150, 66, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(10, 0, 224, 34);
		panel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		menuItem = new JMenuItem("唱歌");
		menuItem.addActionListener(new menuItemListener());
		mnNewMenu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("2222");
		menuItem_1.addActionListener(new menuItem1Listener());
		mnNewMenu.add(menuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("New menu");
		menuBar.add(mnNewMenu_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"11111", "33333"}));
		comboBox.setBounds(185, 150, 93, 21);
		panel.add(comboBox);
		
		textArea = new JTextArea();
		textArea.setBounds(78, 199, 166, 41);
		panel.add(textArea);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(54, 250, 224, 61);
		panel.add(scrollPane);
		
		
		//panel.add(textArea);
	}
	
	class menuItemListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==menuItem)
			{
				textField.setText(e.getActionCommand()+"菜单被选中");
				textArea.append(e.getActionCommand()+"菜单被选中\n");
			}
		}
	}
	
	class menuItem1Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			textField.setText(e.getActionCommand()+"菜单被选中");
			textArea.append(e.getActionCommand()+"菜单被选中\n");
		}
	}
}


