package task5

import org.junit.*
import org.junit.Assert.*
import Optionals.*
import OptionalInt.*

class OptionalIntTest:
  @Test def emptyOptionalShouldBeEmpty(): Unit =
    val empty = OptionalInt.Empty()
    assertTrue(OptionalInt.isEmpty(empty))

  @Test def nonEmptyOptionalShouldNotBeEmpty(): Unit =
    val nonEmpty = OptionalInt.Just(0)
    assertFalse(OptionalInt.isEmpty(nonEmpty))

  @Test def orElseShouldReturnDefaultWhenEmpty(): Unit =
    val nonEmpty = OptionalInt.Just(0)
    assertEquals(0, OptionalInt.orElse(nonEmpty, 1))

  @Test def orElseShouldReturnValueWhenNonEmpty(): Unit =
    val empty = OptionalInt.Empty()
    assertEquals(1, OptionalInt.orElse(empty, 1))

  /** Task 5: do test for map **/
  
  @Test def testMapIntNotEmpty(): Unit =
    val result = OptionalInt.mapInt(Just(5))(_ + 1)
    assertEquals(Just(6), result)

  @Test def testMapIntEmpty(): Unit =
    val result = OptionalInt.mapInt(Empty())(_ + 1)
    assertEquals(Empty(), result)

  @Test def testFilterNotEmpty(): Unit =
    val result = OptionalInt.filter(Just(5))(_ > 2)
    assertEquals(Just(5), result)

  @Test def testFilterNotEmptyButFalse(): Unit =
    val result = OptionalInt.filter(Just(5))(_ > 8)
    assertEquals(Empty(), result)

  @Test def testFilterEmpty(): Unit =
    val result = OptionalInt.filter(Empty())(_ > 2)
    assertEquals(Empty(), result)