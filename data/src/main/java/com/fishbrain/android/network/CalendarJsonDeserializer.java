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
import java.util.TimeZone;

/**
 * This class is used in order to serialize/deserialize the proper way the calendar items we fetch from the backend
 *
 * Created by dimitris.lachanas on 22/08/15.
 */
public class CalendarJsonDeserializer implements JsonDeserializer<Calendar>, JsonSerializer<Calendar> {

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat(BuildConfig.DATE_FORMAT);

    @Override
    public Calendar deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        try {
            Calendar cal = Calendar.getInstance();
            cal.setTime(simpleDateFormat.parse(json.getAsString()));
            return cal;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public JsonElement serialize(Calendar src, Type typeOfSrc, JsonSerializationContext context) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(BuildConfig.TIMEZONE));
        String calendarString = simpleDateFormat.format(src.getTime());

        return new JsonPrimitive(calendarString);
    }
}
