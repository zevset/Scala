val chars = ('a' to 'f').toList
def first[A](items: List[A], count: Int): List[A] = items take count
first(chars, 3)
def first2[A](items: List[A], count: Int): List[A] = {
	val l = for(i <- 0 until count) yield items(i)
	l.toList
}
first2(chars,3)
def first3[A](items: List[A], count: Int): List[A] = {
	items.foldLeft[List[A]](Nil){ (a: List[A], i: A) =>
		if(a.size >= count) a else i:: a
	}.reverse
}
first3(chars,3)
def first4[A](items: List[A], count: Int): List[A] = {
	if(count>0 && items.tail != Nil) items.head :: first4(items.tail,count-1)
	else Nil
}
first4(chars,3)
