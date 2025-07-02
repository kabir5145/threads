package com.company;

class goodMorning extends Thread{
    @Override
    public void run() {
        int i = 0;
        while(i<10) {
            System.out.println("GOOD MORNING");
            i++;
        }
    }
}
class badMorning extends Thread {
    @Override
    public void run() {
        int i=0;
        while (i<10) {
            System.out.println("WELCOME");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
                i++;
            }
        }
    }
}
    public class practice_set_for_Threads {
        public static void main(String[] args) {
            //question 1

        goodMorning g = new goodMorning();
        g.start();
        badMorning b = new badMorning();
        b.start();

        }
    }

