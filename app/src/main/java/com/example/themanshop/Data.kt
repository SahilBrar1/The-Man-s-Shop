package com.example.themanshop

import androidx.annotation.DrawableRes

object Data {
    class Demo(
        @DrawableRes
        var img:Int,
        var name: String,
        var disp: String,
        var price: String
    )

    var datalist = listOf(
        Demo(
            R.drawable.a,
            name = "The suit",
            disp = "The ever suit by us in the market",
            price = "$23"
        ),
        Demo(
            R.drawable.b,
            name = "The suit",
            disp = "The ever suit by us in the market",
            price = "$23"
        ),
        Demo(
            R.drawable.a,
            name = "The suit",
            disp = "The ever suit by us in the market",
            price = "$23"
        ),
        Demo(
            R.drawable.b,
            name = "The suit",
            disp = "The ever suit by us in the market",
            price = "$23"
        ),Demo(
            R.drawable.a,
            name = "The suit",
            disp = "The ever suit by us in the market",
            price = "$23"
        ),
        Demo(
            R.drawable.b,
            name = "The suit",
            disp = "The ever suit by us in the market",
            price = "$23"
        ),Demo(
            R.drawable.a,
            name = "The suit",
            disp = "The ever suit by us in the market",
            price = "$23"
        ),
        Demo(
            R.drawable.b,
            name = "The suit",
            disp = "The ever suit by us in the market",
            price = "$23"
        ),Demo(
            R.drawable.a,
            name = "The suit",
            disp = "The ever suit by us in the market",
            price = "$23"
        ),
        Demo(
            R.drawable.b,
            name = "The suit",
            disp = "The ever suit by us in the market",
            price = "$23"
        ),Demo(
            R.drawable.a,
            name = "The suit",
            disp = "The ever suit by us in the market",
            price = "$23"
        ),
        Demo(
            R.drawable.b,
            name = "The suit",
            disp = "The ever suit by us in the market",
            price = "$23"
        )
    )
}