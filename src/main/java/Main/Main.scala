package Main

import Figure.{Circle, Square, Triangle}

object Main extends App {

  val name = Utils.askname()

  //val age = Utils.age()

  val radius = Utils.radius()

  val Circle = new Circle(radius, name)
  val Triangle = new Triangle(10, 2, name)
  val Square = new Square(35, 16, name)

  println(Circle.area())
  println(Triangle.area())
  println(Square.name() + "'s area is = " + Square.area())
  Square.show()
}
