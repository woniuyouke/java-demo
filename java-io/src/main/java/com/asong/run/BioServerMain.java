package com.asong.run;

import com.asong.bio.BioServer;

import java.io.IOException;

public class BioServerMain {
    public static void main(String[] args) throws IOException, InterruptedException {
        BioServer.server(8080);
    }
}
