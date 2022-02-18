package test.Questoes;

import org.junit.jupiter.api.Test;

import java.util.List;

import static main.java.application.Questoes.Anagram.buscaAnagrama;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Anagram Test.
 *
 * @author <Samuel Levi Araújo Alves>
 * @since <pre>fev 18, 2022</pre>
 * @version 1.0
 */
class AnagramTest {

    @Test
    void testAoBuscarOsAnagramasDeCapgeminiDeveRetornar2() {
        List<String> result = buscaAnagrama("capgemini");
        assertEquals(Integer.valueOf(2), result.size());
        assertEquals("[i]", result.get(0));
        assertEquals("[i, n]", result.get(1));
    }

    @Test
    void testAoBuscarOsAnagramasDeSamuelDeveRetornar0() {
        List<String> result = buscaAnagrama("Samuel");
        assertEquals(Integer.valueOf(0), result.size());
        assertTrue(result.isEmpty());
    }

    @Test
    void testAoBuscarOsAnagramasDeifailuhkqqDeveRetornar0() {
        List<String> result = buscaAnagrama("ifailuhkqq");
        assertEquals(Integer.valueOf(3), result.size());
        assertEquals("[i]", result.get(0));
        assertEquals("[a, f, i]", result.get(1));
        assertEquals("[q]", result.get(2));
    }

}
