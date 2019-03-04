package z.tour

class TwoDVector ( var name: String = "Point") {

  private var _x: Double = 0
  private var _y: Double = 0

  def x = _x
  def y = _y

  def x_= (xVal: Double) = {
    _x = xVal
  }

  def y_= (yVal: Double) ={
    _y = yVal
  }


  def move(dx: Double, dy: Double): Unit = {
    _x = _x + dx
    _y = _y + dy
  }

  override def toString: String = {
    s"(${_x}, ${_y})"
  }

  def display(): Unit = {
    println(s" ${name} is at : " + this)
  }

}
