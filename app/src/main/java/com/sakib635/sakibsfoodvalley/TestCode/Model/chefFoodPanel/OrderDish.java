package com.sakib635.sakibsfoodvalley.TestCode.Model.chefFoodPanel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.sakib635.sakibsfoodvalley.R;
import com.sakib635.sakibsfoodvalley.databinding.ActivityMainBinding;

public class OrderDish extends AppCompatActivity {

    ActivityMainBinding binding;
    String RandomId, ChefID;
    ImageView imageView;
    ElegantNumberButton additem;
    TextView Foodname, ChefName, ChefLoaction, FoodQuantity, FoodPrice, FoodDescription;
    DatabaseReference databaseReference, dataaa, chefdata, reference, data, dataref;
    String State, City, Sub, dishname;
    int dishprice;
    String custID;
    FirebaseDatabase dishDBref;
    TextView email;
    TextView subject;
    EditText etBody;
    Button buy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_dish);
        etBody = findViewById(R.id.etBody);
        buy = findViewById(R.id.buy_btn);

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase.getInstance().getReference().child("DISH").setValue("10");
                Toast.makeText(OrderDish.this,"orderd sucesfully",Toast.LENGTH_SHORT).show();
            }
        });
    }

}