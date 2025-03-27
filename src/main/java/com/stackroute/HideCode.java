package com.stackroute;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.DosFileAttributeView;

public class HideCode {
    public static void main(String[] args) {
//        try {
//            Path path = Path.of("hello.txt");
//            // checking if file exists
//        if(Files.exists(path)){
//            Files.setAttribute(path,"dos:hidden",true);
//            System.out.println("File is now Hidden");
//        }
//        else {
//            System.out.println("File does not found");
//        }
//
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }

//


        try {
            Path path = Path.of("hello.txt");
            long filesize = Files.size(path);

            System.out.println("File Size is "+ filesize);;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
