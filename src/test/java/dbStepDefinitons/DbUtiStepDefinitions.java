package dbStepDefinitons;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;

public class DbUtiStepDefinitions {

    @Given("kullanici DBUtil ile CHQA database'ine baglanir")
    public void kullanici_db_util_ile_chqa_database_ine_baglanir() {
        DBUtils.getConnection();

    }


    @Given("kullanici DBUtil ile {string} tablosundaki {string} verilerini alir")
    public void kullanici_db_util_ile_tablosundaki_verilerini_alir(String table, String field) {
       String readQuery="SELECT "+field+" FROM "+table;
       DBUtils.executeQuery(readQuery);
    }


    @Given("kullanici DBUtil ile  {string} sutunundaki {int} fiyatin {int} oldugunu test eder")
    public void kullanici_db_util_ile_sutunundaki_fiyatin_oldugunu_test_eder(String field, Integer satirno, Integer expectedprice) throws Exception {

        int satirSayisi=DBUtils.getRowCount();//iterator en sonuncu objeye götürür
        int aktifSatirNumarasi=1;

        System.out.println(satirSayisi);

        DBUtils.getResultset().first();// bununla biz tekrar basa aliyoruz

        while (aktifSatirNumarasi<100){
            System.out.println(aktifSatirNumarasi+ ". satirdaki fiyat :"+DBUtils.getResultset().getObject(field));
            DBUtils.getResultset().next();
            aktifSatirNumarasi++;

        }
        DBUtils.getResultset().absolute(satirno);
        int actualDeger= (int) DBUtils.getResultset().getDouble(field);
        Assert.assertTrue(actualDeger==expectedprice);

    }


    @Then("DBU IDHotel degeri {int} olan kaydin Email degerini {string} yapar")

    public void dbuIDHotelDegeriOlanKaydinEmailDegeriniYapar(int idHotelNo, String yeniEmail) throws SQLException {
        
        String updateQuery=" UPDATE tHOTEL SET Email= "+yeniEmail+" WHERE IDHotel= "+idHotelNo;

       DBUtils.executeQuery(updateQuery);

      String readQuery="SELECT Email FROM tHOTEL";
      DBUtils.executeQuery(readQuery);

    int aktifSatirNumarasi=1;

    DBUtils.getResultset().first();

    while (aktifSatirNumarasi<100){

        Object satirdakiObje=DBUtils.getResultset().getObject("Email");

        System.out.println(aktifSatirNumarasi + ".satirdaki Email :"+ satirdakiObje.toString());

        DBUtils.getResultset().next();

        aktifSatirNumarasi++;

    }
    }


}