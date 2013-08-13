package com.inktomi.cirrus.forecast;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Text;

import java.math.BigInteger;

@Element
public class PercentageValue {

    @Text(required = false)
    public BigInteger value;

    @Attribute(name = "nil", required = false)
    public String nil;

    @Attribute(name = "upper-range", required = false)
    public Integer upperRange;

    @Attribute(name = "lower-range", required = false)
    public Integer lowerRange;

    @Attribute(name = "type", required = false)
    public DataSource type;
}
