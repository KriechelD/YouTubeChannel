package scheduler;

import java.util.Date;

import javax.ejb.Schedule;
import javax.ejb.Stateless;

@Stateless
public class ShowCurrentTime {

	@Schedule(second="*/10", minute="*", hour="*")
	public void showTime() {
		System.out.println(new Date());
	}

}
