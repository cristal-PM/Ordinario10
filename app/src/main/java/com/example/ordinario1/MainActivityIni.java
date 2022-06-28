package com.example.ordinario1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class MainActivityIni extends AppCompatActivity {
private ViewPager2 viewPager2;
private int[] images={R.drawable.x1,R.drawable.x2,R.drawable.x3,R.drawable.x4};
  private SlidePagerAdapter MyAdapter;
private  int cont;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ini);
        viewPager2=findViewById(R.id.pager);
        MyAdapter=new SlidePagerAdapter(images);
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER);
        viewPager2.setAdapter(MyAdapter);
    CompositePageTransformer transformer= new CompositePageTransformer();
    transformer.addTransformer(new MarginPageTransformer(40));
    transformer.addTransformer(new ViewPager2.PageTransformer() {
        @Override
        public void transformPage(@NonNull View page, float position) {
            float r=1-Math.abs(position);
            page.setScaleY(0.95F +r*0.15F);
            page.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switch(cont){
                        case 1: Intent i=new Intent(MainActivityIni.this,MapsActivity4.class);
                            startActivity(i); break;
                        case 2: Intent i1=new Intent(MainActivityIni.this,MapsActivity3.class);
                            startActivity(i1); break;
                        case 3:Intent i2=new Intent(MainActivityIni.this,MapsActivity2.class);
                            startActivity(i2); break;
                        case 4: Intent i3=new Intent(MainActivityIni.this,MapsActivity.class);
                            startActivity(i3);break;
                    }
                }
            });
        }
    });
    viewPager2.setPageTransformer(transformer);
    viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
        @Override
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            switch (position){
                case 0: cont=1; break;
                case 1: cont=2; break;
                case 2: cont=3; break;
                case 3: cont=4; break;
                default: cont=0; break;
            }
        }
    });
    }
}