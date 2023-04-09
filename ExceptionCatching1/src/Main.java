import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exection1();
        System.out.println("\n\n");
        exeption2("192.168.100.11",140);
        System.out.println("\n\n");
        exeption3();

    }
    static void exeption3(){
        Scanner scanner=new Scanner(System.in);
        int temp;
        try{
            temp=Integer.valueOf(scanner.nextLine());
        } catch (NumberFormatException e){
            temp=1;
        }
        System.out.println(temp);
    }
    static String exeption2(String ip, int port){
        try {
            Socket dialog = new Socket(ip, port);
            DataInputStream Stream=new DataInputStream(dialog.getInputStream());
            String temp = Stream.readUTF();
            Stream.close();
            dialog.close();
            return temp;
        } catch (IOException e){
            return "Cannot reach " + ip;
        }
    }
    static void exection1(){
        int[] a=new int[9];
        for (int i =0;i< a.length;i++){
            a[i]=(int)(Math.random()*100);
            System.out.print(a[i]+"\t");
        }
        System.out.println("\n");
        int[]b=new int[5];
        for (int i =0;i< b.length;i++){
            b[i]=(int)(Math.random()*100);
            System.out.print(a[i]+"\t");
        }

        ExceptionMaker m=new ExceptionMaker();
        if (m.massSum(a,b)!=null) {
            int[] c = m.massSum(a, b);
            for (int i=0;i<c.length;i++) {
                System.out.print(c[i]+"\t");
            }
        }

    }
}