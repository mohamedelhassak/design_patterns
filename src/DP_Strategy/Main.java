package DP_Strategy;

import DP_Strategy.strategies.IStrategey;

import java.util.Scanner;

public class Main {

    private static Scanner scanner;

    public static void main(String[] args) throws Exception {
        Context context = new Context();
        context.process();

        boolean fin = false;
        scanner = new Scanner(System.in);

        while (!fin) {
            System.out.println("donner num de strategie..... : ");
            String strtegyNameClass = scanner.nextLine();

            IStrategey strategy = (IStrategey) Class.forName(strtegyNameClass).newInstance();
            context.setStrategey(strategy);
            context.process();
        }

    }

}
