package com.donniemattingly.kotlinbrownbag;

import java.util.Objects;


/*
TODO: Show open / final by default w/ this class
 */
public class Cocktail extends Recipe {
  private Double alcoholByVolume;

  public Double getAlcoholByVolume() {
    return alcoholByVolume;
  }

  public void setAlcoholByVolume(Double alcoholByVolume) {
    this.alcoholByVolume = alcoholByVolume;
  }

  @Override
  public String toString() {
    return "Cocktail{" +
      "alcoholByVolume=" + alcoholByVolume +
      '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    Cocktail cocktail = (Cocktail) o;
    return alcoholByVolume.equals(cocktail.alcoholByVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), alcoholByVolume);
  }
}
