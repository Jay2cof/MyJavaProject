package OOP.Abstraction.Interface;

import java.util.ArrayList;

public class Iphone implements PhoneFunctions{
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
}
