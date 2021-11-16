import akka.actor.ActorSystem
import org.woocommerce.akkaclient.api.DefaultApi
import org.woocommerce.akkaclient.core.ApiInvoker

import scala.Seq.empty
import scala.concurrent.Await
import scala.concurrent.duration._

object WoocommerceAkkAExample extends App {
  implicit val system: ActorSystem = ActorSystem("Woocommerce-Akka-Example")
  implicit val ec = system.getDispatcher
  sys.addShutdownHook(system.terminate())

  val invoker = ApiInvoker()

  // Using the generated api to get a list of products
  val storeApi = DefaultApi("https://www.liberactiva.nl/wp-json/wc/store")
  // Constructing a get request to retrieve a few products
  val productsGet = storeApi.productsGet(exclude = empty, include = empty, parent = empty, stockStatus = empty, parentExclude = empty, rating = empty, attributes = empty)
  val fResult = invoker.execute(productsGet)
  val result = Await.result(fResult, 15.seconds)
  println(result.content)
  System.exit(0)
}
