import Main.{fibonacci, fibonacciEvenSum}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class MainSpec extends AnyFlatSpec with should.Matchers {

  "fibonacciEvenSum" should "return 4613732 " in {
    fibonacciEvenSum(fibonacci(Seq(0, 1)).init) shouldBe 4613732
  }

}
