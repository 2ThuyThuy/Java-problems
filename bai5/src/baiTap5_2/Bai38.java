package baiTap5_2;

import java.io.*;


public class Bai38   {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("Record.txt");
            CustomFilterWriter filterWriter = new CustomFilterWriter(fw);
            filterWriter.write("I LOVE MY COUNTRY");
            filterWriter.close();
            FileReader fr = new FileReader("record.txt");
            BufferedReader bufferedReader = new BufferedReader(fr);
            int k;
            while ((k = bufferedReader.read()) != -1) {
                System.out.print((char) k);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


class CustomFilterWriter extends FilterWriter {
    CustomFilterWriter(Writer out) {
        super(out);
    }

    public void write(String str) throws IOException {
        super.write(str.toLowerCase());
    }
}

