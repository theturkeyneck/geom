package Main

import Figure.{Circle, Cube, Square, Triangle}

object Main extends App {

  val name = Utils.askname()

  //val age = Utils.age()

  val radius = Utils.radius()

  val circle = new Circle(radius, name)
  val triangle = new Triangle(10, 2, name)
  val square = new Square(35, 16, name)
  val cube = new Cube(23,4,18, name)

  println(circle.area())
  println(triangle.area())
  println(square.name() + "'s area is = " + square.area())
  square.show()
  println(cube.area())
}
