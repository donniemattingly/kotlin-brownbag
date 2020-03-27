package com.donniemattingly.kotlinbrownbag


import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RecipeController(private val recipeService: RecipeService) {

  @GetMapping("/recipes")
  fun getRecipes(): List<Recipe> = recipeService.recipes

  @GetMapping("/bestRecipes")
  fun getBestRecipes(): Recipe = recipeService.bestRecipe().orElse(null)

}
