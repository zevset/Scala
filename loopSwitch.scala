for(i <- 1 to 100){
	i match {
		 case x if x % 15 == 0 => println("typesafe")
		 case x if x % 5 == 0 => println("safe")
		 case x if x % 3 == 0 => println("type")
		 case x => println(x)
	}
}
