package com.ccjjltx.command;

public class MainClass {
    public static void main(String[] args) {
        Peddler peddler = new Peddler();
//        peddler.sailApple();
//        peddler.sailBanana();
        Command appleCommand = new AppleCommand(peddler);
        Command bananaCommand = new AppleCommand(peddler);
        appleCommand.sail();
        bananaCommand.sail();
    }


}
