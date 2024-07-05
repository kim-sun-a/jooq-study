package suna.jooqfirstlook.web;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PagedResponse {
    private Long page;
    private Long pageSize;
}
