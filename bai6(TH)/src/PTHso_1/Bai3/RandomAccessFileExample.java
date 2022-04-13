package PTHso_1.Bai3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

class RandomAccessFileExample {
    public static void main(String[] args) throws IOException {
        double data[] = {11.2, 13.6, 255.6, 117.92, 2007.96, 8.9, 9.9, 10.0, 100.6};
        double d;
        RandomAccessFile raf;

        try {
            raf = new RandomAccessFile("D:\\random.dat","rw");
        }catch (FileNotFoundException exc) {
            System.out.println("cannot open file.");
            return;
        }

        for(int i=0; i< data.length; i++) {
            try {
                raf.writeDouble(data[i]);
            }catch (IOException exc) {
                System.out.println("Erroe writing to file.");
                return;
            }
        }

        try{
            raf.seek(0*8);
            d = raf.readDouble();
            System.out.println("First value is "+ d);
            raf.seek(8*1);
            d = raf.readDouble();
            System.out.println("Second value is "+d);
            raf.seek(8*2);
            d = raf.readDouble();
            System.out.println("third value is "+ d);
            System.out.println();

            System.out.println("Read all: ");
            for(int i = 0; i<data.length; i++){
                raf.seek(8*i);
                d = raf.readDouble();
                System.out.print(d +" ");
            }
            System.out.println();
            System.out.println("Here is every other value: ");
            for(int i =0; i<data.length; i +=2) {
                raf.seek(8*i);
                d = raf.readDouble();
                System.out.print(d+" ");
            }
            System.out.print("\n");

        }catch (IOException exc) {
            System.out.println("Error seeking or reading");
        } finally {
            raf.close();
        }
    }
}
