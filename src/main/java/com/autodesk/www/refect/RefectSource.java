package com.autodesk.www.refect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/** @Author: Frank */
class RefectSource {

  public static void main(String[] args) {
    Class<String> stringClass = String.class;

    Method hashCodeMethod = null;
    try {
      hashCodeMethod = stringClass.getDeclaredMethod("hashCode");
      String str = "hello, world";
      Object hashCode = hashCodeMethod.invoke(str);
      System.out.println(hashCode);
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    }
  }

  /**
   * @param a
   * @param b
   * @param c
   * @return
   */
  public static String testString(int a, int b, int c) {
    return "";
  }
}
