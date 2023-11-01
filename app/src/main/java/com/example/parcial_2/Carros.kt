package com.example.parcial_2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.ArrowForward
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Carros() {
    var num by remember {
        mutableStateOf(1)
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            text = "VEHICULOS",
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(500.dp),
            fontSize = 34.sp
        )
        Spacer(modifier = Modifier.height(16.dp))
        Card(modifier = Modifier.size(300.dp).align(Alignment.CenterHorizontally))
        {
            Text(
                text = "BMW",
                textAlign = TextAlign.Center,
                modifier = Modifier.width(500.dp),
                fontSize = 24.sp
            )
           val modelo=remember{
               val map = mutableMapOf<Int,String>()
               bmw.forEach { item -> map[item.id]=item.nombre}
               map
           }
            Text(
                text = "${modelo[num] ?:"MODELO DESCONOCIDO"}",
                textAlign = TextAlign.Center,
                modifier = Modifier.width(500.dp),
                fontSize = 17.sp)
            if(num<1){
                num=1
            }else if(num>3){
                num=3
            }else{ }
            val imageRes = when (num) {
                1 -> R.drawable.serie_3
                2 -> R.drawable.x_1
                3 -> R.drawable.serie_1
                else -> R.drawable.peligro
            }
            val painter = painterResource(id = imageRes)
            Image(
                painter = painter,
                contentDescription = null,
                modifier = Modifier.size(180.dp).align(Alignment.CenterHorizontally),
                contentScale = ContentScale.Fit
            )
            Row(
                modifier = Modifier.padding(16.dp).align(Alignment.CenterHorizontally),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(
                    onClick = { num-- },
                    modifier = Modifier.size(48.dp)
                ) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Arrow Back")
                }
                Text(
                    text = num.toString(),
                    style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 17.sp),
                    modifier = Modifier.padding(8.dp)
                )

                IconButton(
                    onClick = { num++ },
                    modifier = Modifier.size(48.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = "Arrow Forward"
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        //MERCEDEZ
        var num2 by remember {
            mutableStateOf(1)
        }
        Card(
            modifier = Modifier.size(300.dp).align(Alignment.CenterHorizontally))
        {
            Text(
                text = "MERCEDES BENZ",
                textAlign = TextAlign.Center,
                modifier = Modifier.width(500.dp),
                fontSize = 24.sp
            )
            val modelo1=remember{
                val map1 = mutableMapOf<Int,String>()
                mercedez.forEach { item -> map1[item.id]=item.nombre}
                map1
            }
            Text(
                text = "${modelo1[num2] ?:"MODELO DESCONOCIDO"}",
                textAlign = TextAlign.Center,
                modifier = Modifier.width(500.dp),
                fontSize = 17.sp)

            if(num2<1){
                num2=1
            }else if(num2>3){
                num2=3
            }else{ }
            val imageRes1 = when (num2) {
                1 -> R.drawable.ml2_2
                2 -> R.drawable.clase_a
                3 -> R.drawable.clase_c
                else -> R.drawable.peligro
            }
            val painter1 = painterResource(id = imageRes1)
            Image(
                painter = painter1,
                contentDescription = null,
                modifier = Modifier.size(180.dp).align(Alignment.CenterHorizontally),
                contentScale = ContentScale.Fit
            )
            Row(
                modifier = Modifier.padding(16.dp).align(Alignment.CenterHorizontally),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(
                    onClick = { num2-- },
                    modifier = Modifier.size(48.dp)
                ) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Arrow Back")
                }
                Text(
                    text = num2.toString(),
                    style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 17.sp),
                    modifier = Modifier.padding(8.dp)
                )

                IconButton(
                    onClick = { num2++ },
                    modifier = Modifier.size(48.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = "Arrow Forward"
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(16.dp))


        //CHEVROLET
        var num1 by remember {
            mutableStateOf(1)
        }
        Card(
            modifier = Modifier.size(300.dp).align(Alignment.CenterHorizontally))
        {
            Text(
                text = "CHEVROLET",
                textAlign = TextAlign.Center,
                modifier = Modifier.width(500.dp),
                fontSize = 24.sp
            )
            val modelo2=remember{
                val map2 = mutableMapOf<Int,String>()
                chevrolet.forEach { item -> map2[item.id]=item.nombre}
                map2
            }
            Text(
                text = "${modelo2[num1] ?:"MODELO DESCONOCIDO"}",
                textAlign = TextAlign.Center,
                modifier = Modifier.width(500.dp),
                fontSize = 17.sp)
            if(num1<1){
                num1=1
            }else if(num1>3){
                num1=3
            }else{ }
            val imageRes2 = when (num1) {
                1 -> R.drawable.blazer
                2 -> R.drawable.tracker
                3 -> R.drawable.camaro
                else -> R.drawable.peligro
            }
            val painter2 = painterResource(id = imageRes2)
            Image(
                painter = painter2,
                contentDescription = null,
                modifier = Modifier.size(180.dp).align(Alignment.CenterHorizontally),
                contentScale = ContentScale.Fit
            )
            Row(
                modifier = Modifier.padding(16.dp).align(Alignment.CenterHorizontally),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(
                    onClick = { num1-- },
                    modifier = Modifier.size(48.dp)
                ) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Arrow Back")
                }
                Text(
                    text = num1.toString(),
                    style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 17.sp),
                    modifier = Modifier.padding(8.dp)
                )

                IconButton(
                    onClick = { num1++ },
                    modifier = Modifier.size(48.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = "Arrow Forward"
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(16.dp))


        //FORD
        var num3 by remember {
            mutableStateOf(1)
        }
        Card(
            modifier = Modifier.size(300.dp).align(Alignment.CenterHorizontally))
        {
            Text(
                text = "FORD",
                textAlign = TextAlign.Center,
                modifier = Modifier.width(500.dp),
                fontSize = 24.sp
            )
            val modelo3=remember{
                val map3 = mutableMapOf<Int,String>()
                ford.forEach { item -> map3[item.id]=item.nombre}
                map3
            }
            Text(
                text = "${modelo3[num3] ?:"MODELO DESCONOCIDO"}",
                textAlign = TextAlign.Center,
                modifier = Modifier.width(500.dp),
                fontSize = 17.sp)
            if(num3<1){
                num3=1
            }else if(num3>3){
                num3=3
            }else{ }
            val imageRes3 = when (num3) {
                1 -> R.drawable.mustang
                2 -> R.drawable.escape
                3 -> R.drawable.ranger
                else -> R.drawable.peligro
            }
            val painter3 = painterResource(id = imageRes3)
            Image(
                painter = painter3,
                contentDescription = null,
                modifier = Modifier.size(180.dp).align(Alignment.CenterHorizontally),
                contentScale = ContentScale.Fit
            )
            Row(
                modifier = Modifier.padding(16.dp).align(Alignment.CenterHorizontally),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(
                    onClick = { num3-- },
                    modifier = Modifier.size(48.dp)
                ) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Arrow Back")
                }
                Text(
                    text = num3.toString(),
                    style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 17.sp),
                    modifier = Modifier.padding(8.dp)
                )

                IconButton(
                    onClick = { num3++ },
                    modifier = Modifier.size(48.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = "Arrow Forward"
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        //PORCHE
        var num4 by remember {
            mutableStateOf(1)
        }
        Card(
            modifier = Modifier.size(300.dp).align(Alignment.CenterHorizontally))
        {
            Text(
                text = "PORCHE",
                textAlign = TextAlign.Center,
                modifier = Modifier.width(500.dp),
                fontSize = 24.sp
            )
            val modelo4=remember{
                val map4 = mutableMapOf<Int,String>()
                porche.forEach { item -> map4[item.id]=item.nombre}
                map4
            }
            Text(
                text = "${modelo4[num4] ?:"MODELO DESCONOCIDO"}",
                textAlign = TextAlign.Center,
                modifier = Modifier.width(500.dp),
                fontSize = 17.sp)
            if(num4<1){
                num4=1
            }else if(num4>3){
                num4=3
            }else{ }
            val imageRes4 = when (num4) {
                1 -> R.drawable.boxster
                2 -> R.drawable.cayenne
                3 -> R.drawable._18
                else -> R.drawable.peligro
            }
            val painter4 = painterResource(id = imageRes4)
            Image(
                painter = painter4,
                contentDescription = null,
                modifier = Modifier.size(180.dp).align(Alignment.CenterHorizontally),
                contentScale = ContentScale.Fit
            )
            Row(
                modifier = Modifier.padding(16.dp).align(Alignment.CenterHorizontally),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(
                    onClick = { num4-- },
                    modifier = Modifier.size(48.dp)
                ) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Arrow Back")
                }
                Text(
                    text = num4.toString(),
                    style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 17.sp),
                    modifier = Modifier.padding(8.dp)
                )

                IconButton(
                    onClick = { num4++ },
                    modifier = Modifier.size(48.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = "Arrow Forward"
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun mostrar(){
    Carros()
}