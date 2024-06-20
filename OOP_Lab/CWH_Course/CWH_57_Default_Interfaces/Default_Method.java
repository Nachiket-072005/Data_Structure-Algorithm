interface myCamara {
    void takeSnap();

    void recordVideo();

    private void greet() {
        System.out.println("Good Morning!");
    }

    default void record4KVideo() {
        greet();
        System.out.println("Record in 4K");
    }
}

interface myWifi {
    String[] getNetworks();

    void connectToNetworks();
}

class myCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling to : " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting....");
    }
}

class mySmartPhone extends myCellPhone implements myCamara, myWifi {
    public void takeSnap() {
        System.out.println("Taking Snapshot");
    }

    public void recordVideo() {
        System.out.println("Record Videos");
    }

    // public void record4KVideo() {
    // System.out.println("Taking Snap & Record 4K Videos");
    // }

    public void connectToNetworks() {
        System.out.println("Connecting to NetWorks");
    }

    public String[] getNetworks() {
        System.out.println("Getting list of Networks: ");
        String[] netWorksList = { "Khud ka vapar", "Realme Narzo 60x", "DND", "JIO5G" };
        return netWorksList;
    }
}

public class Default_Method {
    public static void main(String[] args) {
        mySmartPhone ms = new mySmartPhone();
        ms.record4KVideo();
        String[] ar = ms.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        }
    }
}