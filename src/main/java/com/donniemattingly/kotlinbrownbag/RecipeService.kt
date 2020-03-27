package com.donniemattingly.kotlinbrownbag

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*
import kotlin.Comparator

@Service
class RecipeService @Autowired
constructor(private val recipeRepository: RecipeRepository) {

  fun getRecipes(): List<Recipe> {
    return recipeRepository.allRecipes
  }

  fun getSampleRecipe(cals: Long = 1000L): Recipe {
    return Recipe().apply {
      author = "Sample Author"
      calories = cals
      name = "Sample Recipe"
      rating = 5.0
      ingredients = emptyList()
    }
  }

  fun getABunchOfSampleRecipes(): List<Recipe> {
    return (1..10).map { getSampleRecipe(it * 100L) }
  }


  fun bestRecipe(considerCalories: Boolean = false): Recipe {
    val recipes = recipeRepository.allRecipes
    val best = recipes.stream().max(Comparator.comparing({ it.rating }))
    log.info("Found best recipe: " + Utils.nullSafeToString(best.orElse(null)))

    return best.get()
  }

  fun mostCommonIngredient(): String? {
    return recipeRepository.allRecipes
      .flatMap { it.ingredients ?: listOf() }
      .groupBy { it }
      .map { it.key to it.value.size }
      .maxBy { it.second }?.first
  }

  companion object {
    private val log = LoggerFactory.getLogger("RecipeService")
  }

}
