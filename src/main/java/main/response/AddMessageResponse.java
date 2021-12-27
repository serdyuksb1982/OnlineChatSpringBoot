package main.response;

import java.util.Date;

public class AddMessageResponse {

    private boolean result;

    private Date time;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
