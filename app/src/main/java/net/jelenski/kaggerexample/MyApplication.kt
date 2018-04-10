package net.jelenski.kaggerexample

import android.app.Application
import android.bluetooth.BluetoothManager
import android.content.Context
import android.location.LocationManager
import android.os.PowerManager
import net.jelenski.kaggerexample.modules.*

class MyComponentImpl(application: Application) : MyComponent,
        AxModule by AxModuleImpl(application),
        BxModule by BxModuleImpl(),
        CxModule by CxModuleImpl()

class MyApplication : Application() {

    val myComponent: MyComponent by lazy { MyComponentImpl(this) }

}