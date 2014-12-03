public class Employee
{
  String name;
  double hourlyWage;
  int hoursWorked;
  public Employee(String nam, double wage, int hours)
  {
    name=nam;
    hourlyWage=wage;
    hoursWorked=hours;
  }
  public String getName()
  {
    return name;
  }
  public double getWage()
  {
    return hourlyWage;
  }
  public int getHours()
  {
    return hoursWorked;
  }
  public double getWeeklySalary()
  {
    return hoursWorked*hourlyWage;
  }
  public double getYearlySalary()
  {
    return (hourlyWage*hoursWorked)*52;
  }
  public String toString()
  {
    return "Name:"+name+", Wage:"+hourlyWage+",Hours:"+hoursWorked;
  }
  public void setName(String newName)
  {
    name=newName;
  }
  public void setWage(double newWage)
  {
    hourlyWage=newWage;
  }
  public void setHours(int h)
  {
    hoursWorked=h;
  }
  public void giveRaise(String newName)
  {
    hourlyWage++;
  }
}
