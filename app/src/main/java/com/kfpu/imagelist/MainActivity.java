package com.kfpu.imagelist;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.kfpu.imagelist.adapters.ImageRecyclerAdapter;
import com.kfpu.imagelist.models.Image;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.rv_images)
    RecyclerView rv;
    private ImageRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        rv.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        adapter = new ImageRecyclerAdapter(MainActivity.this);
        ArrayList<Image> images = new ArrayList<>();
        images.add(new Image("CAT", "http://developer.alexanderklimov.ru/android/images/android_cat.jpg"));
        images.add(new Image("SKY", "https://cs8.pikabu.ru/post_img/big/2016/11/29/10/1480439597175676615.jpg"));
        images.add(new Image("Bioshock", "https://vignette.wikia.nocookie.net/904acc8f-f117-4fb4-8919-f4f3d90ccb46/scale-to-width-down/1024"));
        images.add(new Image("Supercar", "http://moneyinc.com/wp-content/uploads/2016/08/2017-Bugatti-Chiron.jpg"));
        images.add(new Image("Gravity Falls", "http://kto-ozvuchil.ru/wp-content/uploads/01-19.jpg"));
        adapter.setmImages(images);
        rv.setAdapter(adapter);
    }
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
