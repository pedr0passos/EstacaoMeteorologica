/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package log;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 *
 * @author Catterina Salvador
 */
public class JsonLog {
    public void gravarLogJson(String operacao) throws FileNotFoundException {
        File file = createFile();
        try {
            BufferedWriter myWriter = new BufferedWriter(new FileWriter(file.getName(), true));
            myWriter.write("{ \"log\": { ");
            myWriter.write("\"dataHora\" :" + "\"" + LocalDateTime.now().toString() + "\"" + ",");
            myWriter.write("\t\"operacao\" :" + "\"" + operacao + "\" } } ");
            myWriter.write("\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public File createFile() {
        try {
            File xml = new File("JsonLog.txt");
            System.out.println(xml.getAbsolutePath());
            if (xml.createNewFile()) {
                System.out.println("File created: " + xml.getName());
                return xml;
            } else {
                System.out.println("File already exists.");
                return xml;
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return null;
        }
    }
}
