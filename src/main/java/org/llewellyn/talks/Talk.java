package org.llewellyn.talks;

public class Talk
{
  private String title;
  private String path;
  public Talk(String title, String path)
  {
    this.title = title;
    this.path = path;
  }
  public String getTitle()
  {
    return title;
  }
  public String getPath()
  {
    return path;
  }
}
