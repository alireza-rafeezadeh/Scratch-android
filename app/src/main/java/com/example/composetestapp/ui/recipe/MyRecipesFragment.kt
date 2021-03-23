package com.example.composetestapp.ui.recipe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.composetestapp.R

class MyRecipesFragment : Fragment() {

    /*override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                MyRecipe({
                    findNavController()
                        .navigate(R.id.action_myRecipesFragment_to_editRecipeFragment)
                }, {
                    findNavController()
                        .navigate(R.id.action_myRecipesFragment_to_recipeDetailFragment)

                })
            }
        }
    }*/
}