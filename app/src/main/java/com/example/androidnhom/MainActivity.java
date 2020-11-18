package com.example.androidnhom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvdanhsach;
    ArrayList<danhsach> mangdanhsach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvdanhsach=(ListView) findViewById(R.id.listdanhsach);
        mangdanhsach= new ArrayList<>();

        mangdanhsach.add(new danhsach("Vinmart","Chuỗi siêu thị uy tín. Sản phẩm đa dạng, vận chuyển siêu tốc","Tích 3%",R.drawable.a2));
        mangdanhsach.add(new danhsach("Mejiii","Nhãn hiệu sửa bán chạy số 1 tại Nhật bản","Tích 5%",R.drawable.a3));
        mangdanhsach.add(new danhsach("Bác Tôm","Đặc sản vùng miền","Tích 5%",R.drawable.a4));
        danhsachAdapter adapter= new danhsachAdapter(
                MainActivity.this,
                R.layout.dongdanhsach,
                mangdanhsach
        );
        lvdanhsach.setAdapter(adapter);


    }
}