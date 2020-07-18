package com.tsoft.bot.frontend.steps.gestion;

import com.tsoft.bot.frontend.BaseClass;
import com.tsoft.bot.frontend.helpers.Hook;
import com.tsoft.bot.frontend.utility.ExcelReader;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.List;

public class web_DCODE extends BaseClass {

    private static final String EXCEL_WEB = "excel/data1.xlsx";
    private static final String LOGIN_WEB = "DATA";
    private static final String COLUMNA_DATA = "DATA";
    private static final String COLUMNA_TC = "TC";
    private WebDriver driver;

    By txt_numeros = By.id("luhn_algorithm_numbers");
    By btn_verificar = By.cssSelector("#luhn_algorithm > button:nth-child(5)");
    By btn_orden = By.xpath("/html/body/div[2]/div[1]/div/div[6]/div[1]/table/thead/tr/th[2]/span");

    By txt_val1 = By.xpath("/html/body/div[2]/div[1]/div/div[6]/div[1]/table/tbody/tr[1]/td[1]");
    By txt_val2 = By.xpath("/html/body/div[2]/div[1]/div/div[6]/div[1]/table/tbody/tr[2]/td[1]");
    By txt_val3 = By.xpath("/html/body/div[2]/div[1]/div/div[6]/div[1]/table/tbody/tr[3]/td[1]");
    By txt_val4 = By.xpath("/html/body/div[2]/div[1]/div/div[6]/div[1]/table/tbody/tr[4]/td[1]");
    By txt_val5 = By.xpath("/html/body/div[2]/div[1]/div/div[6]/div[1]/table/tbody/tr[5]/td[1]");
    By txt_val6 = By.xpath("/html/body/div[2]/div[1]/div/div[6]/div[1]/table/tbody/tr[6]/td[1]");
    By txt_val7 = By.xpath("/html/body/div[2]/div[1]/div/div[6]/div[1]/table/tbody/tr[7]/td[1]");
    By txt_val8 = By.xpath("/html/body/div[2]/div[1]/div/div[6]/div[1]/table/tbody/tr[8]/td[1]");
    By txt_val9 = By.xpath("/html/body/div[2]/div[1]/div/div[6]/div[1]/table/tbody/tr[9]/td[1]");
    By txt_val10 = By.xpath("/html/body/div[2]/div[1]/div/div[6]/div[1]/table/tbody/tr[10]/td[1]");



    public web_DCODE() {
        this.driver = Hook.getDriver();
    }
    private List<HashMap<String, String>> getData() throws Throwable {
        return ExcelReader.data(EXCEL_WEB, LOGIN_WEB);

    }

    @Given("^Se realiza el flujo DCODE extrae diez \"([^\"]*)\"$")
    public void seRealizaElFlujoDCODE(String casoDePrueba) throws Throwable {

        int dcode = Integer.parseInt(casoDePrueba) - 1;
        String numero = getData().get(dcode).get(COLUMNA_DATA);

        driver.get("https://www.dcode.fr/luhn-algorithm");
        driver.findElement(txt_numeros).click();
        Robot robot = new Robot();
        String text = numero;
        StringSelection stringSelection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, stringSelection);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(3000);

        driver.findElement(btn_verificar).click();
        Thread.sleep(5000);
        driver.findElement(btn_orden).click();
        Thread.sleep(8000);

