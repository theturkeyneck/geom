package Figure

import Shape.Geomeshape

class Cube(base:Double, height: Double, depth: Double, name: String) extends Geomeshape{
  override def area(): Double = base*height*depth

  override def edge(): Int = 12

  override def dimensions(): Int = 3

  override def show(): Unit = {}

  override def name(): String = name
}
