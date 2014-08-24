package org.ethack.orwall;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

import org.ethack.orwall.lib.Constants;
import org.ethack.orwall.lib.NatRules;

public class UninstallBroadcast extends BroadcastReceiver {
    private final static String TAG = "UninstallBroadcast";

    public UninstallBroadcast() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();

        if (!data.getScheme().equals("package")) {
            Log.d(TAG, "Intent scheme was not 'package'");
            return;
        }

        boolean replacing = intent.getBooleanExtra(Intent.EXTRA_DATA_REMOVED, false);

        if (Intent.ACTION_PACKAGE_REMOVED.equals(intent.getAction()) && !replacing) {
            final long uid = intent.getIntExtra(Intent.EXTRA_UID, -123);

            // First: remove rule from firewall if any
            Intent bgpProcess = new Intent(context, BackgroundProcess.class);
            bgpProcess.putExtra(Constants.PARAM_APPNAME, intent.getData().getSchemeSpecificPart());
            bgpProcess.putExtra(Constants.PARAM_APPUID, uid);
            bgpProcess.putExtra(Constants.ACTION, Constants.ACTION_RM_RULE);
            context.startService(bgpProcess);

            // Second: remove app from NatRules if present
            NatRules natRules = new NatRules(context);
            natRules.removeAppFromRules(uid);

        }
    }
}