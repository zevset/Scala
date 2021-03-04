def circleArea3(r : String): Double = {
	r.isEmpty match{
		case true => 0
		case false => math.pow(r.toDouble,2)*math.Pi
	}
}
circleArea3("8")
circleArea3("")
