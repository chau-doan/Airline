import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

     Person[] people =new Person[]{
         new Person("Chau Doan", "American","10/21/1977",9),
         new Person("Huy Nguyen", "American","11/10/1996",8),
         new Person("Nhat Thai", "American","05/17/2003",7),
         new Person("Nhi Thai ", "American","07/04/2001",6),
         new Person("Thinh Nguyen", "American","10/21/1977",5),
         new Person("Phuong Ngo", "American","10/21/1977",4),
         new Person("Khoa Truong", "American","10/21/1977",3),
         new Person("Thuy Truong", "American","10/21/1977",2),
         new Person("Thuy Luu", "American","10/21/1977",1),
         new Person("Thao Ton", "American","10/21/1977",10),
         new Person("Minh Nguyen", "American","10/21/1977",11)
     };

     

     Airline airline= new Airline();

     for (int i=0; i<people.length; i++){
         if (people[i].applyPassport()==true){
             people[i].setPassport();
             airline.createReservation(people[i]);
         }
     }

     System.out.println("******************* RESERVATIONS COMPLETE!**************");
     System.out.println(airline);
     



    //  person.chooseSeat();
    //  person.setPassport();

    //  Person person1= new Person(person);
    //  person1.chooseSeat();;
    //  person1.setName("Huy Nguyen");


    //  Person person1= new Person("Huy Nguyen", "American", "11/10/1996", 6); 
    //  person1.setSeatNumber(10);


    //  System.out.println("\nName: "+person.getName()+"\n"+"Nationality: "
    //  +person.getNationality()+"\n"+"Date Of Birth: "+person.getDateOfBirth()
    //  +"\n"+"Seat Number: "+person.getSeatNumber()+"\n"+"Passport: "+Arrays.toString(person.getPassport()));

    // System.out.println(person);

    //  if(person.applyPassport()==true){
    //      System.out.println("\nCongratulations "+person.getName()+". Your passport was approved!");
    //  }else{
    //     System.out.println("\nWe're sorry  "+person.getName()+". We cannot process your application!"); 
    //  }

    // if (person.applyPassport()==true){
    //     person.setPassport();
    // }



    //  System.out.println("\nName: "+person1.getName()+"\n"+"Nationality: "
    //  +person1.getNationality()+"\n"+"Date Of Birth: "+person1.getDateOfBirth()+"\n"+"Seat Number: "+person1.getSeatNumber());
     

    }
  
  
}
