package Figure

import Shape.Geomeshape

class Square(base: Int, height: Int, name: String) extends Geomeshape{

  override def area(): Double = base*height

  override def edge(): Int = 4

  override def dimensions(): Int = 2

  override def show(): Unit = {
      println("╔" + "═"*base + "╗")
      for (i <- 0 to height)
        println("║" + " "*base + "║")
      println("╚" + "═"*base + "╝")

  }

  override def name(): String = name
}
