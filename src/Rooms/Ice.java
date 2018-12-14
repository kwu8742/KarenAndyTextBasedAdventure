package Rooms;

import Game.Runner;
import People.Person;

public class Ice {
}
    public Ice(int x, int y) {
        super(x, y);

    }

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You have to beat Gray Fullbuster. You can escape or fight. If you win then you get 10 points and if you lose bye-bye.");
        Runner.gameOff();
    }


}
