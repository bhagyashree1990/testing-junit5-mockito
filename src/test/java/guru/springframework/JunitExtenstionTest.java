package guru.springframework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.Map;
@ExtendWith(MockitoExtension.class)
public class JunitExtenstionTest {
    @Mock
    Map<String,Object> mapMock;

    @Test
    void testMock() {
        mapMock.put("myKey","foo");
    }
}
