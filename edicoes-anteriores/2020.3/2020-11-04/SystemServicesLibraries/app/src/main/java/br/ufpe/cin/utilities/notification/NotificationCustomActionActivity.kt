package br.ufpe.cin.utilities.notification

import android.app.Activity
import android.os.Bundle
import br.ufpe.cin.utilities.R
import kotlinx.android.synthetic.main.activity_notification_custom_action.*

class NotificationCustomActionActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification_custom_action)
        val nome = intent.getStringExtra("informacao")
        infoExtra.text = nome
    }
}
