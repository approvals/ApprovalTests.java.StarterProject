package org.llewellyn.talks;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.random.selector.RamdomSelector;

import com.spun.util.ObjectUtils;
import com.spun.util.WindowUtils;

public class LightningTalkSelector extends JPanel
{
  private JLabel               commitLabel;
  private JButton              nextButton;
  private RamdomSelector<Talk> talks;
  public LightningTalkSelector()
  {
    talks = new RamdomSelector<>(Talk.class, LightningTalks.getLlewellyns());
    setLayout();
  }
  private void setLayout()
  {
    this.setLayout(new BorderLayout());
    this.setPreferredSize(new Dimension(1200, 75));
    commitLabel = new JLabel("Up Next : ");
    Font font = new Font("Courier", Font.BOLD, 28);
    commitLabel.setFont(font);
    this.add(commitLabel, BorderLayout.WEST);
    nextButton = new JButton("Next");
    nextButton.addActionListener(e -> next());
    this.add(nextButton, BorderLayout.EAST);
  }
  private Object next()
  {
    Talk talk = talks.get();
    commitLabel.setText("Up Next : " + talk.getTitle());
    this.invalidate();
    ObjectUtils.throwAsError(() -> Runtime.getRuntime().exec("open " + talk.getPath()));
    return null;
  }
  public static void main(String[] args)
  {
    WindowUtils.testPanel(new LightningTalkSelector());
  }
}
