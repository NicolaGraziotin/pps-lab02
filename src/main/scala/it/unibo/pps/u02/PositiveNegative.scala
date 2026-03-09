package it.unibo.pps.u02

object PositiveNegative {
  // a
  val positiveVal: Int => String = _ match
    case x if x >= 0 => "positive"
    case _ => "negative"

  def positiveDef(x: Int): String = x match
    case x if x >= 0 => "positive"
    case _ => "negative"

  // b
  val neg: (String => Boolean) => (String => Boolean) = e => !e(_)
  val empty: String => Boolean = _ == ""
  val notEmpty = neg(empty)
  notEmpty("foo")
  notEmpty("")

  // 4
  val p1 = (x: Double) => (y: Double) => (z: Double) => x <= y && y == z
  val p2 = (x: Double, y: Double, z: Double) => x <= y && y == z
  def p3(x: Double)(y: Double)(z: Double): Boolean = x <= y && y == z
  def p4(x: Double, y: Double, z: Double): Boolean = x <= y && y == z

  // 5
  def compose(f: Int => Int, g: Int => Int): Int => Int = (x: Int) => f(g(x))
  compose(_ - 1, _ * 2)(5)
}
