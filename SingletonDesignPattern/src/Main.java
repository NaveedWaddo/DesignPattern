import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  throws Exception {
//        SingletonClass s1 = SingletonClass.getInstance();
//        SingletonClass s2 = SingletonClass.getInstance();
//        SingletonClass s3 = SingletonClass.getInstance();
//
//
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
//        System.out.println(s3.hashCode());

        SerializedSingletonClass s11 = SerializedSingletonClass.getInstance();
        SerializedSingletonClass s12 = SerializedSingletonClass.getInstance();
        SerializedSingletonClass s13 = SerializedSingletonClass.getInstance();

        System.out.println(s11.hashCode());
        System.out.println(s12.hashCode());
        System.out.println(s13.hashCode());

        FileOutputStream f = new FileOutputStream("E:\\Courses\\SerilizedData.txt");
        ObjectOutputStream obj = new ObjectOutputStream(f);
        obj.writeObject(s11);

        FileInputStream f1 = new FileInputStream("E:\\Courses\\SerilizedData.txt");
        ObjectInputStream in = new ObjectInputStream(f1);
        SerializedSingletonClass s14 = (SerializedSingletonClass)in.readObject();
        System.out.println(s14.name);
        System.out.println(s14.hashCode());

    }
}