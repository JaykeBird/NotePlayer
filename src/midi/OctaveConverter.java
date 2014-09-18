package midi;

public class OctaveConverter {

	// http://computermusicresource.com/midikeys.html
	
	/**
	 * Returns a note value for a note when given an octave.
	 * @param octave The octave to use. For example, to play C4 (middle C), use 4.
	 * @param note The note to use. C is 0. This number increases with each half step. B is 11. For example, to play C4 (middle C), use 0.
	 * @return The note value to use to play the note.
	 */
	public static int getNoteValue(int octave, int note)
	{
		return (octave * 12) + note;
	}
	
}
