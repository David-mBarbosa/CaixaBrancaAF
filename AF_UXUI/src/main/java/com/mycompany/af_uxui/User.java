package com.mycompany.af_uxui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
    public Connection conectarBD(){
     /*1*/   Connection conn = null;
       /*2*/ try{
        /*3*/    Class.forName("com.mysql.Driver.Manager").newInstance();
        /*4*/  String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
        /*5*/    conn = DriverManager.getConnection(url);
     /*6*/  }catch (Exception e) {}
      /*7*/ return conn;}
    public String nome="";
 /*8*/   public boolean result = false;
    public boolean verificarUsuario(String login, String senha){
        String sql = "";
        Connection conn = conectarBD();
    /*9*/    //INSTRUÇÃO SQL
        sql += "select nome from usuarios";
        sql += "where login = " + "'"+ login + "'";
        sql += " and senha = " + "'" + senha + "';";
     /*10*/   try{
            Statement st = conn.createStatement();
      /*11*/      ResultSet rs = st.executeQuery(sql);
       /*12*/     if(rs.next()){
                result = true;
       /*13*/   nome = rs.getString("nome");}
      /*14*/  }catch (Exception e) { }
     /*15*/  return result; }
    }//fim da class
