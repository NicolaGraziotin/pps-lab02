package it.unibo.pps.u02

object Recursion {
  // 7
  def power(base: Double, exponent: Int): Double = exponent match
    case 0 => 1
    case _ => base * power(base, exponent - 1)

  def powerTail(base: Double, exponent: Int): Double =
    @annotation.tailrec
    def _powerTail(b: Double, exponent: Int, acc: Double): Double = exponent match
      case 0 => acc
      case _ => _powerTail(b, exponent - 1, b * acc)
    _powerTail(base, exponent, 1)

  // 8
  def reverseNumber(n: Int): Int =
    @annotation.tailrec
    def _reverseNumber(n: Int, acc: Int, len: Int): Int = n match
      case 0 => acc
      case _ => _reverseNumber(n / 10, f(acc, n%10, len - 1), len - 1)
    _reverseNumber(n, 0, Math.log10(n).toInt + 1)

  val f: (Int, Int, Int) => Int = (acc, n, len) => acc + (n * powerTail(10, len).toInt)
}

