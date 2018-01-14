// Class to get player data

package game;

import java.util.Random;

public class Player
{
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
    this.jtfId = jtfId;
  }


// getter & setter jtfName
  public String getName()
  {
    return jtfName;
  }
  public void setName(String jtfName)
  {
    this.jtfName = jtfName;
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
// Check if age is not negative
    if ((ageint < 0))
    {
      this.ageint = 999;
    }   
    else
    {
      this.jtfAge = jtfAge;
    }
  }


// getter & setter age2 en string
  public int getAge2()
  {
    return ageint;
  }
  public void setAge2(int ageint)
  {
    this.ageint = ageint;
  }


  public boolean isNumeric(String text1)
  {
    try
    {
      Integer.parseInt(text1);
      return true;
    }
    catch (NumberFormatException text2)
    {
      return false;
    }
  }


  public boolean isEmpty(String data2)
  {
    for (int i = 0; i < data2.length(); i++)
    {
      if (data2.charAt(i) != ' ')
      {
        return false;
      }
      else
      {
        return true;
      }
    }
  }
}
