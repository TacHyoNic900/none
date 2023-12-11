package com.sakib635.sakibsfoodvalley.TestCode.Model;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

public class UpdateDishModelTest extends TestCase {

UpdateDishModel updateDishModel;

    @Before
    @Override
    protected void setUp() throws Exception {
        updateDishModel= new UpdateDishModel();

    }
    @Test
    public void testGetDishes() {
        updateDishModel.setDishes("Kacchi Biriyani");

        assertEquals("Kacchi Biriyani",updateDishModel.getDishes());

    }
    @Test
    public void testSetDishes( String x) {
        updateDishModel.Dishes=x;

    }
    @Test
    public void testGetRandomUID() {
        updateDishModel.setRandomUID("zx123");
        assertEquals("zx123",updateDishModel.getRandomUID());

    }
    @Test
    public void testSetRandomUID(String x) {
        updateDishModel.RandomUID=x;

    }
    @Test
    public void testGetDescription() {
        updateDishModel.setDescription("Good Food");
        assertEquals("Good Food",updateDishModel.getDescription());

    }
    @Test
    public void testSetDescription(String x) {
        updateDishModel.Description=x;

    }
    @Test
    public void testGetQuantity() {
        updateDishModel.setQuantity("02");
        assertEquals("02",updateDishModel.getQuantity());

    }
    @Test
    public void testSetQuantity(String x) {
        updateDishModel.Quantity=x;

    }
    @Test
    public void testGetPrice() {
        updateDishModel.setPrice("200");
        assertEquals("200",updateDishModel.getPrice());
    }
    @Test
    public void testSetPrice(String x) {
        updateDishModel.Price=x;

    }
    @Test
    public void testGetImageURL() {
        updateDishModel.setImageURL("www.google.com");
        assertEquals("www.google.com",updateDishModel.getImageURL());
    }
    @Test
    public void testSetImageURL(String x) {
        updateDishModel.ImageURL=x;

    }
    @Test
    public void testGetChefId() {
        updateDishModel.setChefId("xyz123");
        assertEquals("xyz123",updateDishModel.getChefId());
    }
    @Test
    public void testSetChefId(String x) {
        updateDishModel.ChefId=x;
    }
}