package com.example.borger_kong;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ViewOrderActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private TextView no_order;

    public TextView totalAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order);

        no_order = findViewById(R.id.no_order);
        totalAmount = findViewById(R.id.totalAmountValue);

        recyclerView = (RecyclerView) findViewById(R.id.rv_orderedList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        Button empty_list = findViewById(R.id.btn_emptyList);

        final OrderAdapter orderAdapter = new OrderAdapter(StaticResource.orderedList);
        recyclerView.setAdapter(orderAdapter);

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    while (!isInterrupted()) {
                        Thread.sleep(250);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                if(StaticResource.orderedList.size() > 0){
                                    no_order.setVisibility(View.GONE);
                                } else {
                                    no_order.setVisibility(View.VISIBLE);
                                }

                                updateTotalAmount(StaticResource.orderedList);
                            }
                        });
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();

        empty_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StaticResource.orderedList.clear();
                Toast.makeText(getApplicationContext(), "All item removed.", Toast.LENGTH_SHORT).show();
                orderAdapter.notifyDataSetChanged();
            }
        });
    }

    public void updateTotalAmount(ArrayList<ArrayList<String>> ordered){
        ArrayList<ArrayList<String>> orderedList = ordered;
        double countTotalAmount = 0;
        for(int i = 0; i < orderedList.size(); i++){
            ArrayList<String> itemNQuantity = orderedList.get(i);
            Item item = ItemDatabase.getItemById(Integer.parseInt(itemNQuantity.get(0)));
            double itemPrice = item.getItemPrice();
            double quantity = Double.parseDouble(itemNQuantity.get(1));
            countTotalAmount = countTotalAmount + (itemPrice * quantity);
        }
        String finalTotal = StaticResource.df.format(countTotalAmount);
        totalAmount.setText("$" + finalTotal);
    }
}