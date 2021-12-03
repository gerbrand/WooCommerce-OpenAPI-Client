import akka.actor.ActorSystem
import org.woocommerce.akkaclient.api.DefaultApi
import org.woocommerce.akkaclient.core.{ApiInvoker, BasicCredentials}

import scala.Seq.empty
import scala.concurrent.Await
import scala.concurrent.duration._

object WoocommerceAkkAExample extends App {
  implicit val system: ActorSystem = ActorSystem("Woocommerce-Akka-Example")
  implicit val ec = system.getDispatcher
  sys.addShutdownHook(system.terminate())

  val invoker = ApiInvoker()
  implicit val basicAuth = BasicCredentials(sys.env("WORDPRESS_USER"), sys.env("WORDPRESS_PASSWORD"))
  // Using the generated api to get a list of products
  val wcApi = DefaultApi("https://www.software-creation.nl/wp-json/wc/store")
  // Constructing a get request to retrieve a few products
  val productsGet = wcApi.productsGet(exclude=Seq.empty, include=Seq.empty, parent=Seq.empty,parentExclude=Seq.empty )
  val fResult = invoker.execute(productsGet)
  val products = Await.result(fResult, 15.seconds)
  println(products.content.map(p => s"Product ${p.name.getOrElse("")} with barcode ${p.sku.getOrElse("unknown")} for ${p.price.getOrElse("unknown")}").mkString("\n"))
  System.exit(0)
}
