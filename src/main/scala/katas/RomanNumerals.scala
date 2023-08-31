package katas

import scala.annotation.tailrec

/** Roman Numerals Kata
 *  ==Your task==
 *  Write a method `String convert(int)` that takes a number and converts it to the according String representation.
 */
object RomanNumerals {
  def convert(n: Int): String = calc("", n)

  @tailrec
  private def calc(acc: String, n: Int): String = n match {
    case x if x / 1000 > 0 => calc(acc + "M" * (x / 1000), x % 1000)
    case x if x / 500 > 0 => calc(acc + "D" * (x / 500), x % 500)
    case x if x / 100 > 0 => calc(acc + "C" * (x / 100), x % 100)
    case x if x / 50 > 0 => calc(acc + "L" * (x / 50), x % 50)
    case x if x / 10 > 0 => calc(acc + "X" * (x / 10), x % 10)
    case x if x == 5 => calc(acc + "V" * (x / 5), x % 5)
    case x if x > 0 => acc + "I" * x
    case _ => acc
  }
}
