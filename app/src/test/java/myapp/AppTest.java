/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package myapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {
  @Test
  public void objectsEqual() {
    String[] arg = new String[] {"A", "B", "C"};
        assertThrows(
                RuntimeException.class,
                () -> { App.swap(arg, "A", "A"); });
  }
  @Test
  public void cannotFindX() {  // First arg of swap is not in the array
    String[] arg = new String[] {"A", "B"};
    String[] expected = new String[] {"A", "B"};

    // There is no C
    boolean result = App.swap(arg, "C", "A");
    assertFalse(result);  // fail
    assertArrayEquals(expected, arg);  // No change
  }
  @Test
  public void cannotFindY() {  // Second arg of swap is not in the array
    String[] arg    = new String[] {"A", "B"};
    String[] expected = new String[] {"A", "B"};

    // There is no C
    boolean result = App.swap(arg, "A", "C");
    assertFalse(result);  // fail
    assertArrayEquals(expected, arg);  // No change
  }
  
  @Test
  public void swapWithFirstX() {
    String[] arg      = new String[] {"A", "B", "C", "B", "D"};
    String[] expected = new String[] {"A", "D", "C", "B", "B"};

       // D should be swapped with first B
    boolean result = App.swap(arg, "B", "D");
    assertTrue(result);  // success
    assertArrayEquals(expected, arg);  // swapped
  }
  
  @Test
  public void swapWithLastY() {
    String[] arg      = new String[] {"A", "B", "C", "B", "D"};
    String[] expected = new String[] {"B", "B", "C", "A", "D"};

    // A should be swapped with last B
    boolean result = App.swap(arg, "A", "B");
    assertTrue(result);  // success     
    assertArrayEquals(expected, arg);  // swapped
    }
    
}
