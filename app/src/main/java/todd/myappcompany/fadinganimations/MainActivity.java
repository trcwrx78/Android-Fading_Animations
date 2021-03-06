package todd.myappcompany.fadinganimations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean toggle = false;

    public void fade(View view) {
        Log.i("info", "Button has been clicked");

        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);

        if(toggle) {
            bartImageView.animate().alpha(1).setDuration(2000);
            homerImageView.animate().alpha(0).setDuration(2000);
            toggle = false;
        } else {
            bartImageView.animate().alpha(0).setDuration(2000);
            homerImageView.animate().alpha(1).setDuration(2000);
            toggle = true;
        }

//        bartImageView.animate().translationYBy(1000).setDuration(2000);

//        bartImageView.animate().rotation(1000).alpha(0).setDuration(1000);

//        bartImageView.animate().scaleX(.5f).scaleY(.5f).setDuration(1000);



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);

        bartImageView.animate().alpha(1).translationX(1400).rotation(360 * 4).setDuration(2000);
    }

}