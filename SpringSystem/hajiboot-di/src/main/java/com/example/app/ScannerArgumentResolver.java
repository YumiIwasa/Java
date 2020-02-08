package com.example.app;

import java.io.InputStream;
import java.io.SyncFailedException;
import java.util.Scanner;

public class ScannerArgumentResolver implements ArgumentResolver {
    @Override
    public Argument resolve(InputStream stream){
        Scanner scannner = new Scanner(stream);
        int a = scannner.nextInt();
        int b = scannner.nextInt();
        return new Argument(a, b);
    }
}
