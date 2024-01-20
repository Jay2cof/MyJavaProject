package oop.Abstraction.Interface;

// A class that implements and interface must provide the implementation of all the method of the interface must be declared abstract


import java.util.ArrayList;

public class Samsung implements PhoneFunctions{


    @Override
    public String businessCalls(String businessCalls) {
        String calls = "conference calls";
        return calls;
    }

    @Override
    public String VideoCalls(String VideoCalls) {
        return "group video calls";
    }

    @Override
    public void recording(ArrayList<String> recording) {
        for(String records: recording){
            System.out.println(records);
        }

    }
}
