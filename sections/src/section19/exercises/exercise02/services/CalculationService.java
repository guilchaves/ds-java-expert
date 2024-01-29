package section19.exercises.exercise02.services;

import java.util.List;

public class CalculationService {

    public static <T extends Comparable<? super T>> T max(List<T> list){
        if(list.isEmpty()){
            throw new IllegalStateException("List can't be empty");
        }
        T max = list.get(0);
        for (T product : list){
            if(product.compareTo(max) > 0){
                max = product;
            }
        }
        return max;
    }

}
