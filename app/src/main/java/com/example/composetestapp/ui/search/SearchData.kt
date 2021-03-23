package com.example.composetestapp.ui.search

import com.example.composetestapp.R

fun getTrendingRecipes(): List<ImageItem> {

    val list = mutableListOf<ImageItem>()
    list.add(ImageItem(R.drawable.trending_item_1, "Banana and Mandarin Buns"))
    list.add(ImageItem(R.drawable.trending_item_2, "Coconut Pound Cake"))
    list.add(ImageItem(R.drawable.trending_item_3, "Cardamom and Cranberry Pastry"))
    list.add(ImageItem(R.drawable.trending_item_1, "Banana and Mandarin Buns"))
    list.add(ImageItem(R.drawable.trending_item_2, "Coconut Pound Cake"))
    list.add(ImageItem(R.drawable.trending_item_3, "Cardamom and Cranberry Pastry"))
    list.add(ImageItem(R.drawable.trending_item_1, "Banana and Mandarin Buns"))
    list.add(ImageItem(R.drawable.trending_item_2, "Coconut Pound Cake"))
    list.add(ImageItem(R.drawable.trending_item_3, "Cardamom and Cranberry Pastry"))

    return list

}

fun getWhatCanIMake() = mutableListOf<ImageItem>().apply {
    add(ImageItem(R.drawable.what_can_i_make_1, "Tenderized Salty & Sour Potato Beef"))
    add(ImageItem(R.drawable.what_can_i_make_2, "Sautéed Orange & Mustard Bruschetta"))
    add(ImageItem(R.drawable.what_can_i_make_3, "Blanched Peppermint Pheasant"))
    add(ImageItem(R.drawable.what_can_i_make_1, "Tenderized Salty & Sour Potato Beef"))
    add(ImageItem(R.drawable.what_can_i_make_2, "Sautéed Orange & Mustard Bruschetta"))
    add(ImageItem(R.drawable.what_can_i_make_3, "Blanched Peppermint Pheasant"))
    add(ImageItem(R.drawable.what_can_i_make_1, "Tenderized Salty & Sour Potato Beef"))
    add(ImageItem(R.drawable.what_can_i_make_2, "Sautéed Orange & Mustard Bruschetta"))
    add(ImageItem(R.drawable.what_can_i_make_3, "Blanched Peppermint Pheasant"))
}



