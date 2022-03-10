package ApprovalTests.Scala.StarterProject

import org.approvaltests.Approvals
import org.junit.Test

class AppSuiteTest {
  @Test def testUsingApprovalTests(): Unit = {
    Approvals.verify("Hello World")
  }
}
