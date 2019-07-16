package org.random.selector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RamdomSelector<T>
{
  private T[]          originalItemsToPickFrom;
  private Class<T>     classT;
  private Random       random;
  private ArrayList<T> remainingItems;
  private ArrayList<T> pickedItems;
  public RamdomSelector(Class<T> classT, T[] itemsToPickFrom)
  {
    this.classT = classT;
    this.originalItemsToPickFrom = itemsToPickFrom;
    this.remainingItems = new ArrayList<>(Arrays.asList(itemsToPickFrom));
    this.pickedItems = new ArrayList<>();
    random = new Random();
  }
  public void setRandom(Random random)
  {
    this.random = random;
  }
  public T get()
  {
    if (remainingItems.isEmpty())
    {
      String helpMessage = String.format("All [%s] items have been picked, there are no more remaining.",
          pickedItems.size());
      throw new RuntimeException(helpMessage);
    }
    int index = random.nextInt(remainingItems.size());
    T pickedItem = remainingItems.get(index);
    remainingItems.remove(index);
    pickedItems.add(pickedItem);
    return pickedItem;
  }
  public boolean isEmpty()
  {
    return remainingItems.isEmpty();
  }
}
