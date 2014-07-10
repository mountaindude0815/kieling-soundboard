package de.kieling.soundboard;

import java.util.ArrayList;

import android.content.Context;
import android.media.MediaPlayer;

public class SoundManager {
	private static final int KIELING = 1;
	private static final int JEDEN_GEGEN_JEDER = 2;

	private Context mContext = null;
	private ArrayList<SingleSound> mIndexList = null;

	public SoundManager(Context con, int sounds) {
		mContext = con;
		// mPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		mIndexList = new ArrayList<SingleSound>();

		loadSounds(sounds);
	}

	/**
	 * Loads all sounds.
	 */
	private void loadSounds(int sounds) {

		// Load KIELING sounds
		if (sounds == KIELING) {
			mIndexList.add(new SingleSound(R.raw.kielingngngng, "Kielingngng"));
			mIndexList
					.add(new SingleSound(R.raw.arschbuersten, "Arschbürsten"));
			mIndexList.add(new SingleSound(R.raw.das_gibts_ja_wohl_nicht,
					"Gibts ja wohl nicht"));
			mIndexList.add(new SingleSound(R.raw.du_bist_zu_dicht,
					"Du bist zu dicht!"));
			mIndexList.add(new SingleSound(R.raw.ein_glas_maggi,
					"Ein Glas Maggi"));
			mIndexList.add(new SingleSound(R.raw.fahrrad_werden,
					"Sollte das mal ein Fahrrad werden?"));
			mIndexList
					.add(new SingleSound(R.raw.hohlgebrochen, "Hohlgebrochen"));
			mIndexList.add(new SingleSound(R.raw.ja_die_lebt, "Ja, die lebt"));
			mIndexList.add(new SingleSound(R.raw.kernbohrung, "Kernbohrung"));
			mIndexList.add(new SingleSound(R.raw.maeh_melodie,
					"Mäh - Herr der Ringe"));
			mIndexList.add(new SingleSound(R.raw.maggi, "Maggi"));
			mIndexList.add(new SingleSound(R.raw.mh_maggi, "Mmmhh, Maggi"));
			mIndexList.add(new SingleSound(R.raw.n_witz_1, "Is wohl'n Witz"));
			mIndexList.add(new SingleSound(R.raw.n_witz_2,
					"Das is wohl hier'n Witz oder...?"));
			mIndexList.add(new SingleSound(R.raw.neijn, "Neeeijn!"));
			mIndexList.add(new SingleSound(R.raw.nein_das_ist_cleo,
					"Nein, das ist Cleo"));
			mIndexList.add(new SingleSound(R.raw.rumaenischer_akzent,
					"Rumänischer Akzent"));
			mIndexList.add(new SingleSound(R.raw.spastkiste, "Spastkiste"));
			mIndexList.add(new SingleSound(R.raw.waldelefant, "Waldelefant"));
			mIndexList.add(new SingleSound(R.raw.walnuss,
					"So wie der ne Walnuss knackt..."));
		}
		// Load JEDEN GEGEN JEDER sounds
		else if (sounds == JEDEN_GEGEN_JEDER) {
			mIndexList.add(new SingleSound(R.raw.fuck_lol_mom, "Fuck. Lol. Mom."));
			mIndexList.add(new SingleSound(R.raw.viev, "Viev"));
			mIndexList.add(new SingleSound(R.raw.sus, "Sus"));
			mIndexList.add(new SingleSound(R.raw.aaahhhmm, "Äähhmm"));
			mIndexList.add(new SingleSound(R.raw.stimmt_nicht, "Stimmt... nicht!"));
			mIndexList.add(new SingleSound(R.raw.wie_viele_quatten, "Wie viele Quatten hat ein Quant?"));
			mIndexList.add(new SingleSound(R.raw.wann_gefriert_gouda, "Bei welcher Temparatur gefriert Gouda?"));
			mIndexList.add(new SingleSound(R.raw.micheal_jackson, "Micheal Jackson"));
			mIndexList.add(new SingleSound(R.raw.wie, "Wie?"));
			mIndexList.add(new SingleSound(R.raw.micheal_jordan, "Micheal Jordan"));
			mIndexList.add(new SingleSound(R.raw.jasmin_scheisst_gerne, "Jasmin scheißt gerne..."));
			mIndexList.add(new SingleSound(R.raw.klappe_du_arschloch, "Klappe du Arschloch!"));
			mIndexList.add(new SingleSound(R.raw.fickmuskel_mit_sack, "Fickmuskel mit Sack"));
		}
	}

	/**
	 * @param index
	 */
	public void playSound(int index) {
		MediaPlayer.create(mContext, mIndexList.get(index).getID()).start();
	}

	/**
	 * @param index
	 * @return
	 */
	public String getSoundName(int index) {
		return mIndexList.get(index).getName();
	}

	/**
	 * @return Count of the sounds
	 */
	public int getSoundCount() {
		return mIndexList.size();
	}
}
