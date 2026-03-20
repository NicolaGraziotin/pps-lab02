package task5

import org.junit.*
import org.junit.Assert.*
import it.unibo.pps.u02.Expressions.*
import it.unibo.pps.u02.Expressions.Expr.*

class ExpressionTest:

  @Test def testEvaluate(): Unit = {
    val sum = evaluate(Add(Literal(5), Literal(10)))
    assertEquals(15, sum)
    val mult = evaluate(Multiply(Literal(3), Literal(10)))
    assertEquals(30, mult)
  }

  @Test def testEvaluateCombined(): Unit = {
    val expr = evaluate(Add(Literal(5), Multiply(Literal(3), Literal(10))))
    assertEquals(35, expr)
  }

  @Test def testShow(): Unit = {
    val actual: String = show(Add(Literal(5), Literal(10)))
    assertEquals("(5 + 10)", actual)
    assertEquals("10", show(Literal(10)))
  }

  @Test def testShowCombined(): Unit = {
    val actual = show(Add(Literal(5), Multiply(Literal(3), Literal(10))))
    assertEquals("(5 + (3 * 10))", actual)
  }