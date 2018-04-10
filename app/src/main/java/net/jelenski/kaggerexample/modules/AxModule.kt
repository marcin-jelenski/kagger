package net.jelenski.kaggerexample.modules

import android.app.Application
import android.content.Context
import android.location.LocationManager
import android.os.PowerManager

interface AxModule {
    val someSingleton: PowerManager
    fun someBean(): LocationManager
}

class AxModuleImpl(private val application: Application) : AxModule {
    override val someSingleton = application.getSystemService(Context.POWER_SERVICE) as PowerManager

    override fun someBean() = application.getSystemService(Context.LOCATION_SERVICE) as LocationManager
}