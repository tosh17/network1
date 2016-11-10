/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.network1;
//package comand;

import java.io.Serializable;

/**
 *
 * @author a_scherbakov
 */
public class NetDevice implements Serializable {

    private int ports;
    String name;
    private NetDevice connections[];
    private static final String TYPE = "NetDevice";
    private int rootHop = -1;
//konstruktor

    NetDevice(String name, int port) {
        this.ports = port;
        this.name = name;
        connections = new NetDevice[ports];
    }

    public String getLink(int port) {
        return connections[port].getName();
    }

    public String getInfo() {
        if (this == null) {
            return "";
        }
        String str;
        str = getType() + " : " + getName() + System.lineSeparator() + "Количество портов : " + ports;
        for (int i = 0; i < ports; i++) {
            if (connections[i] != null) {
                str = str + System.lineSeparator() + " В порту №" + i + "  Подключено устройство " + connections[i].getType() + ":" + getLink(i);
            }
        }
        str = str + System.lineSeparator() + "---------------------------";
        return str;
    }

    public int getport() {
        return ports;
    }

    public String getType() {
        return TYPE;
    }

    public String getName() {
        return name;
    }

    public void setLink(int port, NetDevice dev) {
        connections[port] = dev;
    }

    public void delLink(int port) {
        connections[port] = null;
    }

    public NetDevice getPortDivice(int port) {
        return connections[port];
    }

    public int findPortDivice(NetDevice dev) {
        int port = 0;
        for (int i = 0; i < ports; i++) {
            if (connections[i] == dev) {
                port = i;
            }
        }
        return port;
    }

    public void setRootHop(int i) {
        rootHop = i;
    }

    public int getRootHop() {
        return rootHop;
    }
}
