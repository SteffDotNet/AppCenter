package test.appcenter.appcenter

import android.app.Application
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes
import com.microsoft.appcenter.push.Push
import test.appcenter.appcenter.gcm.MyPushListener

class App : Application(){

    override fun onCreate() {
        super.onCreate()
        Push.setEnabled(true)
        Push.setSenderId("235068313137")
        Push.setListener(MyPushListener())
        AppCenter.start(this, "d6468d49-6cb5-493e-8df2-1fe3aec88278", Analytics::class.java, Crashes::class.java, Push::class.java)
    }
}