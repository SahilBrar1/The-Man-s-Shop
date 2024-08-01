package com.example.themanshop

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.themanshop.ui.theme.deepRed

@Composable
fun HomeUI() {
    val density = LocalDensity.current
    val statusBarHeight = with(density) { WindowInsets.statusBars.getTop(density).toDp() }
    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(top = statusBarHeight))
         {
        Column(modifier = Modifier.fillMaxSize()) {
            Row(
                modifier = Modifier
                    .background(deepRed)
                    .fillMaxWidth()
                    .height(56.dp)
            ) {

                Buttons(icon = R.drawable.baseline_menu_24, Color.White)
                Column(modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.Center ) {
                    Text(
                        text = "The Man's Shop",
                        style = TextStyle(
                            fontSize = 20.sp,
                            color = Color.White,
                            fontWeight = FontWeight.W700
                        )
                    )
                }
                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End) {
                    Buttons(icon = R.drawable.baseline_search_24)
                }
            }
            LazyVerticalGrid(columns = GridCells.Fixed(2)) {
                items(Data.datalist) {
                    ShowSuit(data = it)
                }
            }



        }
    }
}

@Composable
fun Buttons(@DrawableRes icon:Int,tint: Color =  Color.Unspecified) {
    IconButton(onClick = { /*TODO*/ }) {
        Icon(painter = painterResource(id = icon), contentDescription ="",

                )
    }
}

@Composable
fun ShowSuit(
    data: Data.Demo
) {
    Card( shape = RoundedCornerShape(5.dp),
        modifier = Modifier
            .width(175.dp)
            .height(300.dp)
            .padding(vertical = 5.dp, horizontal = 5.dp)) {
            Box(modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center) {
                Column (modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 5.dp, horizontal = 5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally){
                        Image(painter = painterResource(id = data.img), contentDescription = "",
                            modifier = Modifier
                                .size(109.dp)
                                .clip(CircleShape),
                            contentScale = ContentScale.Crop
                            )
                        Text(text = data.name,
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight.W300,
                                textAlign = TextAlign.Center
                            )
                            )
                        Text(text = data.disp,
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight.W300,
                                textAlign = TextAlign.Center
                            )
                        )
                        Text(text = data.price,
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight.W300,
                                textAlign = TextAlign.Center
                            )
                        )
                        Button(onClick = { /*TODO*/ },
                            modifier = Modifier
                                .width(91.dp),
                            shape = RoundedCornerShape(18.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = deepRed
                            )
                        ) {
                                Text(text = "Add", style = TextStyle(
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.W600,
                                    color = Color.White
                                ),
                                textAlign = TextAlign.Center)
                        }
                }
            }
    }
}