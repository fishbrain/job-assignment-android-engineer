package com.fishbrain.assignment;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.fishbrain.assignment.base.BaseActivity;

/**
 * Created by dimitris on 19/07/16.
 */

public class MainActivity extends BaseActivity {

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
}
