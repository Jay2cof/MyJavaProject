package oop.Abstraction.Interface;

import java.util.ArrayList;

public interface PhoneFunctions {
    // You cannot create an object of an interface
    //An interface is like a special class which provides 100% abstraction , because the method by default are all abstract
    // A class can implement an interface
    //  an Interface can extend another interface.
    // All the method of an interface awe by default abstract and public
    // All the field and properties of an interface are static final and public
    // all methods in an interface ae by default abstract


    public String businessCalls(String businessCalls);
    public String VideoCalls(String VideoCalls);
    public void recording(ArrayList<String>recording);
}
