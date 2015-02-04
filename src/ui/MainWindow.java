package ui;

import java.awt.Color;
import java.awt.DefaultKeyboardFocusManager;
import java.awt.Dialog.ModalityType;
import java.awt.EventQueue;
import java.awt.KeyboardFocusManager;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;

import javax.swing.Box;

import midi.OctaveConverter;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Toolkit;

@SuppressWarnings("unused")
public class MainWindow {

	private class ComponentMouseAdapter extends MouseAdapter {
		
		int keyvalue = 0;
		
		private int getKey(String key)
		{
			switch (key)
			{
			case "C":
				keyvalue = 0;
				break;
			case "C#":
				keyvalue = 1;
				break;
			case "D":
				keyvalue = 2;
				break;
			case "D#":
				keyvalue = 3;
				break;
			case "E":
				keyvalue = 4;
				break;
			case "F":
				keyvalue = 5;
				break;
			case "F#":
				keyvalue = 6;
				break;
			case "G":
				keyvalue = 7;
				break;
			case "G#":
				keyvalue = 8;
				break;
			case "A":
				keyvalue = 9;
				break;
			case "A#":
				keyvalue = 10;
				break;
			case "B":
				keyvalue = 11;
				break;
			}
			
			
			
			return OctaveConverter.getNoteValue(MainWindow.octave, keyvalue);
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			
//			System.out.println(e.getComponent().getName());
//			System.out.println(((KeyComponent) e.getComponent()).getKeyName());
//			
//			MainWindow.player.playNote(getKey(((KeyComponent) e.getComponent()).getKeyName()));
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			//int note = OctaveConverter.getNoteValue(MainWindow.octave, keyvalue);
			
			//MainWindow.player.stopNote(getKey(((KeyComponent) e.getComponent()).getKeyName()));
		}
	}

	public JFrame frmNotePlayerPiano;
	private JPanel panel;
	
	public static int octave = 4;
	public static midi.Player player = new midi.Player();
	
	public static int key_C = KeyEvent.VK_Z;
	public static int key_Cs = KeyEvent.VK_S;
	public static int key_D = KeyEvent.VK_X;
	public static int key_Ds = KeyEvent.VK_D;
	public static int key_E = KeyEvent.VK_C;
	public static int key_F = KeyEvent.VK_V;
	public static int key_Fs = KeyEvent.VK_G;
	public static int key_G = KeyEvent.VK_B;
	public static int key_Gs = KeyEvent.VK_H;
	public static int key_A = KeyEvent.VK_N;
	public static int key_As = KeyEvent.VK_J;
	public static int key_B = KeyEvent.VK_M;
	public static int key_Co = KeyEvent.VK_COMMA;
	public static int key_Cso = KeyEvent.VK_L;
	public static int key_Do = KeyEvent.VK_PERIOD;
	public static int key_Dso = KeyEvent.VK_SEMICOLON;
	public static int key_Eo = KeyEvent.VK_SLASH;
	public static int key_Fo = KeyEvent.VK_Q;
	public static int key_Fso = KeyEvent.VK_W;
	public static int key_Go = KeyEvent.VK_E;
	public static int key_Gso = KeyEvent.VK_R;
	public static int key_Ao = KeyEvent.VK_T;
	public static int key_Aso = KeyEvent.VK_Y;
	public static int key_Bo = KeyEvent.VK_U;
	
	public static boolean key_C_pr = false;
	public static boolean key_Cs_pr = false;
	public static boolean key_D_pr = false;
	public static boolean key_Ds_pr = false;
	public static boolean key_E_pr = false;
	public static boolean key_F_pr = false;
	public static boolean key_Fs_pr = false;
	public static boolean key_G_pr = false;
	public static boolean key_Gs_pr = false;
	public static boolean key_A_pr = false;
	public static boolean key_As_pr = false;
	public static boolean key_B_pr = false;
	public static boolean key_Co_pr = false;
	public static boolean key_Cso_pr = false;
	public static boolean key_Do_pr = false;
	public static boolean key_Dso_pr = false;
	public static boolean key_Eo_pr = false;
	public static boolean key_Fo_pr = false;
	public static boolean key_Fso_pr = false;
	public static boolean key_Go_pr = false;
	public static boolean key_Gso_pr = false;
	public static boolean key_Ao_pr = false;
	public static boolean key_Aso_pr = false;
	public static boolean key_Bo_pr = false;
	
