package com.example.hiyoriaya.notificationtest;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener{

    private static final int ID_NOTIFICATION = 1;

    private NotificationManager manager;
    Button nb;
    Button nb2;
    Button nb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        nb = (Button)findViewById(R.id.nb);
        nb.setOnClickListener(this);
        nb2 = (Button)findViewById(R.id.nb2);
        nb2.setOnClickListener(this);
        nb3 = (Button)findViewById(R.id.nb3);
        nb3.setOnClickListener(this);
    }


    public void onShowNotification(View v) {
        // メッセージをクリックした時のインテントを作成する
        final Intent notificationIntent = new Intent(this, Notification.class);
        final PendingIntent contentIntent = PendingIntent.getActivity(this, 0,
                notificationIntent, 0);
        final Notification notification;
        switch(v.getId()){
            case R.id.nb:
                // 通知用のオブジェクトを作成する
                notification = new Notification.Builder(this)
                        .setTicker("カンカンカンカンカンカン！！！")
                        .setContentTitle("なりました。")
                        .setContentText("なってます。")
                        .setContentIntent(contentIntent)
                        .setSmallIcon(android.R.drawable.ic_lock_idle_alarm)
                        .setLargeIcon(
                                BitmapFactory.decodeResource(getResources(),
                                        R.drawable.ic_launcher_web))
                        .setWhen(System.currentTimeMillis())
                        .setContentInfo("なったということです。")
                        .setAutoCancel(true)
                        .setVibrate(
                                new long[]{1000, 700, 250, 700, 250, 700, 250})
                        .setLights(Color.WHITE, 1000, 500).getNotification();
                break;
            case R.id.nb2:
                // 通知用のオブジェクトを作成する
                        notification = new Notification.Builder(this)
                        .setTicker("（……カン……カン…………）")
                        .setContentTitle("なったかもしれません")
                        .setContentText("なってますかね？")
                        .setContentIntent(contentIntent)
                        .setSmallIcon(android.R.drawable.ic_lock_idle_alarm)
                        .setLargeIcon(
                                BitmapFactory.decodeResource(getResources(),
                                        R.drawable.ic_launcher_web))
                        .setWhen(System.currentTimeMillis())
                        .setContentInfo("なってそうですけど。")
                        .setAutoCancel(true)
                        .setVibrate(
                                new long[]{1000, 700, 250, 700, 250, 700, 250})
                        .setLights(Color.WHITE, 1000, 500).getNotification();
                break;
            case R.id.nb3:
                        notification = new Notification.Builder(this)
                        .setTicker("（………。）")
                        .setContentTitle("なってないです。")
                        .setContentText("なってないですよね？")
                        .setContentIntent(contentIntent)
                        .setSmallIcon(android.R.drawable.ic_lock_idle_alarm)
                        .setLargeIcon(
                                BitmapFactory.decodeResource(getResources(),
                                        R.drawable.ic_launcher_web))
                        .setWhen(System.currentTimeMillis())
                        .setContentInfo("なってはないですよ。")
                        .setAutoCancel(true)
                        .setVibrate(
                                new long[]{1000, 700, 250, 700, 250, 700, 250})
                        .setLights(Color.WHITE, 1000, 500).getNotification();
                break;
            default:
                notification = new Notification.Builder(this)
                        .setTicker("（………。）")
                        .setContentTitle("なってないです。")
                        .setContentText("なってないですよね？")
                        .setContentIntent(contentIntent)
                        .setSmallIcon(android.R.drawable.ic_lock_idle_alarm)
                        .setLargeIcon(
                                BitmapFactory.decodeResource(getResources(),
                                        R.drawable.ic_launcher_web))
                        .setWhen(System.currentTimeMillis())
                        .setContentInfo("なってはないですよ。")
                        .setAutoCancel(true)
                        .setVibrate(
                                new long[]{1000, 700, 250, 700, 250, 700, 250})
                        .setLights(Color.WHITE, 1000, 500).getNotification();
                break;
        }


        manager.notify(ID_NOTIFICATION, notification);
    }

    @Override
    public void onClick(View v) {
        onShowNotification(v);
    }
}
