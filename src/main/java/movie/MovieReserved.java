
package movie;

import java.util.Date;

public class MovieReserved extends AbstractEvent{

    private Long id;
    private String moviename;
    private Date moviedate;
    private Integer movieid;
    private String theater;
    private String subscriber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }
    public Date getMoviedate() {
        return moviedate;
    }

    public void setMoviedate(Date moviedate) {
        this.moviedate = moviedate;
    }
    public Integer getMovieid() {
        return movieid;
    }

    public void setMovieid(Integer movieid) {
        this.movieid = movieid;
    }
    public String getTheater() {
        return theater;
    }

    public void setTheater(String theater) {
        this.theater = theater;
    }
    public String getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(String subscriber) {
        this.subscriber = subscriber;
    }


}
