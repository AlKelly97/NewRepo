// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Documents/newestRep-master/conf/routes
// @DATE:Mon Apr 23 14:42:14 IST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
