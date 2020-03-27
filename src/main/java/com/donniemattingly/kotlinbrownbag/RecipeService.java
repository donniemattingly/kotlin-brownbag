package com.donniemattingly.kotlinbrownbag;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RecipeService {

  private final static Logger log = LoggerFactory.getLogger("RecipeService");

  private final RecipeRepository recipeRepository;

  @Autowired
  public RecipeService(RecipeRepository recipeRepository) {
    this.recipeRepository = recipeRepository;
  }

  List<Recipe> getRecipes() {
    return Collections.emptyList();
  }

  Optional<Recipe> bestRecipe() {
    return this.bestRecipe(false);
  }

  private Optional<Recipe> bestRecipe(boolean considerCalories) {
    List<Recipe> recipes = recipeRepository.getAllRecipes();
    Optional<Recipe> best = recipes.stream().max(Comparator.comparing(Recipe::getRating));
    log.info("Found best recipe: " + Utils.nullSafeToString(best.orElse(null)));
    return best;
  }

  Recipe getSampleRecipe() {
    Recipe sample = new Recipe();
    sample.setAuthor("Sample Author");
    sample.setCalories(1000L);
    sample.setName("Sample Recipe");
    sample.setRating(5.0);
    sample.setIngredients(Collections.emptyList());

    return sample;
  }

  String mostCommonIngredient() {
    return this.recipeRepository.getAllRecipes()
      .stream()
      .flatMap(recipe -> recipe.getIngredients().stream())
      .reduce(new HashMap<String, Integer>(),
        (acc, cur) -> {
          acc.compute(cur, (k, v) -> (v == null) ? 1 : v + 1);
          return acc;
        },
        (map1, map2) -> map1)
      .entrySet().stream()
      .max(Comparator.comparing(Map.Entry::getValue))
      .map(Map.Entry::getKey)
      .orElse(null);
  }

}
