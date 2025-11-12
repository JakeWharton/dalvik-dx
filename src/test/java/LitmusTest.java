import com.android.dex.Dex;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public final class LitmusTest {
  @Test
  public void litmus() {
    assertNotNull(Dex.class);
  }
}
