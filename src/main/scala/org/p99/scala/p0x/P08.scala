package org.p99.scala.p0x

import org.p99.scala.Medium

object P08 extends Medium {
  /*
  * Eliminate consecutive duplicates of list elements.
  * If a list contains repeated elements they should be replaced with a single copy of the element.
  * The order of the elements should not be changed.

  * Example:
    scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
  * */

  def compress[T](list: List[T]): List[T] = list match {
    case Nil => Nil
    case head :: Nil => head :: Nil
    case head :: tail => if (head == tail.head) compress(tail) else head :: compress(tail)
  }

}
