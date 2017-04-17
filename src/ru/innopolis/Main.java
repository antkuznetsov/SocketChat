package ru.innopolis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {

        try {

            ServerSocket serverSocket = new ServerSocket(5555);
            Socket socket = serverSocket.accept();
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            String message = null;

            while ((message = bufferedReader.readLine()) != null) { //Так делают сегда
                System.out.println(message);
            }

            socket.close();

        } catch (IOException e) {

            e.printStackTrace();

        }


    }
}
