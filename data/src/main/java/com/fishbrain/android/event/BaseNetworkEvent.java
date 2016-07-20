package com.fishbrain.android.event;

import com.fishbrain.android.exception.NetworkException;

/**
 * Base Event to use when interacting with the backend
 *
 * Created by dimitris on 20/07/16.
 */
public class BaseNetworkEvent<D> {

	private final boolean mIsFailure;
	D mData;
	NetworkException mNetworkException;

	public BaseNetworkEvent(D data) {
		mData = data;
		mIsFailure = false;
	}

	public BaseNetworkEvent(NetworkException networkException) {
		mNetworkException = networkException;
		mIsFailure = true;
	}


	public D getData() {
		return mData;
	}

	public NetworkException getNetworkException() {
		return mNetworkException;
	}

	public boolean isFailure() {
		return mIsFailure;
	}
}
