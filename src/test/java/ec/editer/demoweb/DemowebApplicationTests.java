package ec.editer.demoweb;

import ec.editer.demoweb.controllers.HomeController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {HomeController.class})
class DemowebApplicationTests {
    
    @Autowired
    private HomeController controller;

    @Test
    public void getResultTest(){
        //Arrange
        String text = "hello world!";
        
        //Act
        ResponseEntity<String> response = controller.getResult(text);
        
        //Assert
        Assertions.assertEquals(text.toUpperCase(), response.getBody());
    }
    
    @Test
    public void getCountTest(){
        //Arrange
        String text = "Hello World!";
        
        //Act
        ResponseEntity<Integer> response = controller.getCount(text);
        
        //Assert
        Assertions.assertEquals((Integer)text.length(), response.getBody());
    }
}
