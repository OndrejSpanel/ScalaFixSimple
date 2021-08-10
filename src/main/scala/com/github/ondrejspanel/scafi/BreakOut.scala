package com.github.ondrejspanel.scafi

object BreakOut {

  val diffI = List(1, 2, 3)
  val set: Set[Int] = diffI.map(i => i)(collection.breakOut)

}
