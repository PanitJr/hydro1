package com.hydro.report;

import com.hydro.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by User on 3/6/2559.
 */
@Repository
public class ReportDaoImpl implements ReportDao{
    @Autowired
    private ReportRepository reportRepository;
}
