/*
  Copyright (C) 2004, 2005, 2006 Petra Malik
  This file is part of the czt project.

  The czt project contains free software; you can redistribute it and/or modify
  it under the terms of the GNU General Public License as published by
  the Free Software Foundation; either version 2 of the License, or
  (at your option) any later version.

  The czt project is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with czt; if not, write to the Free Software
  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/

package net.sourceforge.czt.parser.util;

import java.text.MessageFormat;
import java.util.ResourceBundle;

/**
 * An abstract CztError that can be localised.
 *
 * @author Petra Malik
 */
public abstract class CztErrorImpl
  extends LocInfoImpl
  implements CztError
{
  private String message_;
  private String info_;
  private Object[] params_;
  private ErrorType errorType_ = ErrorType.ERROR;

  public CztErrorImpl(String message, Object[] params, LocInfo locInfo)
  {
    super(locInfo);
    message_ = message;
    params_ = params;
  }

  protected abstract ResourceBundle getResourceBundle();

  public String getMessage()
  {
    String localized = getResourceBundle().getString(message_);
    MessageFormat form = new MessageFormat(localized);
    return form.format(params_);
  }

  public void setErrorType(ErrorType errorType)
  {
    errorType_ = errorType;
  }

  public ErrorType getErrorType()
  {
    return errorType_;
  }

  public String getInfo()
  {
    return info_;
  }

  public void setInfo(String info)
  {
    info_ = info;
  }

  public String toString()
  {
    return super.toString() + ": " + getMessage();
  }

  protected String getMessageKey()
  {
    return message_;
  }

  protected Object[] getMessageParams()
  {
    return params_;
  }

  public int compareTo(CztError other)
  {
    return compareTo(this, other);
  }

  public static int compareTo(CztError error1, CztError error2)
  {
    int result = 0;
    result = error1.getLine() - error2.getLine();
    if (result == 0) {
      result = error1.getColumn() - error2.getColumn();
    }
    if (result == 0) {
      result = error1.getErrorType().compareTo(error2.getErrorType());
    }
    if (result == 0) {
      result = error1.getMessage().compareTo(error2.getMessage());
    }
    return result;
  }
}
