package dhani.iak.com.ipaterpadu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   TextView btnFisika, btnBiologi, btnKimia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //untuk button page fisika
        btnFisika = (TextView) findViewById(R.id.btnFisika);
        btnFisika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Anda Masuk ke Soal Fisika", Toast.LENGTH_SHORT).show();
                Intent a1 = new Intent(getApplicationContext(), FisikaActivity.class);
                startActivity(a1);
            }
        });

        //untuk button page biologi
        btnBiologi = (TextView) findViewById(R.id.btnBiologi);
        btnBiologi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Anda Masuk ke Soal Biologi", Toast.LENGTH_SHORT).show();
                Intent a1 = new Intent(getApplicationContext(), BiologiActivity.class);
                startActivity(a1);
            }
        });

        //untuk button page kimia
        btnKimia = (TextView) findViewById(R.id.btnKimia);
        btnKimia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Anda Masuk ke Soal Extract Bonus", Toast.LENGTH_SHORT).show();
                Intent a1 = new Intent(getApplicationContext(), KimiaActivity.class);
                startActivity(a1);
            }
        });
    }
}
