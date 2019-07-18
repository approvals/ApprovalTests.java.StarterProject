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
                      _("10 X", "/Users/llewellyn/Documents/10x.pptx"),
                      _("A swimming pool isn’t just a bigger bathtub",
                          "/Users/llewellyn/Documents/Infographics/A_Swimming_Pool_is_not_just_a_bigger_bathub.pptx"),
                      _("Bdd vs TDD", "/Users/llewellyn/Documents/Bdd_vs_TDD.pptx"),
                      _("Arlo’s Git Notation", "/Users/llewellyn/Documents/Belshee_Git_Notation.pptx"), // need improvement
                      _("The Curse of knowledge",
                          "/Users/llewellyn/Documents/The_Curse_of_Knowledge_-_parts.pptx"),
                      _("Do NOT use the greater than sign in programming",
                          "/Users/llewellyn/Documents/Do_NOT_use_the_greater_than_sign_in_programming_16x9.pptx"),
                      _("DocDoD", "/Users/llewellyn/Documents/DocDoD.pptx"),
                      _("Sparrows", "/Users/llewellyn/Github/RefactoringClass/Slides/Sparrows_SongAndHouse.pptx"),
                      _("Sticky Notes", "/Users/llewellyn/Github/RefactoringClass/Slides/Sticky_Notes.pptx"),
                      _("Leveling up", "/Users/llewellyn/Documents/Leveling_Up.pptx"),
                      _("On being the best", "/Users/llewellyn/Documents/On_Being_the_Best_Animation.key"),
                      _("Mob Programming the best of the team",
                          "/Users/llewellyn/Documents/Infographics/Mob_Programming_Infographic.pptx"),
                      _("Quantum Computing", "/Users/llewellyn/Documents/Quantum_Computing_2019.pptx"),
                      _("Theory Based thread testing", "/Users/llewellyn/Documents/Thread_base_theory_test.pptx"),
                      _("Better Lunches", "/Users/llewellyn/Documents/Infographics/Better_Lunches.pptx"),
                      _("Generic Type Information at Runtime in Java",
                          "/Users/llewellyn/Documents/Generic_Runtime_Information_in_Java.pptx"),
                      _("Sustainable Pace", "/Users/llewellyn/Documents/Sustainable_Pace.pptx"),
                      _("Make the Easy Change", "/Users/llewellyn/Documents/Make_the_Easy_Change.pptx"),
                      _("Decision trees", "/Users/llewellyn/Documents/Decision_trees.pptx")};
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
