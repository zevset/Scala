import org.scalatest.{FlatSpec, ShouldMatchers}

class SafeStringUtilsSpec extends FlatSpec with ShouldMatchers{
  "The Safe String Utils object" should "trim empty string to None" in {
    SafeStringUtils.trimToNone("") should be(None)
    SafeStringUtils.trimToNone(" ") should be(None)
    SafeStringUtils.trimToNone("      ") should be(None) // Tab and spaces

  }
  it should "handle null values safely" in {
    SafeStringUtils.trimToNone(null) should be(None)
  }
  it should "trim non-empty strings" in {
    SafeStringUtils.trimToNone(" hi there ") should equal(Some("hi there"))
  }
  it should "leave intrimmabe non-empty strings alone" in{
    val testString = "Goin' down that road feeling bad ."
    SafeStringUtils.trimToNone(testString) should equal(Some(testString))
  }
}