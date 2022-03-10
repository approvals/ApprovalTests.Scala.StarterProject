package ApprovalTests.Scala.StarterProject

import org.approvaltests.Approvals
import org.approvaltests.combinations.CombinationApprovals
import org.junit.{Assert, Test}

class AppSuiteTest {
  @Test def testNormalJUnitTest(): Unit = {
    Assert.assertEquals(5, 5)
  }
  @Test def testUsingApprovalTests(): Unit = {
    Approvals.verify("Hello World")
  }
  @Test def testUsingApprovalCombinations(): Unit = {
    val numbers: Array[Integer] = Array( 10 , 20 , 30 , 40 , 50 )
    CombinationApprovals.verifyAllCombinations( (a: Integer , b: Integer) => s"$a + $b" , numbers, numbers)}
}
