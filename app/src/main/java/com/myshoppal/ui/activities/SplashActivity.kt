package com.myshoppal.ui.activities

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.myshoppal.R
import com.myshoppal.firestore.FirestoreClass
import kotlinx.android.synthetic.main.activity_splash.*

@Suppress("DEPRECATION")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )


        Handler().postDelayed(
            {


                val currentUserID = FirestoreClass().getCurrentUserID()

                if (currentUserID.isNotEmpty()) {

                    startActivity(Intent(this@SplashActivity, DashboardActivity::class.java))
                } else {

                    startActivity(Intent(this@SplashActivity, DashboardActivity::class.java))
                }
                finish()
            },
            2500
        )
    }
}