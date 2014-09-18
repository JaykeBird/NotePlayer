import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import ui.MainWindow;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boolean useUI = true;
		
		if (args.length > 0)
		{
			if (args[0].equals("-noui"))
			{
				//noui switch. The console interface will be used instead.
				useUI = false;
			}
		}
		
		if (useUI)
		{
			// set up UI here
			
			try {
				// Set System L&F
				UIManager.setLookAndFeel(UIManager
						.getSystemLookAndFeelClassName());

			} catch (UnsupportedLookAndFeelException e) {
				// handle exception
			} catch (ClassNotFoundException e) {
				// handle exception
			} catch (InstantiationException e) {
				// handle exception
			} catch (IllegalAccessException e) {
				// handle exception
			}
			
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
		else
		{
			// use console interface
			
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner (System.in);
			
			System.out.println("Note Player. Built by Jayke R. Huempfner, September 2014. Using console interface.");
			
			midi.Player player = new midi.Player();
			
			int vol = 127;
			int inst = 0;
			
			player.setVolume(127);
			
			Boolean exit = false;
			
			while (exit == false)
			{
				String com = scanner.nextLine();
				
				if (com.toLowerCase().startsWith("play"))
				{
					if (com.length() > 5)
					{
						String note = com.substring(5);
						int nn = 60;
						int vl = 93;
						
						String[] data = note.split(" ");
						
						
						try
						{
							nn = Integer.parseInt(data[0]);
							if (data.length > 1)
							{
								vl = Integer.parseInt(data[1]);
							}
							
							player.playNote(nn, vl);
						}
						catch (Exception ex)
						{
							System.out.println("Error occurred: " + ex.getMessage());
						}
					}
					else
					{
						System.out.println("Please enter note.");
					}
				}
				else if (com.toLowerCase().startsWith("stop"))
				{
					if (com.length() > 5)
					{
						String note = com.substring(5);
						int nn = 60;
						
						try
						{
							nn = Integer.parseInt(note);
							
							player.stopNote(nn);
						}
						catch (Exception ex)
						{
							System.out.println("Error occurred: " + ex.getMessage());
						}
					}
					else if (com.length() == 4)
					{
						for (int i = 0 ; i < 128 ; i++)
						{
							player.stopNote(i);
						}
					}
					else
					{
						System.out.println("Please enter note.");
					}
				}
				else if (com.toLowerCase().startsWith("vol"))
				{
					if (com.length() == 3)
					{
						System.out.println("Volume is " + vol);
					}
					else
					{
						String volu = com.substring(4);
						
						int nn = 64;
						
						try
						{
							nn = Integer.parseInt(volu);
							
							player.setVolume(nn);
							vol = nn;
						}
						catch (Exception ex)
						{
							System.out.println("Error occurred: " + ex.getMessage());
						}
					}
				}
				else if (com.toLowerCase().startsWith("inst"))
				{
					if (com.length() == 4)
					{
						System.out.println("Instrument is " + inst);
					}
					else
					{
						String ints = com.substring(5);
						
						int nn = 0;
						
						try
						{
							nn = Integer.parseInt(ints);
							
							player.setInstrument(nn);
							inst = nn;
						}
						catch (Exception ex)
						{
							System.out.println("Error occurred: " + ex.getMessage());
						}
					}
				}
				else if (com.toLowerCase().startsWith("exit"))
				{
					exit = true;
				}
				else
				{
					System.out.println("Unable to process command.");
				}
			}
		
		}
		
	}

}
