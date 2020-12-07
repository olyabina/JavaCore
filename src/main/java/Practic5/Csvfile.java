package Practic5;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Csvfile {

    public static void main(String[] args) throws IOException {
        File file = new File("./myfile.txt");

        file.createNewFile();
        System.out.println(Arrays.toString(file.list()));

        Writer writer = new Csv.Writer("myfile.txt").delimiter(';');
        writer.comment("example of csv")
                .value("a").value("b").newLine()
                .value("c").close();

        Reader reader = new Reader(new FileReader("myfile.txt"))
                .delimiter(';').ignoreComments(true);
        System.out.println(reader.readLine());
    }


}
