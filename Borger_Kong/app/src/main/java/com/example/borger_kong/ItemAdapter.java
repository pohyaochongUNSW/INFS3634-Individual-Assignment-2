package com.example.borger_kong;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private ArrayList<Item> itemList;

    public ItemAdapter(ArrayList<Item> itemList){
        this.itemList = itemList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView itemName;
        public ImageView itemImage;
        public TextView itemPrice;
        public TextView shortDescription;
        public TextView calories;

        public ViewHolder(View itemView) {
            super(itemView);
            view = itemView;
            itemImage = view.findViewById(R.id.itemImage);
            itemName = view.findViewById(R.id.itemName);
            itemPrice = view.findViewById(R.id.itemPrice);
            shortDescription = view.findViewById(R.id.shortDescription);
            calories = view.findViewById(R.id.calories);
        }
    }

    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        ViewHolder vh = new ViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(ItemAdapter.ViewHolder holder, final int position) {
        Item item = itemList.get(position);
        holder.itemName.setText(item.getItemName());
        holder.itemImage.setImageResource(item.getImageDrawableId());
        holder.itemPrice.setText("$" + String.valueOf(item.getItemPrice()) + " ea");
        holder.shortDescription.setText(item.getShortDescription());
        String calories = item.getNutritionInfo().substring(0, item.getNutritionInfo().indexOf("\n"));
        holder.calories.setText(calories + " Cal");
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, ItemDetailActivity.class);
                intent.putExtra("itemID", itemList.get(position).getItemId());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
