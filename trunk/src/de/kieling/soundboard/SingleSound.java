package de.kieling.soundboard;

public class SingleSound {

	private int mID = 0;
	private String mName = null;

	public SingleSound(int id, String name) {
		mID = id;
		mName = name;
	}

	/**
	 * @return ID for the SoundPool
	 */
	public int getID() {
		return mID;
	}

	/**
	 * @return Name for this Sound
	 */
	public String getName() {
		return mName;
	}
}
