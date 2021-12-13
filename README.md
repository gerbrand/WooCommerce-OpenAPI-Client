# OpenAPI specification for Woocommerce API

An [OpenAPI specification for Woocommerce API](https://github.com/gerbrand/WooCommerce-OpenAPI-Client/blob/main/src/main/resources/woocommerce-openapi-3.0.x.yml), which should allow you to generate clients in almost any programming language.

The OpenAPI specification is based on the OpenAPI-specification generated using the Wordpress plugin [document-generator-for-openapi](https://wordpress.org/plugins/document-generator-for-openapi) with some modifications. For more details and background see this [blog-posting](https://www.software-creation.nl/2021/11/using-the-woocommerce-api/).

# Using OpenAPI Document
You should be to use OpenAPI document to generate a client for your favorite programming language, assuming there's a [generator available](https://openapi-generator.tech/). Also you can load the document in a OpenAPI editor, for example the online [swagger-editor](https://editor.swagger.io/). Download the [openapi document](https://github.com/gerbrand/WooCommerce-OpenAPI-Client/blob/main/src/main/resources/woocommerce-openapi-3.0.x.yml) and try it out. For scala-akka, a generated library is included, see below for usage.

# Using the woocommerce-scala-akka library
A Woocommerce-scala-client library is created and published under sonatype, currently as yet as snapshot version.
To use, first add the sonatype s01 repository if not already done so to your build.sbt:
```sbt
resolvers += "Sonatype OSS S01 Snapshots" at " https://s01.oss.sonatype.org/content/repositories/snapshots"
resolvers += "Sonatype OSS S01 Snapshots" at " https://s01.oss.sonatype.org/content/repositories/releases"
```
Then you can add the library as dependency:
```sbt
libraryDependencies += "nl.software-creation" %% "woocommerce-scala-akka-client" % "0.1.1-SNAPSHOT"
```

And you can use the library as follows:
```scala
  implicit val system: ActorSystem = ActorSystem("Woocommerce-Akka-Example")
  implicit val ec = system.getDispatcher

  val invoker = ApiInvoker()
  // Wordpress user and password. Tip:
  // at very least app generated password instead of your default username or password, and preferably a seperated account
  implicit val basicAuth = BasicCredentials(sys.env("WORDPRESS_USER"), sys.env("WORDPRESS_PASSWORD"))
  // Using the generated api to get a list of products
  val wcApi = DefaultApi("https://www.software-creation.nl/wp-json/wc/v3")
  // Constructing a get request to retrieve a few products
  val productsGet = wcApi.productsGet(exclude=Seq.empty, include=Seq.empty, parent=Seq.empty,parentExclude=Seq.empty, page=Some(2) )
  val fResult = invoker.execute(productsGet)
  val products = Await.result(fResult, 15.seconds)
  println(products.content.map(p => s"Product ${p.name.getOrElse("")} with barcode ${p.sku.getOrElse("unknown")} for ${p.price.getOrElse("unknown")}").mkString("\n"))

```

## Build clients via sbt
You can use any tool or library to generate use the openapi-specification, for convenience I've added an example sbt project that should allow you to generate any client as sbt.

For example the command below will (re)generate the scala-akka code
```shell
sbt generateClient scala-akka
```



