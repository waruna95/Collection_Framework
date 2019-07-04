package FileIOStream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileIOstream {
    public static void main(String[] args) {
        String all = "" +
                "public class helloworld {\n" +
                "    public static void main(String[] args) {\n" +
                "        System.out.println(\"Hello World\");\n" +
                "    }\n" +
                "}\n";

        try{

            FileWriter fw = new FileWriter("helloworld.java");
            CustomFilterWriter filterWriter = new CustomFilterWriter(fw);
            filterWriter.write(all);
            filterWriter.close();
            fw.close();


//Serialization
//            FileOutputStream fos=new FileOutputStream(new File("helloworld.java"));
//            OutputStreamWriter ost = new OutputStreamWriter(fos);
//            BufferedWriter bft = new BufferedWriter(ost);
//            bft.write(all);
//            bft.close();
//            fos.close();

//            ObjectOutputStream oos=new ObjectOutputStream(fos);
//            oos.writeObject(all);
//            oos.close();

// Deserialization
//            FileInputStream fis=new FileInputStream("helloworld.java");
//            ObjectInputStream ois=new ObjectInputStream(fis);
//            String STR = (String)ois.readObject();
//            ArrayList  list=(ArrayList)ois.readObject();
//            System.out.println(STR);

        }catch(Exception e){
            System.out.println(e);
        }


    }
}
