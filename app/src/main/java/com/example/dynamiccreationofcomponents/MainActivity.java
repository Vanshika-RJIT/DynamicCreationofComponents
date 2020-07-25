package com.example.dynamiccreationofcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipDrawable;
import com.google.android.material.chip.ChipGroup;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText t1;
    ChipGroup cg;

    //   ImageButton i;
//   int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        l = findViewById(R.id.ll);
        t1 = findViewById(R.id.edit_text);
        b = findViewById(R.id.button);
        cg=findViewById(R.id.chip_group);
//        i= findViewById(R.id.imageButton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              final  Chip chip = new Chip(MainActivity.this);
                ChipDrawable cd = ChipDrawable.createFromAttributes(MainActivity.this,
                        null,
                        0,
                        R.style.Widget_MaterialComponents_Chip_Entry);
                chip.setChipDrawable(cd);
                chip.setCheckable(false);
                chip.setClickable(false);
                chip.setChipIconResource(R.drawable.ic_baseline_add_circle_24);
                chip.setIconStartPadding(5f);
                chip.setPadding(50,10,50,10);
                chip.setText(t1.getText().toString());
                chip.setOnCloseIconClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cg.removeView(chip);
                    }
                }); chip.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this,chip.getText().toString(),Toast.LENGTH_SHORT).show();
                    }
                });
                cg.addView(chip);
                t1.setText("");
            }

        });


    }



//    public void btn_click(View view) {
//        Button b = new Button(MainActivity.this);
//        b.setText("Hii Everyone !!!!");
//        b.setHeight(120);
//        b.setWidth(120);
////        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT
////        );
////        l.addView(b,lp);
//        l.addView(b);
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                count++;
//                if(count==1) {
//                    EditText t1 = new EditText(MainActivity.this);
//                    t1.setHint("Enter Your Name");
//                    t1.setHeight(120);
//                    t1.setWidth(120);
//                    l.addView(t1);
//                }
//                if(count==2) {
//                    EditText t1 = new EditText(MainActivity.this);
//                    t1.setHint("Enter Your Age");
//                    t1.setHeight(120);
//                    t1.setWidth(120);
//                    l.addView(t1);
//                }
//                if(count==3) {
//                    EditText t1 = new EditText(MainActivity.this);
//                    t1.setHint("Enter Your Email Address");
//                    t1.setHeight(120);
//                    t1.setWidth(120);
//                    l.addView(t1);
//                }
//                if(count==4) {
//                    Button b = new Button(MainActivity.this);
//                    b.setText("Login");
//                    b.setHeight(120);
//                    b.setWidth(120);
//                    l.addView(b);
//                }
//
//
//            }
//        });
//}

}