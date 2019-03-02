package tests.test14

import dejavu.Verify
import org.junit.Test
import tests.util.testcase.TestCase

class Test14 extends TestCase {
  val TEST = PATH_TO_TESTS + "/test14"
  val spec = s"$TEST/spec.qtl"
  val log1 = s"$TEST/log1.csv"
  val log2 = s"$TEST/log2.csv"

  @Test def test1(): Unit = {
    Verify(spec,log1, "3")
    checkResults(1,2,3)
  }

  @Test def test2(): Unit = {
    Verify(spec,log2, "3")
    checkResults(1,2,3,4,5)
  }
}

