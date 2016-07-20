package com.fishbrain.assignment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

import com.fishbrain.android.event.CatchesEvent;
import com.fishbrain.android.network.RetrofitInstance;
import com.fishbrain.android.network.interactor.CatchesInteractor;
import com.fishbrain.android.network.interactor.CatchesInteractorImpl;
import com.fishbrain.android.network.service.ApiService;
import com.fishbrain.assignment.base.BaseActivity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.io.IOException;

/**
 * Created by dimitris on 19/07/16.
 */

public class MainActivity extends BaseActivity {

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		EventBus.getDefault().register(this);
		CatchesInteractor catchesInteractor = new CatchesInteractorImpl(RetrofitInstance.getInstance().create(ApiService.class));
		try {
			catchesInteractor.fetchCatches("1");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void onDestroy() {
		EventBus.getDefault().unregister(this);
		super.onDestroy();
	}

	@Subscribe
	public void onEvent(CatchesEvent event) {
		Toast.makeText(MainActivity.this, event.getData().size() + " catches fetched!", Toast.LENGTH_LONG).show();
	}
}
