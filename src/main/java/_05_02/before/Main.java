package _05_02.before;

public class Main {

    public static void main(String[] args) {

        Thread thread1 = new ThreadExample();   
        Thread thread2 = new ThreadExample(); 
        Thread thread3 = new ThreadExample(); 

        thread1.setName("thread1");
        thread2.setName("thread2");
        thread3.setName("thread3");

        thread1.start();
        thread2.start();
        thread3.start();

    }

}
