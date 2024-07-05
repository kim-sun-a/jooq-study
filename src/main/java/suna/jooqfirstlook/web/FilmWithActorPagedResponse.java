package suna.jooqfirstlook.web;

import lombok.Getter;
import suna.jooqfirstlook.film.FilmWithActor;
import java.util.List;

@Getter
public class FilmWithActorPagedResponse {
    private PagedResponse page;
    private List<FilmActorResponse> filmActorList;

    public FilmWithActorPagedResponse(PagedResponse page, List<FilmWithActor> filmActorList) {
        this.page = page;
        this.filmActorList = filmActorList.stream()
                .map(FilmActorResponse::new)
                .toList();
    }

    @Getter
    public static class FilmActorResponse {
        private final String filmTile;
        private final String actorFullName;
        private final Long filmId;

        public FilmActorResponse(FilmWithActor filmWithActor) {
            this.filmTile = filmWithActor.getTitle();
            this.actorFullName = filmWithActor.getActorFullName();
            this.filmId = filmWithActor.getFilmId();
        }
    }
}
