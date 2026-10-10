package com.studentmanagement;

class Student {
    private int id;
    private String name;
    private String dept;
    private double marks;

    public Student(int id,String name,String dept,double marks){
        this.id=id;
        this.name =name;
        this.dept =dept;
        this.marks =marks;
    }

    public  int getId(){
        return id;
    }

    public void setId(int id){
        this.id =id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getDept(){
        return dept;
    }

    public void setDept(String dept){
        this.dept =dept;
    }

    public double getMarks(){
        return marks;
    }

    public void setMarks(double marks)
    {
        this.marks=marks;
    }

    @Override
    public String toString(){
        return "Student Information => \n" +
                "Student ID : "+id+ "\n" +
                "Name : " +name+ "\n" +
                "Department : " +dept+ "\n" +
                "Marks : " +marks;
    }
}


