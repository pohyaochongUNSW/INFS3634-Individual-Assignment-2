package com.example.borger_kong;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ItemDetailActivity extends AppCompatActivity {

    private ImageView itemImage;
    private TextView itemName;
    private TextView itemPrice;
    private TextView nutritionInforValue;
    private TextView itemDescription;
    private TextView itemIngredient;
    private TextView allergen;
    private TextView shortDescription;

    private ImageView btnAdd;
    private ImageView btnRemove;
    private EditText itemQuantity;
    private Button addOrder;
    private ArrayList<String> order = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_detail);

        Intent intent = getIntent();

        int itemID = intent.getIntExtra("itemID", 0);

        final Item item = ItemDatabase.getItemById(itemID);

        itemImage = findViewById(R.id.itemImage);
        itemName = findViewById(R.id.itemName);
        itemPrice = findViewById(R.id.itemPrice);
        nutritionInforValue = findViewById(R.id.nutritionInforValue);
        itemDescription = findViewById(R.id.description);
        itemIngredient = findViewById(R.id.ingredient);
        allergen = findViewById(R.id.allergen);
        shortDescription = findViewById(R.id.shortDescription);

        itemImage.setImageResource(item.getImageDrawableId());
        itemName.setText(item.getItemName());
        itemPrice.setText("$" + String.valueOf(item.getItemPrice()) + " ea");
        nutritionInforValue.setText(item.getNutritionInfo());
        itemDescription.setText(item.getDescription());
        itemIngredient.setText(item.getIngredient());
        allergen.setText("*" + item.getAllergens());
        shortDescription.setText(item.getShortDescription());

        itemQuantity = findViewById(R.id.itemQuantity);
        itemQuantity.addTextChangedListener(textWatcher);
        btnAdd = findViewById(R.id.btnAdd);
        btnRemove = findViewById(R.id.btnRemove);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int quantity = 0;
                if(itemQuantity.getText().toString().equals("")){
                    quantity = 1;
                } else {
                    quantity = Integer.parseInt(itemQuantity.getText().toString());
                    quantity = quantity + 1;
                }
                itemQuantity.setText(String.valueOf(quantity));
            }
        });

        btnRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int quantity = 0;
                if(itemQuantity.getText().toString().equals("")){
                    quantity = 1;
                } else {
                    quantity = Integer.parseInt(itemQuantity.getText().toString());
                    quantity = quantity - 1;
                }
                itemQuantity.setText(String.valueOf(quantity));
            }
        });

        addOrder = findViewById(R.id.addOrder);
        addOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (itemQuantity.getText().toString().equals("")) {
                    Toast.makeText(ItemDetailActivity.this,
                            "Please insert number of item.", Toast.LENGTH_SHORT).show();
                } else if (itemQuantity.getText().toString().equals("0")) {
                    Toast.makeText(ItemDetailActivity.this,
                            "Item is not added.\nMinimum quantity required: 1.", Toast.LENGTH_SHORT).show();
                } else {
                    int id = item.getItemId();
                    int quantity = Integer.parseInt(itemQuantity.getText().toString());
                    if(duplicatedCheck(id) == -1) {
                        order.add(String.valueOf(id));
                        order.add(itemQuantity.getText().toString());
                        Toast.makeText(ItemDetailActivity.this,
                                quantity + " of " + item.getItemName()
                                        + " added.", Toast.LENGTH_SHORT).show();
                        StaticResource.orderedList.add(order);
                    } else {
                        ArrayList<String> orderedItem =
                                StaticResource.orderedList.get(duplicatedCheck(id));
                        int orderedQuantity = Integer.parseInt(orderedItem.get(1));
                        if(orderedQuantity >= 99){
                            Toast.makeText(ItemDetailActivity.this,
                                        "Nothing added. \nMaximum quantity ordered: 99 pcs\n" +
                                                "Current ordered: " + orderedQuantity, Toast.LENGTH_SHORT).show();
                        } else {
                            if(quantity + orderedQuantity > 99){
                                int canPurchase = 99 - orderedQuantity;
                                Toast.makeText(ItemDetailActivity.this,
                                        "Maximum quantity per order: 99\n"
                                                + "Current quantity: " + orderedQuantity
                                        + "\nAmount available: " + canPurchase, Toast.LENGTH_SHORT).show();
                            } else {
                                orderedItem.set(1, String.valueOf(orderedQuantity + quantity));
                                StaticResource.orderedList.set(duplicatedCheck(id), orderedItem);
                                Toast.makeText(ItemDetailActivity.this,
                                        "Another " + quantity
                                                + " of " + item.getItemName()
                                                + " added.\n" +
                                                "Current ordered: " + (orderedQuantity + quantity)
                                        , Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                }
            }
        });

    }

    final TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if (itemQuantity.getText().length() > 0) {
                int num = Integer.parseInt(itemQuantity.getText().toString());
                if (num >= 1 && num <= 99) {

                } else {
                    if(num > 99){
                        itemQuantity.setText("99");
                        Toast.makeText(getApplicationContext(), "Maximum 99 pcs per order.", Toast.LENGTH_SHORT).show();
                    } else {
                        itemQuantity.setText("1");
                        Toast.makeText(getApplicationContext(), "Minimum 1 pcs to add in order.", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    public int duplicatedCheck(int itemId){
        for(int i = 0; i < StaticResource.orderedList.size(); i++){
            int orderedItemId = Integer.parseInt(StaticResource.orderedList.get(i).get(0));

            if(itemId == orderedItemId){
                return i;
            }
        }

        return -1;
    }
}