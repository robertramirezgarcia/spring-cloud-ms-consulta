package com.bsoftgroup.springcloudmsconsulta.integration;

import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

public interface GreetingHandlerInterface {
    Mono<ServerResponse> hello(ServerRequest request);
}