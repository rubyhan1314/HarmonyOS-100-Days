package com.example.hanruweather.utils;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;


public class TextUtils {


    /**
     * 将汉字转为汉语拼音
     *
     * @param text
     * @return
     */
    public static String convertToHanYuPinYin(String text) {
        // 如果不是中文，直接 返回原字符串
        if (!text.matches("[\\u4E00-\\u9FA5]+")) {
            return text;
        }
        // 如果是中文，转为汉语拼音
        char[] array = text.toCharArray();
        StringBuffer sb = new StringBuffer();

        HanyuPinyinOutputFormat format = new HanyuPinyinOutputFormat();
        // 不显示拼音的声调
        format.setToneType(HanyuPinyinToneType.WITHOUT_TONE);

        for (int i = 0; i < array.length; i++) {
//            if (Character.toString(array[i]).matches("[\\u4E00-\\u9FA5]+")){
            try {
                sb.append(PinyinHelper.toHanyuPinyinStringArray(array[i],
                        format)[0]);
            } catch (BadHanyuPinyinOutputFormatCombination badHanyuPinyinOutputFormatCombination) {
                badHanyuPinyinOutputFormatCombination.printStackTrace();
            }
        }
        return sb.toString();
    }

    /**
     * 将汉字转换为全拼(每个字之间有一个空格)
     *
     * @param str 字符串，k 为1转大写拼音，否则小写拼音
     * @return String
     */
    public static String getPinYin(String str, int k) {
        HanyuPinyinOutputFormat outputFormat = new HanyuPinyinOutputFormat();
        // 默认小写
        outputFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        if (k == 1)
            outputFormat.setCaseType(HanyuPinyinCaseType.UPPERCASE);

        // 不显示拼音的声调
        outputFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        // outputFormat.setVCharType(HanyuPinyinVCharType.WITH_V);

        StringBuilder sb = new StringBuilder();
        try {
            for (char c : str.toCharArray()) {
                // 如果包含有中文标点除号，需要使用正则表达式
                if (Character.toString(c).matches("[\\u4E00-\\u9FA5]+")) {
                    // if (c > 128) {
                    try {
                        sb.append(PinyinHelper.toHanyuPinyinStringArray(c,
                                outputFormat)[0] + " ");
                    } catch (NullPointerException e) {
                        sb.append(Character.toString(c) + " ");
                    }
                } else {
                    sb.append(Character.toString(c));
                }
            }
        } catch (BadHanyuPinyinOutputFormatCombination e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

}
