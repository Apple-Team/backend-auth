
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/bmanisha/Backend-Java/MyBranch/conf/routes
// @DATE:Thu Mar 02 15:42:30 IST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:10
  class ReverseRestaurantController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def deleteRestAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.deleteRestAdmin",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "rest/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:19
    def updateRestAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.updateRestAdmin",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "update_a_restaurant/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:25
    def getNearbyRestaurants: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getNearbyRestaurants",
      """
        function(latitude0,longitude1,distance2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search_nearby_restaurants/" + (""" + implicitly[PathBindable[java.lang.Double]].javascriptUnbind + """)("latitude", latitude0) + _qS([(""" + implicitly[QueryStringBindable[java.lang.Double]].javascriptUnbind + """)("longitude", longitude1), (""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("distance", distance2)])})
        }
      """
    )
  
    // @LINE:11
    def getRestaurantByID: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getRestaurantByID",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurants_by_id/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:26
    def getNearbyRestaurantsBySearch: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getNearbyRestaurantsBySearch",
      """
        function(keyword0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search_restaurants/" + (""" + implicitly[PathBindable[java.lang.String]].javascriptUnbind + """)("keyword", keyword0)})
        }
      """
    )
  
    // @LINE:24
    def getRestaurantsFromSearchFilter: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getRestaurantsFromSearchFilter",
      """
        function(area0,restaurantname1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search_restaurants_by_name_area" + _qS([(area0 == null ? null : (""" + implicitly[QueryStringBindable[java.lang.String]].javascriptUnbind + """)("area", area0)), (restaurantname1 == null ? null : (""" + implicitly[QueryStringBindable[java.lang.String]].javascriptUnbind + """)("restaurantname", restaurantname1))])})
        }
      """
    )
  
    // @LINE:10
    def getRestaurantsList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getRestaurantsList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "list_of_all_restaurants"})
        }
      """
    )
  
    // @LINE:18
    def createRestAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.createRestAdmin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "rest"})
        }
      """
    )
  
    // @LINE:15
    def getCollectionType: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getCollectionType",
      """
        function(collection0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "collections/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("collection", encodeURIComponent(collection0))})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:43
  class ReverseCollectionController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:45
    def createCollection: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CollectionController.createCollection",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "collection"})
        }
      """
    )
  
    // @LINE:43
    def getCollectionsList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CollectionController.getCollectionsList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "get_all_collections"})
        }
      """
    )
  
    // @LINE:47
    def deleteCollection: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CollectionController.deleteCollection",
      """
        function(ctype0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "delete_collection/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("ctype", encodeURIComponent(ctype0))})
        }
      """
    )
  
    // @LINE:46
    def updateCollection: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CollectionController.updateCollection",
      """
        function(ctype0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "update_a_collection/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("ctype", encodeURIComponent(ctype0))})
        }
      """
    )
  
    // @LINE:44
    def getCollectionByID: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CollectionController.getCollectionByID",
      """
        function(ctype0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "collections_by_id/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("ctype", encodeURIComponent(ctype0))})
        }
      """
    )
  
  }

  // @LINE:31
  class ReverseMemberController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def getMemberByUsernamePassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MemberController.getMemberByUsernamePassword",
      """
        function(username0,password1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate_member_by_username_password/" + (""" + implicitly[PathBindable[java.lang.String]].javascriptUnbind + """)("username", username0) + _qS([(password1 == null ? null : (""" + implicitly[QueryStringBindable[java.lang.String]].javascriptUnbind + """)("password", password1))])})
        }
      """
    )
  
    // @LINE:32
    def createMember: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MemberController.createMember",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "create_member"})
        }
      """
    )
  
  }

  // @LINE:37
  class ReverseImageController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def downloadImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ImageController.downloadImage",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "images/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id0))})
        }
      """
    )
  
    // @LINE:39
    def deleteImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ImageController.deleteImage",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "images/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id0))})
        }
      """
    )
  
    // @LINE:37
    def uploadImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ImageController.uploadImage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "images"})
        }
      """
    )
  
  }

  // @LINE:56
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:56
    def signIn: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.signIn",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/signin"})
        }
      """
    )
  
  }

  // @LINE:51
  class ReverseImagesController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:51
    def getImagesList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ImagesController.getImagesList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "get_all_images"})
        }
      """
    )
  
  }


}
