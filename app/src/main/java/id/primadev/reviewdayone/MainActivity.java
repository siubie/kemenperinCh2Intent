package id.primadev.reviewdayone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button btnDiskon,btnLuas,btnKeliling;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDiskon = findViewById(R.id.btnDiskon);
        btnKeliling = findViewById(R.id.btnKeliling);
        btnLuas = findViewById(R.id.btnLuas);

        btnDiskon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //intent untuk pindah activity
                Intent i = new Intent(getApplicationContext(),DiskonActivity.class);
                startActivity(i);
            }
        });
    }
}
