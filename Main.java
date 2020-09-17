package br.univille.poo.logger;

public class Main {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getInstance().createFileLogger();

        logger.message("Iniciando sistema...");
        logger.message("Carregando arquivos...");
        logger.message("Finalizando sistema...");

    }

}
