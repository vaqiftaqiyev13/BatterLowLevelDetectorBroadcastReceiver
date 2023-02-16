package com.vagif_tagiyev.batterylevelcontrolappwithbroadcastreceiver

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.logging.Filter

class MainActivity : AppCompatActivity() {
    //battery level detector object was created because in new
    // android broadcast list don't mention about battery low.
    private lateinit var batteryLevelDetector: BatteryLevelDetector

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        batteryLevelDetector = BatteryLevelDetector()
    }

    override fun onResume() {
        val filter = IntentFilter("android.intent.action.BATTERY_LOW")
        super.onResume()
        registerReceiver(batteryLevelDetector, filter)
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(batteryLevelDetector)
    }

}