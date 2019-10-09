package Figure

import Shape.Geomeshape

class Triangle(base: Double, height: Double, name: String) extends Geomeshape {
  override def area(): Double = base*height/2

  override def edge(): Int = 3

  override def dimensions(): Int = 2

  override def show(): Unit = {}

  override def name(): String = name
}
