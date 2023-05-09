package editor;

public class IOResult<T> {
    private boolean ok;
    private T data;

    public IOResult(boolean ok, T data) {
        this.ok = ok;
        this.data = data;
    }

    public boolean isOk() {
        return ok;
    }

    public boolean hasData() {
        return data != null;

    }

    public T getData() {
        return data;
    }
}
