import org.scalatest.funsuite.AnyFunSuite

class Question6Test extends AnyFunSuite{

  test("Range between 20-50"){
    assert(Question6.check(20,50) === true)
    assert(Question6.check(10,60) === false)
  }

}
