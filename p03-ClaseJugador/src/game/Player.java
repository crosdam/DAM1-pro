package game;

import java.util.Random;

public class Player {
  private Random jtfId = new Random();
  private String jtfName;
  private String jtfSurname;
  private String jtfAge;
  private int ageint;
  private int jtfScore;



/* Player class constructor */
  public Player()
  {

  }
/* /Player class constructor */



/* Player class - getters & setters */
// getter & setter jtfId
public Random getId()
{
  return jtfId;
}
public void setId(Random jtfId)
{
  this.jtfId=jtfId;
}


// getter & setter jtfName
  public String getName()
  {
    return jtfName;
  }
  public void setName(String jtfName)
  {
    this.jtfName=jtfName;
  }


// getter & setter jtfSurname
  public String getSurname()
  {
    return jtfSurname;
  }
  public void setSurname(String jtfSurname)
  {
    this.jtfSurname = jtfSurname;
  }


// getter & setter jtfAge
  public String getAge()
  {
    return jtfAge;
  }
  public void setAge(String jtfAge)
  {
    this.jtfAge = jtfAge;
  }


// getter & setter age2 en string
  public int getAge2()
  {
    return ageint;
  }
  public void setAge2(int ageint)
  {
    this.ageint=ageint;
  }
/* /Player class - getters & setters */
}
