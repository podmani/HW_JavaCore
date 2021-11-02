package HW5;

import java.io.*;
import java.util.ArrayList;

public class AppData {
    static private String[] header = new String[]{"Value1","Value2","Value3"};
    static private int[][] data = new int[][] { {100, 200, 123}, {300, 400, 500}};

    public static void main(String[] args) throws IOException {

        // загрузка данных в csv-файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("test.csv"))) {

            StringBuffer sb = new StringBuffer();
             for (int i = 0; i < header.length; i++) {
                sb.append(header[i] + ";");

              }
            sb.deleteCharAt(sb.lastIndexOf(";"));
            sb.append("\n");

            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[0].length; j++) {
                   sb.append(data[i][j] + ";");
                }
                sb.deleteCharAt(sb.lastIndexOf(";"));
                sb.append("\n");
            }
            writer.write(sb.toString());


        }catch (IOException e){
                e.printStackTrace();
        }

        // загрузка данных из csv-файла
        File file = new File("test.csv");
        ArrayList<Value> values = new ArrayList<>();

        try(BufferedReader in = new BufferedReader(new FileReader(file))){
            String result = null;
            in.readLine();
            while((result = in.readLine()) != null){
                String[] temp = result.split(";");
                values.add(new Value((temp[0]),(temp[1]),(temp[2])));
            }
        }

        for (Value value: values){
            System.out.println(value.getValue1() + " " + value.getValue2() + " " + value.getValue3());
        }

        }
        public static class Value {
            private String Value1, Value2, Value3;

            public Value(String value1, String value2, String value3) {
                this.Value1 = value1;
                this.Value2 = value2;
                this.Value3 = value3;
            }

            public String getValue1() {
                return Value1;
            }

            public void setValue1(String value1) {
                Value1 = value1;
            }

            public String getValue2() {
                return Value2;
            }

            public void setValue2(String value2) {
                Value2 = value2;
            }

            public String getValue3() {
                return Value3;
            }

            public void setValue3(String value3) {
                Value3 = value3;
            }
        }
}

