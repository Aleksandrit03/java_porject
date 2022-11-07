package java_dz_2;

import java.util.ArrayList;
import netscape.javascript.JSObject;

public class Task_1 {

    // Дана строка sql-запроса "select * from students".
    // Сформируйте часть WHERE этого запроса, используя StringBuilder.
    //
    // 1) Данные для фильтрации подаются в метод двумя массивами paramName и paramValue.
    // 2) Данные для фильтрации подаются в метод строкой в формате json.
    public static void main(String[] args) {
        Task_1 hom = new Task_1();
        String sql_start = "select * from students WHERE ";
        String[] paramName = {"City","castle","rivers"};
        String[] paramValue = {"5","2","3"};
        String[] res_ult = hom.updateQueryByArrays(sql_start, paramName, paramValue);
        for (String string : res_ult) {
            System.out.println(string);
        }
    }

    public String[] updateQueryByArrays(String q, String[] paramName, String[] paramValue){
        
        int count = 0;
        ArrayList<String> ready_comand = new ArrayList<>();
        StringBuilder SB = new StringBuilder(q);
        for (String string : paramName) {
            SB.append(q);
            SB.append(paramName);
            SB.append(" = ");
            SB.append(paramValue);
            ready_comand.add(q + string + " = " + paramValue[count]);
            count += 1;
        }

        return ready_comand.toArray(String[]::new);
    }

    public String updateQueryByJson(String q){
        
        return "";
    } 
}