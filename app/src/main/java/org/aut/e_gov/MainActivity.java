package org.aut.e_gov;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnNews, btnWeather, btnMoneyTransfer, btnBuyCredit, btnHafez, btnBalance, btnDonation, btnStock;
    TextView txtName;

    public void findViews(){
        txtName = findViewById(R.id.txtNameView);
        btnNews = findViewById(R.id.btnNews);
        btnWeather = findViewById(R.id.btnWeather);
        btnMoneyTransfer = findViewById(R.id.btnMoneyTransfer);
        btnBuyCredit = findViewById(R.id.btnBuyCharge);
        btnHafez = findViewById(R.id.btnHafez);
        btnBalance = findViewById(R.id.btnBalance);
        btnDonation = findViewById(R.id.btnDonation);
        btnStock = findViewById(R.id.btnStock);
    }
    public void implementClickListeners(){
        btnNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(MainActivity.this, NewsActivity.class));
                Intent intent = new Intent(MainActivity.this, NewsActivity.class);
                startActivity(intent);
            }
        });

        btnWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WeatherActivity.class);
                startActivity(intent);

            }
        });

        btnMoneyTransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MoneyTransfer.class);
                intent.putExtra("destCard", "");
                intent.putExtra("count", 0);
                startActivity(intent);
            }
        });

        btnBuyCredit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BuyCreditActivity.class);
                startActivity(intent);
            }
        });

        btnHafez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HafezActivity.class);
                startActivity(intent);
            }
        });

        btnBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BalanceActivity.class);
                startActivity(intent);
            }
        });

        btnDonation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DonationActivity.class);
                startActivity(intent);
            }
        });
        btnStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StockActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        txtName.setText(GlobalVariables.name);
        implementClickListeners();

    }
}
