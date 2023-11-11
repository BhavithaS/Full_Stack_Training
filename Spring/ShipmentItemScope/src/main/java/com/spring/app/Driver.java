package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Shipment Details 1");
        Item item1 = (Item)context.getBean("itemObj");
        System.out.println("Enter the item name");
        String name1 = sc.next();
        item1.setItemName(name1);
        System.out.println("Enter the item price");
        double price1 = sc.nextDouble();
        item1.setPrice(price1);
        Shipment shipment1 = (Shipment)context.getBean("shipmentObj");
        System.out.println("Enter the ShipmentTd");
        String shipmentId1 = sc.next();
        System.out.println("Enter the Delivery Status");
        String delivery1 = sc.next();
        shipment1.setShipmentId(shipmentId1);
        shipment1.setDeliveryStatus(delivery1);

        System.out.println("Shipment Details 2");
        Item item2 = (Item)context.getBean("itemObj");
        System.out.println("Enter the item name");
        String name2 = sc.next();
        item2.setItemName(name2);
        System.out.println("Enter the item price");
        double price2 = sc.nextDouble();
        item2.setPrice(price2);
        Shipment shipment2 = (Shipment)context.getBean("shipmentObj");
        System.out.println("Enter the ShipmentTd");
        String shipmentId2 = sc.next();
        System.out.println("Enter the Delivery Status");
        String delivery2 = sc.next();
        shipment2.setShipmentId(shipmentId2);
        shipment2.setDeliveryStatus(delivery2);

        System.out.println("Delivery status of shipment id : "+shipment1.getShipmentId()+ " is "
        +shipment1.getDeliveryStatus());
        System.out.println("Delivery status of shipment id : "+shipment2.getShipmentId()+ " is "
                +shipment2.getDeliveryStatus());
    }
}
