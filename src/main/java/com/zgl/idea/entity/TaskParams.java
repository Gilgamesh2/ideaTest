package com.zgl.idea.entity;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.*;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JacksonXmlRootElement(localName = "任务参数")
public class TaskParams {
    @JacksonXmlProperty(localName = "编号")
    private String no;
    @JacksonXmlProperty(localName = "姓名")
    private String name;
    @JacksonXmlElementWrapper(localName = "参数列表")
    @JacksonXmlProperty(localName = "参数列表")
    private List<Param> paramList;

    @Getter
    @Setter
    @ToString
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    public static final class Param {
        @JacksonXmlProperty(localName = "编号")
        private String no;
        @JacksonXmlText
        private String id;


    }
}
