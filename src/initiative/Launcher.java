package initiative;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JSlider;
import javax.swing.JButton;
import com.jgoodies.forms.layout.Sizes;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Random;
import java.beans.PropertyChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JInternalFrame;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import java.awt.Font;



public class Launcher {

	private JFrame frame;
	private JTextField init1;
	private JTextField name1;
	private JTextField init2;
	private JTextField name2;
	private JTextField init3;
	private JTextField name3;
	private JLabel plabel1;
	private JLabel plabel2;
	private JLabel plabel3;
	private JLabel plabel4;
	private JTextField name4;
	private JTextField init4;
	private JLabel plabel5;
	private JTextField name5;
	private JTextField init5;
	private JTextField init6;
	private JTextField init7;
	private JTextField init8;
	private JTextField init9;
	private JTextField name6;
	private JTextField name7;
	private JTextField name8;
	private JTextField name9;
	private JLabel plabel6;
	private JLabel plabel7;
	private JLabel plabel8;
	private JLabel plabel9;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JSlider slider_1;
	private JLabel elabel1;
	private JLabel elabel2;
	private JLabel elabel3;
	private JLabel elabel4;
	private JLabel elabel5;
	private JLabel elabel6;
	private JLabel elabel7;
	private JLabel elabel8;
	private JLabel elabel9;
	private JTextField enemyName1;
	private JTextField enemyName2;
	private JTextField enemyName3;
	private JTextField enemyName4;
	private JTextField enemyName5;
	private JTextField enemyName6;
	private JTextField enemyName7;
	private JTextField enemyName8;
	private JTextField EnemyName9;
	private JTextField enemyInit1;
	private JTextField enemyInit2;
	private JTextField enemyInit3;
	private JTextField enemyInit4;
	private JTextField enemyInit5;
	private JTextField enemyInit6;
	private JTextField enemyInit7;
	private JTextField enemyInit8;
	private JTextField enemyInit9;
	private JButton btnNewButton_2;
	private JSlider slider;
	private int partyCount=9;
	private int enemyCount=9;
	private JLabel lblNewLabel;
	private JLabel lblInitiative;
	private JLabel lblNewLabel_1;
	private JLabel lblDexMod;
	private Component verticalStrut;
	private Component verticalStrut_1;
	private Component rigidArea;
	private JLabel lblNewLabel_2;
	private JButton resetButton;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Launcher window = new Launcher();
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
	public Launcher() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 309, 728);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLayeredPane panel = new JLayeredPane();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{74, 100, 100, 0};
		gbl_panel.rowHeights = new int[]{0, 24, 0, 20, 20, 20, 20, 20, 20, 20, 20, 20, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblNewLabel_2 = new JLabel("D&D Combat Tool");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.gridwidth = 3;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 0;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		lblNewLabel_9 = new JLabel("Party Size");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 0;
		gbc_lblNewLabel_9.gridy = 1;
		panel.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		slider = new JSlider();
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMinorTickSpacing(1);
		slider.setMinimum(1);
		slider.setMaximum(9);
		GridBagConstraints gbc_slider = new GridBagConstraints();
		gbc_slider.gridwidth = 2;
		gbc_slider.fill = GridBagConstraints.HORIZONTAL;
		gbc_slider.insets = new Insets(0, 0, 5, 0);
		gbc_slider.gridx = 1;
		gbc_slider.gridy = 1;
		panel.add(slider, gbc_slider);
		
		lblNewLabel = new JLabel("Name");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 2;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		lblInitiative = new JLabel("Initiative");
		GridBagConstraints gbc_lblInitiative = new GridBagConstraints();
		gbc_lblInitiative.insets = new Insets(0, 0, 5, 0);
		gbc_lblInitiative.gridx = 2;
		gbc_lblInitiative.gridy = 2;
		panel.add(lblInitiative, gbc_lblInitiative);
		
		JLabel plabel1 = new JLabel("Party 1");
		GridBagConstraints gbc_plabel1 = new GridBagConstraints();
		gbc_plabel1.anchor = GridBagConstraints.EAST;
		gbc_plabel1.insets = new Insets(0, 0, 5, 5);
		gbc_plabel1.gridx = 0;
		gbc_plabel1.gridy = 3;
		panel.add(plabel1, gbc_plabel1);
		
		name1 = new JTextField();
		name1.setToolTipText("");
		name1.setText("");
		name1.setColumns(10);
		GridBagConstraints gbc_name1 = new GridBagConstraints();
		gbc_name1.fill = GridBagConstraints.HORIZONTAL;
		gbc_name1.anchor = GridBagConstraints.NORTH;
		gbc_name1.insets = new Insets(0, 0, 5, 5);
		gbc_name1.gridx = 1;
		gbc_name1.gridy = 3;
		panel.add(name1, gbc_name1);
		
		init1 = new JTextField();
		init1.setToolTipText("0");
		init1.setText("0");
		init1.setColumns(10);
		GridBagConstraints gbc_init1 = new GridBagConstraints();
		gbc_init1.fill = GridBagConstraints.HORIZONTAL;
		gbc_init1.anchor = GridBagConstraints.NORTH;
		gbc_init1.insets = new Insets(0, 0, 5, 0);
		gbc_init1.gridx = 2;
		gbc_init1.gridy = 3;
		panel.add(init1, gbc_init1);
		
		JLabel plabel2 = new JLabel("Party 2");
		GridBagConstraints gbc_plabel2 = new GridBagConstraints();
		gbc_plabel2.anchor = GridBagConstraints.EAST;
		gbc_plabel2.insets = new Insets(0, 0, 5, 5);
		gbc_plabel2.gridx = 0;
		gbc_plabel2.gridy = 4;
		panel.add(plabel2, gbc_plabel2);
		
		name2 = new JTextField();
		name2.setToolTipText("");
		name2.setText("");
		name2.setColumns(10);
		GridBagConstraints gbc_name2 = new GridBagConstraints();
		gbc_name2.fill = GridBagConstraints.HORIZONTAL;
		gbc_name2.anchor = GridBagConstraints.NORTH;
		gbc_name2.insets = new Insets(0, 0, 5, 5);
		gbc_name2.gridx = 1;
		gbc_name2.gridy = 4;
		panel.add(name2, gbc_name2);
		
		init2 = new JTextField();
		init2.setToolTipText("0");
		init2.setText("0");
		init2.setColumns(10);
		GridBagConstraints gbc_init2 = new GridBagConstraints();
		gbc_init2.fill = GridBagConstraints.HORIZONTAL;
		gbc_init2.anchor = GridBagConstraints.NORTH;
		gbc_init2.insets = new Insets(0, 0, 5, 0);
		gbc_init2.gridx = 2;
		gbc_init2.gridy = 4;
		panel.add(init2, gbc_init2);
		
		JLabel plabel3 = new JLabel("Party 3");
		GridBagConstraints gbc_plabel3 = new GridBagConstraints();
		gbc_plabel3.anchor = GridBagConstraints.EAST;
		gbc_plabel3.insets = new Insets(0, 0, 5, 5);
		gbc_plabel3.gridx = 0;
		gbc_plabel3.gridy = 5;
		panel.add(plabel3, gbc_plabel3);
		
		name3 = new JTextField();
		name3.setToolTipText("");
		name3.setText("");
		name3.setColumns(10);
		GridBagConstraints gbc_name3 = new GridBagConstraints();
		gbc_name3.fill = GridBagConstraints.HORIZONTAL;
		gbc_name3.anchor = GridBagConstraints.NORTH;
		gbc_name3.insets = new Insets(0, 0, 5, 5);
		gbc_name3.gridx = 1;
		gbc_name3.gridy = 5;
		panel.add(name3, gbc_name3);
		
		init3 = new JTextField();
		init3.setToolTipText("0");
		init3.setText("0");
		init3.setColumns(10);
		GridBagConstraints gbc_init3 = new GridBagConstraints();
		gbc_init3.fill = GridBagConstraints.HORIZONTAL;
		gbc_init3.anchor = GridBagConstraints.NORTH;
		gbc_init3.insets = new Insets(0, 0, 5, 0);
		gbc_init3.gridx = 2;
		gbc_init3.gridy = 5;
		panel.add(init3, gbc_init3);
		
		plabel4 = new JLabel("Party 4");
		GridBagConstraints gbc_plabel4 = new GridBagConstraints();
		gbc_plabel4.anchor = GridBagConstraints.EAST;
		gbc_plabel4.insets = new Insets(0, 0, 5, 5);
		gbc_plabel4.gridx = 0;
		gbc_plabel4.gridy = 6;
		panel.add(plabel4, gbc_plabel4);
		
		name4 = new JTextField();
		name4.setToolTipText("");
		name4.setText("");
		name4.setColumns(10);
		GridBagConstraints gbc_name4 = new GridBagConstraints();
		gbc_name4.fill = GridBagConstraints.HORIZONTAL;
		gbc_name4.anchor = GridBagConstraints.NORTH;
		gbc_name4.insets = new Insets(0, 0, 5, 5);
		gbc_name4.gridx = 1;
		gbc_name4.gridy = 6;
		panel.add(name4, gbc_name4);
		
		init4 = new JTextField();
		init4.setToolTipText("0");
		init4.setText("0");
		init4.setColumns(10);
		GridBagConstraints gbc_init4 = new GridBagConstraints();
		gbc_init4.fill = GridBagConstraints.HORIZONTAL;
		gbc_init4.anchor = GridBagConstraints.NORTH;
		gbc_init4.insets = new Insets(0, 0, 5, 0);
		gbc_init4.gridx = 2;
		gbc_init4.gridy = 6;
		panel.add(init4, gbc_init4);
		
		plabel5 = new JLabel("Party 5");
		GridBagConstraints gbc_plabel5 = new GridBagConstraints();
		gbc_plabel5.anchor = GridBagConstraints.EAST;
		gbc_plabel5.insets = new Insets(0, 0, 5, 5);
		gbc_plabel5.gridx = 0;
		gbc_plabel5.gridy = 7;
		panel.add(plabel5, gbc_plabel5);
		
		name5 = new JTextField();
		name5.setToolTipText("");
		name5.setText("");
		name5.setColumns(10);
		GridBagConstraints gbc_name5 = new GridBagConstraints();
		gbc_name5.fill = GridBagConstraints.HORIZONTAL;
		gbc_name5.anchor = GridBagConstraints.NORTH;
		gbc_name5.insets = new Insets(0, 0, 5, 5);
		gbc_name5.gridx = 1;
		gbc_name5.gridy = 7;
		panel.add(name5, gbc_name5);
		
		init5 = new JTextField();
		init5.setToolTipText("0");
		init5.setText("0");
		init5.setColumns(10);
		GridBagConstraints gbc_init5 = new GridBagConstraints();
		gbc_init5.fill = GridBagConstraints.HORIZONTAL;
		gbc_init5.anchor = GridBagConstraints.NORTH;
		gbc_init5.insets = new Insets(0, 0, 5, 0);
		gbc_init5.gridx = 2;
		gbc_init5.gridy = 7;
		panel.add(init5, gbc_init5);
		
		plabel6 = new JLabel("Party 6");
		GridBagConstraints gbc_plabel6 = new GridBagConstraints();
		gbc_plabel6.anchor = GridBagConstraints.EAST;
		gbc_plabel6.insets = new Insets(0, 0, 5, 5);
		gbc_plabel6.gridx = 0;
		gbc_plabel6.gridy = 8;
		panel.add(plabel6, gbc_plabel6);
		
		name6 = new JTextField();
		name6.setToolTipText("");
		name6.setText("");
		name6.setColumns(10);
		GridBagConstraints gbc_name6 = new GridBagConstraints();
		gbc_name6.fill = GridBagConstraints.HORIZONTAL;
		gbc_name6.anchor = GridBagConstraints.NORTH;
		gbc_name6.insets = new Insets(0, 0, 5, 5);
		gbc_name6.gridx = 1;
		gbc_name6.gridy = 8;
		panel.add(name6, gbc_name6);
		
		init6 = new JTextField();
		init6.setToolTipText("0");
		init6.setText("0");
		init6.setColumns(10);
		GridBagConstraints gbc_init6 = new GridBagConstraints();
		gbc_init6.fill = GridBagConstraints.HORIZONTAL;
		gbc_init6.anchor = GridBagConstraints.NORTH;
		gbc_init6.insets = new Insets(0, 0, 5, 0);
		gbc_init6.gridx = 2;
		gbc_init6.gridy = 8;
		panel.add(init6, gbc_init6);
		
		plabel7 = new JLabel("Party 7");
		GridBagConstraints gbc_plabel7 = new GridBagConstraints();
		gbc_plabel7.anchor = GridBagConstraints.EAST;
		gbc_plabel7.insets = new Insets(0, 0, 5, 5);
		gbc_plabel7.gridx = 0;
		gbc_plabel7.gridy = 9;
		panel.add(plabel7, gbc_plabel7);
		
		name7 = new JTextField();
		name7.setToolTipText("");
		name7.setText("");
		name7.setColumns(10);
		GridBagConstraints gbc_name7 = new GridBagConstraints();
		gbc_name7.fill = GridBagConstraints.HORIZONTAL;
		gbc_name7.anchor = GridBagConstraints.NORTH;
		gbc_name7.insets = new Insets(0, 0, 5, 5);
		gbc_name7.gridx = 1;
		gbc_name7.gridy = 9;
		panel.add(name7, gbc_name7);
		
		init7 = new JTextField();
		init7.setToolTipText("0");
		init7.setText("0");
		init7.setColumns(10);
		GridBagConstraints gbc_init7 = new GridBagConstraints();
		gbc_init7.fill = GridBagConstraints.HORIZONTAL;
		gbc_init7.anchor = GridBagConstraints.NORTH;
		gbc_init7.insets = new Insets(0, 0, 5, 0);
		gbc_init7.gridx = 2;
		gbc_init7.gridy = 9;
		panel.add(init7, gbc_init7);
		
		plabel8 = new JLabel("Party 8");
		GridBagConstraints gbc_plabel8 = new GridBagConstraints();
		gbc_plabel8.anchor = GridBagConstraints.EAST;
		gbc_plabel8.insets = new Insets(0, 0, 5, 5);
		gbc_plabel8.gridx = 0;
		gbc_plabel8.gridy = 10;
		panel.add(plabel8, gbc_plabel8);
		
		name8 = new JTextField();
		name8.setToolTipText("");
		name8.setText("");
		name8.setColumns(10);
		GridBagConstraints gbc_name8 = new GridBagConstraints();
		gbc_name8.fill = GridBagConstraints.HORIZONTAL;
		gbc_name8.anchor = GridBagConstraints.NORTH;
		gbc_name8.insets = new Insets(0, 0, 5, 5);
		gbc_name8.gridx = 1;
		gbc_name8.gridy = 10;
		panel.add(name8, gbc_name8);
		
		init8 = new JTextField();
		init8.setToolTipText("0");
		init8.setText("0");
		init8.setColumns(10);
		GridBagConstraints gbc_init8 = new GridBagConstraints();
		gbc_init8.fill = GridBagConstraints.HORIZONTAL;
		gbc_init8.anchor = GridBagConstraints.NORTH;
		gbc_init8.insets = new Insets(0, 0, 5, 0);
		gbc_init8.gridx = 2;
		gbc_init8.gridy = 10;
		panel.add(init8, gbc_init8);
		
		plabel9 = new JLabel("Party 9");
		GridBagConstraints gbc_plabel9 = new GridBagConstraints();
		gbc_plabel9.anchor = GridBagConstraints.EAST;
		gbc_plabel9.insets = new Insets(0, 0, 5, 5);
		gbc_plabel9.gridx = 0;
		gbc_plabel9.gridy = 11;
		panel.add(plabel9, gbc_plabel9);
		
		name9 = new JTextField();
		name9.setToolTipText("");
		name9.setText("");
		name9.setColumns(10);
		GridBagConstraints gbc_name9 = new GridBagConstraints();
		gbc_name9.fill = GridBagConstraints.HORIZONTAL;
		gbc_name9.anchor = GridBagConstraints.NORTH;
		gbc_name9.insets = new Insets(0, 0, 5, 5);
		gbc_name9.gridx = 1;
		gbc_name9.gridy = 11;
		panel.add(name9, gbc_name9);
		
		init9 = new JTextField();
		init9.setToolTipText("0");
		init9.setText("0");
		init9.setColumns(10);
		GridBagConstraints gbc_init9 = new GridBagConstraints();
		gbc_init9.insets = new Insets(0, 0, 5, 0);
		gbc_init9.fill = GridBagConstraints.HORIZONTAL;
		gbc_init9.anchor = GridBagConstraints.NORTH;
		gbc_init9.gridx = 2;
		gbc_init9.gridy = 11;
		panel.add(init9, gbc_init9);
		
		rigidArea = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea = new GridBagConstraints();
		gbc_rigidArea.insets = new Insets(0, 0, 0, 5);
		gbc_rigidArea.gridx = 0;
		gbc_rigidArea.gridy = 12;
		panel.add(rigidArea, gbc_rigidArea);
		
		verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 0, 5);
		gbc_verticalStrut.gridx = 1;
		gbc_verticalStrut.gridy = 12;
		panel.add(verticalStrut, gbc_verticalStrut);
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{75, 100, 100, 0};
		gbl_panel_2.rowHeights = new int[]{28, 0, 20, 20, 20, 20, 20, 20, 20, 20, 20, 22, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		lblNewLabel_10 = new JLabel("Enemies");
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10.gridx = 0;
		gbc_lblNewLabel_10.gridy = 0;
		panel_2.add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		slider_1 = new JSlider();
		
		
		slider_1.setSnapToTicks(true);
		slider_1.setPaintTicks(true);
		slider_1.setPaintLabels(true);
		slider_1.setMinorTickSpacing(1);
		slider_1.setMinimum(1);
		slider_1.setMaximum(9);
		GridBagConstraints gbc_slider_1 = new GridBagConstraints();
		gbc_slider_1.gridwidth = 2;
		gbc_slider_1.fill = GridBagConstraints.BOTH;
		gbc_slider_1.insets = new Insets(0, 0, 5, 0);
		gbc_slider_1.gridx = 1;
		gbc_slider_1.gridy = 0;
		panel_2.add(slider_1, gbc_slider_1);
		
		lblNewLabel_1 = new JLabel("Name");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		panel_2.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		lblDexMod = new JLabel("Dex Mod");
		GridBagConstraints gbc_lblDexMod = new GridBagConstraints();
		gbc_lblDexMod.insets = new Insets(0, 0, 5, 0);
		gbc_lblDexMod.gridx = 2;
		gbc_lblDexMod.gridy = 1;
		panel_2.add(lblDexMod, gbc_lblDexMod);
		
		elabel1 = new JLabel("Enemy 1");
		GridBagConstraints gbc_elabel1 = new GridBagConstraints();
		gbc_elabel1.anchor = GridBagConstraints.EAST;
		gbc_elabel1.insets = new Insets(0, 0, 5, 5);
		gbc_elabel1.gridx = 0;
		gbc_elabel1.gridy = 2;
		panel_2.add(elabel1, gbc_elabel1);
		
		enemyName1 = new JTextField();
		enemyName1.setToolTipText("");
		enemyName1.setText("");
		enemyName1.setColumns(10);
		GridBagConstraints gbc_enemyName1 = new GridBagConstraints();
		gbc_enemyName1.anchor = GridBagConstraints.NORTH;
		gbc_enemyName1.fill = GridBagConstraints.HORIZONTAL;
		gbc_enemyName1.insets = new Insets(0, 0, 5, 5);
		gbc_enemyName1.gridx = 1;
		gbc_enemyName1.gridy = 2;
		panel_2.add(enemyName1, gbc_enemyName1);
		
		enemyInit1 = new JTextField();
		enemyInit1.setToolTipText("0");
		enemyInit1.setText("0");
		enemyInit1.setColumns(10);
		GridBagConstraints gbc_enemyInit1 = new GridBagConstraints();
		gbc_enemyInit1.fill = GridBagConstraints.HORIZONTAL;
		gbc_enemyInit1.anchor = GridBagConstraints.NORTH;
		gbc_enemyInit1.insets = new Insets(0, 0, 5, 0);
		gbc_enemyInit1.gridx = 2;
		gbc_enemyInit1.gridy = 2;
		panel_2.add(enemyInit1, gbc_enemyInit1);
		
		elabel2 = new JLabel("Enemy 2");
		GridBagConstraints gbc_elabel2 = new GridBagConstraints();
		gbc_elabel2.anchor = GridBagConstraints.EAST;
		gbc_elabel2.insets = new Insets(0, 0, 5, 5);
		gbc_elabel2.gridx = 0;
		gbc_elabel2.gridy = 3;
		panel_2.add(elabel2, gbc_elabel2);
		
		enemyName2 = new JTextField();
		enemyName2.setToolTipText("");
		enemyName2.setText("");
		enemyName2.setColumns(10);
		GridBagConstraints gbc_enemyName2 = new GridBagConstraints();
		gbc_enemyName2.anchor = GridBagConstraints.NORTH;
		gbc_enemyName2.fill = GridBagConstraints.HORIZONTAL;
		gbc_enemyName2.insets = new Insets(0, 0, 5, 5);
		gbc_enemyName2.gridx = 1;
		gbc_enemyName2.gridy = 3;
		panel_2.add(enemyName2, gbc_enemyName2);
		
		enemyInit2 = new JTextField();
		enemyInit2.setToolTipText("0");
		enemyInit2.setText("0");
		enemyInit2.setColumns(10);
		GridBagConstraints gbc_enemyInit2 = new GridBagConstraints();
		gbc_enemyInit2.fill = GridBagConstraints.HORIZONTAL;
		gbc_enemyInit2.anchor = GridBagConstraints.NORTH;
		gbc_enemyInit2.insets = new Insets(0, 0, 5, 0);
		gbc_enemyInit2.gridx = 2;
		gbc_enemyInit2.gridy = 3;
		panel_2.add(enemyInit2, gbc_enemyInit2);
		
		elabel3 = new JLabel("Enemy 3");
		GridBagConstraints gbc_elabel3 = new GridBagConstraints();
		gbc_elabel3.anchor = GridBagConstraints.EAST;
		gbc_elabel3.insets = new Insets(0, 0, 5, 5);
		gbc_elabel3.gridx = 0;
		gbc_elabel3.gridy = 4;
		panel_2.add(elabel3, gbc_elabel3);
		
		enemyName3 = new JTextField();
		enemyName3.setToolTipText("");
		enemyName3.setText("");
		enemyName3.setColumns(10);
		GridBagConstraints gbc_enemyName3 = new GridBagConstraints();
		gbc_enemyName3.anchor = GridBagConstraints.NORTH;
		gbc_enemyName3.fill = GridBagConstraints.HORIZONTAL;
		gbc_enemyName3.insets = new Insets(0, 0, 5, 5);
		gbc_enemyName3.gridx = 1;
		gbc_enemyName3.gridy = 4;
		panel_2.add(enemyName3, gbc_enemyName3);
		
		enemyInit3 = new JTextField();
		enemyInit3.setToolTipText("0");
		enemyInit3.setText("0");
		enemyInit3.setColumns(10);
		GridBagConstraints gbc_enemyInit3 = new GridBagConstraints();
		gbc_enemyInit3.fill = GridBagConstraints.HORIZONTAL;
		gbc_enemyInit3.anchor = GridBagConstraints.NORTH;
		gbc_enemyInit3.insets = new Insets(0, 0, 5, 0);
		gbc_enemyInit3.gridx = 2;
		gbc_enemyInit3.gridy = 4;
		panel_2.add(enemyInit3, gbc_enemyInit3);
		
		elabel4 = new JLabel("Enemy 4");
		GridBagConstraints gbc_elabel4 = new GridBagConstraints();
		gbc_elabel4.anchor = GridBagConstraints.EAST;
		gbc_elabel4.insets = new Insets(0, 0, 5, 5);
		gbc_elabel4.gridx = 0;
		gbc_elabel4.gridy = 5;
		panel_2.add(elabel4, gbc_elabel4);
		
		enemyName4 = new JTextField();
		enemyName4.setToolTipText("");
		enemyName4.setText("");
		enemyName4.setColumns(10);
		GridBagConstraints gbc_enemyName4 = new GridBagConstraints();
		gbc_enemyName4.anchor = GridBagConstraints.NORTH;
		gbc_enemyName4.fill = GridBagConstraints.HORIZONTAL;
		gbc_enemyName4.insets = new Insets(0, 0, 5, 5);
		gbc_enemyName4.gridx = 1;
		gbc_enemyName4.gridy = 5;
		panel_2.add(enemyName4, gbc_enemyName4);
		
		enemyInit4 = new JTextField();
		enemyInit4.setToolTipText("0");
		enemyInit4.setText("0");
		enemyInit4.setColumns(10);
		GridBagConstraints gbc_enemyInit4 = new GridBagConstraints();
		gbc_enemyInit4.fill = GridBagConstraints.HORIZONTAL;
		gbc_enemyInit4.anchor = GridBagConstraints.NORTH;
		gbc_enemyInit4.insets = new Insets(0, 0, 5, 0);
		gbc_enemyInit4.gridx = 2;
		gbc_enemyInit4.gridy = 5;
		panel_2.add(enemyInit4, gbc_enemyInit4);
		
		elabel5 = new JLabel("Enemy 5");
		GridBagConstraints gbc_elabel5 = new GridBagConstraints();
		gbc_elabel5.anchor = GridBagConstraints.EAST;
		gbc_elabel5.insets = new Insets(0, 0, 5, 5);
		gbc_elabel5.gridx = 0;
		gbc_elabel5.gridy = 6;
		panel_2.add(elabel5, gbc_elabel5);
		
		enemyName5 = new JTextField();
		enemyName5.setToolTipText("");
		enemyName5.setText("");
		enemyName5.setColumns(10);
		GridBagConstraints gbc_enemyName5 = new GridBagConstraints();
		gbc_enemyName5.anchor = GridBagConstraints.NORTH;
		gbc_enemyName5.fill = GridBagConstraints.HORIZONTAL;
		gbc_enemyName5.insets = new Insets(0, 0, 5, 5);
		gbc_enemyName5.gridx = 1;
		gbc_enemyName5.gridy = 6;
		panel_2.add(enemyName5, gbc_enemyName5);
		
		enemyInit5 = new JTextField();
		enemyInit5.setToolTipText("0");
		enemyInit5.setText("0");
		enemyInit5.setColumns(10);
		GridBagConstraints gbc_enemyInit5 = new GridBagConstraints();
		gbc_enemyInit5.fill = GridBagConstraints.HORIZONTAL;
		gbc_enemyInit5.anchor = GridBagConstraints.NORTH;
		gbc_enemyInit5.insets = new Insets(0, 0, 5, 0);
		gbc_enemyInit5.gridx = 2;
		gbc_enemyInit5.gridy = 6;
		panel_2.add(enemyInit5, gbc_enemyInit5);
		
		elabel6 = new JLabel("Enemy 6");
		GridBagConstraints gbc_elabel6 = new GridBagConstraints();
		gbc_elabel6.anchor = GridBagConstraints.EAST;
		gbc_elabel6.insets = new Insets(0, 0, 5, 5);
		gbc_elabel6.gridx = 0;
		gbc_elabel6.gridy = 7;
		panel_2.add(elabel6, gbc_elabel6);
		
		enemyName6 = new JTextField();
		enemyName6.setToolTipText("");
		enemyName6.setText("");
		enemyName6.setColumns(10);
		GridBagConstraints gbc_enemyName6 = new GridBagConstraints();
		gbc_enemyName6.anchor = GridBagConstraints.NORTH;
		gbc_enemyName6.fill = GridBagConstraints.HORIZONTAL;
		gbc_enemyName6.insets = new Insets(0, 0, 5, 5);
		gbc_enemyName6.gridx = 1;
		gbc_enemyName6.gridy = 7;
		panel_2.add(enemyName6, gbc_enemyName6);
		
		enemyInit6 = new JTextField();
		enemyInit6.setToolTipText("0");
		enemyInit6.setText("0");
		enemyInit6.setColumns(10);
		GridBagConstraints gbc_enemyInit6 = new GridBagConstraints();
		gbc_enemyInit6.fill = GridBagConstraints.HORIZONTAL;
		gbc_enemyInit6.anchor = GridBagConstraints.NORTH;
		gbc_enemyInit6.insets = new Insets(0, 0, 5, 0);
		gbc_enemyInit6.gridx = 2;
		gbc_enemyInit6.gridy = 7;
		panel_2.add(enemyInit6, gbc_enemyInit6);
		
		elabel7 = new JLabel("Enemy 7");
		GridBagConstraints gbc_elabel7 = new GridBagConstraints();
		gbc_elabel7.anchor = GridBagConstraints.EAST;
		gbc_elabel7.insets = new Insets(0, 0, 5, 5);
		gbc_elabel7.gridx = 0;
		gbc_elabel7.gridy = 8;
		panel_2.add(elabel7, gbc_elabel7);
		
		enemyName7 = new JTextField();
		enemyName7.setToolTipText("");
		enemyName7.setText("");
		enemyName7.setColumns(10);
		GridBagConstraints gbc_enemyName7 = new GridBagConstraints();
		gbc_enemyName7.anchor = GridBagConstraints.NORTH;
		gbc_enemyName7.fill = GridBagConstraints.HORIZONTAL;
		gbc_enemyName7.insets = new Insets(0, 0, 5, 5);
		gbc_enemyName7.gridx = 1;
		gbc_enemyName7.gridy = 8;
		panel_2.add(enemyName7, gbc_enemyName7);
		
		enemyInit7 = new JTextField();
		enemyInit7.setToolTipText("0");
		enemyInit7.setText("0");
		enemyInit7.setColumns(10);
		GridBagConstraints gbc_enemyInit7 = new GridBagConstraints();
		gbc_enemyInit7.fill = GridBagConstraints.HORIZONTAL;
		gbc_enemyInit7.anchor = GridBagConstraints.NORTH;
		gbc_enemyInit7.insets = new Insets(0, 0, 5, 0);
		gbc_enemyInit7.gridx = 2;
		gbc_enemyInit7.gridy = 8;
		panel_2.add(enemyInit7, gbc_enemyInit7);
		
		elabel8 = new JLabel("Enemy 8");
		GridBagConstraints gbc_elabel8 = new GridBagConstraints();
		gbc_elabel8.anchor = GridBagConstraints.EAST;
		gbc_elabel8.insets = new Insets(0, 0, 5, 5);
		gbc_elabel8.gridx = 0;
		gbc_elabel8.gridy = 9;
		panel_2.add(elabel8, gbc_elabel8);
		
		enemyName8 = new JTextField();
		enemyName8.setToolTipText("");
		enemyName8.setText("");
		enemyName8.setColumns(10);
		GridBagConstraints gbc_enemyName8 = new GridBagConstraints();
		gbc_enemyName8.anchor = GridBagConstraints.NORTH;
		gbc_enemyName8.fill = GridBagConstraints.HORIZONTAL;
		gbc_enemyName8.insets = new Insets(0, 0, 5, 5);
		gbc_enemyName8.gridx = 1;
		gbc_enemyName8.gridy = 9;
		panel_2.add(enemyName8, gbc_enemyName8);
		
		enemyInit8 = new JTextField();
		enemyInit8.setToolTipText("0");
		enemyInit8.setText("0");
		enemyInit8.setColumns(10);
		GridBagConstraints gbc_enemyInit8 = new GridBagConstraints();
		gbc_enemyInit8.fill = GridBagConstraints.HORIZONTAL;
		gbc_enemyInit8.anchor = GridBagConstraints.NORTH;
		gbc_enemyInit8.insets = new Insets(0, 0, 5, 0);
		gbc_enemyInit8.gridx = 2;
		gbc_enemyInit8.gridy = 9;
		panel_2.add(enemyInit8, gbc_enemyInit8);
		
		elabel9 = new JLabel("Enemy 9");
		GridBagConstraints gbc_elabel9 = new GridBagConstraints();
		gbc_elabel9.anchor = GridBagConstraints.EAST;
		gbc_elabel9.insets = new Insets(0, 0, 5, 5);
		gbc_elabel9.gridx = 0;
		gbc_elabel9.gridy = 10;
		panel_2.add(elabel9, gbc_elabel9);
		
		EnemyName9 = new JTextField();
		EnemyName9.setToolTipText("");
		EnemyName9.setText("");
		EnemyName9.setColumns(10);
		GridBagConstraints gbc_EnemyName9 = new GridBagConstraints();
		gbc_EnemyName9.anchor = GridBagConstraints.NORTH;
		gbc_EnemyName9.fill = GridBagConstraints.HORIZONTAL;
		gbc_EnemyName9.insets = new Insets(0, 0, 5, 5);
		gbc_EnemyName9.gridx = 1;
		gbc_EnemyName9.gridy = 10;
		panel_2.add(EnemyName9, gbc_EnemyName9);
		
		enemyInit9 = new JTextField();
		enemyInit9.setToolTipText("0");
		enemyInit9.setText("0");
		enemyInit9.setColumns(10);
		GridBagConstraints gbc_enemyInit9 = new GridBagConstraints();
		gbc_enemyInit9.fill = GridBagConstraints.HORIZONTAL;
		gbc_enemyInit9.anchor = GridBagConstraints.NORTH;
		gbc_enemyInit9.insets = new Insets(0, 0, 5, 0);
		gbc_enemyInit9.gridx = 2;
		gbc_enemyInit9.gridy = 10;
		panel_2.add(enemyInit9, gbc_enemyInit9);
		
		verticalStrut_1 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_1 = new GridBagConstraints();
		gbc_verticalStrut_1.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_1.gridx = 2;
		gbc_verticalStrut_1.gridy = 11;
		panel_2.add(verticalStrut_1, gbc_verticalStrut_1);
		
		resetButton = new JButton("Reset All");
		resetButton.setForeground(SystemColor.controlLtHighlight);
		resetButton.setBackground(SystemColor.textHighlight);
		
		GridBagConstraints gbc_resetButton = new GridBagConstraints();
		gbc_resetButton.anchor = GridBagConstraints.EAST;
		gbc_resetButton.insets = new Insets(0, 0, 5, 5);
		gbc_resetButton.gridx = 1;
		gbc_resetButton.gridy = 12;
		panel_2.add(resetButton, gbc_resetButton);
		
		btnNewButton_2 = new JButton("Go");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton_2.gridx = 2;
		gbc_btnNewButton_2.gridy = 12;
		panel_2.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JTextField [] pInit = {init1, init2, init3, init4, init5, init6, init7, init8, init9};
		JTextField [] pName = {name1, name2, name3, name4, name5, name6, name7, name8, name9};
		JLabel [] pLabel = {plabel1, plabel2, plabel3, plabel4, plabel5, plabel6, plabel7, plabel8, plabel9};
		JTextField [] eInit = {enemyInit1, enemyInit2, enemyInit3, enemyInit4, enemyInit5, enemyInit6, enemyInit7, enemyInit8, enemyInit9};
		JTextField [] eName = {enemyName1, enemyName2, enemyName3, enemyName4, enemyName5, enemyName6, enemyName7, enemyName8, EnemyName9};
		JLabel [] eLabel = {elabel1, elabel2, elabel3, elabel4, elabel5, elabel6, elabel7, elabel8, elabel9};
		
		
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			for(int i=0; i<9; i++) {
				pInit[i].setText("0");
				pName[i].setText("");
				pLabel[i].setText("Party "+(i+1));
			}
			for(int i=0; i<9; i++) {
				eInit[i].setText("0");
				eName[i].setText("");
				eLabel[i].setText("Enemy "+(i+1));
			}
	
			}
		});
		
		
		slider_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(slider_1.getValue()<enemyCount) {
					for(int i=slider_1.getValue(); i<9; i++) {
						eInit[i].setVisible(false);
						eName[i].setVisible(false);
						eLabel[i].setVisible(false);
					}
					enemyCount=slider_1.getValue();
				}
				
				if(slider_1.getValue()>enemyCount) {
					for(int i = enemyCount; i<slider_1.getValue(); i++) {
						eInit[i].setVisible(true);
						eName[i].setVisible(true);
						eLabel[i].setVisible(true);
					}
					enemyCount=slider_1.getValue();
				}
			}
		});
		
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(slider.getValue()<partyCount) {
					for(int i=slider.getValue(); i<9; i++) {
						pInit[i].setVisible(false);
						pName[i].setVisible(false);
						pLabel[i].setVisible(false);
					}
					partyCount=slider.getValue();
				}
				
				if(slider.getValue()>partyCount) {
					for(int i = partyCount; i<slider.getValue(); i++) {
						pInit[i].setVisible(true);
						pName[i].setVisible(true);
						pLabel[i].setVisible(true);
					}
					partyCount=slider.getValue();
				}
			}
		});
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Pair> rolls = new ArrayList<Pair>();
				for(int i=0; i<enemyCount; i++) {
					Random rand = new Random();
					int roll= rand.nextInt((20 - 1) + 1) + 1;
					if(!eName[i].getText().equals("")){
						rolls.add(new Pair(eName[i].getText(), roll+ Integer.parseInt(eInit[i].getText())));
					}
				}
				for(int i=0; i<partyCount; i++) {
					if(!pName[i].getText().equals("")){
						rolls.add(new Pair(pName[i].getText(), Integer.parseInt(pInit[i].getText())));
					}
				}
				
				int i, j;

			    for (i = 1; i < rolls.size(); i++) {
			        Pair key = new Pair("", 0);
			        key.setInit(rolls.get(i).getInit());
			        key.setName(rolls.get(i).getName());
			        j = i;
			        while((j > 0) && (rolls.get(j - 1).getInit()< key.getInit())) {
			            rolls.set(j, rolls.get(j - 1));
			            j--;
			        }
			        rolls.set(j,key);
			    }
			    
			    String turns=null;
			    for(Pair x: rolls) {
			    	turns+=x.getName()+" ("+x.getInit()+")\n";
			    }
			    if(rolls.size()==0) {
			    	turns="No players rolling initiative.";
			    }
			    
			    JOptionPane.showMessageDialog(frame, turns);
			}
		});
		
		
		
	}
	
}
