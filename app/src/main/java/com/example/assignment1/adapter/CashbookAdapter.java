package com.example.assignment1.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment1.R;
import com.example.assignment1.database.Cashbook;

import java.util.List;

public class CashbookAdapter extends RecyclerView.Adapter {
    Activity activity;
    List<Cashbook> listCashbook;

    public CashbookAdapter(Activity activity, List<Cashbook> listCashbook) {
        this.activity = activity;
        this.listCashbook = listCashbook;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = activity.getLayoutInflater().inflate(, parent, false);
        CashbookHolder holder = new CashbookHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        CashbookHolder vh = (CashbookHolder) holder;
        Cashbook model = listCashbook.get(position);
        vh.tvID.setText(model.id + "");
        vh.tvName.setText(model.name);
        vh.tvPrice.setText(model.price);
    }

    @Override
    public int getItemCount() {
        return listCashbook.size();
    }

    public class CashbookHolder extends RecyclerView.ViewHolder {

        TextView tvName, tvID, tvPrice;

        public CashbookHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvID = itemView.findViewById(R.id.tvID);
            tvPrice = itemView.findViewById(R.id.tvPrice);
        }
    }
}
