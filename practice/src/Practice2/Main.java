package Practice2;

import java.util.Arrays;
import java.util.Objects;

class Participant {
    String name;
    String role;

    public Participant(String name, String role) {
        this.name = name;
        this.role = role;
    }

    void showPerformance() {

    }
}

class Players extends Participant {
    int run;
    int wicket;

    public Players(String name, String role) {
        super(name, role);
    }

    void scoreRun(int run) {
        this.run = run;
    }

    void takeWicket(int wicket) {
        this.wicket = wicket;
    }

    @Override
    void showPerformance() {
        System.out.println(name + " scored " + run + " runs and took " + wicket + " wickets");
    }
}

class Coach extends Participant {
    String sessionType;
    private String playerName;
    private String feedback;

    public Coach(String name, String role) {
        super(name, role);
    }

    void conductPractice(String sessionType) {
        this.sessionType = sessionType;
    }

    void giveFeedback(String playerName, String feedback) {
        this.playerName = playerName;
        this.feedback = feedback;
    }

    @Override
    void showPerformance() {
        System.out.println("Coach " + name + " conducted practice: " + sessionType);
        System.out.println("Coach " + name + " gave feedback to: " + playerName + " : " + feedback);

    }
}

class Selector extends Participant {
    String[] playerName = new String[100];
    int count = 0;
    int index = -1;
    String lastAddedName;
    String lastDroppeddName;

    public Selector(String name, String role) {
        super(name, role);
    }

    void addPlayer(String playerName) {
        this.playerName[count] = playerName;
        count++;
        lastAddedName = playerName;

    }

    void dropPlayer(String playerName) {
        lastDroppeddName = playerName;
        for (int i = 0; i < count; i++) {
            if (playerName != null && this.playerName[i] == playerName) {
                index = i;
                break;
            }
        }
        if (index == -1) return;
        for (int i = index; i < count - 1; i++) {
            this.playerName[i] = this.playerName[i + 1];
        }
        this.playerName[--count] = null;

    }

    @Override
    void showPerformance() {
        System.out.println("Selector " + name + " added player: " + lastAddedName);
        System.out.println("Selector " + name + " dropped player: " + lastDroppeddName);
    }
}

public class Main {
    public static void main(String[] args) {
        Participant[] p = new Participant[3];
        p[0] = new Players("Shakib", "All-rounder");
        p[1] = new Coach("Hathurusingha", "Head Coach");
        p[2] = new Selector("Minhazul", "Chief Selector");
        ((Players) (p[0])).scoreRun(75);
        ((Players) (p[0])).takeWicket(3);
        p[0].showPerformance();
        ((Coach) (p[1])).conductPractice("Net Session");
        ((Coach) (p[1])).giveFeedback("Shakib", "Excellent performance");
        p[1].showPerformance();
        ((Selector) (p[2])).addPlayer("Tamim");
        ((Selector) (p[2])).dropPlayer("Mushfiq");
        p[2].showPerformance();


    }
}
