package com.donniemattingly.kotlinbrownbag

data class Recipe(
    var name: String? = null,
    var author: String? = null,
    var type: RecipeType? = null,
    var rating: Double? = null,
    var calories: Long? = null,
    var ingredients: List<String>? = null)

