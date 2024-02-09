package ru.gb;

import ru.gb.client.ClientGUI;
import ru.gb.server.Server;
import ru.gb.server.ServerStorage;

public class Main {
    public static void main(String[] args) {

        Server server = new Server(new ServerStorage());
        new ClientGUI(server);
        new ClientGUI(server);
    }
}