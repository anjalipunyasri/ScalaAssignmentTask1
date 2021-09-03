import org.scalatest.funsuite.AnyFunSuite

class Question2Test extends AnyFunSuite{

    test("Example TEST CASE "){
      assert(Question2.check("Scala",1) === "Sala")
      assert(Question2.check("Scala",0) === "cala")
      assert(Question2.check("Scala",4) === "Scal")

    }

}
