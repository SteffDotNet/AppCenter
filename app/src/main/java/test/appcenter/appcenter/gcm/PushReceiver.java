package test.appcenter.appcenter.gcm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.gcm.GcmReceiver;

public class PushReceiver extends GcmReceiver {

    public static final String DATA = "data";
    public static final String WAKE_UP = "WakeUp";
    public static final String NEW_ISSUE = "NewIssue";

    @Override
    public void onReceive(Context context, Intent intent) {

        Bundle bundle = intent.getExtras();
        String data = bundle.getString(DATA);
    }
}
