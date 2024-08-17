package com.example.nikeapp.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.nikeapp.R
import com.example.nikeapp.model.Product
import com.example.nikeapp.navigation.NavigationItem
import com.example.nikeapp.screen.components.ProductItem

@Composable
fun ProductScreen(
    navController: NavController
){
    var products: List<Product> = remember{
        getProductList()
    }

    LazyVerticalGrid(columns = GridCells.Fixed(2),modifier = Modifier.padding(8.dp)) {
        items(products){
            ProductItem(product =it){
                navController.navigate("${NavigationItem.PRODUCT_DETAILS}/${it.id}")
            }
        }
    }
}

fun getProductList(): List<Product>{
    return listOf(
        Product(
            id ="1",
            name ="Shoes",
            price =99.99f,
            color = Color.Magenta,
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s_4,
            size = 10

        ) ,
        Product(
        id ="2",
        name ="Shoes Blue",
        price =99.99f,
        color = Color.Blue,
        discountPrice = 1000f,
        rating = 4.7f,
        imageRes = R.drawable.s_5,
        size = 10
        ),
        Product(
            id ="3",
            name ="Shoes Green",
            price =99.99f,
            color = Color.Green,
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s_9,
            size = 10
        ),Product(
            id ="4",
            name ="Shoe",
            price =99.99f,
            color = Color.Magenta,
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s_4,
            size = 10
        ),Product(
            id ="5",
            name ="Shoe Red",
            price =99.99f,
            color = Color.Red,
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s_5,
            size = 10
        ),Product(
            id ="6",
            name ="Shoes Yellow",
            price =99.99f,
            color = Color.Yellow,
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s_6,
            size = 10
        ),
    )
}