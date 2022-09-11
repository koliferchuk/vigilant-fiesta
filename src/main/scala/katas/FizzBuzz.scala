package katas

/** Fizz Buzz Kata
 *  ==Your task==
 *  - Write a program that prints one line for each number from 1 to 100
 *  - For multiples of three print `Fizz` instead of the number
 *  - For the multiples of five print `Buzz` instead of the number
 *  - For numbers which are multiples of both three and five print `FizzBuzz` instead of the number
 */
object FizzBuzz {
  def apply(x: Int): String = x match {
    case n if n % 3 == 0 && n % 5 == 0 => "FizzBuzz"
    case n if n % 3 == 0 => "Fizz"
    case n if n % 5 == 0 => "Buzz"
    case n => s"$n"
  }
}