        String valor1 = driver.findElement(txt_val1).getText();
        System.out.println(valor1);
        ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 1, 3, valor1.substring(1, valor1.length() -1));

        String valor2 = driver.findElement(txt_val2).getText();
        System.out.println(valor2);
        ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 2, 3, valor2.substring(1, valor2.length() -1));

        String valor3 = driver.findElement(txt_val3).getText();
        System.out.println(valor3);
        ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 3, 3, valor3.substring(1, valor3.length() -1));

        String valor4 = driver.findElement(txt_val4).getText();
        System.out.println(valor4);
        ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 4, 3, valor4.substring(1, valor4.length() -1));

        String valor5 = driver.findElement(txt_val5).getText();
        System.out.println(valor5);
        ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 5, 3, valor5.substring(1, valor5.length() -1));

        String valor6 = driver.findElement(txt_val6).getText();
        System.out.println(valor6);
        ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 6, 3, valor6.substring(1, valor6.length() -1));

        String valor7 = driver.findElement(txt_val7).getText();
        System.out.println(valor7);
        ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 7, 3, valor7.substring(1, valor7.length() -1));

        String valor8 = driver.findElement(txt_val8).getText();
        System.out.println(valor8);
        ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 8, 3, valor8.substring(1, valor8.length() -1));

        String valor9 = driver.findElement(txt_val9).getText();
        System.out.println(valor9);
        ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 9, 3, valor9.substring(1, valor9.length() -1));

        String valor10 = driver.findElement(txt_val10).getText();
        System.out.println(valor10);
        ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 10, 3, valor10.substring(1, valor10.length() -1));



    }

    @Given("^Se realiza el flujo DCODE extrae cien \"([^\"]*)\"$")
    public void seRealizaElFlujoDCODEExtraeCien(String casoDePrueba) throws Throwable {

        int dcode = Integer.parseInt(casoDePrueba) - 1;
        String caso = getData().get(dcode).get(COLUMNA_TC);
        String numero = getData().get(dcode).get(COLUMNA_DATA);

        driver.get("https://www.dcode.fr/luhn-algorithm");
        driver.findElement(txt_numeros).click();
        Robot robot = new Robot();
        String text = numero;
        StringSelection stringSelection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, stringSelection);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(3000);

        driver.findElement(btn_verificar).click();
        Thread.sleep(5000);
        driver.findElement(btn_orden).click();
        Thread.sleep(8000);

        switch(caso) {
            case "1":
                String valor1 = driver.findElement(txt_val1).getText();
                System.out.println(valor1);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 1, 3, valor1.substring(1, valor1.length() -1));

                String valor2 = driver.findElement(txt_val2).getText();
                System.out.println(valor2);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 2, 3, valor2.substring(1, valor2.length() -1));

                String valor3 = driver.findElement(txt_val3).getText();
                System.out.println(valor3);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 3, 3, valor3.substring(1, valor3.length() -1));

                String valor4 = driver.findElement(txt_val4).getText();
                System.out.println(valor4);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 4, 3, valor4.substring(1, valor4.length() -1));

                String valor5 = driver.findElement(txt_val5).getText();
                System.out.println(valor5);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 5, 3, valor5.substring(1, valor5.length() -1));

                String valor6 = driver.findElement(txt_val6).getText();
                System.out.println(valor6);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 6, 3, valor6.substring(1, valor6.length() -1));

                String valor7 = driver.findElement(txt_val7).getText();
                System.out.println(valor7);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 7, 3, valor7.substring(1, valor7.length() -1));

                String valor8 = driver.findElement(txt_val8).getText();
                System.out.println(valor8);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 8, 3, valor8.substring(1, valor8.length() -1));

                String valor9 = driver.findElement(txt_val9).getText();
                System.out.println(valor9);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 9, 3, valor9.substring(1, valor9.length() -1));

                String valor10 = driver.findElement(txt_val10).getText();
                System.out.println(valor10);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 10, 3, valor10.substring(1, valor10.length() -1));

                break;
            case "2":
                String valor11 = driver.findElement(txt_val1).getText();
                System.out.println(valor11);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 1, 4, valor11.substring(1, valor11.length() -1));

                String valor12 = driver.findElement(txt_val2).getText();
                System.out.println(valor12);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 2, 4, valor12.substring(1, valor12.length() -1));

                String valor13 = driver.findElement(txt_val3).getText();
                System.out.println(valor13);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 3, 4, valor13.substring(1, valor13.length() -1));

                String valor14 = driver.findElement(txt_val4).getText();
                System.out.println(valor14);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 4, 4, valor14.substring(1, valor14.length() -1));

                String valor15 = driver.findElement(txt_val5).getText();
                System.out.println(valor15);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 5, 4, valor15.substring(1, valor15.length() -1));

                String valor16 = driver.findElement(txt_val6).getText();
                System.out.println(valor16);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 6, 4, valor16.substring(1, valor16.length() -1));

                String valor17 = driver.findElement(txt_val7).getText();
                System.out.println(valor17);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 7, 4, valor17.substring(1, valor17.length() -1));

                String valor18 = driver.findElement(txt_val8).getText();
                System.out.println(valor18);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 8, 4, valor18.substring(1, valor18.length() -1));

                String valor19 = driver.findElement(txt_val9).getText();
                System.out.println(valor19);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 9, 4, valor19.substring(1, valor19.length() -1));

                String valor20 = driver.findElement(txt_val10).getText();
                System.out.println(valor20);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 10, 4, valor20.substring(1, valor20.length() -1));

                break;
            case "3":
                String valor21 = driver.findElement(txt_val1).getText();
                System.out.println(valor21);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 1, 5, valor21.substring(1, valor21.length() -1));

                String valor22 = driver.findElement(txt_val2).getText();
                System.out.println(valor22);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 2, 5, valor22.substring(1, valor22.length() -1));

                String valor23 = driver.findElement(txt_val3).getText();
                System.out.println(valor23);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 3, 5, valor23.substring(1, valor23.length() -1));

                String valor24 = driver.findElement(txt_val4).getText();
                System.out.println(valor24);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 4, 5, valor24.substring(1, valor24.length() -1));

                String valor25 = driver.findElement(txt_val5).getText();
                System.out.println(valor25);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 5, 5, valor25.substring(1, valor25.length() -1));

                String valor26 = driver.findElement(txt_val6).getText();
                System.out.println(valor26);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 6, 5, valor26.substring(1, valor26.length() -1));

                String valor27 = driver.findElement(txt_val7).getText();
                System.out.println(valor27);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 7, 5, valor27.substring(1, valor27.length() -1));

                String valor28 = driver.findElement(txt_val8).getText();
                System.out.println(valor28);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 8, 5, valor28.substring(1, valor28.length() -1));

                String valor29 = driver.findElement(txt_val9).getText();
                System.out.println(valor29);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 9, 5, valor29.substring(1, valor29.length() -1));

                String valor30 = driver.findElement(txt_val10).getText();
                System.out.println(valor30);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 10, 5, valor30.substring(1, valor30.length() -1));
                break;

            case "4":
                String valor31 = driver.findElement(txt_val1).getText();
                System.out.println(valor31);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 1, 6, valor31.substring(1, valor31.length() -1));

                String valor32 = driver.findElement(txt_val2).getText();
                System.out.println(valor32);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 2, 6, valor32.substring(1, valor32.length() -1));

                String valor33 = driver.findElement(txt_val3).getText();
                System.out.println(valor33);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 3, 6, valor33.substring(1, valor33.length() -1));

                String valor34 = driver.findElement(txt_val4).getText();
                System.out.println(valor34);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 4, 6, valor34.substring(1, valor34.length() -1));

                String valor35 = driver.findElement(txt_val5).getText();
                System.out.println(valor35);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 5, 6, valor35.substring(1, valor35.length() -1));

                String valor36 = driver.findElement(txt_val6).getText();
                System.out.println(valor36);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 6, 6, valor36.substring(1, valor36.length() -1));

                String valor37 = driver.findElement(txt_val7).getText();
                System.out.println(valor37);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 7, 6, valor37.substring(1, valor37.length() -1));

                String valor38 = driver.findElement(txt_val8).getText();
                System.out.println(valor38);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 8, 6, valor38.substring(1, valor38.length() -1));

                String valor39 = driver.findElement(txt_val9).getText();
                System.out.println(valor39);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 9, 6, valor39.substring(1, valor39.length() -1));

                String valor40 = driver.findElement(txt_val10).getText();
                System.out.println(valor40);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 10, 6, valor40.substring(1, valor40.length() -1));
                break;

            case "5":
                String valor41 = driver.findElement(txt_val1).getText();
                System.out.println(valor41);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 1, 7, valor41.substring(1, valor41.length() -1));

                String valor42 = driver.findElement(txt_val2).getText();
                System.out.println(valor42);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 2, 7, valor42.substring(1, valor42.length() -1));

                String valor43 = driver.findElement(txt_val3).getText();
                System.out.println(valor43);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 3, 7, valor43.substring(1, valor43.length() -1));

                String valor44 = driver.findElement(txt_val4).getText();
                System.out.println(valor44);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 4, 7, valor44.substring(1, valor44.length() -1));

                String valor45 = driver.findElement(txt_val5).getText();
                System.out.println(valor45);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 5, 7, valor45.substring(1, valor45.length() -1));

                String valor46 = driver.findElement(txt_val6).getText();
                System.out.println(valor46);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 6, 7, valor46.substring(1, valor46.length() -1));

                String valor47 = driver.findElement(txt_val7).getText();
                System.out.println(valor47);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 7, 7, valor47.substring(1, valor47.length() -1));

                String valor48 = driver.findElement(txt_val8).getText();
                System.out.println(valor48);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 8, 7, valor48.substring(1, valor48.length() -1));

                String valor49 = driver.findElement(txt_val9).getText();
                System.out.println(valor49);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 9, 7, valor49.substring(1, valor49.length() -1));

                String valor50 = driver.findElement(txt_val10).getText();
                System.out.println(valor50);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 10, 7, valor50.substring(1, valor50.length() -1));
                break;

            case "6":
                String valor51 = driver.findElement(txt_val1).getText();
                System.out.println(valor51);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 1, 8, valor51.substring(1, valor51.length() -1));

                String valor52 = driver.findElement(txt_val2).getText();
                System.out.println(valor52);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 2, 8, valor52.substring(1, valor52.length() -1));

                String valor53 = driver.findElement(txt_val3).getText();
                System.out.println(valor53);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 3, 8, valor53.substring(1, valor53.length() -1));

                String valor54 = driver.findElement(txt_val4).getText();
                System.out.println(valor54);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 4, 8, valor54.substring(1, valor54.length() -1));

                String valor55 = driver.findElement(txt_val5).getText();
                System.out.println(valor55);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 5, 8, valor55.substring(1, valor55.length() -1));

                String valor56 = driver.findElement(txt_val6).getText();
                System.out.println(valor56);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 6, 8, valor56.substring(1, valor56.length() -1));

                String valor57 = driver.findElement(txt_val7).getText();
                System.out.println(valor57);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 7, 8, valor57.substring(1, valor57.length() -1));

                String valor58 = driver.findElement(txt_val8).getText();
                System.out.println(valor58);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 8, 8, valor58.substring(1, valor58.length() -1));

                String valor59 = driver.findElement(txt_val9).getText();
                System.out.println(valor59);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 9, 8, valor59.substring(1, valor59.length() -1));

                String valor60 = driver.findElement(txt_val10).getText();
                System.out.println(valor60);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 10, 8, valor60.substring(1, valor60.length() -1));
                break;

            case "7":
                String valor61 = driver.findElement(txt_val1).getText();
                System.out.println(valor61);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 1, 9, valor61.substring(1, valor61.length() -1));

                String valor62 = driver.findElement(txt_val2).getText();
                System.out.println(valor62);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 2, 9, valor62.substring(1, valor62.length() -1));

                String valor63 = driver.findElement(txt_val3).getText();
                System.out.println(valor63);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 3, 9, valor63.substring(1, valor63.length() -1));

                String valor64 = driver.findElement(txt_val4).getText();
                System.out.println(valor64);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 4, 9, valor64.substring(1, valor64.length() -1));

                String valor65 = driver.findElement(txt_val5).getText();
                System.out.println(valor65);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 5, 9, valor65.substring(1, valor65.length() -1));

                String valor66 = driver.findElement(txt_val6).getText();
                System.out.println(valor66);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 6, 9, valor66.substring(1, valor66.length() -1));

                String valor67 = driver.findElement(txt_val7).getText();
                System.out.println(valor67);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 7, 9, valor67.substring(1, valor67.length() -1));

                String valor68 = driver.findElement(txt_val8).getText();
                System.out.println(valor68);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 8, 9, valor68.substring(1, valor68.length() -1));

                String valor69 = driver.findElement(txt_val9).getText();
                System.out.println(valor69);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 9, 9, valor69.substring(1, valor69.length() -1));

                String valor70 = driver.findElement(txt_val10).getText();
                System.out.println(valor70);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 10, 9, valor70.substring(1, valor70.length() -1));
                break;

            case "8":
                String valor71 = driver.findElement(txt_val1).getText();
                System.out.println(valor71);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 1, 10, valor71.substring(1, valor71.length() -1));

                String valor72 = driver.findElement(txt_val2).getText();
                System.out.println(valor72);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 2, 10, valor72.substring(1, valor72.length() -1));

                String valor73 = driver.findElement(txt_val3).getText();
                System.out.println(valor73);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 3, 10, valor73.substring(1, valor73.length() -1));

                String valor74 = driver.findElement(txt_val4).getText();
                System.out.println(valor74);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 4, 10, valor74.substring(1, valor74.length() -1));

                String valor75 = driver.findElement(txt_val5).getText();
                System.out.println(valor75);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 5, 10, valor75.substring(1, valor75.length() -1));

                String valor76 = driver.findElement(txt_val6).getText();
                System.out.println(valor76);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 6, 10, valor76.substring(1, valor76.length() -1));

                String valor77 = driver.findElement(txt_val7).getText();
                System.out.println(valor77);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 7, 10, valor77.substring(1, valor77.length() -1));

                String valor78 = driver.findElement(txt_val8).getText();
                System.out.println(valor78);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 8, 10, valor78.substring(1, valor78.length() -1));

                String valor79 = driver.findElement(txt_val9).getText();
                System.out.println(valor79);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 9, 10, valor79.substring(1, valor79.length() -1));

                String valor80 = driver.findElement(txt_val10).getText();
                System.out.println(valor80);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 10, 10, valor80.substring(1, valor80.length() -1));
                break;

            case "9":
                String valor81 = driver.findElement(txt_val1).getText();
                System.out.println(valor81);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 1, 11, valor81.substring(1, valor81.length() -1));

                String valor82 = driver.findElement(txt_val2).getText();
                System.out.println(valor82);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 2, 11, valor82.substring(1, valor82.length() -1));

                String valor83 = driver.findElement(txt_val3).getText();
                System.out.println(valor83);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 3, 11, valor83.substring(1, valor83.length() -1));

                String valor84 = driver.findElement(txt_val4).getText();
                System.out.println(valor84);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 4, 11, valor84.substring(1, valor84.length() -1));

                String valor85 = driver.findElement(txt_val5).getText();
                System.out.println(valor85);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 5, 11, valor85.substring(1, valor85.length() -1));

                String valor86 = driver.findElement(txt_val6).getText();
                System.out.println(valor86);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 6, 11, valor86.substring(1, valor86.length() -1));

                String valor87 = driver.findElement(txt_val7).getText();
                System.out.println(valor87);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 7, 11, valor87.substring(1, valor87.length() -1));

                String valor88 = driver.findElement(txt_val8).getText();
                System.out.println(valor88);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 8, 11, valor88.substring(1, valor88.length() -1));

                String valor89 = driver.findElement(txt_val9).getText();
                System.out.println(valor89);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 9, 11, valor89.substring(1, valor89.length() -1));

                String valor90 = driver.findElement(txt_val10).getText();
                System.out.println(valor90);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 10, 11, valor90.substring(1, valor90.length() -1));
                break;
            case "10":
                String valor91 = driver.findElement(txt_val1).getText();
                System.out.println(valor91);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 1, 12, valor91.substring(1, valor91.length() -1));

                String valor92 = driver.findElement(txt_val2).getText();
                System.out.println(valor92);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 2, 12, valor92.substring(1, valor92.length() -1));

                String valor93 = driver.findElement(txt_val3).getText();
                System.out.println(valor93);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 3, 12, valor93.substring(1, valor93.length() -1));

                String valor94 = driver.findElement(txt_val4).getText();
                System.out.println(valor94);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 4, 12, valor94.substring(1, valor94.length() -1));

                String valor95 = driver.findElement(txt_val5).getText();
                System.out.println(valor95);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 5, 12, valor95.substring(1, valor95.length() -1));

                String valor96 = driver.findElement(txt_val6).getText();
                System.out.println(valor96);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 6, 12, valor96.substring(1, valor96.length() -1));

                String valor97 = driver.findElement(txt_val7).getText();
                System.out.println(valor97);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 7, 12, valor97.substring(1, valor97.length() -1));

                String valor98 = driver.findElement(txt_val8).getText();
                System.out.println(valor98);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 8, 12, valor98.substring(1, valor98.length() -1));

                String valor99 = driver.findElement(txt_val9).getText();
                System.out.println(valor99);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 9, 12, valor99.substring(1, valor99.length() -1));

                String valor100 = driver.findElement(txt_val10).getText();
                System.out.println(valor100);
                ExcelReader.writeCellValue(EXCEL_WEB, LOGIN_WEB, 10, 12, valor100.substring(1, valor100.length() -1));
                break;
        }
    }
}
