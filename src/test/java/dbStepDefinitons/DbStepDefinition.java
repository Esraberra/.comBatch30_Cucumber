package dbStepDefinitons;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbStepDefinition {
    String url="jdbc:sqlserver://184.168.194.58:1433;databaseName=qaconcorthotel; user=Ahmet_User;password=Ahmet123!";
    String username="Ahmet_User";
    String password="Ahmet123!";
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("kullanici CHQA database'ine baglanir")
    public void kullanici_chqa_database_ine_baglanir() throws SQLException {
        connection=DriverManager.getConnection(url,username,password);
        statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    }
    @Given("kullanici {string} tablosundaki {string} verilerini alir")
    public void kullanici_tablosundaki_verilerini_alir(String table, String field) throws SQLException {
        // SELECT Price FROM tHOTELROOM
        String readQuery= "SELECT "+field+" FROM "+table;

        resultSet=statement.executeQuery(readQuery);
    }
    @Given("kullanici {string} sutunundaki verileri okur ve istedigi islemleri yapar")
    public void kullanici_sutunundaki_verileri_okur_ve_istedigi_islemleri_yapar(String field) throws SQLException {

        // resultset iterator gibi calisir
        resultSet.first();
        System.out.println(resultSet.getObject(field).toString());
        System.out.println(resultSet.next());
        System.out.println(resultSet.getObject(field).toString());

  resultSet.last();
        System.out.println(resultSet.next());
        while (resultSet.next()){
            System.out.println(resultSet.getObject(field).toString());
        }
//varsa ilk 100 fiyati double olrak bir listeye kaydedip yazdirin

        int sayac=1;
        resultSet.absolute(0);

        List<Double> ilkYuzSayi= new ArrayList<>();

        while(sayac<=100&& resultSet.next()){
            ilkYuzSayi.add(resultSet.getDouble(field));
            sayac++;
        }

        System.out.println(ilkYuzSayi);
        //7. fiyatin double olarak620.0 oldugunu test et
        resultSet.absolute(7);
        double yedinciSayi=resultSet.getDouble(field);
        Assert.assertTrue(yedinciSayi==620);

    }
}