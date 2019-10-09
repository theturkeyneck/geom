package Main

object Utils {
  /**
   *
   * @return
   */
  def askname(): String = {
    println ("What do you want to call your figure? ")
    val name = scala.io.StdIn.readLine ()
    name
  }

  /**
   *
   * @return
   */
  def age(): Int ={
    println("How old are you? ")
    scala.io.StdIn.readInt()
  }

  /**
   * Asking for the circle's radius
   * @return
   */
  def radius(): Int = {
    println("What's your circle's radius? : ")
    scala.io.StdIn.readInt()
  }
}
