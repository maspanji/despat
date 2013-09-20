package org.sample.behavioral.state;

public class MainPalangParkir {

    private static void tundaTampilan(int milidetik) throws InterruptedException {
        Thread.sleep(milidetik);
    }

    public static void main(String[] args) throws InterruptedException{
        ContextPalang contextPalang = new ContextPalang();
        //mencoba menutup palang...
        System.out.println("Mencoba menutup palang ....");
        contextPalang.tutupPalang();
        tundaTampilan(2000);
        //mencoba membuka palang ...
        System.out.println("Mencoba membuka palang ....");
        contextPalang.bukaPalang();
        tundaTampilan(4000);
        //mencoba menutup kembali palang....
        System.out.println("Mencoba membuka palang ....");
        contextPalang.tutupPalang();
    }
}
