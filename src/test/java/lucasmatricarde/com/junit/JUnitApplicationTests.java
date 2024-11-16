package lucasmatricarde.com.junit;

import lucasmatricarde.com.junit.Model.Pessoa;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JUnitApplicationTests {

//    @Test
//    void validarCalculodeIdade() {
//        Pessoa pessoa = new Pessoa("Julia", LocalDate.of(1998,4,15));
//        Assertions.assertEquals(26, pessoa.getIdade());
//    }

//    @Test
//    void deveRetornarSeEhMaiorIdade(){
//        Pessoa lucas = new Pessoa("Lucas", LocalDate.of(1998,4,15));
//        Assertions.assertTrue(lucas.eMaiordeIdade());
//    }

//    @Test
//    void validarLancamentos(){
//        int[] lancamentos = {1,2,3,4,5,6,7,8,9,10};
//        int[] lancamentos2 = {1,12,13,14,15,16,17,18,19,20};
//        Assertions.assertArrayEquals(lancamentos, lancamentos2);
//    }

//    @Test
//    void validarSeObjetoEstaNulo(){
//        Pessoa pessoa = null;
//        Assertions.assertNull(pessoa);
//    }

    @Test
    void validarNumerosDeTiposDiferentes(){
        double valor = 4.2;
        double valor2 = 4.2;
        assertEquals(valor, valor2);
    }
}
