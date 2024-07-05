package suna.jooqfirstlook;

import org.assertj.core.api.Assertions;
import org.jooq.generated.tables.pojos.Film;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import suna.jooqfirstlook.film.FilmRepository;
import suna.jooqfirstlook.film.FilmService;
import suna.jooqfirstlook.film.SimpleFilmInfo;
import suna.jooqfirstlook.web.FilmWithActorPagedResponse;

@SpringBootTest
public class JooqStartSelectTest {

    @Autowired
    FilmRepository filmRepository;

    @Autowired
    FilmService filmService;

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

    @Test
    @DisplayName("3) 영화와 영화에 출연한 배우 정보를 페이징하여 조회")
    void test3() {
        FilmWithActorPagedResponse filmActorPageResponse = filmService.getFilmActorPageResponse(1L, 20L);

        Assertions.assertThat(filmActorPageResponse.getFilmActorList())
                .hasSize(20);

    }
}
