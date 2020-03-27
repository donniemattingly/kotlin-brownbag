package com.donniemattingly.kotlinbrownbag


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RecipeController @Autowired
constructor(private val recipeService: RecipeService) {

    val recipes: List<Recipe>
        @GetMapping("/recipes")
        get() = this.recipeService.recipes

    val bestRecipes: Recipe
        @GetMapping("/best_recipe")
        get() = this.recipeService.bestRecipe().orElse(null)
}
