package linked.practice

case class LinkedNode(element: Int, nextNode: LinkedNode) {
  var elem: Int = element
  var next: LinkedNode = nextNode

  def this(element: Int) {
    this(element, null)
  }
}
