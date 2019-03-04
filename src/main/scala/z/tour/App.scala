package z.tour

object App {

  def main(args: Array[String]): Unit = {
    val p = new TwoDVector("p")
    p.x = 2.3
    p.y = 4.12
    p.display()
    val p2 = new TwoDVector(name ="p2")
    p2.display()
    p2.move(3, 3.4)
    p2.display()
  }

}
