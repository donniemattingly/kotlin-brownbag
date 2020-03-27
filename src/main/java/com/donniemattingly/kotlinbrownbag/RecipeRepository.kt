package com.donniemattingly.kotlinbrownbag

import org.springframework.stereotype.Repository

import java.util.Collections

@Repository
class RecipeRepository {

    val allRecipes: List<Recipe>
        get() = emptyList()

    fun getRecipesByType(type: String): List<Recipe> {
        return emptyList()
    }

}
