package com.company;


import com.google.gson.annotations.SerializedName;

public class User {

    public String Name;

    @SerializedName("Number")
    public int Number;

    public class InnerA {
        @SerializedName("a")
        int a;
        @SerializedName("s")
        String s;
        @SerializedName("ss")
        short ss;
    }

    public static class InnerB {
        @SerializedName("a")
        int a;
        @SerializedName("s")
        String s;
        @SerializedName("ss")
        short ss;
    }
}

class Test {
    
    @SerializedName("Name")
    public String Name;

    @SerializedName("Number")
    public int Number;

    public class InnerC {
        @SerializedName("a")
        int a;
        @SerializedName("s")
        String s;
        @SerializedName("ss")
        short ss;
    }

    public static class InnerB {
        @SerializedName("a")
        int a;
        @SerializedName("s")
        String s;
        @SerializedName("ss")
        short ss;
    }
}