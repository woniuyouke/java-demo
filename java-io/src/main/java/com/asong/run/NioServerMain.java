package com.asong.run;

import com.asong.nio.NioServer;

import java.io.IOException;

public class NioServerMain {

    public static void main(String[] args) throws IOException {
        NioServer.Server(8081);
    }
}
