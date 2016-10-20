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
public class Switch extends NetDevice {

    static final String TYPE = "Switch";

    public Switch(String name, int port) {
        super(name, port);
    }

    public String getType() {
        return TYPE;
    }
}
