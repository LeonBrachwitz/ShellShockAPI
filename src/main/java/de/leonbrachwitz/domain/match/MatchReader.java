package de.leonbrachwitz.domain.match;

public class MatchReader implements MatchDetailsRepository {
    @Override
    public MatchDetails readMatchDetails(int id) {
        //Dummy MatchDetails für Beispiel
        return new MatchDetails("Fortuna Düsseldorf", "1. FC *öln", "2:0");
    }
}
