package com.fishbrain.assignment.data.exception

import java.io.IOException

/**
 * Created by dimitris on 20/07/16.
 */
private val GENERAL_EXCEPTION = "Something went wrong while trying to fetch data! Please try again!"

open class NetworkException : IOException(GENERAL_EXCEPTION)
