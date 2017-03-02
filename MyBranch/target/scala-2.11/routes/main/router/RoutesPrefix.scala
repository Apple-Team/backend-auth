
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/bmanisha/Backend-Java/MyBranch/conf/routes
// @DATE:Thu Mar 02 15:42:30 IST 2017


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
