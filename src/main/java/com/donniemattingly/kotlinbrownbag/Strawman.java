package com.donniemattingly.kotlinbrownbag;

public class Strawman {

  private static Strawman instance = new Strawman();

  public static Strawman getInstance() {
    return instance;
  }

  private String name;

  private Strawman() {
    this.name = "I realize singletons aren't used a bunch anymore, this is a contrived example.";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
