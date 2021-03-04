def pow(x: Double, y: Double): Double = math.pow(x,y)
pow(2,5)

def pow2(x: Double, y: Int): Double = {
	var p = 1.0
	for(i<- 1 to y) p*=x;p
}

pow2(2,5)
@annotation.tailrec
def pow3(x: Double, y:Int, accum: Double = 1): Double = {
	if(y<1)accum
	else pow3(x,y-1, accum*x)
}
pow3(2,5)
