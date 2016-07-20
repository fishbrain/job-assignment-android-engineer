package com.fishbrain.android.network;

import com.fishbrain.android.BuildConfig;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 * This class is used in order to serialize/deserialize the proper way the calendar items we fetch from the backend
 * <p>
 * Created by dimitris.lachanas on 22/08/15.
 */
public class CalendarJsonDeserializer implements JsonDeserializer<Calendar>, JsonSerializer<Calendar> {

	private SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(BuildConfig.DATE_FORMAT1, Locale.getDefault());
	private SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(BuildConfig.DATE_FORMAT2, Locale.getDefault());

	@Override
	public Calendar deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		try {
			Calendar cal = Calendar.getInstance();
			cal.setTime(simpleDateFormat1.parse(json.getAsString()));
			return cal;
		} catch (ParseException e) {
			Calendar cal = Calendar.getInstance();
			try {
				cal.setTime(simpleDateFormat2.parse(json.getAsString()));
			} catch (ParseException e1) {
				e1.printStackTrace();
				return null;
			}
			return cal;

		}
	}

	@Override
	public JsonElement serialize(Calendar src, Type typeOfSrc, JsonSerializationContext context) {
		simpleDateFormat1.setTimeZone(TimeZone.getTimeZone(BuildConfig.TIMEZONE));
		String calendarString = simpleDateFormat1.format(src.getTime());

		return new JsonPrimitive(calendarString);
	}
}
