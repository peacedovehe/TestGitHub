package com.rxx.gesturelockdemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        char data[] = {'a', 'b', 'd'};
        String str = new String(data);
        Log.i("phe", str);
        return super.onStartCommand(intent, flags, startId);
    }
}
