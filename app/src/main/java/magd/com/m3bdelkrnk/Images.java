package magd.com.m3bdelkrnk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;
import java.util.List;

public class Images extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView_dAdapter recyclerView_dAdapter;
    public List<List_Item> listItems;


    ListView gv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);

        Button Back = (Button)findViewById(R.id.back_button2);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



        MobileAds.initialize(Images.this , "ca-app-pub-2706569992906314~7597149382");

        AdView mAdView = (AdView) findViewById(R.id.adView2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        recyclerView = (RecyclerView) findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);

        listItems = new ArrayList<>();

        listItems.add(new List_Item("معبد الكرنك(معبد امون رع)", R.drawable.p5));
        listItems.add(new List_Item("طريق الكباش", R.drawable.p11));
        listItems.add(new List_Item("طريق الكباش", R.drawable.p3));
        listItems.add(new List_Item("معبد الكرنك", R.drawable.p4));
        listItems.add(new List_Item("بهو الاحتفالات", R.drawable.p12));
        listItems.add(new List_Item("معبد الكرنك", R.drawable.p6));
        listItems.add(new List_Item("معبد الكرنك", R.drawable.p7));
        listItems.add(new List_Item("مقصورة المركب المقدسة", R.drawable.p13));

        recyclerView_dAdapter = new RecyclerView_dAdapter(listItems, this);
        recyclerView.setAdapter(recyclerView_dAdapter);





    }

    @Override
    public void onBackPressed() {
            finish();
    }
}
