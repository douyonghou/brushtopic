package linked.practice

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 * 链表数据结构面试题-多家公司
 */
object FindIndexKNode {

  // 返回以数组创建一条链表的头节点
  def makeLinkedByArray(list: List[Int]): LinkedNode = {
    val node = new LinkedNode(-1)
    list.foreach(x => {
      val next = new LinkedNode(x)
      node.next = next
    })
    node
  }

}

case class LinkedNode(element: Int, nextNode: LinkedNode){
  var elem: Int = element
  var next: LinkedNode = nextNode

  def this(element: Int){
    this(element, null)
  }

}
