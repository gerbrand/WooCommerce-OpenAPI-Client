import akka.actor.ActorSystem
import org.woocommerce.akkaclient.api.DefaultApi
import org.woocommerce.akkaclient.core.{ApiInvoker, ApiRequest}
import org.woocommerce.akkaclient.model

import scala.concurrent.Await
import scala.concurrent.duration._


object WoocommerceAkkAExample extends App {
  implicit val system: ActorSystem = ActorSystem("Woocommerce-Akka-Example")
  sys.addShutdownHook(system.terminate())
  val invoker = ApiInvoker()



  import Seq.empty
  val storeApi = DefaultApi("https://www.software-creation.nl/wp-json/wc/store")
  val productsGet: ApiRequest[Seq[model.Product]] = storeApi.productsGet(exclude = empty, include = empty, parent = empty, stockStatus = empty, parentExclude = empty, rating = empty, attributes = empty);
  val fResult = invoker.execute(productsGet)
  val result = Await.result(fResult, 5.seconds)
  println(result.content.mkString)
}
