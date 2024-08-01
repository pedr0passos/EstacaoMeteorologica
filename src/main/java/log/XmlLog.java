
package log;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Catterina Salvador
 */

public class XmlLog {

    public void gravarLogXml(String operacao) throws FileNotFoundException {
        File file = createFile();
        try {
            BufferedWriter myWriter = new BufferedWriter(new FileWriter(file.getName(), true));
            myWriter.write("<log>\n");
            myWriter.write("\t<dataHora>" + LocalDateTime.now().toString() + "</dataHora>\n");
            myWriter.write("\t<operacao>" + operacao + "</operacao>\n");
            myWriter.write("</log>\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public File createFile() {
        try {
            File xml = new File("xmlLog.txt");
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
