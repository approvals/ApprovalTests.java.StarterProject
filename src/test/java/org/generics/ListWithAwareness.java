package org.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListWithAwareness<T> extends ArrayList<T>
{
  private Class<T> typeT;
  public ListWithAwareness(Class<T> typeT)
  {
    this.typeT = typeT;
  }
  public T[] toArrayWithType()
  {
    T[] array = (T[]) Array.newInstance(typeT, this.size());
    return toArray(array);
  }
  //	public T[] toArrayWant() {
  //		T[] array = new T[size()]
  //		return toArray(array);
  //	}
}
