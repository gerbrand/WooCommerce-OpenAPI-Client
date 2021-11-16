import org.woocommerce.sttpclient.api.DefaultApi

import scala.Seq.empty

object WooCommerceSttpExample extends App {

  import sttp.client._

  val api = DefaultApi("https://www.liberactiva.nl/wp-json/wc/store")
  val productsRequest = api.productsGet(exclude = empty, include = empty, parent = empty, stockStatus = empty, parentExclude = empty, rating = empty, attributes = empty)

  // Based on example at: https://github.com/softwaremill/sttp#welcome

  implicit val backend = HttpURLConnectionBackend()

  val response = productsRequest.send()

  // response.header(...): Option[String]
  println(response.header("Content-Length"))

  // response.body: by default read into an Either[String, String] to indicate failure or success
  println(response.body)

  System.exit(0)
}
