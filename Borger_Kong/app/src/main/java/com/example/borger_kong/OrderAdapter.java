package com.example.borger_kong;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.ViewHolder> {

    private ArrayList<ArrayList<String>> orderedList;


    public OrderAdapter(ArrayList<ArrayList<String>> orderedList){
        this.orderedList = orderedList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView itemName;
        public ImageView itemImage;
        public TextView itemPrice;
        public TextView subTotal;
        public TextView total;
        public ImageView delete;
        public ImageView increase;
        public ImageView decrease;
        public TextView itemQuantity;
        public TextView totalCalories;

        public ViewHolder(View itemView) {
            super(itemView);
            view = itemView;
            itemImage = view.findViewById(R.id.itemImage);
            itemName = view.findViewById(R.id.itemName);
            itemPrice = view.findViewById(R.id.itemPrice);
            subTotal = view.findViewById(R.id.subtotalPrice);
            total = view.findViewById(R.id.totalAmountValue);
            delete = view.findViewById(R.id.removeItem);
            increase = view.findViewById(R.id.btnAdd);
            decrease = view.findViewById(R.id.btnRemove);
            itemQuantity = view.findViewById(R.id.itemQuantity);
            totalCalories = view.findViewById(R.id.calories);
        }
    }

    @Override
    public OrderAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_detail, parent, false);
        ViewHolder vh = new ViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        final ArrayList<String> orderItem = orderedList.get(position);
        int quantity = Integer.parseInt(orderItem.get(1));

        final Item item = ItemDatabase.getItemById(Integer.parseInt(orderItem.get(0)));
        final double itemPrice = item.getItemPrice();

        holder.itemImage.setImageResource(item.getImageDrawableId());
        holder.itemName.setText(item.getItemName());
        holder.itemPrice.setText("$" + itemPrice + " ea");
        holder.itemQuantity.setText(String.valueOf(quantity));

        final int calories = Integer.parseInt(item.getNutritionInfo().
                substring(0, item.getNutritionInfo().indexOf("\n")));

        holder.totalCalories.setText(String.valueOf(calories * quantity) + "Kcal");
        holder.subTotal.setText("$" + StaticResource.df.format(itemPrice * quantity));

        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StaticResource.orderedList.remove(position);
                Toast.makeText(v.getContext(), item.getItemName() + " was removed.",
                        Toast.LENGTH_SHORT).show();
                notifyDataSetChanged();
            }
        });

        holder.increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int quantity = 0;
                quantity = Integer.parseInt(holder.itemQuantity.getText().toString());
                quantity = quantity + 1;
                if(quantity > 99){
                    quantity = 99;
                    Toast.makeText(v.getContext(), "Maximum quantity: 99",
                            Toast.LENGTH_SHORT).show();
                }
                holder.itemQuantity.setText(String.valueOf(quantity));
                orderItem.set(1, holder.itemQuantity.getText().toString());
                StaticResource.orderedList.set(position, orderItem);

                holder.totalCalories.setText(String.valueOf(calories * quantity) + "Kcal");
                holder.subTotal.setText("$" + StaticResource.df.format(itemPrice * quantity));
            }
        });

        holder.decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int quantity = 0;
                quantity = Integer.parseInt(holder.itemQuantity.getText().toString());
                quantity = quantity - 1;
                if(quantity < 1){
                    quantity = 1;
                    Toast.makeText(v.getContext(), "Minimum quantity: 1\n" +
                                    "Press remove button on top right to remove order.",
                            Toast.LENGTH_SHORT).show();
                }
                holder.itemQuantity.setText(String.valueOf(quantity));
                orderItem.set(1, holder.itemQuantity.getText().toString());
                StaticResource.orderedList.set(position, orderItem);

                holder.totalCalories.setText(String.valueOf(calories * quantity) + "Kcal");
                holder.subTotal.setText("$" + StaticResource.df.format(itemPrice * quantity));
            }
        });
    }

    @Override
    public int getItemCount() {
        return orderedList.size();
    }
}