	public static int key_Up = KeyEvent.VK_SHIFT;
	public static int key_Down = KeyEvent.VK_CONTROL;
	
	public static MainWindow wndow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmNotePlayerPiano.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		wndow = this;
		
		frmNotePlayerPiano = new JFrame();
		frmNotePlayerPiano.setIconImage(Toolkit.getDefaultToolkit().getImage(MainWindow.class.getResource("/ui/32.png")));
		frmNotePlayerPiano.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent arg0) {
				DrawPianoKeys();
			}
		});
		
		frmNotePlayerPiano.setTitle("Note Player Piano");
		frmNotePlayerPiano.setBounds(50, 50, 1000, 350);
		frmNotePlayerPiano.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNotePlayerPiano.getContentPane().setLayout(new BorderLayout(0, 0));
		
		KeyboardFocusManager.setCurrentKeyboardFocusManager(new DefaultKeyboardFocusManager() {
            @Override
            public boolean postProcessKeyEvent(KeyEvent e) {
            	
            	int code = e.getKeyCode();
            	
                if (!e.isConsumed() && e.getID() == KeyEvent.KEY_PRESSED) {
                    //System.out.print(e.getKeyChar());
                    
                    if (code == key_C)
        			{
        				if (key_C_pr == false)
        				{
        					key_C_pr = true;
        					int note = OctaveConverter.getNoteValue(MainWindow.octave, 0);
        					MainWindow.player.playNote(note);
        				}
        			}
        			else if (code == key_Cs)
        			{
        				if (key_Cs_pr == false)
        				{
        					key_Cs_pr = true;
        					int note = OctaveConverter.getNoteValue(MainWindow.octave, 1);
        					MainWindow.player.playNote(note);
        				}
        			}
        			else if (code == key_D)
        			{
        				if (key_D_pr == false)
        				{
        					key_D_pr = true;
        					int note = OctaveConverter.getNoteValue(MainWindow.octave, 2);
        					MainWindow.player.playNote(note);
        				}
        			}
        			else if (code == key_Ds)
        			{
        				if (key_Ds_pr == false)
        				{
        					key_Ds_pr = true;
        					int note = OctaveConverter.getNoteValue(MainWindow.octave, 3);
        					MainWindow.player.playNote(note);
        				}
        			}
        			else if (code == key_E)
        			{
        				if (key_E_pr == false)
        				{
        					key_E_pr = true;
        					int note = OctaveConverter.getNoteValue(MainWindow.octave, 4);
        					MainWindow.player.playNote(note);
        				}
        			}
        			else if (code == key_F)
        			{				
        				if (key_F_pr == false)
        				{
        					key_F_pr = true;
        					int note = OctaveConverter.getNoteValue(MainWindow.octave, 5);
        					MainWindow.player.playNote(note);
        				}
        			}
        			else if (code == key_Fs)
        			{
        				if (key_Fs_pr == false)
        				{
        					key_Fs_pr = true;
        					int note = OctaveConverter.getNoteValue(MainWindow.octave, 6);
        					MainWindow.player.playNote(note);
        				}
        			}
        			else if (code == key_G)
        			{
        				if (key_G_pr == false)
        				{
        					key_G_pr = true;
        					int note = OctaveConverter.getNoteValue(MainWindow.octave, 7);
        					MainWindow.player.playNote(note);
        				}
        			}
        			else if (code == key_Gs)
        			{
        				if (key_Gs_pr == false)
        				{
        					key_Gs_pr = true;
        					int note = OctaveConverter.getNoteValue(MainWindow.octave, 8);
        					MainWindow.player.playNote(note);
        				}
        			}
        			else if (code == key_A)
        			{
        				if (key_A_pr == false)
        				{
        					key_A_pr = true;
        					int note = OctaveConverter.getNoteValue(MainWindow.octave, 9);
        					MainWindow.player.playNote(note);
        				}
        			}
        			else if (code == key_As)
        			{
        				if (key_As_pr == false)
        				{
        					key_As_pr = true;
        					int note = OctaveConverter.getNoteValue(MainWindow.octave, 10);
        					MainWindow.player.playNote(note);
        				}
        			}
        			else if (code == key_B)
        			{
        				if (key_B_pr == false)
        				{
        					key_B_pr = true;
        					int note = OctaveConverter.getNoteValue(MainWindow.octave, 11);
        					MainWindow.player.playNote(note);
        				}
        			}
                    if (code == key_Co)
        			{
        				if (key_Co_pr == false)
        				{
        					key_Co_pr = true;
        					int note = OctaveConverter.getNoteValue(MainWindow.octave, 12);
        					MainWindow.player.playNote(note);
        				}
        			}
        			else if (code == key_Cso)
        			{
        				if (key_Cso_pr == false)
        				{
        					key_Cso_pr = true;
        					int note = OctaveConverter.getNoteValue(MainWindow.octave, 13);
        					MainWindow.player.playNote(note);
        				}
        			}
        			else if (code == key_Do)
        			{
        				if (key_Do_pr == false)
        				{
        					key_Do_pr = true;
        					int note = OctaveConverter.getNoteValue(MainWindow.octave, 14);
        					MainWindow.player.playNote(note);
        				}
        			}
        			else if (code == key_Dso)
        			{
        				if (key_Dso_pr == false)
        				{
        					key_Dso_pr = true;
        					int note = OctaveConverter.getNoteValue(MainWindow.octave, 15);
        					MainWindow.player.playNote(note);
        				}
        			}
        			else if (code == key_Eo)
        			{
        				if (key_Eo_pr == false)
        				{
        					key_Eo_pr = true;
        					int note = OctaveConverter.getNoteValue(MainWindow.octave, 16);
        					MainWindow.player.playNote(note);
        				}
        			}
        			else if (code == key_Fo)
        			{				
        				if (key_Fo_pr == false)
        				{
        					key_Fo_pr = true;
        					int note = OctaveConverter.getNoteValue(MainWindow.octave, 17);
        					MainWindow.player.playNote(note);
        				}
        			}
        			else if (code == key_Fso)
        			{
        				if (key_Fso_pr == false)
        				{
        					key_Fso_pr = true;
        					int note = OctaveConverter.getNoteValue(MainWindow.octave, 18);
        					MainWindow.player.playNote(note);
        				}
        			}
        			else if (code == key_Go)
        			{
        				if (key_Go_pr == false)
        				{
        					key_Go_pr = true;
        					int note = OctaveConverter.getNoteValue(MainWindow.octave, 19);
        					MainWindow.player.playNote(note);
        				}
        			}
        			else if (code == key_Gso)
        			{
        				if (key_Gso_pr == false)
        				{
        					key_Gso_pr = true;
        					int note = OctaveConverter.getNoteValue(MainWindow.octave, 20);
        					MainWindow.player.playNote(note);
        				}
        			}
        			else if (code == key_Ao)
        			{
        				if (key_Ao_pr == false)
        				{
        					key_Ao_pr = true;
        					int note = OctaveConverter.getNoteValue(MainWindow.octave, 21);
        					MainWindow.player.playNote(note);
        				}
        			}
        			else if (code == key_Aso)
        			{
        				if (key_Aso_pr == false)
        				{
        					key_Aso_pr = true;
        					int note = OctaveConverter.getNoteValue(MainWindow.octave, 22);
        					MainWindow.player.playNote(note);
        				}
        			}
        			else if (code == key_Bo)
        			{
        				if (key_Bo_pr == false)
        				{
        					key_Bo_pr = true;
        					int note = OctaveConverter.getNoteValue(MainWindow.octave, 23);
        					MainWindow.player.playNote(note);
        				}
        			}
        			else if (code == key_Up)
        			{
        				if (octave < 8)
        				{
        					octave += 1;
        				}
        			}
        			else if (code == key_Down)
        			{
        				if (octave > 0)
        				{
        					octave -= 1;
        				}
        			}
                }
                else if (!e.isConsumed() && e.getID() == KeyEvent.KEY_RELEASED) {
                    //System.out.print(e.getKeyChar() + "R");
                    
                    if (code == key_C)
        			{
        				int note = OctaveConverter.getNoteValue(MainWindow.octave, 0);
        				MainWindow.player.stopNote(note);
        				key_C_pr = false;
        			}
        			else if (code == key_Cs)
        			{
        				int note = OctaveConverter.getNoteValue(MainWindow.octave, 1);
        				MainWindow.player.stopNote(note);
        				key_Cs_pr = false;
        			}
        			else if (code == key_D)
        			{
        				int note = OctaveConverter.getNoteValue(MainWindow.octave, 2);
        				MainWindow.player.stopNote(note);
        				key_D_pr = false;
        			}
        			else if (code == key_Ds)
        			{
        				int note = OctaveConverter.getNoteValue(MainWindow.octave, 3);
        				MainWindow.player.stopNote(note);
        				key_Ds_pr = false;
        			}
        			else if (code == key_E)
        			{
        				int note = OctaveConverter.getNoteValue(MainWindow.octave, 4);
        				MainWindow.player.stopNote(note);
        				key_E_pr = false;
        			}
        			else if (code == key_F)
        			{
        				int note = OctaveConverter.getNoteValue(MainWindow.octave, 5);
        				MainWindow.player.stopNote(note);
        				key_F_pr = false;
        			}
        			else if (code == key_Fs)
        			{
        				int note = OctaveConverter.getNoteValue(MainWindow.octave, 6);
        				MainWindow.player.stopNote(note);
        				key_Fs_pr = false;
        			}
        			else if (code == key_G)
        			{
        				int note = OctaveConverter.getNoteValue(MainWindow.octave, 7);
        				MainWindow.player.stopNote(note);
        				key_G_pr = false;
        			}
        			else if (code == key_Gs)
        			{
        				int note = OctaveConverter.getNoteValue(MainWindow.octave, 8);
        				MainWindow.player.stopNote(note);
        				key_Gs_pr = false;
        			}
        			else if (code == key_A)
        			{
        				int note = OctaveConverter.getNoteValue(MainWindow.octave, 9);
        				MainWindow.player.stopNote(note);
        				key_A_pr = false;
        			}
        			else if (code == key_As)
        			{
        				int note = OctaveConverter.getNoteValue(MainWindow.octave, 10);
        				MainWindow.player.stopNote(note);
        				key_As_pr = false;
        			}
        			else if (code == key_B)
        			{
        				int note = OctaveConverter.getNoteValue(MainWindow.octave, 11);
        				MainWindow.player.stopNote(note);
        				key_B_pr = false;
        			}
                    if (code == key_Co)
        			{
        				int note = OctaveConverter.getNoteValue(MainWindow.octave, 12);
        				MainWindow.player.stopNote(note);
        				key_Co_pr = false;
        			}
        			else if (code == key_Cso)
        			{
        				int note = OctaveConverter.getNoteValue(MainWindow.octave, 13);
        				MainWindow.player.stopNote(note);
        				key_Cso_pr = false;
        			}
        			else if (code == key_Do)
        			{
        				int note = OctaveConverter.getNoteValue(MainWindow.octave, 14);
        				MainWindow.player.stopNote(note);
        				key_Do_pr = false;
        			}
        			else if (code == key_Dso)
        			{
        				int note = OctaveConverter.getNoteValue(MainWindow.octave, 15);
        				MainWindow.player.stopNote(note);
        				key_Dso_pr = false;
        			}
        			else if (code == key_Eo)
        			{
        				int note = OctaveConverter.getNoteValue(MainWindow.octave, 16);
        				MainWindow.player.stopNote(note);
        				key_Eo_pr = false;
        			}
        			else if (code == key_Fo)
        			{
        				int note = OctaveConverter.getNoteValue(MainWindow.octave, 17);
        				MainWindow.player.stopNote(note);
        				key_Fo_pr = false;
        			}
        			else if (code == key_Fso)
        			{
        				int note = OctaveConverter.getNoteValue(MainWindow.octave, 18);
        				MainWindow.player.stopNote(note);
        				key_Fso_pr = false;
        			}
        			else if (code == key_Go)
        			{
        				int note = OctaveConverter.getNoteValue(MainWindow.octave, 19);
        				MainWindow.player.stopNote(note);
        				key_Go_pr = false;
        			}
        			else if (code == key_Gso)
        			{
        				int note = OctaveConverter.getNoteValue(MainWindow.octave, 20);
        				MainWindow.player.stopNote(note);
        				key_Gso_pr = false;
        			}
        			else if (code == key_Ao)
        			{
        				int note = OctaveConverter.getNoteValue(MainWindow.octave, 21);
        				MainWindow.player.stopNote(note);
        				key_Ao_pr = false;
        			}
        			else if (code == key_Aso)
        			{
        				int note = OctaveConverter.getNoteValue(MainWindow.octave, 22);
        				MainWindow.player.stopNote(note);
        				key_Aso_pr = false;
        			}
        			else if (code == key_Bo)
        			{
        				int note = OctaveConverter.getNoteValue(MainWindow.octave, 23);
        				MainWindow.player.stopNote(note);
        				key_Bo_pr = false;
        			}
                }
                return true;
            }
        });
		
		JPanel panel_1 = new JPanel();
		frmNotePlayerPiano.getContentPane().add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		JButton btnOptions = new JButton("Options...");
		btnOptions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Options opts = new Options();
				opts.SetUpOptions(player.getInstrument(), player.getVolume());
				opts.parent = MainWindow.wndow;
				opts.setModalityType(ModalityType.APPLICATION_MODAL);
				opts.setVisible(true);
			}
		});
		panel_1.add(btnOptions);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		panel_1.add(horizontalGlue);
		
		JButton btnDownOctave = new JButton("Down Octave");
		btnDownOctave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (octave > 0)
				{
					octave -= 1;
				}
			}
		});
		panel_1.add(btnDownOctave);
		
		JButton btnUpOctave = new JButton("Up Octave");
		btnUpOctave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (octave < 8)
				{
					octave += 1;
				}
			}
		});
		panel_1.add(btnUpOctave);
		
		JButton btnAbout = new JButton("Stop All Notes");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for (int i = 0 ; i < 128 ; i++)
				{
					player.stopNote(i);
				}
			}
		});
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		panel_1.add(horizontalGlue_1);
		panel_1.add(btnAbout);
		
		panel = new JPanel();
		//panel.addMouseListener(new ComponentMouseAdapter());
		frmNotePlayerPiano.getContentPane().add(panel);
		panel.setLayout(new OverlayLayout(panel));
		panel.updateUI();
		
		//DrawPianoKeys();
	}
	
	private void DrawPianoKeys()
	{
		panel.removeAll();
		panel.updateUI();
		
		int width = panel.getWidth() - 1;
		int height = panel.getHeight();
		
		//JOptionPane.showMessageDialog(panel, "" + panel.getWidth() + " " + panel.getHeight());
		
		int itemwidth = (int) Math.floor(width / 14);
		
		//JOptionPane.showMessageDialog(panel, "" + itemwidth);
		
		int left = 0;
		
		String[] keynames = {"C", "D", "E", "F", "G", "A", "B", "C", "D", "E", "F", "G", "A", "B"};
		String[] sharpnames = {"C#", "D#", "E#", "F#", "G#", "A#", "B#", "C#", "D#", "E#", "F#", "G#", "A#", "B#"};
		
		for (int i = 0; i < 14; i++)
		{
			
			if (!(sharpnames[i].equals("B#") || sharpnames[i].equals("E#"))) {
				KeyComponent bc = new KeyComponent(0, (int) ((left + itemwidth) - (itemwidth * 0.25)), (int) (itemwidth * 0.5), (int) (height * 0.6), Color.BLACK, sharpnames[i], Color.BLACK, Color.GRAY);
				bc.addMouseListener(new ComponentMouseAdapter());
				panel.add(bc);
				left += itemwidth;
			}
			else
			{
				left += itemwidth;
			}
		}
		
		left = 0;
		
		for (int i = 0; i < 14; i++)
		{
			//JOptionPane.showMessageDialog(panel, "" + keynames[i] + " " + left);
			//System.out.println(left);
			
			KeyComponent bc = new KeyComponent(0, left, itemwidth, height, Color.WHITE, keynames[i], Color.BLACK, Color.GRAY);
			bc.addMouseListener(new ComponentMouseAdapter());
			panel.add(bc);
			left += itemwidth;
		}
		
		panel.updateUI();
		
		//frmNotePlayerPiano.setSize(frmNotePlayerPiano.getWidth(), frmNotePlayerPiano.getHeight() + 1);
		
	}
	
}
