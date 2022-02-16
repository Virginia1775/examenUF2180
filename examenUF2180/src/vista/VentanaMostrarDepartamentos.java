package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import controlador.Controlador;
import modelo.Centro;
import modelo.Departamento;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class VentanaMostrarDepartamentos extends JFrame {

	private JPanel contentPane;
	private JTable tablaDepartamentos;
	private Controlador controlador;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public VentanaMostrarDepartamentos() {
		setFont(new Font("Dialog", Font.BOLD, 18));
		setTitle("DEPARTAMENTOS");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Virginia\\Pictures\\Saved Pictures\\71494590.jfif"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 688, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][]", "[][][]"));
		
		JLabel lblDepartamentos = new JLabel("Departamentos");
		lblDepartamentos.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblDepartamentos, "cell 0 0");
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 0 1,grow");
		
		tablaDepartamentos = new JTable();
		tablaDepartamentos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"cod_departamento", "cod_centro", "tipo_dir", "presupuesto", "nombre"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Integer.class, String.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, true, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tablaDepartamentos.getColumnModel().getColumn(0).setPreferredWidth(105);
		tablaDepartamentos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scrollPane.setViewportView(tablaDepartamentos);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(btnOk, "cell 0 2,alignx right");
	}
	public void setControlador(Controlador controlador) {
		this.controlador=controlador;
	}
	
	public void setListaDepartamentos(ArrayList<Departamento> lista) {
		DefaultTableModel modelo = (DefaultTableModel) tablaDepartamentos.getModel();
		modelo.setRowCount(0);
		for (Departamento departamento : lista) {
			Object fila [] = {
					departamento.getCod_departamento(),departamento.getCod_centro(),
					departamento.getTipo_dir(), departamento.getPresupuesto(),
					departamento.getNombre()
			};
			modelo.addRow(fila);
		}
	}

}
