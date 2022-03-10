package ApprovalTests.Scala.StarterProject

import org.approvaltests.{Approvals, JsonApprovals}
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
    CombinationApprovals.verifyAllCombinations( (a: Integer , b: Integer) => s"$a + $b" , numbers, numbers)
  }

  /**
   * note: this requires GSON which is currently added in the build.gradle file.
   * This is only required if you want to use the VerifyAsJson.
   */
  @Test def testUsingApprovalsAndJson () {
    def hero = new Person("jayne", "cobb", true, 38)
    JsonApprovals.verifyAsJson(hero)
  }
}
