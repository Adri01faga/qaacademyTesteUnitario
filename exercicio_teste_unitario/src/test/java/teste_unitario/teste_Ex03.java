package teste_unitario;

import org.junit.Test;
import org.junit.Assert;

public class teste_Ex03 {
   @Test 
   public void validaUsuario(){
    Assert.assertEquals("sabado",Ex03.inserirPalavra());  
    }
}
