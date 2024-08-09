package de.leonbrachwitz.domain.match;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MatchResponse {

    private String home;
    private String guest;
    private String score;

    public MatchResponse(String home, String guest, String score) {
        this.home = home;
        this.guest = guest;
        this.score = score;
    }
}
