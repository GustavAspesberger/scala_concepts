val x = List(1,2,3)
val y = List(4,5,6)
val z = List(x,y)

z.flatMap(z => z)
z.flatten
