import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers
import katas.FizzBuzz


class DummySpec extends AnyFreeSpec with Matchers {
  "A HelloWorld" - {
    "when greet" - {
      "should produce `Hello World`" in {
        HelloWorld.greet shouldBe "Hello World"
      }
    }
  }

  "A FizzBuzz" - {
    "when apply multipliers of three" - {
      "should produce `Fizz`" in {
        FizzBuzz.apply(3) shouldBe "Fizz"
        FizzBuzz.apply(6) shouldBe "Fizz"
        FizzBuzz.apply(9) shouldBe "Fizz"
      }
    }

    "when apply multipliers of five" - {
      "should produce `Buzz`" in {
        
      }
    }

    "when apply multipliers of three and five" - {
      "should produce `FizzBuzz`" in {
        
      }
    }

    "when apply non-multipliers of three or five" - {
      "should produce applied number" in {
        
      }
    }
  }
}
