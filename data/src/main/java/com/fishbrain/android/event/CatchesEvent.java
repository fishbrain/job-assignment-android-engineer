package com.fishbrain.android.event;

import com.fishbrain.android.domain.Catch;
import com.fishbrain.android.exception.CatchesException;

import java.util.List;

/**
 * This event is used for broadcasting the outcome of the network call for catches to the classes are interested
 * <p>
 * Created by dimitris.lachanas on 22/08/15.
 */
public class CatchesEvent extends BaseNetworkEvent<List<Catch>> {

	public CatchesEvent(List<Catch> catches) {
		super(catches);
	}

	public CatchesEvent(CatchesException catchesException) {
		// here we have a failure
		super(catchesException);
	}
}
