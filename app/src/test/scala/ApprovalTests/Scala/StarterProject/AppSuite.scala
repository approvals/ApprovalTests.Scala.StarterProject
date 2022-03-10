package ApprovalTests.Scala.StarterProject

import org.approvaltests.Approvals
import org.junit.{Assert, Test}

class AppSuiteTest {
  @Test def testNormalJUnitTest(): Unit = {
    Assert.assertEquals(5, 5)
  }
  @Test def testUsingApprovalTests(): Unit = {
    Approvals.verify("Hello World")
  }
}
