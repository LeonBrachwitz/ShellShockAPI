package de.leonbrachwitz.domain.match;

public class MatchDetailsService {
    MatchDetailsRepository matchDetailsRepository;

    public MatchDetailsService() {
        this.matchDetailsRepository = new MatchReader();
    }

    public MatchResponse getMatchResponse(int id) {
        var matchDetails = matchDetailsRepository.readMatchDetails(id);
        return new MatchResponse(matchDetails.getHomeTeam(), matchDetails.getGuestTeam(), matchDetails.getScore());
    }
}
