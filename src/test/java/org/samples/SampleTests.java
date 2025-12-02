package org.samples;


import org.approvaltests.Approvals;
import org.approvaltests.JsonApprovals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SampleTests
{
  @Test
  void testNormalJunit()
  {
    assertEquals(5, 5);
  }
  @Test
  void testWithApprovalTests()
  {
    Approvals.verify("Hello World");
  }
  /**
    *  note: this requires GSON which is currently added in the pom.xml file. 
    *  This is only required if you want to use the VerifyAsJson.
    **/
  @Test
  void testJson()
  {
    Person hero = new Person("jayne", "cobb", true, 38);
    JsonApprovals.verifyAsJson(hero);
  }
}
