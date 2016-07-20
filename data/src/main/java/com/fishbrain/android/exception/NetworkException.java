package com.fishbrain.android.exception;

import java.io.IOException;

/**
 * Created by dimitris on 20/07/16.
 */
public class NetworkException extends IOException{


	private static final String GENERAL_EXCEPTION = "Something went wrong while trying to fetch data! Please try again!";

	public NetworkException() {
		super(GENERAL_EXCEPTION);
	}
}
