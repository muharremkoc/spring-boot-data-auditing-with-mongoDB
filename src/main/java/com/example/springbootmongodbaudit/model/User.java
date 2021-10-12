package com.example.springbootmongodbaudit.model;

import com.example.springbootmongodbaudit.audit.data.AuditRequestData;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;



@Document(value = "user_tables")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor

public class User extends AuditRequestData {


    @Id
    String id;

    String firstName;
}
