package net.jelenski.kaggerexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class DummyActivity : AppCompatActivity() {
    private val component by lazy {
        // there might be a better ways of accessing myComponent
        (application as MyApplication).myComponent
    }
    private val someSingleton by lazy { component.someSingleton }
    private val someBean by lazy { component.someBean() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dummy)

        // nothing to define in on create
    }

}
