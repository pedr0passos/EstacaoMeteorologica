/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package log;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Clima;

/**
 *
 * @author Catterina Salvador
 */
public class XmlAdapter implements Log{
    
    private XmlLog xmlLog;

    @Override
    public void gravarLog(String operacao) {
        try {
            xmlLog.gravarLogXml(operacao);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(XmlAdapter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
