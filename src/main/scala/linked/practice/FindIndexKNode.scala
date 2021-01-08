package linked.practice

/**
 * 输入一个链表，输出该链表中第k个结点元素。
 * 链表数据结构面试题-多家公司
 */
object FindIndexKNode {

  def main(args: Array[String]): Unit = {
    val list = (1 to 10).toList
    var first = makeLinkedByArray(list)._1
    var last = makeLinkedByArray(list)._2
    (1 to 4).foreach { x => {
      var nowNoe = first.next
      if (x == 4) {
        println(nowNoe.elem)
      }
      first = nowNoe
    }
    }
  }

  // 返回以数组创建一条链表的尾节点
  def makeLinkedByArray(list: List[Int]): (LinkedNode, LinkedNode) = {
    val first = new LinkedNode(-1)
    var last = first
    list.map(x => {
      val now = new LinkedNode(x)
      last.next = now
      last = now
    })
    (first, last)
  }
}
