package com.kingfish.show.utils;

import com.google.common.base.Splitter;

/**
 * Created by kingfish on 2017/7/10.
 */
public class UrlComparer {
    /*
    public static void main(String[] args) {
        String url1 = "https://rate.taobao.com/feedRateList.htm?auctionNumId=552216487074&userNumId=14197825&currentPageNum=1&pageSize=20&rateType=&orderType=sort_weight&attribute=&sku=&hasSku=false&folded=0&ua=103UW5TcyMNYQwiAiwQRHhBfEF8QXtHcklnMWc%3D%7CUm5Ockt%2FS3FMcEV%2FRHpOdSM%3D%7CU2xMHDJ7G2AHYg8hAS8XIw0tA0QtRmg%2BaA%3D%3D%7CVGhXd1llXGhcZltnUmhTbVliVWhKf0N%2BR3JMdUtxT3NKdExySmQy%7CVWldfS0SMg4yEicHKVs1UikNchtgThhO%7CVmJCbEIU%7CV2lJGSYYOAQkGCEfKwszCTYNLREoESwMOAU4GCQdJBk5DDYIXgg%3D%7CWGFBET8RMQ8xDCwQKxcsDDALPwU%2FAT5oPg%3D%3D%7CWWFBET8RMWFfZVl5RX1Eey0NMBA%2BEDAMNgs3Cz4CVAI%3D%7CWmNeY0N%2BXmFBfUR4WGZeZER%2BRWVbe09vU2k%2F&_ksTS=1499703577610_2538&callback=jsonp_tbcrate_reviews_list";
        printParams(url1);
        String url2 = "https://rate.taobao.com/feedRateList.htm?auctionNumId=552216487074&userNumId=14197825&currentPageNum=1&pageSize=20&rateType=3&orderType=sort_weight&attribute=&sku=&hasSku=false&folded=0&ua=118UW5TcyMNYQwiAiwQRHhBfEF8QXtHcklnMWc%3D%7CUm5Ockt%2FS3FMckpwSnJGeS8%3D%7CU2xMHDJ7G2AHYg8hAS8XIw0tA0QtRmg%2BaA%3D%3D%7CVGhXd1llXGhcZltlXWddZVFuWWRGe05wTHBOcElwRX9HfEN%2FRHhWAA%3D%3D%7CVWldfS0RMQ0zBj0dIRo6FHMYfhN0X39GZlp%2FKQ1gBXtVA1U%3D%7CVmJCbEIU%7CV2lJGSYYOAQkGCEfKwszBj0BIR0kHSAANAk0FCgRKBU1ADoEUgQ%3D%7CWGNDEz1GK1Q1WCZcfQAhSCxIZkZyTm5Tc09zSH1AFkA%3D%7CWWBAED4QMA8zDS0RKhUvDzANMQ86bDo%3D%7CWmJCEjwSMmJbZVt7R39HeS8PMhI8EjINMQ8xDVsN%7CW2JfYkJ%2FX2BAfEV5WWdfZUV%2FRGRaekVxUWREeEMV&_ksTS=1499703598957_2559&callback=jsonp_tbcrate_reviews_list";
        System.out.println("~~~~~~~~~");
        printParams(url2);
    }*/


    private static void printParams(String url) {
        Splitter.on("?").trimResults().splitToList(url).stream().filter(s -> !s.startsWith("http")).forEach(s -> {
            Splitter.on("&").trimResults().splitToList(s).stream().sorted().forEach(s1 -> System.out.println(s1));
        });
    }
}
