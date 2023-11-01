package com.example.parcial_2

data class BMW(val id:Int,val nombre:String)
    val bmw = listOf(
        BMW(1,"BMW SERIE 3"),
        BMW(2,"BMW X1 F48"),
        BMW(3,"BMW SERIE 1")
    )

data class CHEVROLET(val id:Int,val nombre:String)
    val chevrolet = listOf(
        CHEVROLET(1,"CHEVROLET BLAZER"),
        CHEVROLET(2,"CHEVROLET TRACKER"),
        CHEVROLET(3,"CHEVROLET CAMARO ZL1")
    )

data class MERCEDEZ(val id:Int,val nombre:String)
    val mercedez = listOf(
        MERCEDEZ(1,"MERCEDEZ BENZ MI 2.2"),
        MERCEDEZ(2,"MERCEDEZ BENZ CLASE A 1.4"),
        MERCEDEZ(3,"MERCEDEZ BENZ CLASE C 2.0"),
    )

data class FORD(val id:Int,val nombre:String)
    val ford = listOf(
        FORD(1,"FORD MUSTANG"),
        FORD(2,"FORD ESCAPE"),
        FORD(3,"FORD RANGER RAPTOR")
    )

data class PORCHE(val id:Int,val nombre:String)
    val porche = listOf(
        PORCHE(1,"PORCHE BOXSTER"),
        PORCHE(2,"PORCHE CAYENNE"),
        PORCHE(3,"PORCHE 718")
    )
