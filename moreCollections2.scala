def toDouble(a:String) = util.Try(a.toDouble).toOption
val x = toDouble("a")
def product(a: String, b: String):Option[Double] = {
	(toDouble(a),toDouble(b)) match{
		case (Some(a1), Some(b1)) =>Some(a1*b1)
		case _ => None
	}
}
val x = product("yes","20")
val x = product("99.3","7")
def product2(a: String, b: String):Option[Double] = {
	for(a1 <- toDouble(a); b1 <- toDouble(b))yield a1*b1
}
val x = product("11","1.93")
val x = product("true","")
