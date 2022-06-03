import java.util.Arrays;

public class Person {

  private String name;
  private String nationality;
  private String dateOfBirth;
  private int seatNumber;
  private String[] passport;

  // constructor
  public Person(String name, String nationality, String dateOfBirth, int seatNumber){
    this.name=name;
    this.nationality=nationality;
    this.dateOfBirth=dateOfBirth;
    this.seatNumber=seatNumber;
    this.passport=new String[3];
  }
 
  // copy constructor that can copy from constuctor previous
  public Person(Person source){
    this.name=source.name;
    this.nationality=source.nationality;
    this.dateOfBirth=source.dateOfBirth;
    this.seatNumber=source.seatNumber;
    this.passport=Arrays.copyOf(source.passport, source.passport.length);
  }

  // get fields
  public String getName(){
    return this.name;
  }

  public String getNationality(){
    return this.nationality;
  }

  public String getDateOfBirth(){
    return this.dateOfBirth;
  }

  public int getSeatNumber(){
    return this.seatNumber;
  }

  public String[] getPassport(){
      return Arrays.copyOf(this.passport, this.passport.length);
  }

  // update fields
  public void setName(String name){
    this.name=name;
  }

  public void setNationality(String nationality){
    this.nationality=nationality;
  }

  public void setDateOfBirth(String dateOfBirth){
    this.dateOfBirth=dateOfBirth;
  }

  public void setSeatNumber(int seatNumber){
    this.seatNumber=seatNumber;
  }

  public void setPassport(){
    this.passport= new String[]{this.name, this.nationality, this.dateOfBirth};
  }

  /**
   * Function name: applyPassport
   * @return (boolean)
   * 
   * Inside the function:
   *    1. Returns a random boolean of true or false
   */
  public boolean applyPassport(){
    int number = (int)(Math.random()*2);
    if(number==0){
      return false;
    }else{
      return true;
    }
  }

  /**
   * Function name: chooseSeat
   * 
   * Inside the function: 
   *    1. Sets this.seat to a random number between 1--11
   */
  public void chooseSeat(){
    this.seatNumber=(int)(Math.random()*11+1); 
  }

  public String toString(){
    return "\nName: "+this.name+"\n"
         + "Nationality: "+this.nationality+"\n"
         + "Date of birth: "+this.dateOfBirth+"\n"
         + "Seat number: "+ this.seatNumber+"\n"
         + "Passport: "+ Arrays.toString(this.passport)+"\n";

  }

 }

    

