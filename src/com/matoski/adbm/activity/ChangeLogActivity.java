package com.matoski.adbm.activity;

import android.util.Log;

import com.matoski.adbm.R;

/**
 * Shows the Change Log data for the application
 * 
 * @author Ilija Matoski (ilijamt@gmail.com)
 */
public class ChangeLogActivity extends BaseHelpActivity {

	/**
	 * The tag used when logging with {@link Log}
	 */
	private static final String LOG_TAG = ChangeLogActivity.class.getName();

	/*
	 * (non-Javadoc)
	 * @see com.matoski.adbm.activity.BaseHelpActivity#getResourceId()
	 */
	@Override
	protected int getResourceId() {
		Log.d(LOG_TAG, String.format("Loading resource: %d", R.raw.changelog));
		return R.raw.changelog;
	}

}
