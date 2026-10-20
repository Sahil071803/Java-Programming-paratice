public class ifelse {

    public static void main(String[] args){

        int age = 26;

        if(age > 25){
            System.out.println("Person Have voting card ");
        }

        else if(age >= 18 && age <= 25){
            System.out.println("Person Have to Create a voting Card Immeditely");

        }
        else{
            System.out.println("Person is minor not having voter card");
        }
    }
    
}
