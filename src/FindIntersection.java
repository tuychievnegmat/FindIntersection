import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
    public static void main(String[] args) {
        String[] strArr = new String[2];
        strArr[0] = "1, 3, 4 ,7 , 13";
        strArr[1] = "1, 2, 4, 13, 15";

        String[]strArr2 = new String[2];
        strArr2[0] = "1, 3, 9, 10, 17, 18";
        strArr2[1] = "1, 4, 9, 10";

        System.out.println(findIntersection(strArr));
        //1,4,13: final output ,4, Why? I did not understand the condition of the final
        // exit, on the basis of what should this number be there?

        System.out.println(findIntersection(strArr2));
        //1,9,10: final output ,9, Why? I did not understand the condition of the final
        // exit, on the basis of what should this number be there?


        String[] strArr3 = new String[2];
        strArr3[0] = "1, 2, 3, 4, 5";
        strArr3[1] = "6, 7, 8, 9, 10";
        System.out.println(findIntersection(strArr3));
    }
    //метод для решения собеседования, нужно потом удалить
    public static List<String> splitMethod(String str){
        List<String> list = new ArrayList<>();
        String filtred = str.replaceAll("[^0-9,]", "");
        String[] numbers = filtred.split(",");
        for (String s : numbers) {
            list.add(s);
        }
        return list;

    }
    
    public static String findIntersection(String strArr[]){

        List<String> first = splitMethod(strArr[0]);
        List<String> second = splitMethod(strArr[1]);


        first.retainAll(second);

        String text = String.join(",", first);
        if(text.isEmpty() ) return "EMPTY";
        return text;

    }

}
