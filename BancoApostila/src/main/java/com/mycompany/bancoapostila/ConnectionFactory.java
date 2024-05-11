package com.mycompany.bancoapostila;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionFactory {
private String usuario = "root";
//nome do usuario do SQL BENCH
private String senha = "anima123";
//Senha do SQL
private String host = "localhost";
//O Host
private String porta = "3306";
//A porta de entrada
private String bd = "db_pessoas";
//nome do banco de dados
public Connection obtemConexao (){
try{
Connection c = DriverManager.getConnection(
"jdbc:mysql://" + host + ":" + porta + "/" + bd + "?serverTimezone=UTC",
usuario,
senha
);
    System.out.println("Conexao Efetuada");
return c;
}
catch (Exception e){
e.printStackTrace();
    System.out.println("ERRO CONEXAO");
return null;
}
}
}