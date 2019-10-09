package Figure

import Shape.Geomeshape

class Circle(radius : Double, name : String) extends Geomeshape {

  override def area(): Double = 2*Math.PI*radius

  override def edge(): Int = 1

  override def dimensions(): Int = 1

  override def show(): Unit = {}

  override def name(): String = name
}
