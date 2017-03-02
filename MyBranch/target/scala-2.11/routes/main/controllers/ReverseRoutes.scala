
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/bmanisha/Backend-Java/MyBranch/conf/routes
// @DATE:Thu Mar 02 15:42:30 IST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:10
  class ReverseRestaurantController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def deleteRestAdmin(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "rest/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:19
    def updateRestAdmin(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "update_a_restaurant/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:25
    def getNearbyRestaurants(latitude:java.lang.Double, longitude:java.lang.Double, distance:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "search_nearby_restaurants/" + implicitly[PathBindable[java.lang.Double]].unbind("latitude", latitude) + queryString(List(Some(implicitly[QueryStringBindable[java.lang.Double]].unbind("longitude", longitude)), Some(implicitly[QueryStringBindable[Integer]].unbind("distance", distance)))))
    }
  
    // @LINE:11
    def getRestaurantByID(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "restaurants_by_id/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:26
    def getNearbyRestaurantsBySearch(keyword:java.lang.String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "search_restaurants/" + implicitly[PathBindable[java.lang.String]].unbind("keyword", keyword))
    }
  
    // @LINE:24
    def getRestaurantsFromSearchFilter(area:java.lang.String = null , restaurantname:java.lang.String = null): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "search_restaurants_by_name_area" + queryString(List(if(area == null ) None else Some(implicitly[QueryStringBindable[java.lang.String]].unbind("area", area)), if(restaurantname == null) None else Some(implicitly[QueryStringBindable[java.lang.String]].unbind("restaurantname", restaurantname)))))
    }
  
    // @LINE:10
    def getRestaurantsList(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "list_of_all_restaurants")
    }
  
    // @LINE:18
    def createRestAdmin(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "rest")
    }
  
    // @LINE:15
    def getCollectionType(collection:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "collections/" + implicitly[PathBindable[String]].unbind("collection", dynamicString(collection)))
    }
  
  }

  // @LINE:6
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:43
  class ReverseCollectionController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:45
    def createCollection(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "collection")
    }
  
    // @LINE:43
    def getCollectionsList(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "get_all_collections")
    }
  
    // @LINE:47
    def deleteCollection(ctype:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "delete_collection/" + implicitly[PathBindable[String]].unbind("ctype", dynamicString(ctype)))
    }
  
    // @LINE:46
    def updateCollection(ctype:String): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "update_a_collection/" + implicitly[PathBindable[String]].unbind("ctype", dynamicString(ctype)))
    }
  
    // @LINE:44
    def getCollectionByID(ctype:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "collections_by_id/" + implicitly[PathBindable[String]].unbind("ctype", dynamicString(ctype)))
    }
  
  }

  // @LINE:31
  class ReverseMemberController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def getMemberByUsernamePassword(username:java.lang.String, password:java.lang.String = null): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "authenticate_member_by_username_password/" + implicitly[PathBindable[java.lang.String]].unbind("username", username) + queryString(List(if(password == null) None else Some(implicitly[QueryStringBindable[java.lang.String]].unbind("password", password)))))
    }
  
    // @LINE:32
    def createMember(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "create_member")
    }
  
  }

  // @LINE:37
  class ReverseImageController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def downloadImage(id:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "images/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
    }
  
    // @LINE:39
    def deleteImage(id:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "images/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
    }
  
    // @LINE:37
    def uploadImage(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "images")
    }
  
  }

  // @LINE:56
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:56
    def signIn(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "users/signin")
    }
  
  }

  // @LINE:51
  class ReverseImagesController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:51
    def getImagesList(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "get_all_images")
    }
  
  }


}
