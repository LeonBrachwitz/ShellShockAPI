package de.leonbrachwitz.domain.match;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MatchDetails {
    private String homeTeam;
    private String guestTeam;
    private String score;

    public MatchDetails(String homeTeam, String guestTeam, String score) {
        this.homeTeam = homeTeam;
        this.guestTeam = guestTeam;
        this.score = score;
    }
}