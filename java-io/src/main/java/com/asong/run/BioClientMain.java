package com.asong.run;

import com.asong.bio.BioClient;

import java.io.IOException;

public class BioClientMain
{

    public static void main(String[] args) throws IOException, InterruptedException {
        Thread.sleep(4000);
        BioClient.client("asong,i love you");
    }
}
