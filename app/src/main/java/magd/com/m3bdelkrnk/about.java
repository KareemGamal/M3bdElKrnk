package magd.com.m3bdelkrnk;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);



        Toolbar toolbarTop = (Toolbar) findViewById(R.id.toolbar_top_child);
        TextView mTitle = (TextView) toolbarTop.findViewById(R.id.toolbar_title_child);

        Button back= (Button)findViewById(R.id.back_button1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Button link = (Button)findViewById(R.id.link);
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://www.magdsoft.com/"));
                startActivity(i);

            }
        });

    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
