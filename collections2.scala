def factors(x: Int) = {2 to (x-1) filter (x % _ == 0)}
def uniqueFactors (l: Seq[Int]) = l flatMap factors
uniqueFactors(List(9,11,13,15))
