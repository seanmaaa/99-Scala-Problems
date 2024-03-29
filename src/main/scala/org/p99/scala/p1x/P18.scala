package org.p99.scala.p1x

import org.p99.scala.Medium

object P18 extends Medium {
  /*
  * Extract a slice from a list.
  * Given two indices, I and K, the slice is the list containing the elements from
  *   and including the Ith element up to but not including the Kth element of the original list.
  * Start counting the elements with 0.

  * Example:
    scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    res0: List[Symbol] = List('d, 'e, 'f, 'g)
  * */

  def slice[T](i: Int, k: Int, list: List[T]): List[T] = {
    if ((i >= list.length) && (k >= list.length) && (i > k)) throw new IndexOutOfBoundsException
    else list.takeRight(list.length - i).take(k - i)
  }

}
