package cn.dm.param;

/**
 * Created by 北大课工场
 */
public class QuerySeatParam {

    private Long scheduleId;

    private Long cinemaId;

    public Long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Long getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Long cinemaId) {
        this.cinemaId = cinemaId;
    }
}
