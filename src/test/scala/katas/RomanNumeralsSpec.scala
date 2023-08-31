package katas

import org.scalatest.matchers.should.Matchers
import org.scalatest.freespec.AnyFreeSpec

class RomanNumeralsSpec extends AnyFreeSpec with Matchers {
  "A RomanNumerals" - {
    "when convert 1" - {
      "should produce `I`" in {
        RomanNumerals.convert(1) shouldBe "I"
      }
    }
    "when convert 5" - {
      "should produce `V`" in {
        RomanNumerals.convert(5) shouldBe "V"
      }
    }
    "when convert 10" - {
      "should produce `X`" in {
        RomanNumerals.convert(10) shouldBe "X"
      }
    }
    "when convert 50" - {
      "should produce `L`" in {
        RomanNumerals.convert(50) shouldBe "L"
      }
    }
    "when convert 100" - {
      "should produce `C`" in {
        RomanNumerals.convert(100) shouldBe "C"
      }
    }
    "when convert 500" - {
      "should produce `D`" in {
        RomanNumerals.convert(500) shouldBe "D"
      }
    }
    "when convert 1000" - {
      "should produce `M`" in {
        RomanNumerals.convert(1000) shouldBe "M"
      }
    }
    "when convert 1666" - {
      "should produce `MDCLXVI`" in {
        RomanNumerals.convert(1666) shouldBe "MDCLXVI"
      }
    }
    "when convert 21" - {
      "should produce `XXI`" in {
        RomanNumerals.convert(21) shouldBe "XXI"
      }
    }
    "when convert 4" - {
      "should produce `IV`" in {
        RomanNumerals.convert(4) shouldBe "IV"
      }
    }
    "when convert 9" - {
      "should produce `IX`" in {
        RomanNumerals.convert(9) shouldBe "IX"
      }
    }
    "when convert 8" - {
      "should produce `VIII`" in {
        RomanNumerals.convert(8) shouldBe "VIII"
      }
    }
    "when convert 19" - {
      "should produce `XIX`" in {
        RomanNumerals.convert(19) shouldBe "XIX"
      }
    }
    "when convert 18" - {
      "should produce `XVIII`" in {
        RomanNumerals.convert(18) shouldBe "XVIII"
      }
    }
  }
}
