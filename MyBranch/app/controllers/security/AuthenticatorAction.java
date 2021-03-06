package controllers.security;

import models.User;
import play.Logger;
import play.mvc.Http;
import play.mvc.Result;
import models.Member;
import services.UserService;

import javax.inject.Inject;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class AuthenticatorAction extends play.mvc.Action.Simple {

    private final UserService userService;

    @Inject
    public AuthenticatorAction(UserService userService) {
        this.userService = userService;
    }

    @Override
    public CompletionStage<Result> call(Http.Context ctx) {

        Logger.info("Running AuthenticatorAction");

        final Http.Request request = ctx.request();

        final String authorized = request.getHeader("Authorization");
        Logger.debug("Authorized header: {}", authorized);

        if (!authorized.startsWith("Bearer ")) {
            return CompletableFuture.completedFuture(unauthorized());
        }

        final String authToken = authorized.substring(7);
        if (authorized.isEmpty()) {
            return CompletableFuture.completedFuture(unauthorized());
        }

        Logger.debug("auth_token: {}", authToken);

        final Member member = userService.findUserByAuthToken(authToken);
        if (null == member) {
            return CompletableFuture.completedFuture(unauthorized());
        }

        Logger.debug("member: {}", member);

        ctx.args.put("member", member);

        return delegate.call(ctx);
    }
}
