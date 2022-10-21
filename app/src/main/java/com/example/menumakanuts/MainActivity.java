package com.example.menumakanuts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rec_Makanan;
    private ArrayList<Kuliner> listMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rec_Makanan = findViewById(R.id.rec_Makanan);
        initData();
        rec_Makanan.setAdapter(new KulinerAdapter(listMakanan));
        rec_Makanan.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData() {
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new Kuliner("Nasi Pecel Lele",
                "Rp. 15.000",
                "Nasi Pecel Lele merupakan menu andalan yang paling laris. Menu ini tersedia Nasi, Lele Goreng, Sambal, dan Lalapan. Menu ini dibuat Special dengan bumbu racikan tersendiri dan memiliki rasa yang khas.",
                R.drawable.pecel));
        listMakanan.add(new Kuliner("Nasgor Mercon",
                "Rp. 14.500",
                "Nasi Goreng Mercon merupakan Nasi goreng yang terdapat banyak cabai, dibuat dengan menggunakan bumbu khusus sehingga rasanya sangat berbeda dari yang lain.",
                R.drawable.kariayam));
        listMakanan.add(new Kuliner("Ayam Geprek Keju",
                "Rp. 20.000",
                "Ayam Geprek Keju merupakan Ayam Goreng Krispy. Penyajiannya dengan cara geprek dengan sambal yang bisa ditentukan. Lalu diberi Keju sehingga rasanya sangat enak",
                R.drawable.geprekkeju));
        listMakanan.add(new Kuliner("Kari Ayam",
                "Rp. 17.500",
                "Kari Ayam merupakan menu Varian Ayam dengan menggunakan kari kental dan dipadukan dengan bumbu khusus sehingga rasanya gurih dan manis.",
                R.drawable.kariayam));
        listMakanan.add(new Kuliner("Tahu Bulat",
                "Rp. 500",
                "Tahu Bulat merupakan menu pendamping makanan. Tahu bulat sendiri seperti pada umumnya tetapi rasanya lebih lezat karna menggunakan bumbu khusus",
                R.drawable.tahubulat));
        listMakanan.add(new Kuliner("Salad Buah",
                "Rp. 12.000",
                "Salad Buah merupakan menu makanan penutup. Menu ini sangat cocok untuk hidangan penutup karna rasanya yang manis dan segar.",
                R.drawable.saladbuah));
    }


}