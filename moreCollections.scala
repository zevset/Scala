def listFiles(path: String): List[String] = {
	val files = new java.io.File(path).listFiles.toList
	files.map(_.toString.replaceFirst("./",""))
}
val files = listFiles(".")
val files = listFiles(".").filterNot(_ startsWith ".")
println("Found these files: "+files.mkString(";"))
