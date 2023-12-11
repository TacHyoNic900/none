package com.sakib635.sakibsfoodvalley.TestCode.Model.customerFoodPanel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CustomerTest {

    Customer customer;

    @Before
    public void setUp() throws Exception {
        customer=new Customer();
    }
    @Test
    public void testGetCity() {
        customer.setCity("Dhaka");
        Assert.assertEquals("Dhaka", customer.getCity());

    }

    @Test
    public void testGetConfirmPassword() {
        customer.setConfirmPassword("rahman123");
        Assert.assertEquals("rahman123", customer.getConfirmPassword());
    }

    @Test
    public void testGetEmailID() {
        customer.setEmailID("sakib@gmail.com");
        Assert.assertEquals("sakib@gmail.com", customer.getEmailID());
    }


    @Test
    public void testGetFirstName() {
        customer.setFirstName("Rahman");
        Assert.assertEquals("Rahman", customer.getFirstName());
    }


    @Test
    public void testGetLastName() {
        customer.setLastName("Sakib");
        Assert.assertEquals("Sakib", customer.getLastName());
    }

    @Test
    public void testGetMobileno() {
        customer.setMobileno("01756");
        Assert.assertEquals("01756", customer.getMobileno());
    }
    @Test
    public void testGetPassword() {
        customer.setPassword("rahman123");
        Assert.assertEquals("rahman123", customer.getPassword());
    }

    @Test
    public void testGetState() {
        customer.setState("Bangladesh");
        Assert.assertEquals("Bangladesh", customer.getState());
    }

    @Test
    public void testGetArea() {
        customer.setArea("Dhanmondi");
        Assert.assertEquals("Dhanmondi", customer.getArea());
    }

}