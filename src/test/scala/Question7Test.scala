import org.scalatest.funsuite.AnyFunSuite

class Question7Test extends AnyFunSuite{

  test("String is Happy or Not"){
    assert(Question7.check(4,"SwiggyZomato") === "happy")
    assert(Question7.check(8,"SwiggyZomato") === "not happy")
  }

}



