package midi;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Receiver;
import javax.sound.midi.ShortMessage;

public class Player {

	// Uses code from Oracle Java tutorial
	// http://docs.oracle.com/javase/tutorial/sound/MIDI-messages.html
	
	int volume = 64;
	int inst = 0;
	
	private void sendMessage(int command, int byte1, int byte2, int byte3)
	{
		ShortMessage myMsg = new ShortMessage();
		  try {
			myMsg.setMessage(command, byte1, byte2, byte3);
		} catch (InvalidMidiDataException e1) {
			e1.printStackTrace();
		}
		  long timeStamp = -1;
		  Receiver rcvr = null;
		try {
			rcvr = MidiSystem.getReceiver();
		} catch (MidiUnavailableException e) {
			e.printStackTrace();
		}
		  rcvr.send(myMsg, timeStamp);
	}
	
	/**
	 * Begin playing a note.
	 * @param note The MIDI name of the note. For example, middle C is '60'.
	 */
	public void playNote(int note)
	{
		playNote(note, 93);
	}
	
	public void playNote(int note, int vel)
	{
		sendMessage(ShortMessage.NOTE_ON, 0, note, vel);
	}
	
	/**
	 * Stop playing an already-playing note.
	 * @param note The MIDI name of the note. For example, middle C is '60'.
	 */
	public void stopNote(int note)
	{
		sendMessage(ShortMessage.NOTE_OFF, 0, note, 0);
	}

	/**
	 * Gets the volume for the MIDI player.
	 * @return
	 */
	public int getVolume()
	{
		return volume;
	}
	
	/**
	 * Sets the volume for the MIDI player.
	 * @param vol
	 */
	public void setVolume(int vol)
	{
		this.volume = vol;
		sendMessage(ShortMessage.CONTROL_CHANGE, 0, 7, vol);
	}
	
	/**
	 * Gets the instrument for the MIDI player.
	 * @return
	 */
	public int getInstrument()
	{
		return inst;
	}
	
	/**
	 * Sets the instrument for the MIDI player.
	 * @param vol
	 */
	public void setInstrument(int inst)
	{
		this.inst = inst;
		sendMessage(ShortMessage.PROGRAM_CHANGE, 0, inst, 0);
	}
	
}
