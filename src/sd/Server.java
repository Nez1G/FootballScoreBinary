

import java.io.*;
import java.net.*;



public class Server extends Thread{
    
    private static ServerSocket server;
    private static Socket connection;
    private static int DEFAULT_PORT=8082;
    private static String message = "";
    
    public static void main(String[] args){
        
        //Verifica se o utilizador passou parametros
       if (args.length != 2) {
            System.out.println("Erro: use java Server <Equipa1> <Equipa2>");
            System.exit(-1);
        }
        
        Equipa e = new Equipa();
        e.setNomeEquipa1(args[0]);
        e.setNomeEquipa2(args[1]);
        //Cria um ServerSocket na porta 8082
        try{
            server = new ServerSocket(DEFAULT_PORT);
        } catch(IOException ioException){
            System.err.println("Erro ao criar o servidor...");
            ioException.printStackTrace();
            System.exit(-1);
        }
    
    
        //Aguarda pelo aparecimento de ligações e cria uma thread para cada uma delas através da class Connection
        while(true){
            try{
                System.out.println("À espera de um cliente");
                connection = server.accept();
                Connection c = new Connection(connection, e);
                c.start();
        } catch(IOException ioException){
            System.err.println("Erro ao criar o servidor...");
            ioException.printStackTrace();
            System.exit(-1);
            } 
        }
    }
}

