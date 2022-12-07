package atu.ie;

public class Employee {
    private String name;
    private Long number;

    public Employee(String name, Long number){
        Setname(name);
        Setnumber(number);
    }

    public String GetName(){
        return name;
    }

    public void Setname(String name){
        if(String.valueOf(name).length()>=5){
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("This is not a valid name");
        }
    }

    public Long Getnumber(){
        return number;
    }

    public void Setnumber(Long number){
        if(String.valueOf(number).length()>=12){
            this.number = number;
        }
        else throw new IllegalArgumentException("this is not a valid number");
    }
}

