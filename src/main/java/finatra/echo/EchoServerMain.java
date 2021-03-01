package com.dnlbyl.finatra.echo;

public final class EchoServerMain {
    private EchoServerMain() {
    }

    public static void main(String[] args) {
        new EchoServer().main(args);
    }
}
