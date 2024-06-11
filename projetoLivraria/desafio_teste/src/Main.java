import java.io.*;
import java.net.*;

import org.json.*;

public class Main {
    public static void main(String[] args) {
        System.setProperty("http.agent", "Chrome");

        try {
            URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");
            URLConnection connection = url.openConnection();
            InputStream inputStream = connection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder content = new StringBuilder();
            String line;

            // Read the content from the URL
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
            int count = 0;

            // Process each pair
            for (String pair : pairs) {
                String[] keyValue = pair.split("=");
                String key = keyValue[0];
                int age = Integer.parseInt(keyValue[1]);
                if (age >= 50) {
                    count++;
                }
            }

            // Output the result
            System.out.println("Number of people aged 50 or older: " + count);

        } catch (MalformedURLException malEx) {
            System.out.println("MalformedURLException: " + malEx.getMessage());
        } catch (IOException ioEx) {
            System.out.println("IOException: " + ioEx.getMessage());
        } catch (JSONException jsonEx) {
            System.out.println("JSONException: " + jsonEx.getMessage());
        }
    }
}

