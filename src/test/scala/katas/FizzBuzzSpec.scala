package katas

import org.scalatest.propspec.AnyPropSpec
import org.scalacheck.Gen
import org.scalatest.matchers.should.Matchers
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks

class FizzBuzzSpec extends AnyPropSpec with ScalaCheckPropertyChecks with Matchers {
  implicit override val generatorDrivenConfig = PropertyCheckConfiguration(minSuccessful = 3, maxDiscardedFactor = 20)

  private val multipliersOfThree = Gen.choose(1, 1000) suchThat (n => n % 3 == 0 && n % 5 != 0)
  private val multipliersOfFive = Gen.choose(1, 1000) suchThat (n => n % 5 == 0 && n % 3 != 0)
  private val multipliersOfThreeAndFive = Gen.choose(1, 1000) suchThat (n => n % 3 == 0 && n % 5 == 0)
  private val nonThreeOrFiveMultipliers = Gen.choose(1, 1000) suchThat (n => n % 3 != 0 && n % 5 != 0)

  property("multipliers of three should produce `Fizz`") {
    forAll (multipliersOfThree) { (n) => FizzBuzz.apply(n) shouldBe "Fizz" }
  }

  property("multipliers of five should produce `Buzz`") {
    forAll (multipliersOfFive) { (n) => FizzBuzz.apply(n) shouldBe "Buzz" }
  }

  property("multipliers of three and five should produce `FizzBuzz`") {
    forAll (multipliersOfThreeAndFive) { (n) => FizzBuzz.apply(n) shouldBe "FizzBuzz" }
  }

  property("neither three nor five multipliers should produce themself as string") {
    forAll (nonThreeOrFiveMultipliers) { (n) => FizzBuzz.apply(n) shouldBe s"$n" }
  }
}
