package org.llewellyn.talks;

import java.io.IOException;

import org.random.selector.RamdomSelector;

import com.spun.util.tests.TestUtils;

public class LightningTalks
{
  public static Talk _(String title, String path)
  {
    return new Talk(title, path);
  }
  public static Talk[] getLlewellyns()
  {
    return new Talk[]{_("Test Driven Math", "https://www.desmos.com/"),
                      _(" 10 X", "/Users/llewellyn/Documents/10x.pptx"),
                      _(" A swimming pool isn’t just a bigger bathtub",
                          "/Users/llewellyn/Documents/Infographics/A Swimming Pool is not just a bigger bathub.pptx"),
                      _(" Bdd vs TDD", "/Users/llewellyn/Documents/Bdd vs TDD.pptx"),
                      _(" Arlo’s Git Notation", "/Users/llewellyn/Documents/Belshee Git Notation.pptx"), // need improvement
                      _(" The Curse of knowledge",
                          "/Users/llewellyn/Documents/The Curse of Knowledge - parts.pptx"),
                      _(" Do NOT use the greater than sign in programming",
                          "/Users/llewellyn/Documents/Do NOT use the greater than sign in programming 16x9.pptx"),
                      _(" DocDoD", "/Users/llewellyn/Documents/DocDoD.pptx"),
                      _(" Sparrows", "/Users/llewellyn/Github/RefactoringClass/Slides/Sparrows_SongAndHouse.pptx"),
                      _(" Sticky Notes", "/Users/llewellyn/Github/RefactoringClass/Slides/Sticky Notes.pptx"),
                      _(" Leveling up", "/Users/llewellyn/Documents/Leveling Up.pptx"),
                      _(" On being the best",
                          "/Users/llewellyn/Library/Mobile Documents/com~apple~Keynote/Documents/On Being the Best Animation.key"),
                      _(" Mob Programming the best of the team",
                          "/Users/llewellyn/Documents/Infographics/Mob Programming Infographic.pptx"),
                      _(" Quantum Computing",
                          "/Users/llewellyn/Llewellyn Falco/Presentations/Quantum Computing - 2019.pptx"),
                      _(" Theory Based thread testing", "/Users/llewellyn/Documents/Thread base theory test.pptx"),
                      _(" Better Lunches", "/Users/llewellyn/Documents/Infographics/Better Lunches.pptx"),
                      _(" Generic Type Information at Runtime in Java",
                          "/Users/llewellyn/Documents/Generic Runtime Information in Java.pptx"),
                      _(" Sustainable Pace", "/Users/llewellyn/Documents/Sustainable Pace.pptx"),
                      _(" Decision trees", "/Users/llewellyn/Documents/Decision trees.pptx")};
  }
  public static void main(String[] args) throws IOException
  {
    RamdomSelector<Talk> talks = new RamdomSelector<>(Talk.class, getLlewellyns());
    while (!talks.isEmpty())
    {
      Talk talk = talks.get();
      System.out.print("Next up: " + talk.getTitle());
      TestUtils.displayFile(talk.getPath());
      System.in.read();
    }
    System.out.println("That's all folks!");
  }
}
