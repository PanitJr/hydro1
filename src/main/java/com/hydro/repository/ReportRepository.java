package com.hydro.repository;

import com.hydro.report.Report;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by User on 1/6/2559.
 */
public interface ReportRepository extends MongoRepository<Report, String> {
}
