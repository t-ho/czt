/**
Copyright 2003 Mark Utting
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

package net.sourceforge.czt.scanner;

import java.io.*;
import java.util.*;

import java_cup.runtime.*;

public class CztReader
  extends Reader
{
  private Scanner scanner_;
  private String buffer_ = "";
  List positions_ = new Vector();

  /**
   * Create a new character-stream reader
   * whose critical sections will synchronize on the reader itself.
   */
  public CztReader(Scanner scanner)
  {
    super();
    scanner_ = scanner;
  }

  /**
   * Create a new character-stream reader
   * whose critical sections will synchronize on the given object.
   */
  public CztReader(Scanner scanner, Object lock)
  {
    super(lock);
    scanner_ = scanner;
  }

  public void close()
  {
  }

  public int read(char[] cbuf, int off, int len)
  {
    if (buffer_ == null) return -1;
    while(buffer_.length() < len) {
      Symbol s = null;
      try {
        s = scanner_.next_token();
      }
      catch (Exception e) {
        ScanException se = (ScanException) e;
        throw se;
      }
      if (s.sym == sym.EOF) {
        for (int i = 0; i < buffer_.length(); i++) {
          cbuf[off + i] = buffer_.charAt(i);
        }
        int result = buffer_.length();
        buffer_ = null;
        return result;
      }
    }
    for (int i = 0; i < len; i++) {
      cbuf[off + i] = buffer_.charAt(i);
    }
    return len;
  }

  int getLine(int charNum)
  {
    return -1;
  }

  int getColumn(int charNum)
  {
    return -1;
  }
}
