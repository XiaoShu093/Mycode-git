package com.jobs.demo1.utils;

import com.huaban.analysis.jieba.JiebaSegmenter;
import de.siegmar.fastcsv.reader.CsvContainer;
import de.siegmar.fastcsv.reader.CsvReader;
import de.siegmar.fastcsv.reader.CsvRow;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Tim_Shu
 * @create 2022-04-17-9:50
 */
public class JiebaUtils {
    public void test() throws IOException {
        File file = new File("D:\\Date\\Code\\jobs_demo\\demo1\\src\\main\\resources\\python\\20.csv");
        CsvReader csvReader = new CsvReader();
        csvReader.setContainsHeader(true);

        CsvContainer csv = csvReader.read(file, StandardCharsets.UTF_8);
        for (CsvRow row : csv.getRows()) {
            //通过头获取对应属性
            String str=row.getField("title");
            String srt_1=str.replaceAll("\\s*", "");
            JiebaSegmenter jiebaSegmenter = new JiebaSegmenter();

            List<String> list = jiebaSegmenter.sentenceProcess(srt_1);
//            System.out.println(list);
//            System.out.println(count(srt_1));
            String str_2 = "java西安";
            count(srt_1);
            count(str_2);
        }

    }


    public List<Integer> count(String str){
        //将字符串转化为字符数组
        char[] chars = str.toCharArray();
        //创建一个HashMap名为hm
        HashMap<Character,Integer> hm = new HashMap();

        //定义一个字符串c，循环遍历遍历chars数组
        for(char c : chars){
            //containsKey(c),当c不存在于hm中
            if(!hm.containsKey(c)){
                hm.put(c,1);
            }else{
                //否则获得c的值并且加1
                hm.put(c, hm.get(c)+1);
            }

            //或者上面的if和else替换成下面这一行
            /*  hm.put(c,hm.containsKey(c) ? hm.get(c)+1:1);*/
        }

        List<Integer> list = new ArrayList<>();
        for(Character key: hm.keySet()){
            //hm.keySet()代表所有键的集合
            int index = hm.get(key);
            list.add(index);
        }
        return list;
    }

//    public double[][] multiplyMatrix(double[][] a, double[][] b) {
//        double[][] multiply = new double[a.length][b[0].length];
//
//        for (int i = 0; i < multiply.length; i++)
//            for (int j = 0; j < multiply[0].length; j++)
//                for (int k = 0; k < a[0].length; k++)
//                    multiply[i][j] += a[i][k] * b[k][j];
//        return multiply;
//    }
//    public void dot(double[][] v1, double[][] v2){
//        multiplyMatrix(v1,v2) / (Math.sqrt(multiplyMatrix(v1,v2))*Math.sqrt(v2,v2));
////        return v1(v2) / (Math.sqrt(v1.dot(v2))*Math.sqrt(v2.dot(v2)));
//    }

    public int dot(int[] x, int[] y) {
        matrixNotNull(x, y);
        vectorNotEmpty(x.length, y.length);
        matrixNotMismatching(x.length, y.length);
        int dot = 0;
        for (int i = 0; i < x.length; i++) {
            dot += x[i] * y[i];
        }
        return dot;
    }

    /**
     * Dot multiplication of two vectors.
     *
     * @param x one vector
     * @param y another vector
     * @return resykt of dot multiplication
     */
    public static double dot(double[] x, double[] y) {
        matrixNotNull(x, y);
        vectorNotEmpty(x.length, y.length);
        matrixNotMismatching(x.length, y.length);
        double dot = 0;
        for (int i = 0; i < x.length; i++) {
            dot += x[i] * y[i];
        }
        return dot;
    }

    // throw an IllegalArgumentException if obj is null
    // (obj is any type of array)
    private static void matrixNotNull(Object... obj) {
        for (Object o : obj) {
            if (o == null)
                throw new IllegalArgumentException("matrix is null");
        }
    }

    // Check if the vectors are not empty.
    private static void vectorNotEmpty(int... lens) {
        for (int len : lens) {
            if (len == 0)
                throw new EmptyVectorException();
        }
    }

    // Check if the two matrices are mismatch the number of rows.
    private static void matrixNotMismatching(int n, int m) {
        if (n != m)
            throw new MismatchingMatrixException();
    }
}


