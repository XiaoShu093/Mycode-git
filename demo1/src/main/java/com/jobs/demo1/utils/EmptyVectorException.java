package com.jobs.demo1.utils;

/**
 * @author Tim_Shu
 * @create 2022-04-20-10:11
 */
public class EmptyVectorException extends RuntimeException{
    public EmptyVectorException() { super(); }

    public EmptyVectorException(String s) { super(s); }
}
