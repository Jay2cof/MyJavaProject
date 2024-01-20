package oop.Abstraction.Interface;


import java.util.ArrayList;

public class PhoneBrandApp {
    public static void main(String[] args) {
        Samsung Sphones = new Samsung();
        ArrayList<String>samsung_recording = new ArrayList<>();

        samsung_recording.add("low quality output");
        samsung_recording.add("has 50w of sound output");
        Sphones.VideoCalls("A clear video definition");
        Sphones.businessCalls("Can make a conference call of 3 people");
        Sphones.recording(samsung_recording);
        System.out.println(Sphones.VideoCalls("A clear video definition"));
        System.out.println(Sphones.businessCalls("Can accommodate unto 3 people in a conference call"));
        System.out.println();


        Iphone MainPhone = new Iphone();
        ArrayList<String>iphone_recording = new ArrayList<>();

        iphone_recording.add("High quality output");
        iphone_recording.add("has 100w of sound output");
        MainPhone.VideoCalls("High definition video calls");
        MainPhone.businessCalls("Can make a conference call of 5 people");
        MainPhone.recording(iphone_recording);
        System.out.println(MainPhone.VideoCalls("High definition video calls"));
        System.out.println(MainPhone.businessCalls("Can accommodate unto 5 people in a conference"));

        System.out.println();

        MainPhone.MultiTexting();

    }
}
