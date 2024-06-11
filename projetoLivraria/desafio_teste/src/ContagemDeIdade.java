import java.util.*;
import java.io.*;
import java.net.*;

import org.json.*;

public class ContagemDeIdade {

    private String url;

    public ContagemDeIdade(String url) {
        this.url = url;
    }

    public int contarIdades() {
        System.setProperty("http.agent", "Chrome");
        int count = 0;

        try {
            URL url = new URL(this.url);
            URLConnection connection = url.openConnection();
            InputStream inputStream = connection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                content.append(line);
            }

            bufferedReader.close();
            inputStreamReader.close();
            inputStream.close();

            // Parse JSON data
            JSONObject jsonObject = new JSONObject(content.toString());
            String data = jsonObject.getString("data");
            String[] pairs = data.split(", ");

            for (String pair : pairs) {
                String[] keyValue = pair.split("=");
                String key = keyValue[0];
                int age = Integer.parseInt(keyValue[1]);
                if (age >= 50) {
                    count++;
                }
            }

        } catch (IOException ioEx) {
            System.out.println(ioEx);
        } catch (JSONException jsonEx) {
            System.out.println(jsonEx);
        }

        return count;
    }

    public static void main(String[] args) {
        ContagemDeIdade contagem = new ContagemDeIdade("https://coderbyte.com/api/challenges/json/age-counting");
        int resultado = contagem.contarIdades();
        System.out.println("Number of people aged 50 or older: " + resultado);
    }
}
