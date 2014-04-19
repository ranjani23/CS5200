package com.atc.db2xls;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Table
{
	@XmlAttribute
	public String name;
	public List<Column> column;
}
