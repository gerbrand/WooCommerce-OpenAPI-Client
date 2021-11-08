import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.client.RequestBuilding.Get
import akka.http.scaladsl.model.headers.BasicHttpCredentials
import akka.http.scaladsl.unmarshalling.Unmarshal
import org.json4s.DefaultFormats
import org.woocommerce.akkaclient.api.DefaultApi
import org.woocommerce.akkaclient.core.{ApiInvoker, ApiRequest, Serializers}
import org.woocommerce.akkaclient.model

import scala.concurrent.Await
import scala.concurrent.duration._
import Seq.empty

object WoocommerceAkkAExample extends App {
  implicit val system: ActorSystem = ActorSystem("Woocommerce-Akka-Example")
  implicit val ec = system.getDispatcher
  sys.addShutdownHook(system.terminate())

  val invoker = ApiInvoker()


  // Using the generated api to get a list of products
  val storeApi = DefaultApi("https://www.liberactiva.nl/wp-json/wc/store")
  val productsGet = storeApi.productsGet(exclude = empty, include = empty, parent = empty, stockStatus = empty, parentExclude = empty, rating = empty, attributes = empty);
  val fResult = invoker.execute(productsGet)
  val result = Await.result(fResult, 15.seconds)
  println(result.content)
  System.exit(0)
}
