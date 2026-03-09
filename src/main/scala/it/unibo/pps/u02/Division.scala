package it.unibo.pps.u02

object Division {
  // simple division method
  def div(x: Double, y: Double): Double = x / y
  val divNormal = div(10, 2)

  // curried division, first param is divisor and second one is dividend
  def divCurried(x: Double)(y: Double): Double = div(y, x)
  val divBy2 = divCurried(2)
  val divANumberBy2 = divBy2(20)
}

@main
def main(): Unit =
  println("Hello World")
