package it.unibo.pps.u02

object Expressions {
  enum Expr:
    case Literal(value: Int)
    case Add(x: Expr, y: Expr)
    case Multiply(x: Expr, y: Expr)

  import Expr.*

  def evaluate(expr: Expr): Int = expr match
    case Literal(v) => v
    case Add(x, y) => evaluate(x) + evaluate(y)
    case Multiply(x, y) => evaluate(x) * evaluate(y)

  def show(expr: Expr): String = expr match
    case Literal(v) => v.toString
    case Add(x, y) => s"(${show(x)} + ${show(y)})"
    case Multiply(x, y) => s"(${show(x)} * ${show(y)})"
}
