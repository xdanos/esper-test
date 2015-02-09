package cz.muni;

public class Response {

    private final long timestamp;

    public Response(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
