def time() = {
  System.nanoTime()
}

// callByValue only get evaluated the when initiated
def callByValue(t: Long) = {
  println("***** START *****")
  println("****** Call By Value (1)*****")
  println(s"t => $t")
  println("****** Call By Value (2)*****")
  println(s"t => $t")
  println("****** Call By Value (3)*****")
  println(s"t => $t")
  println("***** FINISHED *****")
}

// callByName gets evaluated everytime it is referenced
def callByName(t: => Long) = {
  println("***** START *****")
  println("****** Call By Name (1)*****")
  println(s"t => $t")
  println("****** Call By Name (2)*****")
  println(s"t => $t")
  println("****** Call By Name (3)*****")
  println(s"t => $t")
  println("***** FINISHED *****")
}