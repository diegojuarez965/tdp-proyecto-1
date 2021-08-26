package gui;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import entities.Student;
import javax.swing.JTabbedPane;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;

	public SimplePresentationScreen(Student studentData) {

		this.studentData = studentData;

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 255));
		setResizable(false);
		setContentPane(contentPane);

		init();
	}

	private void init() {
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 430, 197);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation,
				"Muestra la información declarada por el alumno");

		lblNewLabel = new JLabel("LU");
		lblNewLabel_1 = new JLabel("Apellido");
		lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_3 = new JLabel("E-mail");
		lblNewLabel_4 = new JLabel("Github URL");
		lblNewLabel_5 = new JLabel("Esta ventana fue generada el " + LocalDate.now() + " a las: " + LocalTime.now());
		lblNewLabel_5.setBounds(5, 202, 599, 14);
		contentPane.setLayout(null);
		lblNewLabel_6 = new JLabel();
		lblNewLabel_6.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource("/images/foto.jpg")));
		lblNewLabel_6.setBounds(445, 34, 159, 159);

		textField = new JTextField();
		textField.setColumns(10);
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField.setText("" + studentData.getId() + "");
		textField_1.setText(studentData.getLastName());
		textField_2.setText(studentData.getFirstName());
		textField_3.setText(studentData.getMail());
		textField_4.setText(studentData.getGithubURL());

		GroupLayout gl_tabInformation = new GroupLayout(tabInformation);
		gl_tabInformation.setHorizontalGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup().addContainerGap()
						.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING).addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1).addComponent(lblNewLabel_2).addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_4))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField_4).addComponent(textField_3).addComponent(textField_2)
								.addComponent(textField)
								.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
						.addContainerGap(20, Short.MAX_VALUE)));
		gl_tabInformation
				.setVerticalGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabInformation.createSequentialGroup().addContainerGap()
								.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel).addComponent(textField, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_1).addComponent(textField_1,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_2).addComponent(textField_2,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_3).addComponent(textField_3,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_4).addComponent(textField_4,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addContainerGap(28, Short.MAX_VALUE)));
		tabInformation.setLayout(gl_tabInformation);

		contentPane.add(tabbedPane);
		contentPane.add(lblNewLabel_5);
		contentPane.add(lblNewLabel_6);

	}
}
