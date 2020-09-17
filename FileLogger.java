package br.univille.poo.logger;

import java.io.File;
import java.io.FileWriter;

public class FileLogger implements Logger {

    @Override
    public void message(String message) {
        try{
            File arquivo = new File("Arquivo em texto");
            FileWriter writer = new FileWriter(arquivo,true);
            writer.write(message);
            writer.write("\n");
            writer.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
