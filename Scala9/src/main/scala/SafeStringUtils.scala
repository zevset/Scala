import scala.util.Try

trait SafeStringUtils{

  /**
   * Return a trimmed version of the strings ewrapped in an Option
   * or None if the trimmed string is empty.
   * @param s the string to trim
   * @return Some with trimmed string, or Nome if empty
   */
  def trimToNone(s: String): Option[String] = {
    Option(s) map(_.trim) filterNot(_.isEmpty)
  }

  /**
   * Returns the string as an integer or None if it could not to be converted.
   *
   * @param s the string to be converted to an Integer
   * @return Some with the integer values or else None if not parseable
   */
  def parseToInt(s: String): Option[Int] ={
    trimToNone(s) flatMap{x => Try(x.toInt).toOption}
  }
}

object SafeStringUtils extends SafeStringUtils