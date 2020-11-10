package com.example.webservice.domain;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Data
//@XmlRootElement
public class StudentDetailsRequest implements Serializable {
    private static final long serialVersionUID = -7788216109901644147L;
    private String name;


}
