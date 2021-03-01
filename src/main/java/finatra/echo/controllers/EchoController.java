package com.dnlbyl.finatra.echo.controllers;

import com.dnlbyl.finatra.echo.services.EchoService;
import com.twitter.finatra.http.AbstractController;

import javax.inject.Inject;

public class EchoController extends AbstractController {

    private final EchoService echoService;

    @Inject
    public EchoController(EchoService echoService) {
        this.echoService = echoService;
    }

    @Override
    public void configureRoutes() {
        get("/echo", echoService::echo);
    }
}
