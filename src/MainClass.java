import curency.Chief;
import curency.Curency;
import curency.Dollar;
import libs.Calc;
import libs.WorkWithArray;
import libs.WorkWithList;
import sun.awt.geom.AreaOp;

import java.sql.SQLOutput;
import java.util.*;

public class MainClass {

    public static void main(String[] args) {

        int var1 = 30, var2 = 4, var3 = 5, var4 = 1, var5 = 0;
        int[] massive1 = {2, 4, 26, 7, 28, 10, 9, 20, 33};
        int[][] zeroMassive = {{}};
        int[][] massive2 = {{2, 4, 26}, {7, 28, 10}, {9, 20, 33}};



     /*       WorkWithList workWithList = new WorkWithList();
            List<List<String>> ourList = new ArrayList<>();

            workWithList.addNewList(ourList);
            ourList = workWithList.addValueToListList(0, "test01", ourList);

            workWithList.addNewList(ourList);
            ourList = workWithList.addValueToListList(1, "test11", ourList);
            ourList = workWithList.addValueToListList(1, "test12", ourList);
            ourList = workWithList.addValueToListList(0, "test02", ourList);


            workWithList.addNewList(ourList);
            workWithList.addValueToListList(2, "test21", ourList);
            workWithList.addValueToListList(1, "test13", ourList);




        List<String> ourList = new ArrayList<>();
         ourList.add("test");
           System.out.println(ourList);
        List<List<String>> ourListList = new ArrayList<>();
        System.out.println(ourListList);

        ourListList.add(new ArrayList<>());
        System.out.println(ourListList);
        ourListList.add(new ArrayList<>());
        System.out.println(ourListList);
        System.out.println(ourListList.size());


        ourListList.get(1).add("test");
        System.out.println(ourListList);

        ourListList.get(1).add("test1");
        System.out.println(ourListList);

        ourListList.get(1).remove(0);
        System.out.println(ourListList);

        List<String> LineList = new ArrayList<>();
        LineList.add("element1");
        LineList.add("element2");

        System.out.println(LineList);

        // ourListList.add(LineList);
        ourListList.add(new ArrayList<>());
        ourListList.get(2).addAll(LineList);
        System.out.println(ourListList);

        ourListList.get(1).addAll(0, LineList);
        System.out.println(ourListList);

        LineList.add("element3");
        ourListList.add(LineList);

        for (List<String> line : ourListList
        ) {
            System.out.println(line);
        }
        Map<String, Integer> ourMap = new HashMap<>();
        ourMap.put("Login", 23);
        System.out.println(ourMap);
        ourMap.put("Pass", 11);
        System.out.println(ourMap);
        System.out.println(ourMap.get("Pass"));
        ourMap.put("Pass", 777);
        System.out.println(ourMap);

        System.out.println("size: " + ourMap.size());


        List<Map<String, Integer>> ourListMap = new ArrayList<>();
        ourListMap.add(new HashMap<>());
        ourListMap.get(0).put("login", 23);
        ourListMap.get(0).put("pass", 24);
        ourListMap.get(0).put("pass1", 25);
        System.out.println(ourListMap);
        System.out.println(ourListMap.get(0).get("pass1"));
        ourListMap.add(new HashMap<>());
        ourListMap.get(1).put("login", 233);
        ourListMap.get(1).put("pass", 244);
        ourListMap.get(1).put("pass1", 255);
        System.out.println(ourListMap);

        for (int i = 0; i < ourListMap.size(); i++) {
            System.out.println("Line " + (i + 1) + "pass " + ourListMap.get(i).get("pass"));

*/
        Dollar dollar = new Dollar(28);
        System.out.println("kurs dollar: " + dollar.getKursNBU());

        dollar.setKursNBU(28.5);
        System.out.println(dollar.getKursNBU());

        dollar.exchengeСurrencyToHrn(100);
        dollar.setKursNBU(29);
        dollar.exchengeСurrencyToHrn(100);
        dollar.setMarja(0.5);
        dollar.exchengeСurrencyToHrn(100);

        Chief chief = new Chief(30);
        chief.exchengeСurrencyToHrn(100);
    }
}













