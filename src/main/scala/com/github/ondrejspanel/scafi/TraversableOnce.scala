package com.github.ondrejspanel.scafi

object TraversableOnce {

  def shuffle[T](random: scala.util.Random, src: TraversableOnce[T]): List[T] = {
    src.foldLeft(List.empty[T]) { (list, item) =>
      val len = list.length
      val index = (random.nextDouble() * (len + 1)).toInt
      list.patch(index, List(item), 0)
    }
  }

}
