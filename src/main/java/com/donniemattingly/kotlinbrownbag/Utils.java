package com.donniemattingly.kotlinbrownbag;

class Utils {

  static <T> String nullSafeToString(T t){
    if(t == null || t.toString() == null){
      return "NULL";
    }

    return t.toString();
  }

}
