/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.network1;

import java.io.*;

/**
 *
 * @author shcherbakov
 */
public class InputCmd {

    private String line;
    Network net;

    InputCmd(Network n) {
        net = n;
    }

    public boolean input() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter command:");
        line = reader.readLine();
        System.out.printf("You entered %s%n", line);
        if (line.indexOf("exit", 0) == 0) {
            return false;
        }
        return true;
    }

    public void analiz() throws IOException {
        if (line.indexOf("addDevice", 0) == 0) {
            addDev();
        } else if (line.indexOf("removeDevice", 0) == 0) {
            remDev();
        } else if (line.indexOf("print", 0) == 0) {
            print();
        } else if (line.indexOf("save", 0) == 0) {
            save();
        }
    }

    private void addDev() {
        String comand[] = line.split(" ");
        if (comand[1].equalsIgnoreCase("router")) {
            net.addDevice(new Router(comand[2], Integer.parseInt(comand[3])));
        } else if (comand[1].equalsIgnoreCase("switch")) {
            net.addDevice(new Switch(comand[2], Integer.parseInt(comand[3])));
        } else {
            net.addDevice(new NetDevice(comand[1], Integer.parseInt(comand[2])));
        }
    }

    private void remDev() {
        String comand[] = line.split(" ");
        net.remDevice(comand[1]);
    }

    private void print() {
        System.out.println(net.getInfo());
    }

    private void save() throws IOException {
        new Save().serial(net,"nets.save");
    }
}
