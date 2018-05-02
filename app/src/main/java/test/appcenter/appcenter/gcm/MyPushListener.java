package test.appcenter.appcenter.gcm;

import android.app.Activity;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;
import com.microsoft.appcenter.push.PushListener;
import com.microsoft.appcenter.push.PushNotification;

/**
 * Created by Egor on 02.05.2018.
 */

public class MyPushListener implements PushListener {

    @Override
    public void onPushNotificationReceived(Activity activity, PushNotification pushNotification) {

        /* The following notification properties are available. */
        String title = pushNotification.getTitle();
        String message = pushNotification.getMessage();
       // Map<String, String> customData = pushNotification.getCustomData();

        if (message != null) {

            /* Display an alert for foreground push. */
            AlertDialog.Builder dialog = new AlertDialog.Builder(activity);
            if (title != null) {
                dialog.setTitle(title);
            }
            dialog.setMessage(message);
            dialog.setPositiveButton(android.R.string.ok, null);
            dialog.show();
        }
    }
}