package com.donniemattingly.kotlinbrownbag;

import java.util.List;
import java.util.Objects;

// TODO: data classes
class Recipe {
  private String name;
  private String author;
  private RecipeType type;
  private Double rating;
  private Long calories;
  private List<String> ingredients;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public RecipeType getType() {
    return type;
  }

  public void setType(RecipeType type) {
    this.type = type;
  }

  public Double getRating() {
    return rating;
  }

  public void setRating(Double rating) {
    this.rating = rating;
  }

  public Long getCalories() {
    return calories;
  }

  public void setCalories(Long calories) {
    this.calories = calories;
  }

  public List<String> getIngredients() {
    return ingredients;
  }

  public void setIngredients(List<String> ingredients) {
    this.ingredients = ingredients;
  }

  @Override
  public String toString() {
    return "Recipe{" +
      "name='" + name + '\'' +
      ", author='" + author + '\'' +
      ", type=" + type +
      ", ingredient=" + ingredients +
      '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Recipe recipe = (Recipe) o;
    return name.equals(recipe.name) &&
      author.equals(recipe.author) &&
      type == recipe.type &&
      ingredients.equals(recipe.ingredients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, author, type, ingredients);
  }
}
