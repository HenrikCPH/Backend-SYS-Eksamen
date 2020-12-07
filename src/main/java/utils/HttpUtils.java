package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class HttpUtils {

    public static String fetchDataCar(String _url) throws MalformedURLException, IOException {
        URL url = new URL(_url);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Accept", "application/json");
        con.setRequestProperty("X-AUTH-TOKEN", "7ry7tvxiq1gq06125ew6d44z2ckol9lz");
        con.setRequestProperty("User-Agent", "server");

        Scanner scan = new Scanner(con.getInputStream());
        String jsonStr = "";        
        while (scan.hasNext()) {
                jsonStr += scan.nextLine();
        }
        scan.close();
        return jsonStr;
    }
    
    public static void main(String[] args) throws IOException {
        System.out.println(fetchDataCar("https://v1.motorapi.dk/vehicles/ZZ47748"));
    }
}
