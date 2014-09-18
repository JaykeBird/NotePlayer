package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import net.miginfocom.swing.MigLayout;

import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;

import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Options extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private class ChangeKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			if (listening == true)
			{
				//System.out.println(e.getKeyChar());
				//System.out.println(e.getKeyCode());
				
				switch (key)
				{
				case KEY_A:
					lblAKey.setText(Integer.toString(e.getKeyCode()));
					lblAn.setText(Character.toString(e.getKeyChar()));
					break;
				case KEY_As:
					lblAsKey.setText(Integer.toString(e.getKeyCode()));
					lblAsn.setText(Character.toString(e.getKeyChar()));
					break;
				case KEY_B:
					lblBKey.setText(Integer.toString(e.getKeyCode()));
					lblBn.setText(Character.toString(e.getKeyChar()));
					break;
				case KEY_C:
					lblCKey.setText(Integer.toString(e.getKeyCode()));
					lblCn.setText(Character.toString(e.getKeyChar()));
					break;
				case KEY_Cs:
					lblCsKey.setText(Integer.toString(e.getKeyCode()));
					lblCsn.setText(Character.toString(e.getKeyChar()));
					break;
				case KEY_D:
					lblDKey.setText(Integer.toString(e.getKeyCode()));
					lblDn.setText(Character.toString(e.getKeyChar()));
					break;
				case KEY_Ds:
					lblDsKey.setText(Integer.toString(e.getKeyCode()));
					lblDsn.setText(Character.toString(e.getKeyChar()));
					break;
				case KEY_E:
					lblEKey.setText(Integer.toString(e.getKeyCode()));
					lblEn.setText(Character.toString(e.getKeyChar()));
					break;
				case KEY_F:
					lblFKey.setText(Integer.toString(e.getKeyCode()));
					lblFn.setText(Character.toString(e.getKeyChar()));
					break;
				case KEY_Fs:
					lblFsKey.setText(Integer.toString(e.getKeyCode()));
					lblFsn.setText(Character.toString(e.getKeyChar()));
					break;
				case KEY_G:
					lblGKey.setText(Integer.toString(e.getKeyCode()));
					lblGn.setText(Character.toString(e.getKeyChar()));
					break;
				case KEY_Gs:
					lblGsKey.setText(Integer.toString(e.getKeyCode()));
					lblGsn.setText(Character.toString(e.getKeyChar()));
					break;
				case KEY_Ao:
					lblAoKey.setText(Integer.toString(e.getKeyCode()));
					lblAon.setText(Character.toString(e.getKeyChar()));
					break;
				case KEY_Aso:
					lblAsoKey.setText(Integer.toString(e.getKeyCode()));
					lblAson.setText(Character.toString(e.getKeyChar()));
					break;
				case KEY_Bo:
					lblBoKey.setText(Integer.toString(e.getKeyCode()));
					lblBon.setText(Character.toString(e.getKeyChar()));
					break;
				case KEY_Co:
					lblCoKey.setText(Integer.toString(e.getKeyCode()));
					lblCon.setText(Character.toString(e.getKeyChar()));
					break;
				case KEY_Cso:
					lblCsoKey.setText(Integer.toString(e.getKeyCode()));
					lblCson.setText(Character.toString(e.getKeyChar()));
					break;
				case KEY_Do:
					lblDoKey.setText(Integer.toString(e.getKeyCode()));
					lblDon.setText(Character.toString(e.getKeyChar()));
					break;
				case KEY_Dso:
					lblDsoKey.setText(Integer.toString(e.getKeyCode()));
					lblDson.setText(Character.toString(e.getKeyChar()));
					break;
				case KEY_Eo:
					lblEoKey.setText(Integer.toString(e.getKeyCode()));
					lblEon.setText(Character.toString(e.getKeyChar()));
					break;
				case KEY_Fo:
					lblFoKey.setText(Integer.toString(e.getKeyCode()));
					lblFon.setText(Character.toString(e.getKeyChar()));
					break;
				case KEY_Fso:
					lblFsoKey.setText(Integer.toString(e.getKeyCode()));
					lblFson.setText(Character.toString(e.getKeyChar()));
					break;
				case KEY_Go:
					lblGoKey.setText(Integer.toString(e.getKeyCode()));
					lblGon.setText(Character.toString(e.getKeyChar()));
					break;
				case KEY_Gso:
					lblGsoKey.setText(Integer.toString(e.getKeyCode()));
					lblGson.setText(Character.toString(e.getKeyChar()));
					break;
				default:
					break;
					
				}
			
			listening = false;
			}
		}
	}

	private final JPanel contentPanel = new JPanel();
	
	public static JDialog OptDialog;

	public MainWindow parent;

	protected JLabel lblLow;

	protected JLabel lblVol;

	//protected JList list;
	protected JList<String> list;

	protected JScrollBar scrollBar;
	
	private enum KeyNames {
		KEY_C, KEY_Cs, KEY_D, KEY_Ds, KEY_E, KEY_F, KEY_Fs, KEY_G, KEY_Gs, KEY_A, KEY_As, KEY_B, KEY_Co, KEY_Cso, KEY_Do, KEY_Dso, KEY_Eo, KEY_Fo, KEY_Fso, 
		KEY_Go, KEY_Gso, KEY_Ao, KEY_Aso, KEY_Bo, O_DOWN, O_UP
	}
	
	protected boolean listening = false;
	protected KeyNames key = null;

	protected JLabel lblEKey;
	protected JLabel lblDsKey;
	protected JLabel lblDKey;
	protected JLabel lblCsKey;
	protected JLabel lblCKey;
	protected JLabel lblFKey;
	protected JLabel lblFsKey;
	protected JLabel lblGKey;
	protected JLabel lblGsKey;
	protected JLabel lblAKey;
	protected JLabel lblAsKey;
	protected JLabel lblBKey;
	
	protected JLabel lblCn;
	protected JLabel lblCsn;
	protected JLabel lblDn;
	protected JLabel lblDsn;
	protected JLabel lblEn;
	protected JLabel lblFn;
	protected JLabel lblFsn;
	protected JLabel lblGn;
	protected JLabel lblGsn;
	protected JLabel lblAn;
	protected JLabel lblAsn;
	protected JLabel lblBn;
	
	protected JButton btnSetCoKey;
	protected JButton btnSetCsoKey;
	protected JButton btnSetDoKey;
	protected JButton btnSetDsoKey;
	protected JButton btnSetEoKey;
	protected JButton btnSetFoKey;
	protected JButton btnSetFsoKey;
	protected JButton btnSetGoKey;
	protected JButton btnSetGsoKey;
	protected JButton btnSetAoKey;
	protected JButton btnSetAsoKey;
	protected JButton btnSetBoKey;
	protected JLabel lblCoKey;
	protected JLabel lblCsoKey;
	protected JLabel lblDoKey;
	protected JLabel lblDsoKey;
	protected JLabel lblEoKey;
	protected JLabel lblFoKey;
	protected JLabel lblFsoKey;
	protected JLabel lblGoKey;
	protected JLabel lblGsoKey;
	protected JLabel lblAoKey;
	protected JLabel lblAsoKey;
	protected JLabel lblBoKey;
	protected JLabel lblCon;
	protected JLabel lblCson;
	protected JLabel lblDon;
	protected JLabel lblDson;
	protected JLabel lblEon;
	protected JLabel lblFon;
	protected JLabel lblFson;
	protected JLabel lblGon;
	protected JLabel lblGson;
	protected JLabel lblAon;
	protected JLabel lblAson;
	protected JLabel lblBon;
	private JButton btnSetDownKey;
	private JLabel lblDownKey;
	private JLabel lblDownn;
	private JButton btnSetUpKey;
	private JLabel lblUpKey;
	private JLabel lblUpn;
	private JLabel lbldownOctave;
	private JLabel lblupOctave;
	
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		try {
//			Options dialog = new Options();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public Options() {
		setResizable(false);
		setTitle("Options");
		
		OptDialog = this;
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				
			}
		});
		setBounds(100, 100, 750, 450);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new MigLayout("", "[grow][grow]", "[grow]"));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, "cell 0 0,grow");
			panel.setLayout(null);
			
			JLabel lblKeys = new JLabel("Keys");
			lblKeys.setBounds(10, 11, 28, 14);
			panel.add(lblKeys);
			
			JButton btnSetCKey = new JButton("Set C Key");
			btnSetCKey.addKeyListener(new ChangeKeyListener());
			btnSetCKey.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					listening = true;
					key = KeyNames.KEY_C;
				}
			});
			btnSetCKey.setBounds(10, 40, 89, 23);
			panel.add(btnSetCKey);
			
			JButton button = new JButton("Set C# Key");
			button.addKeyListener(new ChangeKeyListener());
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					listening = true;
					key = KeyNames.KEY_Cs;
				}
			});
			button.setBounds(10, 63, 89, 23);
			panel.add(button);
			
			JButton button_1 = new JButton("Set D Key");
			button_1.addKeyListener(new ChangeKeyListener());
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					listening = true;
					key = KeyNames.KEY_D;
				}
			});
			button_1.setBounds(10, 86, 89, 23);
			panel.add(button_1);
			
			JButton btnSetDKey = new JButton("Set D# Key");
			btnSetDKey.addKeyListener(new ChangeKeyListener());
			btnSetDKey.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					listening = true;
					key = KeyNames.KEY_Ds;
				}
			});
			btnSetDKey.setBounds(10, 109, 89, 23);
			panel.add(btnSetDKey);
			
			JButton button_3 = new JButton("Set E Key");
			button_3.addKeyListener(new ChangeKeyListener());
			button_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					listening = true;
					key = KeyNames.KEY_E;
				}
			});
			button_3.setBounds(10, 132, 89, 23);
			panel.add(button_3);
			
			JButton btnSetFKey = new JButton("Set F Key");
			btnSetFKey.addKeyListener(new ChangeKeyListener());
			btnSetFKey.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					listening = true;
					key = KeyNames.KEY_F;
				}
			});
			btnSetFKey.setBounds(10, 155, 89, 23);
			panel.add(btnSetFKey);
			
			JButton btnSetFKey_1 = new JButton("Set F# Key");
			btnSetFKey_1.addKeyListener(new ChangeKeyListener());
			btnSetFKey_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					listening = true;
					key = KeyNames.KEY_Fs;
				}
			});
			btnSetFKey_1.setBounds(10, 179, 89, 23);
			panel.add(btnSetFKey_1);
			
			JButton button_6 = new JButton("Set G Key");
			button_6.addKeyListener(new ChangeKeyListener());
			button_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					listening = true;
					key = KeyNames.KEY_G;
				}
			});
			button_6.setBounds(10, 202, 89, 23);
			panel.add(button_6);
			
			JButton btnSetGKey = new JButton("Set G# Key");
			btnSetGKey.addKeyListener(new ChangeKeyListener());
			btnSetGKey.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					listening = true;
					key = KeyNames.KEY_Gs;
				}
			});
			btnSetGKey.setBounds(10, 225, 89, 23);
			panel.add(btnSetGKey);
			
			JButton btnSetAKey = new JButton("Set A Key");
			btnSetAKey.addKeyListener(new ChangeKeyListener());
			btnSetAKey.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					listening = true;
					key = KeyNames.KEY_A;
				}
			});
			btnSetAKey.setBounds(10, 248, 89, 23);
			panel.add(btnSetAKey);
			
			JButton btnSetAKey_1 = new JButton("Set A# Key");
			btnSetAKey_1.addKeyListener(new ChangeKeyListener());
			btnSetAKey_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					listening = true;
					key = KeyNames.KEY_As;
				}
			});
			btnSetAKey_1.setBounds(10, 271, 89, 23);
			panel.add(btnSetAKey_1);
			
			JButton btnSetBKey = new JButton("Set B Key");
			btnSetBKey.addKeyListener(new ChangeKeyListener());
			btnSetBKey.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					listening = true;
					key = KeyNames.KEY_B;
				}
			});
			btnSetBKey.setBounds(10, 294, 89, 23);
			panel.add(btnSetBKey);
			
			lblCKey = new JLabel(Integer.toString(MainWindow.key_C));
			lblCKey.setBounds(103, 44, 28, 14);
			panel.add(lblCKey);
			
			lblCsKey = new JLabel(Integer.toString(MainWindow.key_Cs));
			lblCsKey.setBounds(103, 67, 28, 14);
			panel.add(lblCsKey);
			
			lblDKey = new JLabel(Integer.toString(MainWindow.key_D));
			lblDKey.setBounds(103, 90, 28, 14);
			panel.add(lblDKey);
			
			lblDsKey = new JLabel(Integer.toString(MainWindow.key_Ds));
			lblDsKey.setBounds(103, 113, 28, 14);
			panel.add(lblDsKey);
			
			lblEKey = new JLabel(Integer.toString(MainWindow.key_E));
			lblEKey.setBounds(103, 136, 28, 14);
			panel.add(lblEKey);
			
			lblFKey = new JLabel(Integer.toString(MainWindow.key_F));
			lblFKey.setBounds(103, 159, 28, 14);
			panel.add(lblFKey);
			
			lblFsKey = new JLabel(Integer.toString(MainWindow.key_Fs));
			lblFsKey.setBounds(103, 183, 28, 14);
			panel.add(lblFsKey);
			
			lblGKey = new JLabel(Integer.toString(MainWindow.key_G));
			lblGKey.setBounds(103, 206, 28, 14);
			panel.add(lblGKey);
			
			lblGsKey = new JLabel(Integer.toString(MainWindow.key_Gs));
			lblGsKey.setBounds(103, 229, 28, 14);
			panel.add(lblGsKey);
			
			lblAKey = new JLabel(Integer.toString(MainWindow.key_A));
			lblAKey.setBounds(103, 252, 28, 14);
			panel.add(lblAKey);
			
			lblAsKey = new JLabel(Integer.toString(MainWindow.key_As));
			lblAsKey.setBounds(103, 275, 28, 14);
			panel.add(lblAsKey);
			
			lblBKey = new JLabel(Integer.toString(MainWindow.key_B));
			lblBKey.setBounds(103, 298, 28, 14);
			panel.add(lblBKey);
			
			lblCn = new JLabel(Character.toString((char) MainWindow.key_C));
			lblCn.setBounds(141, 44, 28, 14);
			panel.add(lblCn);
			
			lblCsn = new JLabel(Character.toString((char) MainWindow.key_Cs));
			lblCsn.setBounds(141, 67, 28, 14);
			panel.add(lblCsn);
			
			lblDn = new JLabel(Character.toString((char) MainWindow.key_D));
			lblDn.setBounds(141, 90, 28, 14);
			panel.add(lblDn);
			
			lblDsn = new JLabel(Character.toString((char) MainWindow.key_Ds));
			lblDsn.setBounds(141, 113, 28, 14);
			panel.add(lblDsn);
			
			lblEn = new JLabel(Character.toString((char) MainWindow.key_E));
			lblEn.setBounds(141, 136, 28, 14);
			panel.add(lblEn);
			
			lblFn = new JLabel(Character.toString((char) MainWindow.key_F));
			lblFn.setBounds(141, 159, 28, 14);
			panel.add(lblFn);
			
			lblFsn = new JLabel(Character.toString((char) MainWindow.key_Fs));
			lblFsn.setBounds(141, 183, 28, 14);
			panel.add(lblFsn);
			
			lblGn = new JLabel(Character.toString((char) MainWindow.key_G));
			lblGn.setBounds(141, 206, 28, 14);
			panel.add(lblGn);
			
			lblGsn = new JLabel(Character.toString((char) MainWindow.key_Gs));
			lblGsn.setBounds(141, 229, 28, 14);
			panel.add(lblGsn);
			
			lblAn = new JLabel(Character.toString((char) MainWindow.key_A));
			lblAn.setBounds(141, 252, 28, 14);
			panel.add(lblAn);
			
			lblAsn = new JLabel(Character.toString((char) MainWindow.key_As));
			lblAsn.setBounds(141, 275, 28, 14);
			panel.add(lblAsn);
			
			lblBn = new JLabel(Character.toString((char) MainWindow.key_B));
			lblBn.setBounds(141, 298, 28, 14);
			panel.add(lblBn);
			
			btnSetCoKey = new JButton("Set C Key 2");
			btnSetCoKey.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					listening = true;
					key = KeyNames.KEY_Co;
				}
			});
			btnSetCoKey.setBounds(179, 40, 97, 23);
			panel.add(btnSetCoKey);
			
			btnSetCsoKey = new JButton("Set C# Key 2");
			btnSetCsoKey.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					listening = true;
					key = KeyNames.KEY_Cso;
				}
			});
			btnSetCsoKey.setBounds(179, 63, 97, 23);
			panel.add(btnSetCsoKey);
			
			btnSetDoKey = new JButton("Set D Key 2");
			btnSetDoKey.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					listening = true;
					key = KeyNames.KEY_Do;
				}
			});
			btnSetDoKey.setBounds(179, 86, 97, 23);
			panel.add(btnSetDoKey);
			
			btnSetDsoKey = new JButton("Set D# Key 2");
			btnSetDsoKey.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					listening = true;
					key = KeyNames.KEY_Dso;
				}
			});
			btnSetDsoKey.setBounds(179, 109, 97, 23);
			panel.add(btnSetDsoKey);
			
			btnSetEoKey = new JButton("Set E Key 2");
			btnSetEoKey.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					listening = true;
					key = KeyNames.KEY_Eo;
				}
			});
			btnSetEoKey.setBounds(179, 132, 97, 23);
			panel.add(btnSetEoKey);
			
			btnSetFoKey = new JButton("Set F Key 2");
			btnSetFoKey.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					listening = true;
					key = KeyNames.KEY_Fo;
				}
			});
			btnSetFoKey.setBounds(179, 155, 97, 23);
			panel.add(btnSetFoKey);
			
			btnSetFsoKey = new JButton("Set F# Key 2");
			btnSetFsoKey.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					listening = true;
					key = KeyNames.KEY_Fso;
				}
			});
			btnSetFsoKey.setBounds(179, 179, 97, 23);
			panel.add(btnSetFsoKey);
			
			btnSetGoKey = new JButton("Set G Key 2");
			btnSetGoKey.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					listening = true;
					key = KeyNames.KEY_Go;
				}
			});
			btnSetGoKey.setBounds(179, 202, 97, 23);
			panel.add(btnSetGoKey);
			
			btnSetGsoKey = new JButton("Set G# Key 2");
			btnSetGsoKey.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					listening = true;
					key = KeyNames.KEY_Gso;
				}
			});
			btnSetGsoKey.setBounds(179, 225, 97, 23);
			panel.add(btnSetGsoKey);
			
			btnSetAoKey = new JButton("Set A Key 2");
			btnSetAoKey.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					listening = true;
					key = KeyNames.KEY_Ao;
				}
			});
			btnSetAoKey.setBounds(179, 248, 97, 23);
			panel.add(btnSetAoKey);
			
			btnSetAsoKey = new JButton("Set A# Key 2");
			btnSetAsoKey.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					listening = true;
					key = KeyNames.KEY_Aso;
				}
			});
			btnSetAsoKey.setBounds(179, 271, 97, 23);
			panel.add(btnSetAsoKey);
			
			btnSetBoKey = new JButton("Set B Key 2");
			btnSetBoKey.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					listening = true;
					key = KeyNames.KEY_Bo;
				}
			});
			btnSetBoKey.setBounds(179, 294, 97, 23);
			panel.add(btnSetBoKey);
			
			lblCoKey = new JLabel(Integer.toString(MainWindow.key_Co));
			lblCoKey.setBounds(280, 44, 28, 14);
			panel.add(lblCoKey);
			
			lblCsoKey = new JLabel(Integer.toString(MainWindow.key_Cso));
			lblCsoKey.setBounds(280, 67, 28, 14);
			panel.add(lblCsoKey);
			
			lblDoKey = new JLabel(Integer.toString(MainWindow.key_Do));
			lblDoKey.setBounds(280, 90, 28, 14);
			panel.add(lblDoKey);
			
			lblDsoKey = new JLabel(Integer.toString(MainWindow.key_Dso));
			lblDsoKey.setBounds(280, 113, 28, 14);
			panel.add(lblDsoKey);
			
			lblEoKey = new JLabel(Integer.toString(MainWindow.key_Eo));
			lblEoKey.setBounds(280, 136, 28, 14);
			panel.add(lblEoKey);
			
			lblFoKey = new JLabel(Integer.toString(MainWindow.key_Fo));
			lblFoKey.setBounds(280, 159, 28, 14);
			panel.add(lblFoKey);
			
			lblFsoKey = new JLabel(Integer.toString(MainWindow.key_Fso));
			lblFsoKey.setBounds(280, 183, 28, 14);
			panel.add(lblFsoKey);
			
			lblGoKey = new JLabel(Integer.toString(MainWindow.key_Go));
			lblGoKey.setBounds(280, 206, 28, 14);
			panel.add(lblGoKey);
			
			lblGsoKey = new JLabel(Integer.toString(MainWindow.key_Gso));
			lblGsoKey.setBounds(280, 229, 28, 14);
			panel.add(lblGsoKey);
			
			lblAoKey = new JLabel(Integer.toString(MainWindow.key_Ao));
			lblAoKey.setBounds(280, 252, 28, 14);
			panel.add(lblAoKey);
			
			lblAsoKey = new JLabel(Integer.toString(MainWindow.key_Aso));
			lblAsoKey.setBounds(280, 275, 28, 14);
			panel.add(lblAsoKey);
			
			lblBoKey = new JLabel(Integer.toString(MainWindow.key_Bo));
			lblBoKey.setBounds(280, 298, 28, 14);
			panel.add(lblBoKey);
			
			lblCon = new JLabel(Character.toString((char) MainWindow.key_Co));
			lblCon.setBounds(318, 44, 28, 14);
			panel.add(lblCon);
			
			lblCson = new JLabel(Character.toString((char) MainWindow.key_Cso));
			lblCson.setBounds(318, 67, 28, 14);
			panel.add(lblCson);
			
			lblDon = new JLabel(Character.toString((char) MainWindow.key_Do));
			lblDon.setBounds(318, 90, 28, 14);
			panel.add(lblDon);
			
			lblDson = new JLabel(Character.toString((char) MainWindow.key_Dso));
			lblDson.setBounds(318, 113, 28, 14);
			panel.add(lblDson);
			
			lblEon = new JLabel(Character.toString((char) MainWindow.key_Eo));
			lblEon.setBounds(318, 136, 28, 14);
			panel.add(lblEon);
			
			lblFon = new JLabel(Character.toString((char) MainWindow.key_Fo));
			lblFon.setBounds(318, 159, 28, 14);
			panel.add(lblFon);
			
			lblFson = new JLabel(Character.toString((char) MainWindow.key_Fso));
			lblFson.setBounds(318, 183, 28, 14);
			panel.add(lblFson);
			
			lblGon = new JLabel(Character.toString((char) MainWindow.key_Go));
			lblGon.setBounds(318, 206, 28, 14);
			panel.add(lblGon);
			
			lblGson = new JLabel(Character.toString((char) MainWindow.key_Gso));
			lblGson.setBounds(318, 229, 28, 14);
			panel.add(lblGson);
			
			lblAon = new JLabel(Character.toString((char) MainWindow.key_Ao));
			lblAon.setBounds(318, 252, 28, 14);
			panel.add(lblAon);
			
			lblAson = new JLabel(Character.toString((char) MainWindow.key_Aso));
			lblAson.setBounds(318, 275, 28, 14);
			panel.add(lblAson);
			
			lblBon = new JLabel(Character.toString((char) MainWindow.key_Bo));
			lblBon.setBounds(318, 298, 28, 14);
			panel.add(lblBon);
			
			btnSetDownKey = new JButton("Set v Key");
			btnSetDownKey.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnSetDownKey.setBounds(10, 328, 89, 23);
			panel.add(btnSetDownKey);
			
			lblDownKey = new JLabel(Integer.toString(MainWindow.key_Down));
			lblDownKey.setBounds(103, 332, 28, 14);
			panel.add(lblDownKey);
			
			lblDownn = new JLabel(Character.toString((char) MainWindow.key_Down));
			lblDownn.setBounds(141, 332, 28, 14);
			panel.add(lblDownn);
			
			btnSetUpKey = new JButton("Set ^ Key");
			btnSetUpKey.setBounds(179, 328, 97, 23);
			panel.add(btnSetUpKey);
			
			lblUpKey = new JLabel(Integer.toString(MainWindow.key_Up));
			lblUpKey.setBounds(280, 332, 28, 14);
			panel.add(lblUpKey);
			
			lblUpn = new JLabel(Character.toString((char) MainWindow.key_Up));
			lblUpn.setBounds(318, 332, 28, 14);
			panel.add(lblUpn);
			
			lbldownOctave = new JLabel("(Down Octave)");
			lbldownOctave.setBounds(10, 351, 89, 14);
			panel.add(lbldownOctave);
			
			lblupOctave = new JLabel("(Up Octave)");
			lblupOctave.setBounds(179, 351, 97, 14);
			panel.add(lblupOctave);
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, "cell 1 0,grow");
			panel.setLayout(null);
			
			scrollBar = new JScrollBar();
			scrollBar.setValue(64);
			scrollBar.addAdjustmentListener(new AdjustmentListener() {
				public void adjustmentValueChanged(AdjustmentEvent e) {
					try
					{
						lblVol.setText(Integer.toString(e.getValue()));
					}
					catch (NullPointerException ex)
					{
						
					}
				}
			});
			scrollBar.setBlockIncrement(8);
			scrollBar.setMaximum(137);
			scrollBar.setOrientation(JScrollBar.HORIZONTAL);
			scrollBar.setBounds(39, 36, 267, 17);
			panel.add(scrollBar);
			
			JLabel lblVolume = new JLabel("Volume");
			lblVolume.setBounds(10, 11, 46, 14);
			panel.add(lblVolume);
			
			lblLow = new JLabel("Low");
			lblLow.setBounds(10, 39, 25, 14);
			panel.add(lblLow);
			
			JLabel lblHigh = new JLabel("High");
			lblHigh.setBounds(316, 39, 25, 14);
			panel.add(lblHigh);
			
			lblVol = new JLabel();
			lblVol.setHorizontalAlignment(SwingConstants.RIGHT);
			lblVol.setBounds(290, 11, 46, 14);
			lblVol.setText(Integer.toString(scrollBar.getValue()));
			panel.add(lblVol);
			
			String[] instruments = {"Acoustic Grand Piano", "Bright Acoustic Piano", "Electric Grand Piano",
					"Honky-tonk Piano", "Electric Piano 1", "Electric Piano 2", "Harpsichord", "Clavinet",
					"Celesta", "Glockenspiel", "Music Box", "Vibraphone", "Marimba", "Xylophone",
					"Tubular Bells", "Dulcimer",
					"Drawbar Organ", "Percussive Organ", "Rock Organ", "Church Organ", "Reed Organ", "Accordion",
					"Harmonica", "Tango Accordion",
					"Acoustic Guitar (nylon)", "Acoustic Guitar (steel)", "Electric Guitar (jazz)", 
					"Electric Guitar (clean)", "Electric Guitar (muted)", "Overdriven Guitar", 
					"Distortion Guitar", "Guitar Harmonics",
					"Acoustic Bass", "Electric Bass (finger)", "Electric Bass (pick)", "Fretless Bass",
					"Slap Bass 1", "Slap Bass 2", "Synth Bass 1", "Synth Bass 2",
					"Violin", "Viola", "Cello", "Contrabass", "Tremolo Strings", "Pizzicato Strings",
					"Orchestral Harp", "Timpani",
					"String Ensemble 1", "String Ensemble 2", "Synth Strings 1", "Synth Strings 2",
					"Choir Aahs", "Voice Oohs", "Synth Choir", "Orchestra Hit",
					"Trumpet", "Trombone", "Tuba", "Muted Trumpet", "French Horn", "Brass Section",
					"Synth Brass 1", "Synth Brass 2",
					"Soprano Sax", "Alto Sax", "Tenor Sax", "Baritone Sax", "Oboe", "English Horn",
					"Bassoon", "Clarinet",
					"Piccolo", "Flute", "Recorder", "Pan Flute", "Blown bottle", "Shakuhachi", "Whistle", "Ocarina",
					"Lead 1 (square)", "Lead 2 (sawtooth)", "Lead 3 (calliope)", "Lead 4 (chiff)", "Lead 5 (charang)",
					"Lead 6 (voice)", "Lead 7 (fifths)", "Lead 8 (bass + lead)",
					"Pad 1 (new age)", "Pad 2 (warm)", "Pad 3 (polysynth)", "Pad 4 (choir)", "Pad 5 (bowed)",
					"Pad 6 (metallic)", "Pad 7 (halo)", "Pad 8 (sweep)",
					"FX 1 (rain)", "FX 2 (soundtrack)", "FX 3 (crystal)", "FX 4 (atmosphere)", "FX 5 (brightness)",
					"FX 6 (goblins)", "FX 7 (echoes)", "FX 8 (sci-fi)",
					"Sitar", "Banjo", "Shamisen", "Koto", "Kalimba", "Bagpipe", "Fiddle", "Shanai",
					"Tinkle Bell", "Agogo", "Steel Drums", "Woodblock", "Taiko Drum", "Melodic Tom",
					"Synth Drum", "Reverse Cymbal",
					"Guitar Fret Noise", "Breath Noise", "Seashore", "Bird Tweet", "Telephone Ring",
					"Helicopter", "Applause", "Gunshot"};
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 101, 294, 264);
			panel.add(scrollPane);
			list = new JList<String>(instruments);
			//list = new JList();
			list.setVisibleRowCount(9);
			scrollPane.setViewportView(list);
			list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			
			JLabel lblSetInstrument = new JLabel("Instrument");
			lblSetInstrument.setBounds(10, 76, 64, 14);
			panel.add(lblSetInstrument);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// set parent options
						MainWindow.player.setInstrument(list.getSelectedIndex());
						MainWindow.player.setVolume(scrollBar.getValue());
						
						MainWindow.key_A = Integer.parseInt(lblAKey.getText());
						MainWindow.key_As = Integer.parseInt(lblAsKey.getText());
						MainWindow.key_B = Integer.parseInt(lblBKey.getText());
						MainWindow.key_C = Integer.parseInt(lblCKey.getText());
						MainWindow.key_Cs = Integer.parseInt(lblCsKey.getText());
						MainWindow.key_D = Integer.parseInt(lblDKey.getText());
						MainWindow.key_Ds = Integer.parseInt(lblDsKey.getText());
						MainWindow.key_E = Integer.parseInt(lblEKey.getText());
						MainWindow.key_F = Integer.parseInt(lblFKey.getText());
						MainWindow.key_Fs = Integer.parseInt(lblFsKey.getText());
						MainWindow.key_G = Integer.parseInt(lblGKey.getText());
						MainWindow.key_Gs = Integer.parseInt(lblGsKey.getText());
						
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	public void SetUpOptions(int instrument, int volume)
	{
		list.setSelectedIndex(instrument);
		list.ensureIndexIsVisible(list.getSelectedIndex());
		scrollBar.setValue(volume);
	}
}
