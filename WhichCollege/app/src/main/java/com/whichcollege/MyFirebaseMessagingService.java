package com.whichcollege;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessagingService;

import static android.support.constraint.Constraints.TAG;

public class MyFirebaseMessagingService extends FirebaseMessagingService {


    @Override
    public void onNewToken(String token) {
        String deviceToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + deviceToken);


    }
}
