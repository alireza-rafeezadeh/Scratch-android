package com.example.composetestapp.util

import com.example.composetestapp.R
import com.example.composetestapp.model.ImageItem

fun getProfileRecipes() =
    mutableListOf<Pair<ImageItem, ImageItem>>().apply {
        add(
            Pair(
                ImageItem(R.drawable.sweets, "Sweets"),
                ImageItem(R.drawable.italian, "Italian")
            )
        )
        add(
            Pair(
                ImageItem(R.drawable.desserts, "Desserts"),
                ImageItem(R.drawable.chocolates, "Chocolates")
            )
        )

        add(
            Pair(
                ImageItem(R.drawable.soups, "Soups"),
                ImageItem(R.drawable.pasta, "Pasta")
            )
        )

        add(
            Pair(
                ImageItem(R.drawable.sweets, "Sweets"),
                ImageItem(R.drawable.italian, "Italian")
            )
        )
        add(
            Pair(
                ImageItem(R.drawable.desserts, "Desserts"),
                ImageItem(R.drawable.chocolates, "Chocolates")
            )
        )
    }

fun getMyRecipeData() = mutableListOf<ImageItem>().apply {
    add(ImageItem(R.drawable.my_recipes_1, "Cooked Coconut Mussels"))
    add(ImageItem(R.drawable.my_recipes_2, "Banana and Mandarin Buns"))
    add(ImageItem(R.drawable.my_recipes_3, "Fried Salty & Sour Snapper"))
    add(ImageItem(R.drawable.my_recipes_4, "Tenderized Hazelnut Pheasant"))

    add(ImageItem(R.drawable.my_recipes_1, "Cooked Coconut Mussels"))
    add(ImageItem(R.drawable.my_recipes_2, "Banana and Mandarin Buns"))
    add(ImageItem(R.drawable.my_recipes_3, "Fried Salty & Sour Snapper"))
    add(ImageItem(R.drawable.my_recipes_4, "Tenderized Hazelnut Pheasant"))

}

fun getIngredients() = mutableListOf<ImageItem>().apply {
    add(ImageItem(R.drawable.ingredient_1, "cooking spray"))
    add(ImageItem(R.drawable.ingredient_2, "1/2 cup whole milk"))
    add(ImageItem(R.drawable.ingredient_3, "2 large eggs1 tablespoon maple syrup"))
    add(ImageItem(R.drawable.ingredient_4, "1/2 teaspoon vanilla extract"))
    add(ImageItem(R.drawable.ingredient_5, "cooking spray"))
    add(ImageItem(R.drawable.ingredient_1, "cooking spray"))
    add(ImageItem(R.drawable.ingredient_2, "1/2 cup whole milk"))
    add(ImageItem(R.drawable.ingredient_3, "2 large eggs1 tablespoon maple syrup"))
    add(ImageItem(R.drawable.ingredient_4, "1/2 teaspoon vanilla extract"))
    add(ImageItem(R.drawable.ingredient_5, "1/2 teaspoon vanilla extract"))
}

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