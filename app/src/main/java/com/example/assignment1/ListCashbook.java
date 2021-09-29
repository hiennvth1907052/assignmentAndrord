package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.assignment1.adapter.CashbookAdapter;
import com.example.assignment1.database.AppDatabase;
import com.example.assignment1.database.Cashbook;

import java.util.List;

public class ListCashbook extends AppCompatActivity {

    RecyclerView rvCashbook;
    AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_cashbook);

        db = AppDatabase.getAppDatabase(this);
        List<Cashbook> list = db.cashbookDao().getAllCashbook();

        CashbookAdapter adapter = new CashbookAdapter(this, list);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        rvCashbook = findViewById(R.id.rvCashbook);
        rvCashbook.setLayoutManager(layoutManager);
        rvCashbook.setAdapter(adapter);
    }
}