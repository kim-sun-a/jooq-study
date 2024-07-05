package suna.jooqfirstlook.film;

import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.jooq.generated.tables.JFilm;
import org.jooq.generated.tables.pojos.Film;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class FilmRepository {

    private final DSLContext dslContext;
    private final JFilm FILM = JFilm.FILM;

    public Film findById(Long id) {
        return dslContext.select(FILM.fields())
                .from(FILM)
                .where(FILM.FILM_ID.eq(id))
                .fetchOneInto(Film.class);
    }

    public SimpleFilmInfo findSimpleFilmInfoById(Long id) {
        return dslContext.select(
                    FILM.FILM_ID,
                    FILM.TITLE,
                    FILM.DESCRIPTION)
                .from(FILM)
                .where(FILM.FILM_ID.eq(id))
                .fetchOneInto(SimpleFilmInfo.class);
    }

}
