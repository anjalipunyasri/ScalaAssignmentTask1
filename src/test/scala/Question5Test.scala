import org.scalatest.funsuite.AnyFunSuite

class Question5Test extends AnyFunSuite{

  test("Print the greatest number and If the number is equal then print 0"){
    assert(Question5.check(78,19) === 78)
    assert(Question5.check(12,12) === 0)
    assert(Question5.check(30,67) === 67)

  }

}
