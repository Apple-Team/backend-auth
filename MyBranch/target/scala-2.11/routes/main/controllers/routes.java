
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/bmanisha/Backend-Java/MyBranch/conf/routes
// @DATE:Thu Mar 02 15:42:30 IST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseRestaurantController RestaurantController = new controllers.ReverseRestaurantController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCollectionController CollectionController = new controllers.ReverseCollectionController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseMemberController MemberController = new controllers.ReverseMemberController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseImageController ImageController = new controllers.ReverseImageController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseImagesController ImagesController = new controllers.ReverseImagesController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseRestaurantController RestaurantController = new controllers.javascript.ReverseRestaurantController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCollectionController CollectionController = new controllers.javascript.ReverseCollectionController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseMemberController MemberController = new controllers.javascript.ReverseMemberController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseImageController ImageController = new controllers.javascript.ReverseImageController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseImagesController ImagesController = new controllers.javascript.ReverseImagesController(RoutesPrefix.byNamePrefix());
  }

}
