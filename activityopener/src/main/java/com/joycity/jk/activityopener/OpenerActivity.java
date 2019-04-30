package com.joycity.jk.activityopener;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;

import com.unity3d.player.UnityPlayer;
import com.unity3d.player.UnityPlayerActivity;

/**
 * Created by jeongkeun Roh on 2018. 11. 14..
 */

public class OpenerActivity  extends UnityPlayerActivity{

    private static final String TAG = "[Opener Plugin]";

    static void OpenActivity(String url){
        if(TextUtils.isEmpty(url)){
            Log.d(TAG,"Url is empty!");
        }else{

            Uri uri = Uri.parse(url);

            if(uri == null){
                Log.d(TAG,"Can't parse url param");
            }else{
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                UnityPlayer.currentActivity.startActivity(intent);
                Log.d(TAG," Call startActivity(url)!");
            }
        }
    }

}
