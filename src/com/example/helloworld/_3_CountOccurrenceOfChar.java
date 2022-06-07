package com.example.helloworld;


public class _3_CountOccurrenceOfChar {

    public static void main(String[] args) {
        _3_CountOccurrenceOfChar ob = new _3_CountOccurrenceOfChar();
        _3_CountOccurrenceOfChar.MyString str = ob.new MyString(" Lets make India Great!!!");
        char X=65;// 'A'
        System.out.print("Occurrence Count: "+ str.countOccurences(X) );
    }

    class MyString{
        private String str;
        public MyString(String str){
            this.str = str;
        }

        public int countOccurences(char X){
            int c=0;
            char ch[] = new char[200];
            str.getChars(0,str.length(),ch,0);

            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==X)
                    c++;
            }

            return c;
        }
    }
}
