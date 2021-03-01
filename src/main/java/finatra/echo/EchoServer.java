package com.dnlbyl.finatra.echo;

import com.dnlbyl.finatra.echo.controllers.EchoController;
import com.twitter.finatra.http.AbstractHttpServer;
import com.twitter.finatra.http.filters.CommonFilters;
import com.twitter.finatra.http.routing.HttpRouter;

public class EchoServer extends AbstractHttpServer {
    @Override
    public void configureHttp(HttpRouter router) {
        router
                .filter(CommonFilters.class)
                .add(EchoController.class);
    }
}
