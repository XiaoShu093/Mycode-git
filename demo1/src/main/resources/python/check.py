# -*- coding: utf-8 -*-
# coding: utf-8
import sys
import io
# 设置编码为“utf-8”防止乱码
sys.stdout = io.TextIOWrapper(sys.stdout.buffer, encoding='utf-8')
import jieba
import numpy as np
from collections import Counter
import pandas as pd

# 传入命令行参数
data5 = sys.argv[1]
class Topic_Similarity:
    # 基于词频的余弦相似度（TF-IDF）
    # 其中的str1，str2是分词后的标签列表
    def cos_sim(str1, str2):
        # 去除字符列表中空格
        str1 = [x.strip() for x in str1 if x.strip() != '']
        # str1是列表
        co_str1 = (Counter(str1))
        # print(co_str1)
        co_str2 = (Counter(str2))
        p_str1 = []
        p_str2 = []
        for temp in set(str1 + str2):
            p_str1.append(co_str1[temp])
            p_str2.append(co_str2[temp])
        p_str1 = np.array(p_str1)
        # print(p_str1)
        p_str2 = np.array(p_str2)
        return p_str1.dot(p_str2) / (np.sqrt(p_str1.dot(p_str1)) * np.sqrt(p_str2.dot(p_str2)))

    def Similarity(str1, str2):

        str3 = jieba.lcut(str1)
        str4 = jieba.lcut(str2)

        return ts.cos_sim(str3, str4)
    def open_file(path1):

        with open(path1, 'r', encoding='utf-8') as file_name1:

            data1 = pd.read_csv(file_name1, encoding="utf-8",error_bad_lines=False)  # 读取文件中所有数据
            for row1, str1 in data1.iterrows():
                    str_1 = str1['title']
                    Sim = ts.Similarity(str_1, data5)

                    if Sim > 0.46 :
                        print(str_1)


if __name__ == "__main__":
    ts = Topic_Similarity
    path1 = 'D:\\Date\\Code\\jobs_demo\\demo1\\src\\main\\resources\\python\\20.csv'
    ts.open_file(path1)