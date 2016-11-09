/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.network1;

import java.util.*;
import java.io.Serializable;


/**
 *
 * @author a_scherbakov
 */
public class Network implements Netcomand,Serializable {

    private String name;
    private List<NetDevice> devices = new ArrayList<>();

    Network(String name) {
        this.name = name;
    }

    @Override
    public void addDevice(NetDevice d) {
        devices.add(d);
    }

    @Override
    public void remDevice(String str) {
        for (NetDevice dev : devices) {
            if (dev.getName().equalsIgnoreCase(str)) {
                for (int i = 0; i < dev.getport(); i++) {
                disconnect(dev,i);
                }
                devices.remove(dev);
                break;
            }
        }
    }

    public int getSize() {
        return devices.size();
    }

    public void connect(NetDevice dev1, int port1, NetDevice dev2, int port2) {
        if (devices.contains(dev1) && devices.contains(dev2)) {
            dev1.setLink(port1, dev2);
            dev2.setLink(port2, dev1);
        }
        if (!devices.contains(dev1)) {
            System.out.println("устройство " + dev1.getName() + "не принадлежит сети" + this.name);
        }
        if (!devices.contains(dev2)) {
            System.out.println("устройство " + dev2.getName() + " не принадлежит сети  " + this.name);
        }
    }

    public void disconnect(NetDevice dev, int port) {
        int rport;
        NetDevice rdev;
        rdev = dev.getPortDivice(port);
        if (rdev != null) {
            rport = rdev.findPortDivice(dev);
            dev.delLink(port);
            rdev.delLink(rport);
        } else {
            System.out.println("устройство " + dev.getName() + " не содержит подключений на порту " + port);
        }
    }

    public String getInfo() {
        String str = "";
        for (NetDevice i : devices) {
            str = str + System.lineSeparator() + i.getInfo();
        }
        return str;
    }

}
