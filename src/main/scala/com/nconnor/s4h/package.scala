package com.nconnor

import scala.collection.generic.CanBuildFrom
import scala.collection.immutable.List

/**
  * Author: Nicholas Connor
  * Date: 7/17/18
  * Package: s4h
  */
package object s4h {

  implicit class Lists4Humans[A](lst: List[A]) {
    /**
      *
      * @param elem
      * @param bf
      * @tparam B
      * @tparam That
      * @return
      */
    def prepend[B >: A, That](elem: B)(implicit bf: CanBuildFrom[List[A], B, That]): That = bf match {
      case _: List.GenericCanBuildFrom[_] => (elem :: lst).asInstanceOf[That]
      case _ => lst.+:(elem)(bf)
    }

    /**
      * Not quite hitting the type signature here.
      * @param elem
      * @return
      */
    def prepend(elem: A): List[A] = elem +: lst
  }

}
