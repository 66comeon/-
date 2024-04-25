package midimusic;

import utils.IOUtil;

public class TheWindRises {
    public static void main(String[] args) throws Exception {
        TheWindRisesRunnable runnable = new TheWindRisesRunnable();
        Thread thread = new Thread(runnable);
        String str = IOUtil.getData("bat\\WindRises.txt");
        String[] bat = str.split("\\|");
        thread.start();
        Thread.sleep(2700);
        for (int i = 0; i < bat.length; i++) {
            int count = i + 1;
            System.out.print("第" + count + "节: ");
            String[] time = bat[i].split(" ");
            for (String s : time) {
                System.out.print(s + " ");
                Thread.sleep(Integer.parseInt(s));
            }
            System.out.println();
        }
    }
}
