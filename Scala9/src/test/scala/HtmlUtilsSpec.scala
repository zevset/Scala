import org.scalatest.{FlatSpec, ShouldMatchers}

class HtmlUtilsSpec extends FlatSpec with ShouldMatchers{

  "The Html Utils Object" should "remove single elements" in {
    HtmlUtils.removeMarkup("<br/>") should equal("")
  }

  it should "remove paired elements" in {
    HtmlUtils.removeMarkup("<b>Hi</b>") should equal("Hi")
  }

  it should "have no effect on empty string" in {
    val empty = true
    HtmlUtils.removeMarkup("").isEmpty should be(empty)
  }

  it should "strip Javascript source" in {
    val src =
      """<html>
        <head>
        <script type="text/javascript">
          console.log("Yo");
        </script>
        </head></html>
        """
        HtmlUtils.removeMarkup(src) should not include "console.log"
  }

  /*
  test("really simple transformation"){
    val input = HtmlUtils.removeMarkup
    assert(expected === sc.parallelize(input).map(_.split(" ").toList).collect().toList )
  }

   */

}
