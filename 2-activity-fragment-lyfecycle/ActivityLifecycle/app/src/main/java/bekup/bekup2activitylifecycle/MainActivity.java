package bekup.bekup2activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String tag = "Bek-Up Lifecycle";

    /*
    Activity have six states
        Created
        Started
        Resumed
        Paused
        Stopped
        Destroyed

    Activity lifecycle have seven methods
        onCreate()
        onStart()
        onResume()
        onPause()
        onStop()
        onRestart()
        onDestroy()
     */

    /**
     *
     * @param savedInstanceState
     *
     * onCreate() dipanggil waktu activity pertama dibuat. Di sini biasanya
     * static setup dikerja (contohnya bikin view, bind data ke list, dll.
     * Ada ikut bundle dari activity yang sebelumnya di freeze (kalau ada)
     *
     * biasanya diikuti sama onStart()
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "In the onCreate() event");
        Toast.makeText(MainActivity.this, "onCreate() event", Toast.LENGTH_SHORT).show();
    }

    /**
     * onStart dipanggil kalau activity terlihat oleh user.
     * biasanya diikuti sama onResume() kalau activity ke foreground
     * atau diikuti onStop() kalau activity di-hidden
     */
    public void onStart()
    {
        super.onStart();
        Log.d(tag, "In the onStart() event");
        Toast.makeText(MainActivity.this, "onStart() event", Toast.LENGTH_SHORT).show();
    }

    /**
     * onRestart() kepanggil kalau activiry habis distop trus di jalankan lagi.
     * diikutin sama onStart()
     */
    public void onRestart()
    {
        super.onRestart();
        Log.d(tag, "In the onRestart() event");
        Toast.makeText(MainActivity.this, "onRestart() event", Toast.LENGTH_SHORT).show();
    }

    /**
     * onResume() kepanggil kalau activity posisinya paling atas. jadi activity yang interaksi ama user
     * biasa diikuti sama onPause()
     */
    public void onResume()
    {
        super.onResume();
        Log.d(tag, "In the onResume() event");
        Toast.makeText(MainActivity.this, "onResume() event", Toast.LENGTH_SHORT).show();
    }

    /**
     * onPause() dipanggil waktu activity ke background tapi belum di kill
     *
     */
    public void onPause()
    {
        super.onPause();
        Log.d(tag, "In the onPause() event");
        Toast.makeText(MainActivity.this, "onPause() event", Toast.LENGTH_SHORT).show();
    }

    /**
     * onStrop() kepanggil kalau activity udah nda kelihatan sama user (dibackground)
     * habis dari onStop() pilihannya tinggal onDestroy() atau onRestart()
     */
    public void onStop()
    {
        super.onStop();
        Log.d(tag, "In the onStop() event");
        Toast.makeText(MainActivity.this, "onStop() event", Toast.LENGTH_SHORT).show();
    }

    /**
     * akhir hidupnya activity atau 'panggilan terakhir'
     * onDestroy() kepanggil sebelum activity di kill. entah gara2 perintah finish() atau system yang kill
     */
    public void onDestroy()
    {
        super.onDestroy();
        Log.d(tag, "In the onDestroy() event");
        Toast.makeText(MainActivity.this, "onDestroy() event", Toast.LENGTH_SHORT).show();
    }
}
