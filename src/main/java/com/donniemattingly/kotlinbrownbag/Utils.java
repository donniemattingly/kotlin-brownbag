package com.donniemattingly.kotlinbrownbag;

public class Utils {

  // TODO: extension functions, null safe to string
  public <T> String nullSafeToString(T t){
    if(t == null || t.toString() == null){
      return "NULL";
    }

    return t.toString();
  }

}
