package com.sakib635.sakibsfoodvalley.TestCode.Model.customerFoodPanel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.sakib635.sakibsfoodvalley.R;

public class CustomerOrderFragment  extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_customerorder,null);
        Button btn2 = (Button) v.findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "checked out" , Toast.LENGTH_SHORT ).show();
                RelativeLayout mainLayout = v.findViewById(R.id.test_layout);

                // Remove all child views from the layout
                mainLayout.removeAllViews();
            }
        });
        return v;
    }

}
