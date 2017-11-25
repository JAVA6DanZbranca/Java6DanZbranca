/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamultitrading6;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michel D. Zbranca
 */
public class Multiprocess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ProcessBuilder pb;
            // Use process builder to start 2 processes multithreading.SayHello with parameter
            pb= new ProcessBuilder(
                    "java",
                    "-classpath",
                    "D:\\KIT\\Fisiere\\NetBeansIDE\\Project\\Java6DanZbranca\\Java6ZbrancaDan\\build\\classes",
                    "javamultitrading6.SayHello",
                    "2", "John", "Jane");
            Map<String, String> env = pb.environment();
            env.put("TEXT_CONGRATS", "Congratulations for starting your process! ");
            env.remove("OTHERVAR");
            env.put("TEXT_HI", "Hello ");
            pb.directory(new File ( "D:\\KIT\\Fisiere\\NetBeansIDE\\Project\\Java6DanZbranca\\Java6ZbrancaDan\\build\\classes\\javamultitrading6" ));
                    
            Process p1 = pb.start();
            Process p2 = pb.start();
        } catch (IOException ex) {
            Logger.getLogger(Multiprocess.class.getName()).log(Level.SEVERE, "An IO exception is here!", ex);
        }

    }
    
}
