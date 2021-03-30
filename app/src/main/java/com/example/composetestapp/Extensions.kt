package com.example.composetestapp

import androidx.compose.material.BottomSheetState
import androidx.compose.material.ExperimentalMaterialApi

@ExperimentalMaterialApi
suspend fun BottomSheetState.toggle() {
    if (isCollapsed) {
        expand()
    } else {
        collapse()
    }
}