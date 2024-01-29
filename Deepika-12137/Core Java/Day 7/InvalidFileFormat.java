package com.day7;

class InvalidFile extends Exception{
    InvalidFile(String msg){
        super(msg);
    }
}

class Fileformat{
    Fileformat(String name) throws InvalidFile
    {
        if (name.endsWith(".pdf") || name.endsWith(".docx")) {
            throw new InvalidFile("File uploaded Successfully");
        } else {
            System.out.println("Not a valid File format");
        }
    }
}

public class InvalidFileFormat {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            Fileformat obj=new Fileformat("File1.pdf");
        } catch (InvalidFile e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

    }

}