package sg.edu.smu.livelabs.mobicom.busEvents;

/**
 * Created by smu on 20/7/15.
 */
public class UnregisterVotingEvent {
    public boolean toUnregister;

    public UnregisterVotingEvent(boolean toUnregister) {
        this.toUnregister = toUnregister;
    }
}
