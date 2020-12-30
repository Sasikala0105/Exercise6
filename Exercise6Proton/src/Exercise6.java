import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Exercise6 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise6 window = new Exercise6();
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
	public Exercise6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 890, 509);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(163, 0, 540, 146);
		Image logoP = new ImageIcon(this.getClass().getResource("/Protonlogo.jpeg")).getImage();
		Image img = logoP.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(img);
		lblNewLabel.setIcon(scaledIcon);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnProtonSaga = new JButton("PROTON SAGA");
		btnProtonSaga.setForeground(Color.BLACK);
		btnProtonSaga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "-PROTON SAGA -"
						+"\n"
						+ " Basic Salary              : RM 2200"
						+"\n"
						+ " Monthly Installment : RM 399"
						+"\n"
						+ " Model                           : C21A"
						+"\n"
						+ " Accessories :-"
						+"\n"
						+ "1.Car Mat"
						+"\n"
						+ "2.USB Armrest"
						+"\n"
						+ " Features :-"
						+"\n"
						+ "1.Rear Seat Fold"
						+"\n"
						+"2.ECO Drive Assist"
						+"\n"
						+"3.Halogen Headlamps"
						+"\n"
						+"Contact us for more details : "
						+" 011-12345789"
						+" Email add : protonmsia@gmail.com");
				
			}
		});
		btnProtonSaga.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnProtonSaga.setBackground(Color.LIGHT_GRAY);
		btnProtonSaga.setBounds(260, 194, 133, 23);
		frame.getContentPane().add(btnProtonSaga);
		
		JButton btnProtonSaga_1 = new JButton("PROTON X50");
		btnProtonSaga_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "-PROTON X50 -"
						+"\n"
						+ " Basic Salary              : RM 4200"
						+"\n"
						+ " Monthly Installment : RM 799"
						+"\n"
						+ " Model                           : B-segment SUV (1.5T Standard)"
						+"\n"
						+ " Accessories :-"
						+"\n"
						+ "1.Door Visor"
						+"\n"
						+ "2.Car Mat"
						+"\n"
						+"3.Key Cover TPU Protection "
						+"\n"
						+ " Features :-"
						+"\n"
						+ "1.Reverse Camera"
						+"\n"
						+"2.Electronic Parking Brake"
						+"\n"
						+"3.Four Airbags"
						+"\n"
						+"4.Fabric seats"
						+"\n"
						+"Contact us for more details : "
						+" 011-12345789"
						+" Email add : protonmsia@gmail.com");
			}
		});
		btnProtonSaga_1.setForeground(Color.BLACK);
		btnProtonSaga_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnProtonSaga_1.setBackground(Color.LIGHT_GRAY);
		btnProtonSaga_1.setBounds(260, 360, 133, 23);
		frame.getContentPane().add(btnProtonSaga_1);
		
		JButton btnProtonSaga_2 = new JButton("PROTON PERSONA");
		btnProtonSaga_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "-PROTON PERSONA -"
						+"\n"
						+ " Basic Salary              : RM 3750"
						+"\n"
						+ " Monthly Installment : RM 442"
						+"\n"
						+ " Model                           : subcompact B-segment (P2-31A)"
						+"\n"
						+ " Accessories :-"
						+"\n"
						+ "1.USB Armrest Double Layer"
						+"\n"
						+ "2. 1 Seater Car Mat"
						+"\n"
						+ " Features :-"
						+"\n"
						+ "1.Adjustable Headlights"
						+"\n"
						+"2.Anti-Lock Braking System"
						+"\n"
						+"3.Anti-Theft Alarm"
						+"\n"
						+"4.Engine Immobilizer"
						+"\n"
						+"Contact us for more details : "
						+" 011-12345789"
						+" Email add : protonmsia@gmail.com");
			}
		});
		btnProtonSaga_2.setForeground(Color.BLACK);
		btnProtonSaga_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnProtonSaga_2.setBackground(Color.LIGHT_GRAY);
		btnProtonSaga_2.setBounds(731, 194, 143, 23);
		frame.getContentPane().add(btnProtonSaga_2);
		
		JButton btnProtonSaga_3 = new JButton("PROTON X70");
		btnProtonSaga_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "-PROTON X70 -"
						+"\n"
						+ " Basic Salary              : RM 6000"
						+"\n"
						+ " Monthly Installment : RM 1499"
						+"\n"
						+ " Model                           : SUV (1.8 TGDI Standard 2WD)"
						+"\n"
						+ " Accessories :-"
						+"\n"
						+ "1.Bonet Trunk LED Running Light"
						+"\n"
						+ "2.Door Visor"
						+"\n"
						+"3.Car Mat"
						+"\n"
						+ " Features :-"
						+"\n"
						+ "1.Rear Camera"
						+"\n"
						+"2.Crash Sensor"
						+"\n"
						+"3.Power Door Locks"
						+"\n"
						+"4.Anti Theft Device"
						+"\n"
						+"5.Sun Roof"
						+"\n"
						+"Contact us for more details : "
						+" 011-12345789"
						+" Email add : protonmsia@gmail.com");
			}
		});
		btnProtonSaga_3.setForeground(Color.BLACK);
		btnProtonSaga_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnProtonSaga_3.setBackground(Color.LIGHT_GRAY);
		btnProtonSaga_3.setBounds(731, 360, 143, 23);
		frame.getContentPane().add(btnProtonSaga_3);
		
		JLabel SagaLabel = new JLabel("New label");
		SagaLabel.setLabelFor(frame);
		Image Saga = new ImageIcon(this.getClass().getResource("/saga.jpg")).getImage();
		SagaLabel.setIcon(new ImageIcon(Saga));
		SagaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		SagaLabel.setBounds(51, 157, 199, 124);
		frame.getContentPane().add(SagaLabel);
		
		JLabel X50Label = new JLabel("New label");
		X50Label.setHorizontalAlignment(SwingConstants.CENTER);
		X50Label.setLabelFor(X50Label);
		Image X50 = new ImageIcon(this.getClass().getResource("/x50protonsmall.jpg")).getImage();
		X50Label.setIcon(new ImageIcon(X50));
		X50Label.setBounds(37, 316, 213, 143);
		frame.getContentPane().add(X50Label);
		
		JLabel PersonaLabel = new JLabel("");
		PersonaLabel.setLabelFor(PersonaLabel);
		Image Persona = new ImageIcon(this.getClass().getResource("/personasmall.png")).getImage();
		PersonaLabel.setIcon(new ImageIcon(Persona));
		PersonaLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		PersonaLabel.setBounds(481, 157, 240, 124);
		frame.getContentPane().add(PersonaLabel);
		
		JLabel X70Label = new JLabel("New label");
		X70Label.setLabelFor(X70Label);
		Image X70 = new ImageIcon(this.getClass().getResource("/x70small.jpg")).getImage();
		X70Label.setIcon(new ImageIcon(X70));
		X70Label.setBounds(481, 316, 240, 143);
		frame.getContentPane().add(X70Label);
		
	}
}
