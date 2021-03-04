def offset(src:(Int,Int),dest: (Int,Int)):(Int,Int) = {
	(dest._1 - src._1, dest._2 -src._2)
}
offset((4,9),(122,27))
