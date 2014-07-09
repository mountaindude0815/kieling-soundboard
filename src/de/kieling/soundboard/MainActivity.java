package de.kieling.soundboard;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity implements OnClickListener {
	private SoundManager mSoundMgr = null;
	private LinearLayout mLayout = null;
	private Button mButtons[] = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mSoundMgr = new SoundManager(getApplicationContext());
		mLayout = (LinearLayout) findViewById(R.id.mainLayout);

		mButtons = new Button[mSoundMgr.getSoundCount()];
		for (int i = 0; i < mSoundMgr.getSoundCount(); i++) {
			mButtons[i] = new Button(getApplicationContext());
			mButtons[i].setText(mSoundMgr.getSoundName(i));
			mButtons[i].setOnClickListener(this);
			mLayout.addView(mButtons[i]);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		// getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		for (int i = 0; i < mButtons.length; i++) {
			if (v == mButtons[i]) {
				mSoundMgr.playSound(i);
			}
		}
	}

}
