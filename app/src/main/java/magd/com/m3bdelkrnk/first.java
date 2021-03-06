package magd.com.m3bdelkrnk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import com.google.android.gms.ads.MobileAds;

public class first extends AppCompatActivity implements View.OnClickListener {

    Button pictures , history , teach , about ;

    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        pictures= (Button)findViewById(R.id.images);
        history= (Button)findViewById(R.id.history);
        teach= (Button)findViewById(R.id.teach);
        about= (Button)findViewById(R.id.about);

        pictures.setOnClickListener(this);
        history.setOnClickListener(this);
        teach.setOnClickListener(this);
        about.setOnClickListener(this);

        MobileAds.initialize(first.this , "ca-app-pub-2706569992906314~7597149382");

        AdView mAdView = (AdView) findViewById(R.id.adView2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if(id==R.id.images)
        {
            Intent i = new Intent(first.this , Images.class);
            startActivity(i);
        }

        if(id==R.id.history)
        {
            Intent i = new Intent(first.this , Detail.class);
            i.putExtra("barName", "تاريخ معبد الكرنك");
            startActivity(i);
        }
        if(id==R.id.teach)
        {
            Intent i = new Intent(first.this , Detail.class);
            i.putExtra("barName", "شرح سياحي لمعبد الكرنك");
            startActivity(i);
        }
        if(id==R.id.about)
        {
            Intent i = new Intent(first.this , about.class);
            startActivity(i);
        }
    }

    @Override
    public void onBackPressed() {
        counter++;
        Toast.makeText(this, "اضغط مرة ثانية اذا كنت تود الخروج من البرنامج", Toast.LENGTH_LONG).show();
        if(counter==2){
           System.exit(0);
            counter=0;
        }

    }
}
