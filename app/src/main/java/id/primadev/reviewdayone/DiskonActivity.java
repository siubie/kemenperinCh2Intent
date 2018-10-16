package id.primadev.reviewdayone;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created on 16/10/18.
 */

public class DiskonActivity extends AppCompatActivity{
    public Button btnHitungDiskon;
    public TextView txtHasilDiskon;
    public EditText mHarga,mDiskon;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diskon);

        btnHitungDiskon = findViewById(R.id.btnHitungDiskon);
        txtHasilDiskon = findViewById(R.id.txtHasilDiskon);
        mHarga = findViewById(R.id.mHarga);
        mDiskon = findViewById(R.id.mDiskon);
        //ketika tombol diskon di klik
        btnHitungDiskon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(
                    !mHarga.getText().toString().matches("")
                    &&
                    !mDiskon.getText().toString().matches("")){
                    //ambil nilai harga
                    float harga = Float.parseFloat(mHarga.getText().toString());
                    //ambil nilai diskon
                    float diskon = Float.parseFloat(mDiskon.getText().toString());
                    //hitung nilai setelah diskon
                    float hasil = harga-(harga*diskon/100);
                    //tampilkan nilai diskonnya
                    txtHasilDiskon.setText(Float.toString(hasil));
                }else{
                    Toast.makeText(DiskonActivity.this,
                            "Mohon Lengkapi data",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
