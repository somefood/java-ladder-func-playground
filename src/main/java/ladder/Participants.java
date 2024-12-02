package ladder;

import java.util.List;

public class Participants {

    private final List<Participant> participants;

    public Participants(List<Participant> participants) {
        this.participants = participants;
    }

    public int size() {
        return participants.size();
    }

    public List<Participant> getParticipants() {
        return List.copyOf(participants);
    }

    public Participants findAllByName(String participantName) {
        if ("all".equals(participantName)) {
            return new Participants(getParticipants());
        }

        final List<Participant> candidates = participants.stream()
            .filter(participant -> participantName.equals(participant.getName()))
            .toList();
        return new Participants(candidates);
    }

    public void move(Ladder ladder) {
        this.participants.forEach(participant -> participant.move(ladder));
    }
}
