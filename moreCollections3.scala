System.getProperty(null)
val arch = System.getProperty("os.arch")
val blarg = System.getProperty("blarg")
def getProperty(s: String): Option[String] = {
	util.Try(System.getProperty(s)) match{
		case util.Success(x) => Option(x)
		case util.Failure(ex) => None
	}
}
getProperty(null)
val arch = getProperty("os.arch")
val blarg = getProperty("blarg")
