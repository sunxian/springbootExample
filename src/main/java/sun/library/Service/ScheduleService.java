package sun.library.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @auther: SUNXIAN
 * @date: 2018-12-27
 */
@Service
public class ScheduleService {

    Logger logger = LoggerFactory.getLogger(ScheduleService.class);
    @Scheduled(cron="0/5 * *  * * ? ")
    public void log(){
        logger.info("schedue");

    }
}
