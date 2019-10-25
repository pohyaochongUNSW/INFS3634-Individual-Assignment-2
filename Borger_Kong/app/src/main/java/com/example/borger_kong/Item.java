package com.example.borger_kong;

public class Item {
    private int itemId;
    private String itemName;
    private double itemPrice;
    private int imageDrawableId;
    private String nutritionInfo;
    private String description;
    private String shortDescription;
    private String ingredient;
    private String allergens;

    public Item(int itemId, String itemName, double itemPrice, int imageDrawableId,
                String nutritionInfo, String description, String ingredient, String allergens,
                String shortDescription){
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.imageDrawableId = imageDrawableId;
        this.nutritionInfo = nutritionInfo;
        this.description = description;
        this.ingredient = ingredient;
        this.allergens = allergens;
        this.shortDescription = shortDescription;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {
        this.imageDrawableId = imageDrawableId;
    }

    public String getNutritionInfo() {
        return nutritionInfo;
    }

    public void setNutritionInfo(String nutritionInfo) {
        this.nutritionInfo = nutritionInfo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getAllergens() {
        return allergens;
    }

    public void setAllergens(String allergens) {
        this.allergens = allergens;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
}
