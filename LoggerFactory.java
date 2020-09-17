package br.univille.poo.logger;

public abstract class LoggerFactory {

    private static LoggerFactory instance;

    protected LoggerFactory(){}

    public static LoggerFactory getInstance(){
        if(instance == null){
            instance = new LoggerFactoryConcrete();
        }
        return instance;
    }

    public abstract Logger createConsoleLogger();

    public abstract Logger createFileLogger();


}
