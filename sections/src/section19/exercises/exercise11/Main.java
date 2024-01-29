package section19.exercises.exercise11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/section19/exercises/exercise11/in.txt";
        String absolutPath = new File(filePath).getAbsolutePath();

        Map<String, Integer> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(absolutPath))) {
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                String candidate = fields[0];
                Integer votes = Integer.parseInt(fields[1]);

                map.compute(candidate, (key, oldValue) -> (oldValue == null) ? votes : votes + oldValue);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
