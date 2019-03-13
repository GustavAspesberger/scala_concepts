val x = List(1,2,3,4,5,6,7,8,9)

x.map { z =>
  z match {
    case y if y < 3 => "Smaller than 3"
    case 4 | 6 => "Either 4 or 6"
    case 9 => "Only 9"
    case _ => "WildCard"
  }
}
