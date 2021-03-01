package com.dnlbyl.finatra.echo.services;

import com.twitter.finagle.http.Request;
import com.twitter.finagle.http.Response;
import com.twitter.finatra.http.response.ResponseBuilder;

import javax.inject.Inject;

public class EchoService {
    private final ResponseBuilder response;

    @Inject
    public EchoService(ResponseBuilder response) {
        this.response = response;
    }

    /**
     * returns an http Response, returning whatever is in the 'q' param
     */
    public Response echo(Request request) {
        return response.ok(request.getParam("q"));
    }
}
