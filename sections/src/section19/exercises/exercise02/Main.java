package section19.exercises.exercise02;

import section19.exercises.exercise02.entities.Product;
import section19.exercises.exercise02.services.CalculationService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        String filePath = "src/section19/exercises/exercise02/in.txt";
        String absolutePath = new File(filePath).getAbsolutePath();

        try (BufferedReader br = new BufferedReader(new FileReader(absolutePath))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                productList.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            if(productList.isEmpty()){
                throw new IllegalStateException("List can't be empty");
            }
            CalculationService service = new CalculationService();

            System.out.println("Most expensive:");
            System.out.println(service.max(productList));
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
