package com.donniemattingly.kotlinbrownbag;

import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class RecipeRepository {

  List<Recipe> getRecipesByType(String type) {
    return Collections.emptyList();
  }

  List<Recipe> getAllRecipes(){
    return Collections.emptyList();
  }

}
