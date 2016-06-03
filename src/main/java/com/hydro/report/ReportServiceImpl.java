package com.hydro.report;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by User on 3/6/2559.
 */
@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    private ReportDao reportDao;
}
