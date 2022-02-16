package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;

public class DialogoAñadirDepartamento extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoAñadirDepartamento dialog = new DialogoAñadirDepartamento();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoAñadirDepartamento() {
		setBounds(100, 100, 670, 426);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new MigLayout("", "[][][][grow]", "[][][][][][][]"));
		{
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
			contentPanel.add(lblNewLabel, "cell 1 1");
		}
		{
			textField = new JTextField();
			contentPanel.add(textField, "cell 3 1,growx");
			textField.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
			contentPanel.add(lblNewLabel_1, "cell 1 3");
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
			contentPanel.add(comboBox, "cell 3 3,growx");
		}
		{
			JLabel lblNewLabel_2 = new JLabel("New label");
			contentPanel.add(lblNewLabel_2, "cell 1 5");
		}
		{
			textField_2 = new JTextField();
			contentPanel.add(textField_2, "cell 3 5,growx");
			textField_2.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
