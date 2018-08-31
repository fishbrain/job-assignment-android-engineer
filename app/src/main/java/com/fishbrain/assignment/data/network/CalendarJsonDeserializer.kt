package com.fishbrain.assignment.data.network

import com.fishbrain.assignment.BuildConfig
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.JsonParseException
import com.google.gson.JsonPrimitive
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer

import java.lang.reflect.Type
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale
import java.util.TimeZone

/**
 * This class is used in order to serialize/deserialize the proper way the calendar items we fetch from the backend
 *
 *
 * Created by dimitris.lachanas on 22/08/15.
 */
class CalendarJsonDeserializer : JsonDeserializer<Calendar>, JsonSerializer<Calendar> {

    private val simpleDateFormat1 = SimpleDateFormat(BuildConfig.DATE_FORMAT1, Locale.getDefault())
    private val simpleDateFormat2 = SimpleDateFormat(BuildConfig.DATE_FORMAT2, Locale.getDefault())

    @Throws(JsonParseException::class)
    override fun deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): Calendar? {
        try {
            val cal = Calendar.getInstance()
            cal.time = simpleDateFormat1.parse(json.asString)
            return cal
        } catch (e: ParseException) {
            val cal = Calendar.getInstance()
            try {
                cal.time = simpleDateFormat2.parse(json.asString)
            } catch (e1: ParseException) {
                e1.printStackTrace()
                return null
            }

            return cal

        }

    }

    override fun serialize(src: Calendar, typeOfSrc: Type, context: JsonSerializationContext): JsonElement {
        simpleDateFormat1.timeZone = TimeZone.getTimeZone(BuildConfig.TIMEZONE)
        val calendarString = simpleDateFormat1.format(src.time)

        return JsonPrimitive(calendarString)
    }
}
