import java.io.*;

class Staff{
    int code;
    String Name;
}

class Faculty extends Staff{
    String dept,subj, ResearchArea;
}

class Typist extends Staff{
    String Office;
    int speed;
}

class Officers extends Staff{
    int Rank;
    String grade;
}

class Permanent extends Typist{
    int salary;
}

class Casual extends Typist{
    int dailyWages;
}



public class Nineprgm3 {
    public static void main(String args[]){
        
    }
    
}
