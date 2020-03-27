package com.donniemattingly.kotlinbrownbag;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecipeController {

  private final RecipeService recipeService;

  @Autowired
  public RecipeController(RecipeService recipeService) {
    this.recipeService = recipeService;
  }

  @GetMapping("/recipes")
  public List<Recipe> getRecipes() {
    return this.recipeService.getRecipes();
  }

  @GetMapping("/best_recipe")
  public Recipe getBestRecipes() {
    return this.recipeService.bestRecipe().orElse(null);
  }
}
