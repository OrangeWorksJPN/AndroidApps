package jp.orangeworks.android.greenfield;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TopScreenActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.top_screen);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.top_screen, menu);
		return true;
	}

}
