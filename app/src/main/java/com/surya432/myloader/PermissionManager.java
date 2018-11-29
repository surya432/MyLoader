package com.surya432.myloader;

import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;

class PermissionManager {
    public static boolean isGranted(MainActivity activity, String permission) {
        return (ActivityCompat.checkSelfPermission(activity, permission) == PackageManager.PERMISSION_GRANTED);

    }

    public static void check(MainActivity activity, String permission, int requestCode) {
        if (ActivityCompat.checkSelfPermission(activity, permission) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(activity, new String[]{permission}, requestCode);
        }
    }
}
