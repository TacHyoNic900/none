package com.sakib635.sakibsfoodvalley.TestCode.Model.chefFoodPanel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChefTest {

    Chef chef;

    @Before

    public void setUp() throws Exception {
        chef=new Chef("Banasree","Dhaka","sakib1234","sadmanjashimsakib@gmail.com","Sadman","house:02","Sakib","01794","sakib1234","1209","Bangladesh");
    }

    @Test

    public void testGetArea() {
        Assert.assertEquals("Banasree", chef.getArea());

    }

    @Test
    public void testGetCity() {
        Assert.assertEquals("Dhaka", chef.getCity());
    }

    @Test
    public void testGetConfirmPassword() {
        Assert.assertEquals("sakib1234", chef.getConfirmPassword());

    }

    @Test
    public void testGetEmailid() {
        Assert.assertEquals("sadmanjashimsakib@gmail.com", chef.getEmailid());

    }

    @Test
    public void testGetFname() {
        Assert.assertEquals("Sadman", chef.getFname());

    }

    @Test
    public void testGetHouse() {
        Assert.assertEquals("house:02", chef.getHouse());

    }

    @Test
    public void testGetLname() {
        Assert.assertEquals("Sakib", chef.getLname());

    }

    @Test
    public void testGetMobile() {
        Assert.assertEquals("01794", chef.getMobile());

    }

    @Test
    public void testGetPassword() {
        Assert.assertEquals("sakib1234", chef.getPassword());

    }

    @Test
    public void testGetPostcode() {
        Assert.assertEquals("1209", chef.getPostcode());

    }

    @Test
    public void testGetState() {
        Assert.assertEquals("Bangladesh", chef.getState());

    }
}