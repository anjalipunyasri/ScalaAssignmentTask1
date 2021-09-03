import org.scalatest.funsuite.AnyFunSuite

class Question4Test extends AnyFunSuite{

  test("Print If statement if is not present in the given statement otherwise not"){
    assert(Question4.check("If better start") === "If better start")
    assert(Question4.check("contact") === "If contact")
  }

}
