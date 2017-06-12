package team.stray.bridgechat.windowgui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class WindowSeat extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowSeat frame = new WindowSeat();
					frame.setVisible(true);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WindowSeat() {
		setTitle("\u6A4B\u724C123");
		setIconImage(Toolkit.getDefaultToolkit().getImage(WindowSeat.class.getResource("/resource/chip.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 250, 210));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		JCheckBox checkBoxSouth = new JCheckBox("\u5357");
		checkBoxSouth.setFont(new Font("�L�n������", Font.PLAIN, 18));
		checkBoxSouth.setBounds(175, 185, 43, 23);
		contentPane.add(checkBoxSouth);
		checkBoxSouth.setOpaque(false);
		checkBoxSouth.setContentAreaFilled(false);
		checkBoxSouth.setBorderPainted(false);
		
		JCheckBox checkBoxNorth = new JCheckBox("\u5317");
		checkBoxNorth.setFont(new Font("�L�n������", Font.PLAIN, 18));
		checkBoxNorth.setBounds(175, 63, 43, 23);
		contentPane.add(checkBoxNorth);
		checkBoxNorth.setOpaque(false);
		checkBoxNorth.setContentAreaFilled(false);
		checkBoxNorth.setBorderPainted(false);
		
		JCheckBox checkBoxEast = new JCheckBox("\u6771");
		checkBoxEast.setFont(new Font("�L�n������", Font.PLAIN, 18));
		checkBoxEast.setBounds(270, 120, 43, 23);
		contentPane.add(checkBoxEast);
		checkBoxEast.setOpaque(false);
		checkBoxEast.setContentAreaFilled(false);
		checkBoxEast.setBorderPainted(false);
		
		
		JCheckBox checkBoxWest = new JCheckBox("\u897F");
		checkBoxWest.setFont(new Font("�L�n������", Font.PLAIN, 18));
		checkBoxWest.setBounds(70, 120, 43, 23);
		contentPane.add(checkBoxWest);
		checkBoxWest.setOpaque(false);
		checkBoxWest.setContentAreaFilled(false);
		checkBoxWest.setBorderPainted(false);
		
		
		ButtonGroup group = new ButtonGroup();
		group.add(checkBoxNorth);
		group.add(checkBoxWest);
		group.add(checkBoxEast);
		group.add(checkBoxSouth);
		
		JButton btnCheckSeat = new JButton("\u78BA\u8A8D\u5EA7\u4F4D");
		btnCheckSeat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				checkBoxNorth.setEnabled(false);
				checkBoxWest.setEnabled(false);
				checkBoxEast.setEnabled(false);
				checkBoxSouth.setEnabled(false);				
			}
		});
		btnCheckSeat.setFont(new Font("�L�n������", Font.PLAIN, 12));
		btnCheckSeat.setBounds(324, 228, 87, 23);
		contentPane.add(btnCheckSeat);
	}
}