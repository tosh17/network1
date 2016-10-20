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
public class Router extends NetDevice {

    static final String TYPE = "Router";

//konstruktor
    Router(String name, int port) {
        super(name, port);
    }

    public String getType() {
        return TYPE;
    }
}
