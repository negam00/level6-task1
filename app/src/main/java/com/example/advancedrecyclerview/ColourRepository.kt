package com.example.advancedrecyclerview

class ColourRepository {

    fun getColourItems(): List<ColourItem> {
        return arrayListOf(
            ColourItem("000000", "Black"),
            ColourItem("FF0000", "Red"),
            ColourItem("0000FF", "Blue"),
            ColourItem("FFFF00", "Yellow"),
            ColourItem("008000", "Green")        )
    }
}