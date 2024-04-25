package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class IOUtil {
    private IOUtil(){}

    public static boolean saveData(String data,String fileName) throws Exception{
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        bw.write(data);
        bw.flush();
        bw.close();
        return true;
    }

    public static String getData(String fileName) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String data = br.readLine();
        br.close();
        return data;
    }
}
