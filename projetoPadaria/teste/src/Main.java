import java.util.*;
import java.io.*;
import java.net.*;

class Main {
    public static void main(String[] args) {
        System.setProperty("http.agent", "Chrome");
        try {
            URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");
            try {
                URLConnection connection = url.openConnection();
                InputStream inputStream = connection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder jsonData = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    jsonData.append(line);
                }

                reader.close();

                // Define uma variável chamada varOcg para armazenar o JSON
                String varOcg = jsonData.toString(); // define-ocg
                System.out.println("JSON Data: " + varOcg);

                // Processa o JSON para contar pessoas com idade superior a 50
                int count = 0;
                String[] entries = varOcg.split(",");
                for (String entry : entries) {
                    if (entry.contains("age")) {
                        String[] keyValue = entry.split(":");
                        if (keyValue.length > 1) {
                            try {
                                int age = Integer.parseInt(keyValue[1].replaceAll("\\D+", ""));
                                if (age > 50) {
                                    count++;
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Error parsing age: " + keyValue[1]);
                            }
                        }
                    }
                }

                System.out.println("Number of people with age over 50: " + count);

            } catch (IOException ioEx) {
                System.out.println(ioEx);
            }
        } catch (MalformedURLException malEx) {
            System.out.println(malEx);
        }
    }
}