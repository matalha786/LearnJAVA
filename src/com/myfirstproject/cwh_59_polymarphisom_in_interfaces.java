package com.myfirstproject;
interface myWifi2{
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
interface myCamera2{
    void takeSnap();
    void  recordVideo();
    default void record4k(){
        System.out.println("Recording Video in 4k.... ");
    }
}
class MyCellPhone2 {
    void callanumber(double number){
        System.out.println("Calling Number :  " + number);}
    void pickCall(){
        System.out.println("Connecting Your Call ...");

    }
}
class mySmartPhone2 extends MyCellPhone2 implements myCamera2,myWifi2{
    @Override
    public String[] getNetworks() {
        System.out.println("Getting List of networks around you ...");
        String[] networkList = {"Anu " , "HS", "Apni Lgwalo", "Password nii btaon ga"};
        return networkList;
    }
    public void sampleMeth(){
        System.out.println("meth");
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

public class cwh_59_polymarphisom_in_interfaces {
    public static void main(String[] args) {
        myCamera2 mc = new mySmartPhone2();
        // mc.getNetworks(); --> Not allowed
//         mc.sampleMeth(); --> Not allowed

        mc.record4k();
        mc.recordVideo();
        mc.takeSnap();
        mySmartPhone2 mc2 = new mySmartPhone2();
        mc2.connectingNetwork();
        mc2.sampleMeth();
        mc2.getNetworks();
        mc2.discwifi();
        mc2.pickCall();
        mc2.recordVideo();
    }
}
