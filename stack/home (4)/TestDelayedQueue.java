import static org.junit.Assert.*;
import org.junit.Test;
public class TestDelayedQueue{
    DelayedQueue<String> s = new MyQueue<String>(4);
   //constructor test
    @Test 
    public void test_consturctor1(){
         DelayedQueue<String> s = new MyQueue<String>(4);
         assertEquals(4,s.getDelay());
         assertEquals(4,s.getMaximumDelay());
    }
    @Test 
    public void test_consturctor2(){
         DelayedQueue<String> s = new MyQueue<String>(0);
         assertEquals(0,s.getDelay());
         assertEquals(0,s.getMaximumDelay());
    }
    @Test 
    public void test_consturctor3(){
         DelayedQueue<String> s = new MyQueue<String>(-3);
         assertEquals(0,s.getDelay());
         assertEquals(-3,s.getMaximumDelay());
    }

    //size() test
    @Test
    public void test_size(){
         DelayedQueue<String> s = new MyQueue<String>(0); 
         assertEquals(0, s.size());
    }
    @Test
    public void test_size_enqueue1(){
         DelayedQueue<String> s = new MyQueue<String>(0); 
         assertEquals(0, s.size());
         s.enqueue("1");
         assertEquals(1, s.size());
    }
    @Test
    public void test_size_enqueue2(){
         DelayedQueue<String> s = new MyQueue<String>(0); 
         assertEquals(0, s.size());
         s.enqueue("1");
         assertEquals(1, s.size());
         s.enqueue("2");
         assertEquals(2, s.size());
    }
    @Test
    public void test_size_enqueue_dequeue(){
         DelayedQueue<String> s = new MyQueue<String>(0); 
         assertEquals(0, s.size());
         s.enqueue("1");
         assertEquals(1, s.size());
         s.enqueue("2");
         assertEquals(2, s.size());
         s.enqueue("3");
         assertEquals(3, s.size());
         s.dequeue();
         assertEquals(2, s.size());
         s.dequeue();
         assertEquals(1, s.size());
         s.dequeue();
         assertEquals(0, s.size());
    }
    @Test
    public void test_size_enqueue_clear(){
        DelayedQueue<String> s = new MyQueue<String>(0); 
         assertEquals(0, s.size());
         s.enqueue("1");
         assertEquals(1, s.size());
         s.enqueue("2");
         assertEquals(2, s.size());
         s.enqueue("3");
         assertEquals(3, s.size());
         s.clear();
         assertEquals(0, s.size());

     }
     //enqueuetest
     @Test
     public void test_enqueue_size(){
        DelayedQueue<String> s = new MyQueue<String>(0); 
         assertEquals(0, s.size());
         s.enqueue("1");
         assertEquals(1, s.size());
         s.enqueue("2");
         assertEquals(2, s.size());
         s.enqueue("3");
         assertEquals(3, s.size());
     }
     @Test
     public void test_enqueue_null(){
         DelayedQueue<String> s = new MyQueue<String>(0); 
         assertEquals(0, s.size());
         s.enqueue(null);
         assertEquals(1, s.size());
         s.enqueue(null);
         assertEquals(2, s.size());
         s.enqueue(null);
         assertEquals(3, s.size());
     }
     @Test
     public void test_enqueue_delay1(){
         DelayedQueue<String> s = new MyQueue<String>(4); 
         assertEquals(0, s.size());
         assertEquals(4,s.getDelay());
         s.enqueue("1");
         assertEquals(1, s.size());
         assertEquals(3,s.getDelay());
         s.enqueue("2");
         assertEquals(2, s.size());
         assertEquals(2,s.getDelay());
         s.enqueue("3");
         assertEquals(3, s.size());
         assertEquals(1,s.getDelay());
         s.enqueue("4");
         assertEquals(4, s.size());
         assertEquals(0,s.getDelay());
         s.enqueue("5");
         assertEquals(5, s.size());
         assertEquals(0,s.getDelay());
         s.dequeue();
         assertEquals(4, s.size());
         s.enqueue("5"); //reset delay
         assertEquals(5, s.size());
         assertEquals(3,s.getDelay());    
     }
     @Test
     public void test_enqueue_delay2(){
         DelayedQueue<String> s = new MyQueue<String>(4); 
         assertEquals(0, s.size());
         assertEquals(4,s.getDelay());
         s.enqueue("1");
         assertEquals(1, s.size());
         assertEquals(3,s.getDelay());
         s.enqueue("2");
         assertEquals(2, s.size());
         assertEquals(2,s.getDelay());
         s.enqueue("3");
         assertEquals(3, s.size());
         assertEquals(1,s.getDelay());
         s.enqueue("4");
         assertEquals(4, s.size());
         assertEquals(0,s.getDelay());
         s.enqueue("5");
         assertEquals(5, s.size());
         assertEquals(0,s.getDelay());
         s.setMaximumDelay(5);
         assertEquals(5,s.getMaximumDelay());
         s.dequeue();
         assertEquals(4, s.size());
         s.enqueue("5"); //reset to newdelay
         assertEquals(5, s.size());
         assertEquals(4,s.getDelay());    
     }
     @Test
     public void test_enqueue_delay3(){
         DelayedQueue<String> s = new MyQueue<String>(4); 
         assertEquals(0, s.size());
         assertEquals(4,s.getDelay());
         s.enqueue("1");
         assertEquals(1, s.size());
         assertEquals(3,s.getDelay());
         s.enqueue("2");
         assertEquals(2, s.size());
         assertEquals(2,s.getDelay());
         s.enqueue("3");
         assertEquals(3, s.size());
         assertEquals(1,s.getDelay());
         s.enqueue("4");
         assertEquals(4, s.size());
         assertEquals(0,s.getDelay());
         s.enqueue("5");
         assertEquals(5, s.size());
         assertEquals(0,s.getDelay());
         s.clear();
         assertEquals(0, s.size());
         s.enqueue("5"); //reset delay
         assertEquals(1, s.size());
         assertEquals(3,s.getDelay());    
     }
     @Test
     public void test_enqueue_delay4(){
         DelayedQueue<String> s = new MyQueue<String>(4); 
         assertEquals(0, s.size());
         assertEquals(4,s.getDelay());
         s.enqueue("1");
         assertEquals(1, s.size());
         assertEquals(3,s.getDelay());
         s.enqueue("2");
         assertEquals(2, s.size());
         assertEquals(2,s.getDelay());
         s.enqueue("3");
         assertEquals(3, s.size());
         assertEquals(1,s.getDelay());
         s.enqueue("4");
         assertEquals(4, s.size());
         assertEquals(0,s.getDelay());
         s.enqueue("5");
         assertEquals(5, s.size());
         assertEquals(0,s.getDelay());
         s.setMaximumDelay(5);
         assertEquals(5,s.getMaximumDelay());
         s.clear();
         assertEquals(0, s.size());
         s.enqueue("5"); //reset to newdelay
         assertEquals(1, s.size());
         assertEquals(4,s.getDelay());    
     }
     //testdequeue
     @Test
     public void test_dequeue_exception(){
         try{
            DelayedQueue<String> s = new MyQueue<String>(4);
            s.dequeue();
         } catch(IllegalStateException e) {
            assertEquals("empty list",e.getMessage());
         }
     }
     @Test
     public void test_dequeue_delay_error(){
         DelayedQueue<String> s = new MyQueue<String>(4);
         s.enqueue("1");
         assertEquals(null,s.dequeue());
         assertEquals(1,s.size());
     }
     @Test 
     public void test_dequeue_success(){
         DelayedQueue<String> s = new MyQueue<String>(4);
         s.enqueue("1");
         s.enqueue("2");
         s.enqueue("3");
         s.enqueue(null);
         assertEquals(4,s.size());
         assertEquals("1",s.dequeue());
         assertEquals(3,s.size());
         assertEquals("2",s.dequeue());
         assertEquals(2,s.size());
         assertEquals("3",s.dequeue());
         assertEquals(1,s.size());
         assertEquals(null,s.dequeue());
         assertEquals(0,s.size());
     }
     //test peek
     @Test
     public void test_peek_unsuccess(){
         DelayedQueue<String> s = new MyQueue<String>(4);
         try{
             s.peek();
         } catch (IllegalStateException e){
             assertEquals("empty list",e.getMessage());
         }
     }
     @Test
     public void test_peek_success(){
         DelayedQueue<String> s = new MyQueue<String>(0);
         s.enqueue(null);
         assertEquals(null,s.peek());
         s.dequeue();
         s.enqueue("1");
         assertEquals("1",s.peek());
     }
     //testgetdelay
     @Test
     public void test_delay(){
         DelayedQueue<String> s = new MyQueue<String>(4);
         s.enqueue("1");
         assertEquals(3,s.getDelay());
         s.enqueue("2");
         assertEquals(2,s.getDelay());
         s.enqueue("3");
         assertEquals(1,s.getDelay());
         s.enqueue("4");
         assertEquals(0,s.getDelay());
         s.enqueue("5");
         assertEquals(0,s.getDelay());
         s.dequeue();
         s.enqueue("6");
         assertEquals(3,s.getDelay());//test delayresetdequeue
         s.enqueue("7");
         s.enqueue("8");
         s.enqueue("9");
         assertEquals(0,s.getDelay());
         s.clear();
         assertEquals(0,s.getDelay());
         s.enqueue("10");
         assertEquals(3,s.getDelay()); //test delayresetdequeue
         s.enqueue("11");
         s.enqueue("12");
         s.enqueue("13");
         s.setMaximumDelay(10);
         s.dequeue();
         s.enqueue("14");
         assertEquals(9,s.getDelay()); //test changeresetdelay
     }
     //test setMaximumDelay & getMaximumDelay
     @Test
     public void test_MaximumDelay(){
         DelayedQueue<String> s = new MyQueue<String>(4);
         assertEquals(4,s.getMaximumDelay());
         s.setMaximumDelay(5);
         assertEquals(5,s.getMaximumDelay());
         s.setMaximumDelay(6);
         assertEquals(6,s.getMaximumDelay());
         s.setMaximumDelay(-2);
         assertEquals(-2,s.getMaximumDelay());
     }
     //test clear
     @Test
     public void test_clear_unempty(){
         DelayedQueue<String> s = new MyQueue<String>(4);
         assertTrue(s.clear());
     }
     @Test
     public void testcleardelayerror(){
         DelayedQueue<String> s = new MyQueue<String>(4);
         s.enqueue("1");
         assertFalse(s.clear());
     }
     @Test
     public void testclearsuccess(){
         DelayedQueue<String> s = new MyQueue<String>(3);
         s.enqueue("1");
         s.enqueue("2");
         s.enqueue("3");
         assertTrue(s.clear());
         assertEquals(0,s.size());
         assertEquals(0,s.getDelay());
     }

     //test contains
     @Test 
     public void test_containempty(){
         DelayedQueue<String> s = new MyQueue<String>(3);
         assertFalse(s.contains("1"));
         assertFalse(s.contains(null));
     }
     @Test
     public void test_containnull(){
         DelayedQueue<String> s = new MyQueue<String>(0);
         s.enqueue(null);
         assertTrue(s.contains(null));
         s.dequeue();
         assertFalse(s.contains(null));
     }
     @Test
     public void test_contain(){
         DelayedQueue<String> s = new MyQueue<String>(0);
         s.enqueue("1");
         assertTrue(s.contains("1"));
         assertFalse(s.contains("2"));
     }




}
