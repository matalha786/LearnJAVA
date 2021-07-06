package com.myfirstproject;
interface myWifi{
    String[] getNetworks();
    void  connectingNetwork();
    private void newwifi(){
        System.out.println("New wifi has been added");
    }
    default void discwifi(){
        System.out.println("Disconnecting from a wifi ... ");
        newwifi();
    }

}
interface myCamera{
    void takeSnap();
    void  recordVideo();
    default void record4k(){
        System.out.println("Recording Video in 4k.... ");
    }
}
class MyCellPhone {
    void callanumber(double number){
        System.out.println("Calling Number :  " + number);}
    void pickCall(){
        System.out.println("Connecting Your Call ...");

    }
}
class mySmartPhone extends MyCellPhone implements myCamera,myWifi{
    @Override
    public String[] getNetworks() {
        System.out.println("Getting List of networks around you ...");
        String[] networkList = {"Anu " , "HS", "Apni Lgwalo", "Password nii btaon ga"};
                return networkList;
    }
        public void connectingNetwork(){
            System.out.println(" \n \n Connecting to a wifi");
        }
    public void takeSnap(){
        System.out.println("Taking a snap...");
    }
    public void  recordVideo(){
        System.out.println("Recording a video...");
    }

    }


public class cwh_57interfaces {
    public static void main(String[] args) {
        mySmartPhone ms = new mySmartPhone();
        String[] ar =  ms.getNetworks();
        for (String a : ar ) {
            System.out.println(a);
        }
      ms.connectingNetwork();
        ms.takeSnap();
        ms.recordVideo();
        ms.callanumber( 917687867);
        ms.pickCall();
        ms.record4k();
        ms.discwifi();

    }
}
