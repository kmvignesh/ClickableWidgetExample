package com.example.vicky.clickablewidgetexample

import android.content.Context
import android.util.ArraySet

val PREFERENCE_NAME = "preference"
val PREFERENCE_WIDGET_ID = "widgetId"

class MyPreference(context: Context){

    val preference = context.getSharedPreferences(PREFERENCE_NAME,Context.MODE_PRIVATE)


    fun updateWidgetIds(ids : MutableSet<String>){
        val editor = preference.edit()
        val newSet = mutableSetOf<String>()
        newSet.addAll(ids)
        editor.putStringSet(PREFERENCE_WIDGET_ID,newSet)
        editor.apply()
    }

    fun getWidgetIds() : MutableSet<String> {
        return preference.getStringSet(PREFERENCE_WIDGET_ID, hashSetOf())
    }

}