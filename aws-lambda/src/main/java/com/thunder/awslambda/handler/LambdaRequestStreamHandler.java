package com.thunder.awslambda.handler;

import com.amazonaws.services.lambda.runtime.RequestStreamHandler;

//@Deprecated
//public class LambdaRequestStreamHandler
//        implements RequestStreamHandler {
//    public void handleRequest(InputStream inputStream,
//                              OutputStream outputStream, Context context) {
//        String input = IOUtils.toString(inputStream, "UTF-8");
//        outputStream.write(("Hello World - " + input).getBytes());
//    }
//}