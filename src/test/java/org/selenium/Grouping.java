package org.selenium;

import org.testng.annotations.Test;

public class Grouping {
@Test(groups="Apple")
public void Apple()
{
System.out.println("Apple1");
}
@Test(groups="Apple")
public void Apple1()
{
System.out.println("Apple1");
}
@Test(groups="samsung")
public void Samsung()
{
System.out.println("samsung");
}
@Test(groups="samsung")
public void Samsung1()
{
System.out.println("samsung");
}
@Test(groups="Lenovo")
public void Lenovo()
{
System.out.println("lenovo");
}
@Test(groups="Lenovo")
public void Lenovo1()
{
System.out.println("lenovo");
}
}
