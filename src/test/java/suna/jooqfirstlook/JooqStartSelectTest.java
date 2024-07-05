package suna.jooqfirstlook;

import org.assertj.core.api.Assertions;
import org.jooq.generated.tables.pojos.Film;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import suna.jooqfirstlook.film.FilmRepository;
import suna.jooqfirstlook.film.SimpleFilmInfo;

@SpringBootTest
public class JooqStartSelectTest {

    @Autowired
    FilmRepository filmRepository;

    @Test
    @DisplayName("1) 영화 정보 조회")
    void test() {
        Film film = filmRepository.findById(1L);
        Assertions.assertThat(film).isNotNull();
    }

    @Test
    @DisplayName("2) 영화 정보 간략 조회")
    void test2() {
        SimpleFilmInfo simpleFilmInfo = filmRepository.findSimpleFilmInfoById(1L);
        Assertions.assertThat(simpleFilmInfo).hasNoNullFieldsOrProperties();
    }
}
