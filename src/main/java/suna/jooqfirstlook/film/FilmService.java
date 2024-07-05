package suna.jooqfirstlook.film;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import suna.jooqfirstlook.web.FilmWithActorPagedResponse;
import suna.jooqfirstlook.web.PagedResponse;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FilmService {

    private final FilmRepository filmRepository;

    public FilmWithActorPagedResponse getFilmActorPageResponse(Long page, Long pageSize) {
        List<FilmWithActor> filmWithActorList = filmRepository.findFilmWithActorList(page, pageSize);
        PagedResponse pagedResponse = new PagedResponse(page, pageSize);

        return new FilmWithActorPagedResponse(pagedResponse, filmWithActorList);


    }
}
