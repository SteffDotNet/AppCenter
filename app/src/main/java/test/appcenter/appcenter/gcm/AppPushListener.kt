package test.appcenter.appcenter.gcm

import android.app.Activity
import android.support.v7.app.AlertDialog
import com.microsoft.appcenter.push.PushListener
import com.microsoft.appcenter.push.PushNotification


class AppPushListener : PushListener {

    override fun onPushNotificationReceived(activity: Activity?, pushNotification: PushNotification?) {
        val title = pushNotification?.title
        val message = pushNotification?.message
        val map = pushNotification?.customData

        if (message != null) {

            /* Display an alert for foreground push. */
            val dialog = AlertDialog.Builder(activity!!)
            dialog.setTitle(title)
            dialog.setMessage(message)
            if(map != null){
                dialog.setMessage("$message" +"\n" + "$map")
            }
            dialog.setPositiveButton(android.R.string.ok, null)
            dialog.show()
        }
    }
}