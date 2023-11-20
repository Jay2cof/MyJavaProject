package OOP.Abstraction.Interface;

import java.util.ArrayList;

public class Iphone implements PhoneFunctions, IphoneFunctions{
    @Override
    public String businessCalls(String businessCalls) {
        String calls= "High divination sounds";
        return calls;
    }

    @Override
    public String VideoCalls(String VideoCalls) {
        String Calls = "High video call quality";
        return Calls;
    }

    @Override
    public void recording(ArrayList<String> recording) {
        for(String records:recording){
            System.out.println(records);

        }

    }

    @Override
    public void MultiTexting() {
        System.out.println("Can text to different people at the same time");
    }
}
