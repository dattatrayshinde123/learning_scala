object hello {
  def main(args: Array[String]): Unit = {
    var isPresent=true // variable boolen type
    var a =5
    var b =7
    var c=2. +(5)
    println("equality of a==b is : " +(a!=b))
    println("logical or of (a||b ) = " +(a|b))
    print(isPresent, c)

    var result=add(2,6)
    println("Addititon of x and y is : "+ result)
  }

  def add(x:Int, y:Int): Int={
    var z=x+y
    return z  // Not mandatory to specify return function
  }
}

