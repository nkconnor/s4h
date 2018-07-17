package com.nconnor.s4h

import org.scalatest._

class BaseSpec extends FlatSpec with Matchers {

  "Prepend method" should "prepend stuff" in {
    val testList = List(1, 2, 3)
    val testItem = 4

    val before = testItem +: testList
    val after = testList.prepend(testItem)


    before shouldEqual after
  }
}
