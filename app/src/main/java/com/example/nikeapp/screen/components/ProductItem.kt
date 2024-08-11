package com.example.nikeapp.screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nikeapp.R
import com.example.nikeapp.model.Product

@Preview(showBackground = true)
@Composable
fun ProductItem(
    product: Product = Product(
        id ="1",
        name ="Shoes",
        price =99.99f,
        color = Color.Magenta,
        discountPrice = 1000f,
        rating = 4.7f,
        imageRes = R.drawable.s_1,
        size = 10

    )
){
    var color by remember {
        mutableStateOf(product.color)
    }
    Box(
        modifier = Modifier
            .padding(20.dp)
            .size(168.dp,210.dp)
    ){
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .alpha(.2f)
                    .background(
                        color = color,
                        shape = RoundedCornerShape(22.dp)
                    )
            ){

            }
    }
}