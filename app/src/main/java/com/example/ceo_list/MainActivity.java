package com.example.ceo_list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView List_View;
    List<ModelData> l1 = new ArrayList();

    int[] img = {R.drawable.satya_nadella,R.drawable.sundar_pichai,R.drawable.tim_kook,R.drawable.james_quincey,R.drawable.elon_musk,R.drawable.jong_hee_han,R.drawable.mukesh_ambani,R.drawable.shantanu_narayen};
    String[] name = {"Satya Nadella","Sundar Pichai","Tim Kook","james_quincey","elon_musk","jong_hee_han","mukesh_ambani","shantanu_narayen"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initBinding();

        for (int i=0;i<name.length;i++)
        {
            ModelData M1 = new ModelData();
            M1.setImg(img[i]);
            M1.setName(name[i]);
            l1.add(M1);
        }
        initDataAdapter();
    }

    void initBinding()
    {
        List_View = findViewById(R.id.List_View);
    }


    void initDataAdapter()
    {
         MyAdapter myAdapter= new MyAdapter(this,l1);
         List_View.setAdapter(myAdapter);
    }

}
