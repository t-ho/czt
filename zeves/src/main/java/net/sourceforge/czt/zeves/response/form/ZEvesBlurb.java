package net.sourceforge.czt.zeves.response.form;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlMixed;

import net.sourceforge.czt.zeves.response.ZEvesResponseUtil;

public class ZEvesBlurb {

	@XmlMixed
	@XmlAnyElement(lax = true)
	private List<?> content = new ArrayList<Object>();

	@Override
	public String toString() {
		return ZEvesResponseUtil.concat(content, " ");
	}

}