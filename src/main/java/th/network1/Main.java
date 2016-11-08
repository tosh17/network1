/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.network1;
import java.io.*;
/**
 *
 * @author a_scherbakov
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        
             // TODO code application logic here
        Router r1 = new Router("Cisco_R1_48", 48);
        Router r2 = new Router("Dlink_R2_8", 8);
        Switch sw1 = new Switch("Dlink-SW1_10", 10);
        Switch sw2 = new Switch("Juniper-SW2_24", 24);
        Switch sw3 = new Switch("cisco-SW3_16", 16);
        Switch sw4 = new Switch("Dlink-SW4_10", 10);
        Switch sw5 = new Switch("NoName-SW5_4", 4);
        Router r3 = new Router("Juniper_R3_8", 24);
        Router r5 = new Router("cisco_R5_8", 44);
        Router r6 = new Router("Juniper_R6_8", 48);
        Router r4 = new Router("Dlink_R4_8", 16);
        Network net1 = new Network("SuperNets");
//        System.out.println(r1.getInfo());
     /*   System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@   Создаем первоначальную сеть   @@@@@@@@@@@@@@@@@@@@@");
        net1.addDevice(r1);
        net1.addDevice(sw1);
        net1.addDevice(sw2);
        net1.addDevice(r4);
        net1.connect(r1,2,sw1,3);
        net1.connect(sw2,1,sw1,5);
        net1.connect(r4,2,r1,3);
        net1.connect(r4,5,sw1,4);
        net1.connect(r4,1,sw2,3);
        net1.connect(r5,1,sw1,2);
        net1.addDevice(r5);
        net1.connect(r5,1,sw1,2);
        net1.getInfo();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@       Отсоединяем устройства    @@@@@@@@@@@@@@@@@@@@@");
        net1.disconnect(r4,1);
        net1.disconnect(r4,2);
        net1.disconnect(r1,2);
        net1.disconnect(sw2,2);
        System.out.println(net1.getInfo());
    */    
    Save s=new Save();
    //s.serial(net1,"nets.save");
      net1=(Network) s.load("nets.save");
        InputCmd cmd = new InputCmd(net1);
     while(cmd.input()){
     cmd.analiz();}
       
    }   
    
    }
    

