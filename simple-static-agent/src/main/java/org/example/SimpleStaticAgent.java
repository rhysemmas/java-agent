package org.example;

import java.lang.instrument.Instrumentation;

public class SimpleStaticAgent {
    public static void premain(String agentArgs, Instrumentation instrumentation) {
        System.out.println("Start!");
    }
}