package br.univille.poo.logger;

class ConsoleLogger implements Logger {

    @Override
    public void message(String message) {
        System.out.println(message);
    }

}
