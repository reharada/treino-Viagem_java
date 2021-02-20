package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ArquivosUtils {
    public static String getPropriedade(String propriedade) throws IOException {
        Properties propriedades = new Properties();
        propriedades.load(new FileInputStream("src/main/resources/application.properties"));
        return propriedades.getProperty(propriedade);
    }
}
//se n é estático ==public String getPropriedade(String propriedade) throws IOException {
//ArquivosUtils arquivosUtils = new ArquivosUtils();
//arquivosUtils.getPropriedade("viagem.internacional.acompanhantes.limite");

//se [e estático == nao precisa dar new ==  public static String getPropriedade(String propriedade) throws IOException {
//ArquivosUtils.getPropriedade("viagem.internacional.acompanhantes.limite");