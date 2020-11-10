package com.example.webservice.domain;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

//
@Data
//@XmlRootElement
public class StudentDetailsResponse implements Serializable {
    private static final long serialVersionUID = -7536833175332788356L;
    private Student student;

}
