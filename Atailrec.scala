@annotation.tailrec
def fives(cur: Int, max: Int): Unit = {
	if(cur<= max){
		println(cur)
		fives(cur+5,max)
	}
}
fives(0,20)
