package com.sakib635.sakibsfoodvalley.Controller;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.sakib635.sakibsfoodvalley.TestCode.Model.chefFoodPanel.ChefHomeFragment;
import com.sakib635.sakibsfoodvalley.TestCode.Model.chefFoodPanel.ChefOrderFragment;
import com.sakib635.sakibsfoodvalley.TestCode.Model.chefFoodPanel.ChefPendingOrdersFragment;
import com.sakib635.sakibsfoodvalley.TestCode.Model.chefFoodPanel.ChefProfileFragment;
import com.sakib635.sakibsfoodvalley.R;

public class ChefFoodPanel_BottomNavigation extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chef_food_panel__bottom_navigation);
        BottomNavigationView navigationView = findViewById(R.id.chef_bottom_navigation);
        navigationView.setOnNavigationItemSelectedListener( this);
        String name =getIntent().getStringExtra("PAGE");
        if (name!=null){
            if (name.equalsIgnoreCase("Orderpage")){
                loadcheffragment(new ChefPendingOrdersFragment());

            }else  if (name.equalsIgnoreCase("Confirmpage")){
                loadcheffragment(new ChefOrderFragment());

            }else  if (name.equalsIgnoreCase("AcceptOrderpage")){
                loadcheffragment(new ChefOrderFragment());

            }else  if (name.equalsIgnoreCase("Deliveredpage")){
                loadcheffragment(new ChefOrderFragment());

            }
        }else {
            loadcheffragment(new ChefHomeFragment());
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()){
            case R.id.chefHome:
                fragment=new ChefHomeFragment();
                break;

            case R.id.Orders:
                fragment=new ChefOrderFragment();
                break;
            case R.id.chefProfile:
                fragment=new ChefProfileFragment();
                break;
        }
        return loadcheffragment(fragment);
    }

    private boolean loadcheffragment(Fragment fragment) {

        if (fragment != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,fragment).commit();
            return true;
        }
        return false;
    }
}