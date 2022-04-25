package com.jobs.demo1.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Tim_Shu
 * @create 2022-04-17-10:24
 */
@Service
public class RecommendService {
    public ArrayList giveRecommend(String text) throws IOException {
//        输入脚本执行所需参数
        String[] commend=new String[] {"python","D:\\Date\\Code\\jobs_demo\\demo1\\src\\main\\resources\\python\\check.py",text};
//        执行python脚本

        Process proc = Runtime.getRuntime().exec(commend);
        // 接受python输出的数据
//        InputStreamReader in=new InputStreamReader(proc.getInputStream(),"utf-8");
//        LineNumberReader input = new LineNumberReader(in);
//        String line=input.readLine();
        Scanner scanner = new Scanner(proc.getInputStream(),"utf-8");
        ArrayList<String> result =new ArrayList<>();
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            result.add(line);

        }
//        String s = scanner.nextLine();
//        System.out.println(s);
//        return line;
        return result;
    }
}
