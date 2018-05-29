package com.ccjjltx.command;

public class BananaCommand extends Command {

    public BananaCommand(Peddler peddler) {
        super(peddler);
    }

    @Override
    public void sail() {
        this.getPeddler().sailBanana();
    }
}
