package oop.Abstraction;

public class BoardGames implements Playing, OtherSports{
    @Override
    public void Playing() {
        System.out.println("this game comprises of different board games");
    }

    @Override
    public void TeamWork() {
        System.out.println("Board games are mostly individual sport");
    }

    @Override
    public void Location() {
        System.out.println("is always an indoor game");

    }

    @Override
    public void Dangerous() {
        System.out.println("is not considered Dangerous");

    }
}
