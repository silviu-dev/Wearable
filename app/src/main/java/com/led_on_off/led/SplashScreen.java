package com.led_on_off.led;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by PEACE on 3/30/2016.
 */
public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(2000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{

                    Intent intent = new Intent(SplashScreen.this, LogInActivity.class);
                    startActivity(intent);
//                    Accelerometer mysensor=new Accelerometer(getApplicationContext());
//                    new Thread(mysensor).start();
//                    BackgroudThread mainThread=new BackgroudThread(mysensor,getApplicationContext());
//                    mainThread.execute();
//                    Intent intent = new Intent(SplashScreen.this, MainActivity.class);
//                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }
    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }

}
