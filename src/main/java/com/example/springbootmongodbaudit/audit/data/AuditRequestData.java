package com.example.springbootmongodbaudit.audit.data;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuditRequestData {

    @CreatedDate
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss")
    Date createdDate;

    @LastModifiedDate
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss")
     Date lastModifiedDate;

    @LastModifiedBy
     String modifiedByUser;


    @CreatedBy
    String createdByUser;


}
