/*
  ZLive - A Z animator -- Part of the CZT Project.
  Copyright 2004 Mark Utting

  This program is free software; you can redistribute it and/or
  modify it under the terms of the GNU General Public License
  as published by the Free Software Foundation; either version 2
  of the License, or (at your option) any later version.

  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with this program; if not, write to the Free Software
  Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
*/
package net.sourceforge.czt.animation.eval;

import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.animation.eval.*;


public class UndefException extends EvalException
{
  /** Constructs a new exception with null as its detail message. */
  UndefException()
  { super(); }

  /** Constructs a new exception with the specified detail message. */
  UndefException(String message)
  { super(message); }

  /** Constructs a new exception with the specified detail message and cause.*/
  UndefException(String message, Throwable cause)
  { super(message, cause); }

  /** Constructs a new exception with the specified cause and detail message.
      The detail message will be (cause==null ? null : cause.toString()),
      which typically contains the class and detail message of cause.
  */ 
  UndefException(Throwable cause)
  { super(cause); }
}
