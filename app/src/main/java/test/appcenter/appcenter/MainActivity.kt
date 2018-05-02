package test.appcenter.appcenter

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.push.Push
import kotlinx.android.synthetic.main.activity_main.buttonCrash
import kotlinx.android.synthetic.main.activity_main.buttonPush

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCrash.setOnClickListener {
            var res = 100/0
        }

        buttonPush.setOnClickListener{
            Push.setSenderId("235068313137")
            AppCenter.start(application, "d6468d49-6cb5-493e-8df2-1fe3aec88278", Push::class.java)
        }

    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Push.checkLaunchedFromNotification(this, intent)
    }
}
