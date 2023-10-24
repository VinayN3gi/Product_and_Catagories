package com.example.poduct_and_catagories

object dataServices {
    var catagoriesList= listOf(
        catagories("shirt","shirtimage"),
        catagories("hat","hatimage"),
        catagories("hoodie","hoodieimage")
    )
    var hatList= listOf(
        Products("Black Hat","$20","hat1"),
        Products("Red Hat","$20","hat2"),
        Products("Yellow Hat","$20","hat3"),
        Products("Yellow Hat","$20","hat4")
    )
    var shirtList= listOf(
        Products("Black shirt","$30","shirt1"),
        Products("Yellow shirt","$30","shirt2"),
        Products("White shirt","$30","shirt3"),
        Products("Red shirt","$30","shirt4"),
        Products("Grey shirt","$30","shirt5")
    )
    var hoodieList= listOf(
        Products("Black hoodie","$22","hoodie1"),
        Products("Red hoodie","$22","hoodie2"),
        Products("Yellow hoodie","$22","hoodie3"),
        Products("White hoodie","$22","hoodie4")
    )
    fun catagoryType(cat:String?): List<Products> {
        when(cat){
            "hat"->return hatList
            "shirt"->return shirtList
            "hoodie"->return hoodieList
            else->return shirtList
        }
    }
}