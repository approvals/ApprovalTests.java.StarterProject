package org.generics;

import java.util.ArrayList;

import org.junit.Test;

public class GenericRuntimeInformation
{
  @Test
  public void doesNotCompile()
  {
    ArrayList<String> list = new ArrayList<String>();
    list.add("bender");
    list.add("fry");
    list.add("lela");
    //    String[] names = list.toArray();
  }
  @Test
  public void throwsException()
  {
    // java.lang.ClassCastException: [Ljava.lang.Object; cannot be cast to
    // [Ljava.lang.String;
    ArrayList<String> list = new ArrayList<>();
    list.add("bender");
    list.add("fry");
    list.add("lela");
    String[] names = (String[]) list.toArray();
  }
  @Test
  public void works()
  {
    ArrayList<String> list = new ArrayList<>();
    list.add("bender");
    list.add("fry");
    list.add("lela");
    String[] names = list.toArray(new String[0]);
  }
  @Test
  public void worksBetter()
  {
    ListWithAwareness<String> list = new ListWithAwareness<>(String.class);
    list.add("bender");
    list.add("fry");
    list.add("lela");
    String[] names = list.toArrayWithType();
  }
  @Test
  public void willNotCompileWrong()
  {
    //		ListWithAwareness<String> list = new ListWithAwareness<>(Int.class);
    //		list.add("bender");
    //		list.add("fry");
    //		list.add("lela");
    //		String[] names = list.toArrayWithType();
  }
}
