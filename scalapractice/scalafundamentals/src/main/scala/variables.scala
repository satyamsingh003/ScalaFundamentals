@main
def variables(): Unit = {
  var a:Int=5
  var b:Int=6
  var c="Hello"
  print(a+b)
  print(a+" "+c)
  
//  asa val cannot be reassigned so it is giving error as reassignment
  val color="Blue"
//  color="Red"
  print(color)
}
