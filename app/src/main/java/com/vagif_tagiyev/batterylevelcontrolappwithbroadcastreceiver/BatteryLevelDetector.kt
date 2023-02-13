package com.vagif_tagiyev.batterylevelcontrolappwithbroadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BatteryLevelDetector : BroadcastReceiver() {

    /**
     * I create my onReceive method.
     */

    override fun onReceive(p0: Context?, p1: Intent?) {

        Toast.makeText(p0, "Battery is low", Toast.LENGTH_SHORT).show()

    }
}