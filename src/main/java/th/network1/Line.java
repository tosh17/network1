package th.network1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author a_scherbakov
 */
public class Line {

    boolean status;
    String name;

    Line() {
    }

    public void connect(NetDevice dev1, int port1, NetDevice dev2, int port2) {
        name = dev1.getName() + " -- " + dev2.getName();
        dev1.setLink(port1, dev2);
        dev2.setLink(port2, dev1);
    }
}
