package com.stackroute;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileNioDemo {
    public static void main(String[] args) {
        try {
            FileChannel channel = FileChannel.open(Path.of("hello.txt"), StandardOpenOption.READ);
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            channel.read(buffer);
            buffer.flip();
            while (buffer.hasRemaining()){
                System.out.print((char)buffer.get());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
