package com.example.npe.npe_example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.flutter.embedding.android.FlutterFragment

class NpeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        intent = null // the reason of NPE
        setContentView(R.layout.activity_npe)
        showFlutterContent()
    }

    private fun showFlutterContent() {
        val fragment: FlutterFragment = FlutterFragment.NewEngineFragmentBuilder()
            .build()

        supportFragmentManager.beginTransaction()
            .replace(R.id.fl_container, fragment)
            .commitAllowingStateLoss()
    }

}