package scala.runtime

/* This is a hijacked class. Its only instance is the value 'undefined'.
 * Constructors are not emitted.
 */
class BoxedUnit private {
  @inline override def equals(that: Any): Boolean =
    this eq that.asInstanceOf[AnyRef]

  @inline override def hashCode(): Int = 0

  @inline override def toString(): String = "undefined"
}

object BoxedUnit {
  val UNIT: BoxedUnit = sys.error("stub")
  val TYPE: Class[Void] = sys.error("stub")
}