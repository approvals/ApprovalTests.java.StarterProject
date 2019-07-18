package org.random.selector;

import java.io.File;
import java.util.Random;
import java.util.stream.Stream;

import org.approvaltests.Approvals;
import org.approvaltests.legacycode.Range;
import org.junit.Assert;
import org.junit.Test;
import org.llewellyn.talks.LightningTalks;
import org.llewellyn.talks.Talk;

public class RandomSelectorTest
{
  @Test
  public void test()
  {
    RamdomSelector<Integer> selector = new RamdomSelector<>(Integer.class, Range.get(1, 10));
    selector.setRandom(new Random(10));
    Approvals.verifyAll("Selected", Stream.of(Range.get(1, 10)).map(__ -> selector.get()).toArray());
  }
  @Test
  public void testEmpty()
  {
    RamdomSelector<Integer> selector = new RamdomSelector<>(Integer.class, Range.get(1, 2));
    selector.get();
    selector.get();
    Approvals.verifyException(() -> selector.get());
  }
  @Test
  public void testTalks()
  {
    Talk[] talks = LightningTalks.getLlewellyns();
    System.out.println(String.format("Testing %s talks", talks.length));
    for (Talk talk : talks)
    {
      String message = String.format("%s:\n %s", talk.getTitle(), talk.getPath());
      if (talk.getPath().startsWith("http"))
      {
        continue;
      }
      Assert.assertTrue(message, new File(talk.getPath()).exists());
      if (talk.getPath().contains(" "))
      {
        File oldFile = new File(talk.getPath());
        File newFile = new File(talk.getPath().replace(" ", "_"));
        oldFile.renameTo(newFile);
        System.out.println(newFile);
      }
      //Assert.assertTrue(message, !talk.getPath().contains(" "));
    }
  }
}
